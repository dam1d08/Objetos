package com.dam1d.obj_1_02;

public class CalculoLetraNif {
	
	private static String clave = "TRWAGMYFPDXBNJZSQVHLCKE";
	
	public static char getLetra(int nif) {
		return clave.charAt(nif%23);
		
	}

}
