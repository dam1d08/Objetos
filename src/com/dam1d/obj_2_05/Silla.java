//4.- Codificar dos clases en Java llamadas
//respectivamente Silla y Salon con las siguientes
//características:
//- Silla: tendrá como atributos el número de patas,
//el precio y el color y como métodos, un método
//constructor que reciba tres argumentos y se los asigne
//a los atributos y un método mostrarCaract que muestre
//por pantalla los atributos de la silla

package com.dam1d.obj_2_05;

public class Silla {
	private int patas;
	private double precio;
	private String color;
	
	public Silla(int patas, double precio, String color ) {
		this.patas = patas;
		this.precio = precio;
		this.color = color;
	}
	
	public void mostrarCaract() {
		System.out.println("Nº de patas: "+this.patas+"\n"
						  +"Precio: "+this.precio+"\n"
						  +"Color: "+this.color);
	}

}
