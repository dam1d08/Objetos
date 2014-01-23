package com.dam1d.obj_4_01;

//1.- Realizar la clase Producto, cuyo objetivo es
//representar un producto de una tienda. Los atributos
//serán: nombre, código, precio, existencias.

public class Producto {
	
	private String nombre;
	private int cod;
	private double precio;
	private int existencias;
	private static int n = 0; //Esta es una variable de clase que sirve para asignar el código automáticamente
	
	//Constructor (inicializará las variables de la clase)
	public Producto() {
		n++;
		this.nombre = "";
		this.cod = n;
		this.precio = 0;
		this.existencias = 0;
		
	}
	
	//modificarPrecio (se le pasará como argumento el
	//nuevo precio)
	public void modificaPrecio(double p) {
		this.precio = p;
		
	}
	
	//modificarExistencias (se le pasará como argumento
	//las nuevas existencias)
	public void modificaExistencias(int e) {
		this.existencias = e;
	}
	
	//mostrarDatos (mostrará todos los datos del producto)
	public void mostrarDatos() {
		System.out.println( "Producto: "+this.cod+" "+this.nombre+"\n"
						   +"Precio: "+this.precio+"\n"
						   +"Existencias: "+this.existencias);
	}
	
	//Realizar un método principal ‘main’ que muestre el
	//menú:
	
	//Producto inicialmente vacío (suponemos que como máximo
	//habrá 20 productos).
	public static void main (String[] args) {
		Producto[] prod = new Producto[20];
		System.out.println("Seleccione una opción.\n"
				+ "n -> Introducir un nuevo producto.\n"
				+ "v -> Ver producto.\n"
				+ "p -> Modificar un precio\n"
				+ "e -> Modificar existencias.\n"
				+ "l -> Listar productos\n"
				+ "s -> Salir");
		char op = Leer.caracter();
		while ( op != 's' ) {
			switch (op) {
			//Introducir nuevo producto
			case 'n':
				int c = n;
				prod[c] = new Producto();
				System.out.print("Nombre: ");
				prod[c].nombre = Leer.cadena();
				System.out.print("Precio: ");
				prod[c].precio = Leer.doble();
				System.out.print("Existencias: ");
				prod[c].existencias = Leer.entero();
				break;
			
			//Mostrar datos de producto dado el código	
			case 'v':
				System.out.print("Codigo: ");
				c = Leer.entero();
				prod[c-1].mostrarDatos();
				break;
			
			//Modificar precio de producto dado el código
			case 'p':
				System.out.print("Codigo: ");
				c = Leer.entero();
				System.out.print("Nuevo precio: ");
				double pre = Leer.doble();
				prod[c-1].modificaPrecio(pre);
				break;
			
			//Modificar existencias de producto dado el código
			case 'e':
				System.out.print("Codigo: ");
				c = Leer.entero();
				System.out.print("Existencias actuales: ");
				int ex = Leer.entero();
				prod[c-1].modificaExistencias(ex);
				break;
			
			//Listar todos los productos
			case 'l':
				for (int i = 0; i < n; i++) prod[i].mostrarDatos();
				break;
			
			default:
				System.out.println("Opción no válida");
				break;
			}
			System.out.print("Seleccione una nueva opción: ");
			op = Leer.caracter();
			
		}
		System.out.println("Hasta luego.");
	}

}
