package com.dam1d.obj_4_01;

	import java.util.Scanner;
	public class Leer{
		static int entero(){
			Scanner teclado=new Scanner(System.in);
			int n;
		//	System.out.print(" Dame un nº: ");
			n=teclado.nextInt();
			return n;
		}
		static double doble(){
			Scanner teclado=new Scanner(System.in);
			double n;
		//	System.out.print(" Dame un nº(con decimales): ");
			n=teclado.nextDouble();
			return n;
		}

		static String cadena(){
			Scanner teclado=new Scanner(System.in);
			String n;
		//	System.out.print(" Dame una cadena de caracteres: ");
			n=teclado.next();
			return n;
		}
		static String linea(){
			Scanner teclado=new Scanner(System.in);
			String n;
		//	System.out.print(" Dame una linea de caracteres: ");
			n=teclado.nextLine();
			return n;
		}
                static char caracter(){
			Scanner teclado=new Scanner(System.in);
			String m;
                        char n;
                        m=teclado.next();
                        n=m.charAt(0);
			return n;
		}
	}

