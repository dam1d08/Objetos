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

public class PruebaCambio {

	public static void main(String[] args) {
		System.out.print("Introduce un valor en euros: ");
		double eur = Leer.doble();
		double cambio = 0;
		String moneda = "";
		while (eur != 0) {
			boolean flag = true;
			System.out.print( "¿A qué moneda quieres cambiar?\n"
							+ "1 -> Dólares\n"
							+ "2 -> Libras\n"
							+ "3 -> Rublos\n"
							+ "4 -> Pesetas\n" );
			while(flag) {
				int m = Leer.entero();
				switch (m) {
				case 1:
					cambio = CambioMoneda.Adolar(eur);
					moneda = "dólares";
					flag = false;
					break;
					
				case 2:
					cambio = CambioMoneda.Alibras(eur);
					moneda = "libras";
					flag = false;
					break;
					
				case 3:
					cambio = CambioMoneda.Arublos(eur);
					moneda = "rublos";
					flag = false;
					break;
					
				case 4:
					cambio = CambioMoneda.Apts(eur);
					moneda = "pesetas";
					flag = false;
					break;

				default:
					System.out.println("Opción incorrecta.\n"
									+ "Introduzca un valor entre uno y cuatro");
					flag = true;
					break;
				}
				
			}
			System.out.println(eur+" euros son "+cambio+" "+moneda+".");
			System.out.print("Introduce un valor en euros: ");
			eur = Leer.doble();
			
		}

	}

}
