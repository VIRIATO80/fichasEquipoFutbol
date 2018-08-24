package com.udemy.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.constant.ViewConstant;
import com.udemy.model.ContactModel;
import com.udemy.service.ContactService;
import com.udemy.service.StorageService;

@Controller
@RequestMapping("/contacts")
public class ContactController {

	private static final Log LOG = LogFactory.getLog(ContactController.class);

	@Autowired
	@Qualifier("contactServiceImpl")
	private ContactService contactService;
	
	
	@Autowired
	@Qualifier("storageServiceImpl")
	private StorageService storageService;

	@PreAuthorize("hasRole('ROLE_USER')")
	@GetMapping("/contactform")
	public String redirectContactForm(@RequestParam(name = "id", required = false) int id, Model model, boolean esDetalle) {
		
		ContactModel contactModel = new ContactModel();
		
		if(id != 0){
			contactModel = contactService.findContactModelById(id);
		}

		model.addAttribute("contactModel", contactModel);
		if(esDetalle)
			return ViewConstant.CONTACT_DETAIL;
		return ViewConstant.CONTACT_FORM;
	}

	@GetMapping("/cancel")
	public String cancel() {
		return "redirect:/contacts/showContacts";
	}
	
	@GetMapping("/detailContact/{id}")
	public String detailContact(@PathVariable("id") int id, Model model) {
		LOG.info("METHOD: detailContact() -- PARAMS: " + id);
		return redirectContactForm(id, model, true);
	}
	
	
	
	
	@PostMapping("/addcontact")
	public String addContact(@ModelAttribute(name = "contactModel") ContactModel contactModel, Model model) {
		LOG.info("METHOD: addContact() -- PARAMS: " + contactModel);	
		ContactModel jugador = contactService.addContact(contactModel);
		if(jugador != null){			
			//Tratamos la foto si se ha subido algún archivo
			if(contactModel.getFoto() != null){
				storageService.store(contactModel.getFoto(), jugador.getId());
			}
			model.addAttribute("result", 1);
		}else{
			model.addAttribute("result", 0);
		}
		

		return "redirect:/contacts/showContacts";
	}

	@GetMapping("/showContacts")
	public ModelAndView showContacts() {
		ModelAndView mav = new ModelAndView(ViewConstant.CONTACTS);
		User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		mav.addObject("userName", user.getUsername());
		mav.addObject("contacts", contactService.listAllContacts());
		return mav;
	}

	@GetMapping("/removeContact")
	public ModelAndView removeContact(@RequestParam(name = "id", required = true) int id) {
		contactService.deleteContact(id);
		return showContacts();
	}

}
