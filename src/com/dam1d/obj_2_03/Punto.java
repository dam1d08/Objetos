//3.- Declarar una clase correspondiente a objetos
//Punto,caracterizados
//por
//sus
//tres
//coordenadas
//espaciales. Debe tener un método constructor. Debe
//tener además un método que devuelva la distancia entre
//el objeto Punto que invoca el método y otro objeto
//Punto pasado como argumento. Crear otro método para
//averiguar la distancia entre dos puntos pasados como
//argumento. ¿Alguno de los métodos anteriores será
//static? Crear además una clase Principal (con método
//main) que cree tres objetos punto con coordenadas
//cualesquiera e imprima la distancia entre cada par de
//puntos.


package com.dam1d.obj_2_03;

public class Punto {
	private double x;
	private double y;
	private double z;
	
	public Punto(double coord_x, double coord_y, double coord_z) {
		
		this.x = coord_x;
		this.y = coord_y;
		this.z = coord_z;
	}
	
	public void MuestraPunto() {
		System.out.println("("+this.x+", "+this.y+", "+this.z+")");
	}
	
	public double Distancia(Punto A) {
		double distancia = Math.sqrt(Math.pow(this.x-A.x,2)+Math.pow(this.y-A.y,2)+Math.pow(this.z-A.z,2));
		return distancia;
		
	}
	
	public static double Distancia(Punto A, Punto B) {
		double distancia = Math.sqrt(Math.pow(B.x-A.x,2)+Math.pow(B.y-A.y,2)+Math.pow(B.z-A.z,2));
		return distancia;
		
	}

}
