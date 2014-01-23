//
//- Salon: tendrá como atributos la superficie, el
//número de ventanas y un objeto Silla. Como métodos, un
//método constructor que reciba tres argumentos y se los
//asigne a los atributos y un método mostrarCaract que
//muestre por pantalla los atributos del salón.

package com.dam1d.obj_2_04;

public class Salon {
	private double superficie;
	private int ventanas;
	private Silla silla;
	
	public Salon(double sup, int vent, Silla s) {
		this.superficie = sup;
		this.ventanas = vent;
		this.silla = s;
	}
	
	public void mostrarCaract() {
		System.out.println("Superficie: "+this.superficie+"\n"
						  +"Nº ventanas: "+this.ventanas+"\n"
						  +"Tipo de silla: ");
		this.silla.mostrarCaract();
	}

}
