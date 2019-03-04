package PracticaGit;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Persona persona1 = new Persona();
		
		//Nombre
		
		System.out.println("Introduzca un nombre");
		
		persona1.setNombre(scanner.next());
		
		System.out.println("Su nombre es " + persona1.getNombre() + "\n");
		
		//Edad
		
		System.out.println("Introduzca una edad");
		
		persona1.setEdad(scanner.nextInt());
		
		System.out.println("La edad de " + persona1.getNombre() + " es " + persona1.getEdad() + " años.\n");
		
		//Altura(cm)
		
	    System.out.println("Introduzca una altura");
		
	    persona1.setAltura(scanner.nextFloat());
		
		System.out.println("La estatura de " + persona1.getNombre()+ " es " + persona1.getAltura() + "m.\n");
		
		//Aplicación del método constructor.
		Persona persona2 = new Persona("Luisa Perez", 32, 1.7f);
		
	}

}
