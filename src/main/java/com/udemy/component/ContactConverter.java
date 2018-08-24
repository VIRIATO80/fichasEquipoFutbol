package com.udemy.component;

import org.springframework.stereotype.Component;

import com.udemy.entity.Contact;
import com.udemy.model.ContactModel;


/**
 * The Class ContactConverter.
 */
@Component("contactConverter")
public class ContactConverter {

	/**
	 * Convert contact model 2 contact.
	 *
	 * @param contactModel the contact model
	 * @return the contact
	 */
	public Contact convertContactModel2Contact(ContactModel contactInput) {
			
		Contact contact = new Contact();

		//Datos personales
		contact.setId(contactInput.getId());
		contact.setNombreJugador(contactInput.getNombreJugador());
		contact.setFechaNacimiento(contactInput.getFechaNacimiento());
		contact.setDni(contactInput.getDni());
		contact.setMovil(contactInput.getMovil());
		contact.setFijo(contactInput.getFijo());
		contact.setEmail(contactInput.getEmail());
		contact.setTemporada(contactInput.getTemporada());
		contact.setEquipo(contactInput.getEquipo());
		
		//Datos de los padres
		contact.setNombrePadre(contactInput.getNombrePadre());
		contact.setNombreMadre(contactInput.getNombreMadre());
		contact.setDniPadre(contactInput.getDniPadre());
		contact.setDniMadre(contactInput.getDniMadre());
		contact.setMovilPadre(contactInput.getMovilPadre());
		contact.setMovilMadre(contactInput.getMovilMadre());
		contact.setEmailPadre(contactInput.getEmailPadre());
		contact.setEmailMadre(contactInput.getEmailMadre());
		
		//Datos de las cuotas
		contact.setCuotaInscripcion(contactInput.getCuotaInscripcion());
		contact.setSegundaCuota(contactInput.getSegundaCuota());
		contact.setTerceraCuota(contactInput.getTerceraCuota());
		contact.setCuartaCuota(contactInput.getCuartaCuota());
		contact.setQuintaCuota(contactInput.getQuintaCuota());
		contact.setSextaCuota(contactInput.getSextaCuota());
		contact.setFechaPagoInscripcion(contactInput.getFechaPagoInscripcion());
		contact.setFechaSegundaCuota(contactInput.getFechaSegundaCuota());
		contact.setFechaTerceraCuota(contactInput.getFechaTerceraCuota());
		contact.setFechaCuartaCuota(contactInput.getFechaCuartaCuota());
		contact.setFechaQuintaCuota(contactInput.getFechaQuintaCuota());
		contact.setFechaSextaCuota(contactInput.getFechaSextaCuota());		
			
		return contact;
	}

	/**
	 * Convert contact 2 contact model.
	 *
	 * @param contact the contact
	 * @return the contact model
	 */
	public ContactModel convertContact2ContactModel(Contact contactInput) {

		ContactModel contact = new ContactModel();

		//Datos personales
		contact.setId(contactInput.getId());
		contact.setNombreJugador(contactInput.getNombreJugador());
		contact.setFechaNacimiento(contactInput.getFechaNacimiento());
		contact.setDni(contactInput.getDni());
		contact.setMovil(contactInput.getMovil());
		contact.setFijo(contactInput.getFijo());
		contact.setEmail(contactInput.getEmail());
		contact.setTemporada(contactInput.getTemporada());
		contact.setEquipo(contactInput.getEquipo());
		
		//Datos de los padres
		contact.setNombrePadre(contactInput.getNombrePadre());
		contact.setNombreMadre(contactInput.getNombreMadre());
		contact.setDniPadre(contactInput.getDniPadre());
		contact.setDniMadre(contactInput.getDniMadre());
		contact.setMovilPadre(contactInput.getMovilPadre());
		contact.setMovilMadre(contactInput.getMovilMadre());
		contact.setEmailPadre(contactInput.getEmailPadre());
		contact.setEmailMadre(contactInput.getEmailMadre());
		
		//Datos de las cuotas
		contact.setCuotaInscripcion(contactInput.getCuotaInscripcion());
		contact.setSegundaCuota(contactInput.getSegundaCuota());
		contact.setTerceraCuota(contactInput.getTerceraCuota());
		contact.setCuartaCuota(contactInput.getCuartaCuota());
		contact.setQuintaCuota(contactInput.getQuintaCuota());
		contact.setSextaCuota(contactInput.getSextaCuota());
		contact.setFechaPagoInscripcion(contactInput.getFechaPagoInscripcion());
		contact.setFechaSegundaCuota(contactInput.getFechaSegundaCuota());
		contact.setFechaTerceraCuota(contactInput.getFechaTerceraCuota());
		contact.setFechaCuartaCuota(contactInput.getFechaCuartaCuota());
		contact.setFechaQuintaCuota(contactInput.getFechaQuintaCuota());
		contact.setFechaSextaCuota(contactInput.getFechaSextaCuota());		
			
		return contact;		
	}
}
