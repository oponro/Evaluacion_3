package Evaluacion_2.platinum;

import java.sql.Date;

import javax.xml.crypto.Data;

public class Persona {
	
	private String rut;
	private String nombre;
	private String apellido;
	private int telefono;
	private Date fechaIngreso;
	
	
	public Persona(String rut) {
		if(rut.trim().equals("") || rut == null) {
			throw new IllegalArgumentException("Ingrese Rut");
		}
	

		
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.fechaIngreso = fechaIngreso;
		
	}
	
	public String getRut() {
		return rut;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public int getTelefono() {
		return telefono;
	}
	
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
}
