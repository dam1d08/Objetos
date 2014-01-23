package com.dam1d.obj_3_01;

public class Oficio {
	private String nombre;
	private double sueldo;
	private String localidad;
	
	public Oficio(String nombre, double sueldo, String localidad) {
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.localidad = localidad;
		
	}
	
	public double obtSueldoAnual(){
		double anual = this.sueldo * 12;
		return anual;

	}
	
	public void mostrarCaract() {
		System.out.println( "Oficio: "+this.nombre+"\n"
						   +"Sueldo mensual: "+this.sueldo+"\n"
						   +"Localidad: "+this.localidad);
	}
	
	public double getSueldo() {
		return this.sueldo;
	}
	
	public String getNombre() {
		return this.nombre;
	}
}
