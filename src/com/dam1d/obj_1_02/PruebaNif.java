package com.dam1d.obj_1_02;

public class PruebaNif {

	public static void main(String[] args) {
		System.out.println("Introduce un NIF sin letra");
		int nif = Leer.entero();
		char letra = CalculoLetraNif.getLetra(nif);
		//System.out.print(nif);
		System.out.print(letra);

	}

}
