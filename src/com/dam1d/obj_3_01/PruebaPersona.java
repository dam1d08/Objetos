package com.dam1d.obj_3_01;

public class PruebaPersona {

	public static void main(String[] args) {
		
		Oficio ofi = new Oficio("Mamporrero", 1265.30, "Zamora");
		Persona A = new Persona("76971146J", "Oswaldo", 42, ofi);
		Persona B = new Persona("00000000T", "Celedonio", 46, ofi);
		
		A.mostrarCaract();
		B.mostrarCaract();
		
		if (A.getEdad()>B.getEdad()) {
			System.out.println(A.getNombre()+" es el mayor");
		} else {
			System.out.println(B.getNombre()+" es el mayor");
		}
		System.out.println("Cobran "+A.obtSueldo()+" euros al mes.\n"+
							"Lo que supone "+ofi.obtSueldoAnual()+" euros aunales.");

	}

}
