package com.udemy.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contacts")
public class Contact {

	@Id
	@Column(name = "id")
	@GeneratedValue
	private int id;
	@Column(name = "nombreJugador")
	private String nombreJugador;
	@Column(name = "fechaNacimiento")
	private String fechaNacimiento;
	@Column(name = "dni")
	private String dni;
	@Column(name = "movil")
	private String movil;
	@Column(name = "fijo")
	private String fijo;
	@Column(name = "email")
	private String email;
	@Column(name = "temporada")
	private String temporada;
	@Column(name = "equipo")
	private String equipo;

	// Datos de los padres
	@Column(name = "nombrePadre")
	private String nombrePadre;
	@Column(name = "nombreMadre")
	private String nombreMadre;
	@Column(name = "dniPadre")
	private String dniPadre;
	@Column(name = "dniMadre")
	private String dniMadre;
	@Column(name = "movilPadre")
	private String movilPadre;
	@Column(name = "movilMadre")
	private String movilMadre;
	@Column(name = "emailPadre")
	private String emailPadre;
	@Column(name = "emailMadre")
	private String emailMadre;

	// Cuotas
	@Column(name = "cuotaInscripcion", nullable = true)
	private Float cuotaInscripcion;
	@Column(name = "segundaCuota", nullable = true)
	private Float segundaCuota;
	@Column(name = "terceraCuota", nullable = true)
	private Float terceraCuota;
	@Column(name = "cuartaCuota", nullable = true)
	private Float cuartaCuota;
	@Column(name = "quintaCuota", nullable = true)
	private Float quintaCuota;
	@Column(name = "sextaCuota", nullable = true)
	private Float sextaCuota;

	@Column(name = "fechaPagoInscripcion", nullable = true)
	private String fechaPagoInscripcion;
	@Column(name = "fechaSegundaCuota", nullable = true)
	private String fechaSegundaCuota;
	@Column(name = "fechaTerceraCuota", nullable = true)
	private String fechaTerceraCuota;
	@Column(name = "fechaCuartaCuota", nullable = true)
	private String fechaCuartaCuota;
	@Column(name = "fechaQuintaCuota", nullable = true)
	private String fechaQuintaCuota;
	@Column(name = "fechaSextaCuota", nullable = true)
	private String fechaSextaCuota;

	public Contact() {
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
		return "JugadorBBDD [id=" + id + ", nombreJugador=" + nombreJugador + ", fechaNacimiento=" + fechaNacimiento
				+ ", dni=" + dni + ", temporada=" + temporada + ", equipo=" + equipo + "]";
	}

}
