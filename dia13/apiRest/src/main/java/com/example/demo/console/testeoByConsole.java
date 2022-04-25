package com.example.demo.console;


import java.util.*;
import com.example.*;
import com.example.demo.controller.PersonaController;
import com.example.demo.model.Persona;
import com.example.demo.repository.PersonaRepository;
public class testeoByConsole {

	
	static void opcionesUsuario() {
		
		int opcion;
		Scanner sc = new Scanner (System.in);
		do {
			System.out.println("1- Crear Usuario");
			System.out.println("2- Listar Usuarios");
			System.out.println("3- Buscar Usuario");
			System.out.println("4- Deletear Usuario");
			System.out.println("0- Retroceder");
			opcion = sc.nextInt();
			switch(opcion) {
			case 0: System.out.println("Retrocediendo"); break;
			case 1: crearPersona(); break;
			}
		}while (opcion != 0);
	}
	
	
	static void crearPersona() {
		String nombre, apellido, email;
		int opcion, edad, count = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su nombre");
		nombre = sc.next();
		System.out.println("Ingrese su apellido");
		apellido = sc.next();
		System.out.println("Ingrese su email");
		email = sc.next();
		System.out.println("Ingrese su edad");
		edad = sc.nextInt();
		Persona persona = new Persona("",nombre, apellido, email, edad);
		PersonaController controlador = null; //Ver como quitaria el null para no matar el programa
		controlador.save(persona);
		System.out.println("Persona registrada (En teoria)");
	}
	
	
	static void opcionesProducto() {
		
	}
	
	static void opcionesCliente() {
		
	}
	public static void main (String [] args) {
		
		
		System.out.println("Bienvenido a esta tienda sin nombre");
		Scanner sc = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("1- Acceder a opciones de Usuario");
			System.out.println("2- Acceder a opciones de Productos");
			System.out.println("3- Acceder a opciones de Clientes");
			System.out.println("4- Registrarse talvez");
			System.out.println("0- Salir");
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 0 : System.out.println("Gracias, vuelva prontos"); break;
			case 1: opcionesUsuario();break;
			case 2: opcionesProducto(); break;
			case 3: opcionesCliente(); break;
			default: System.out.println("Opcion incorrecta"); break;
			}
			
		}while (opcion != 0);
	}
}
