package practica_t4;

import java.util.Scanner;

public class Test {
	public static void main(String[]args){
		Persona per = new Persona();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduzca nombre");
		String nombre = scanner.next();
		System.out.println("Introduzca edad");
		int edad = scanner.nextInt();
		System.out.println("Introduzca altura");
		float altura = scanner.nextFloat(); 
		per.setAltura(altura);
		per.setNombre(nombre);
		per.setEdad(edad);
		int edadLuisa = 16;
		
		Persona per2 = new Persona("Luisa Perez", edadLuisa, altura);
		
	}

}
