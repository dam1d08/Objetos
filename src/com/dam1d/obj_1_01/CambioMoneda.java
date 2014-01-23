//1.- Crea una clase llamada CambioMoneda con los
//métodos Adolar, Alibras, Arublos y Apts. Estos métodos
//deben recibir desde otro programa PruebaCambio una
//cantida en euros y realizaran la conversión
//correspondiente.
//1€=1,26$
//1€=0,86 libras
//1€=43,14 rublos
//1€=166,38 pts


package com.dam1d.obj_1_01;

public class CambioMoneda {
	
	public static double Adolar(double eur) {
		return eur * 1.26;
		
	}
	
	public static double Alibras(double eur) {
		return eur * 0.86;
		
	}
	
	public static double Arublos(double eur) {
		return eur * 43.14;
		
	}
	
	public static double Apts(double eur) {
		return eur * 166.38;
		
	}
	

}
