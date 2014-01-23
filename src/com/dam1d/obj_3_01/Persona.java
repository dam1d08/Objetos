package com.dam1d.obj_3_01;

public class Persona {
	
	private String dni;
	private String nombre;
	private int edad;
	private Oficio ofi;
	
	public Persona(String dni, String nombre, int edad, Oficio ofi) {
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.ofi = ofi;
		
	}
	
	public double obtSueldo() {
		double sueldo = this.ofi.getSueldo();
		return sueldo;
	}
	
	public void mostrarCaract() {
		System.out.println(  "DNI: "+this.dni+"\n"
							+"Nombre: "+this.nombre+"\n"
							+"Edad: "+this.edad+"\n"
							+"Profesión: "+this.ofi.getNombre());
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getEdad() {
		return this.edad;
	}

}
