//2.- Escribe la clase Circulo, que recibe como
//parámetro el radio de la circunferencia y que contiene
//los siguientes métodos:
//public double area(){...}
//public double perimetro(){...}


package com.dam1d.obj_2_02;

public class Circulo {
	double radio;
	private static double pi = 3.141592;
	public Circulo() {
		this.radio = 1;
	}
	
	public Circulo(double r) {
		this.radio = r;
		
	}
	
	public double area() {
		double area = this.radio * this.radio * pi;
		return area;
	}
	
	public double perimetro() {
		double perimetro = 2 * this.radio * pi;
		return perimetro;
		
	}

}
