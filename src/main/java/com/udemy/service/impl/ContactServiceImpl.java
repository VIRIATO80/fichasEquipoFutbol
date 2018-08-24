package com.udemy.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.udemy.component.ContactConverter;
import com.udemy.entity.Contact;
import com.udemy.model.ContactModel;
import com.udemy.repository.ContactRepository;
import com.udemy.service.ContactService;

@Service("contactServiceImpl")
public class ContactServiceImpl implements ContactService {

	@Autowired
	@Qualifier("contactRepository")
	private ContactRepository contactRepository;

	@Autowired
	@Qualifier("contactConverter")
	private ContactConverter contactConverter;

	@Override
	public ContactModel addContact(ContactModel model) {

		Contact contact = contactRepository.save(contactConverter.convertContactModel2Contact(model));
		return contactConverter.convertContact2ContactModel(contact);
	}

	@Override
	public List<ContactModel> listAllContacts() {
		List<Contact> listContact= contactRepository.findAll();
		List<ContactModel> resultado = new ArrayList<ContactModel>();
		for(Contact contact: listContact){
			resultado.add(contactConverter.convertContact2ContactModel(contact));
		}
		return resultado;
	}

	@Override
	public Contact findContactById(int id) {
		return contactRepository.findById(id);
	}

	public ContactModel findContactModelById(int id){
		return contactConverter.convertContact2ContactModel(findContactById(id));
	}
	
	@Override
	public void deleteContact(int id) {		
		Contact contact = findContactById(id);
		if(null != contact)
			contactRepository.delete(contact);
	}

}