package com.dam1d.obj_2_03;

public class PruebaPunto {

	public static void main(String[] args) {
		Punto A = new Punto(Math.random(), Math.random(), Math.random());
		Punto B = new Punto(Math.random(), Math.random(), Math.random());
		Punto C = new Punto(Math.random(), Math.random(), Math.random());
		
		System.out.print("Punto A: ");
		A.MuestraPunto();
		System.out.print("Punto B: ");
		B.MuestraPunto();
		System.out.print("Punto C: ");
		C.MuestraPunto();
		
		System.out.println("");
		
		System.out.println("A - B = "+ A.Distancia(B));
		System.out.println("A - C = "+ A.Distancia(C));
		System.out.println("B - C = "+ B.Distancia(C));

	}

}
