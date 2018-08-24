package com.udemy.model;

import org.springframework.web.multipart.MultipartFile;

public class ContactModel {

	private int id;
	private String nombreJugador;
	private String fechaNacimiento;
	private String dni;
	private String movil;
	private String fijo;	
	private String email;
	private String temporada;
	private String equipo;
	
	//Datos de los padres
	private String nombrePadre;
	private String nombreMadre;
	private String dniPadre;
	private String dniMadre;
	private String movilPadre;
	private String movilMadre;
	private String emailPadre;
	private String emailMadre;
	
	//Cuotas
	private Float cuotaInscripcion;
	private Float segundaCuota;
	private Float terceraCuota;
	private Float cuartaCuota;
	private Float quintaCuota;
	private Float sextaCuota;
	private String fechaPagoInscripcion;
	private String fechaSegundaCuota;
	private String fechaTerceraCuota;
	private String fechaCuartaCuota;
	private String fechaQuintaCuota;
	private String fechaSextaCuota;
	
	//Foto
	private MultipartFile foto;
	

	public ContactModel() {
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombreJugador() {
		return nombreJugador;
	}


	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}



	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getMovil() {
		return movil;
	}


	public void setMovil(String movil) {
		this.movil = movil;
	}


	public String getFijo() {
		return fijo;
	}


	public void setFijo(String fijo) {
		this.fijo = fijo;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTemporada() {
		return temporada;
	}


	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}


	public String getEquipo() {
		return equipo;
	}


	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}


	public String getNombrePadre() {
		return nombrePadre;
	}


	public void setNombrePadre(String nombrePadre) {
		this.nombrePadre = nombrePadre;
	}


	public String getNombreMadre() {
		return nombreMadre;
	}


	public void setNombreMadre(String nombreMadre) {
		this.nombreMadre = nombreMadre;
	}


	public String getDniPadre() {
		return dniPadre;
	}


	public void setDniPadre(String dniPadre) {
		this.dniPadre = dniPadre;
	}


	public String getDniMadre() {
		return dniMadre;
	}


	public void setDniMadre(String dniMadre) {
		this.dniMadre = dniMadre;
	}


	public String getMovilPadre() {
		return movilPadre;
	}


	public void setMovilPadre(String movilPadre) {
		this.movilPadre = movilPadre;
	}


	public String getMovilMadre() {
		return movilMadre;
	}


	public void setMovilMadre(String movilMadre) {
		this.movilMadre = movilMadre;
	}


	public String getEmailPadre() {
		return emailPadre;
	}


	public void setEmailPadre(String emailPadre) {
		this.emailPadre = emailPadre;
	}


	public String getEmailMadre() {
		return emailMadre;
	}


	public void setEmailMadre(String emailMadre) {
		this.emailMadre = emailMadre;
	}


	public Float getCuotaInscripcion() {
		return cuotaInscripcion;
	}


	public void setCuotaInscripcion(Float cuotaInscripcion) {
		this.cuotaInscripcion = cuotaInscripcion;
	}


	public Float getSegundaCuota() {
		return segundaCuota;
	}


	public void setSegundaCuota(Float segundaCuota) {
		this.segundaCuota = segundaCuota;
	}


	public Float getTerceraCuota() {
		return terceraCuota;
	}


	public void setTerceraCuota(Float terceraCuota) {
		this.terceraCuota = terceraCuota;
	}


	public Float getCuartaCuota() {
		return cuartaCuota;
	}


	public void setCuartaCuota(Float cuartaCuota) {
		this.cuartaCuota = cuartaCuota;
	}


	public Float getQuintaCuota() {
		return quintaCuota;
	}


	public void setQuintaCuota(Float quintaCuota) {
		this.quintaCuota = quintaCuota;
	}


	public Float getSextaCuota() {
		return sextaCuota;
	}


	public void setSextaCuota(Float sextaCuota) {
		this.sextaCuota = sextaCuota;
	}


	public String getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public String getFechaPagoInscripcion() {
		return fechaPagoInscripcion;
	}


	public void setFechaPagoInscripcion(String fechaPagoInscripcion) {
		this.fechaPagoInscripcion = fechaPagoInscripcion;
	}


	public String getFechaSegundaCuota() {
		return fechaSegundaCuota;
	}


	public void setFechaSegundaCuota(String fechaSegundaCuota) {
		this.fechaSegundaCuota = fechaSegundaCuota;
	}


	public String getFechaTerceraCuota() {
		return fechaTerceraCuota;
	}


	public void setFechaTerceraCuota(String fechaTerceraCuota) {
		this.fechaTerceraCuota = fechaTerceraCuota;
	}


	public String getFechaCuartaCuota() {
		return fechaCuartaCuota;
	}


	public void setFechaCuartaCuota(String fechaCuartaCuota) {
		this.fechaCuartaCuota = fechaCuartaCuota;
	}


	public String getFechaQuintaCuota() {
		return fechaQuintaCuota;
	}


	public void setFechaQuintaCuota(String fechaQuintaCuota) {
		this.fechaQuintaCuota = fechaQuintaCuota;
	}


	public String getFechaSextaCuota() {
		return fechaSextaCuota;
	}


	public void setFechaSextaCuota(String fechaSextaCuota) {
		this.fechaSextaCuota = fechaSextaCuota;
	}


	@Override
	public String toString() {
		return "Jugador [id=" + id + ", nombreJugador=" + nombreJugador + ", fechaNacimiento=" + fechaNacimiento
				+ ", dni=" + dni + ", temporada=" + temporada + ", equipo=" + equipo + "]";
	}


	public MultipartFile getFoto() {
		return foto;
	}


	public void setFoto(MultipartFile foto) {
		this.foto = foto;
	}


}