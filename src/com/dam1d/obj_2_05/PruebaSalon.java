//Codificar por último una clase principal que cree un
//objeto Silla que sea verde, con tres patas y cueste
//27,8 € y además cree un objeto Salón de 34 mt2, 3
//ventanas y tenga como su atributo silla el objeto Silla
//creado anteriormente. Finalmente el programa mostrará
//las características del salón (utilizando la llamada al
//método correspondiente).

package com.dam1d.obj_2_05;

public class PruebaSalon {

	public static void main(String[] args) {
		Silla[] s = new Silla[10];
		for (int i = 0; i < s.length; i++) {
			s[i] = new Silla((i%2+3), (30.2+i), "Negro");
		}
		Salon2 sal = new Salon2(34, 3, s);
		sal.mostrarCaract();

	}

}
