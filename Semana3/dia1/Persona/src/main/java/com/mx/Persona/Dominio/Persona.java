package com.mx.Persona.Dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.*;

@Entity
@Table(name= "PERSONA")
public class Persona {
	@NotNull(message = "Ingresa el ID")
	@Id
	@Column(name = "ID_PERSONA", columnDefinition="NUMBER")
	private Integer idPersona;
	
	@NotBlank(message = "Ingrese el nombre")
	@Column(name = "NOMBRE", columnDefinition="NVARCHAR2(100)")
	private String nombre;
	
	@NotBlank(message = "Ingrese el apellido Paterno")
	@Column(name = "APELLIDO_P", columnDefinition="NVARCHAR2(100)")
	private String apellidoPaterno;
	
	@NotBlank(message = "Ingrese el apellido Materno")
	@Column(name = "APELLIDO_M", columnDefinition="NVARCHAR2(100)")
	private String apellidoMaterno;
	
	@NotNull(message = "Ingrese la  edad")
	@Column(name = "EDAD", columnDefinition="NUMBER")
	private int edad;
	
	@Email(message = "Ingrese el correo")
	@Column(name = "CORREO", columnDefinition="NVARCHAR2(100)")
	private String correo;
	
	public Persona() {
		
	}

	public Persona(int idPersona, String nombre, String apellidoPaterno, String apellidoMaterno, int edad,
			String correo) {
		super();
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.edad = edad;
		this.correo = correo;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno
				+ ", apellidoMaterno=" + apellidoMaterno + ", edad=" + edad + ", correo=" + correo + "]\n";
	}
	
	
	
	
	
	
	
	
	

}
