package main;

import com.persona.Persona;

import numeros.Complejo;

public class Main {

	public static void main(String[] args) {
	/*	Persona persona1 = new Persona();
		persona1.solicitarImprimirNombre();
		
		Persona persona2 = new Persona("Pepe",20,1.9f);
		System.out.println("\n"+persona2);
		
		Persona persona3 = new Persona();
		System.out.println(persona3); */
		
		Complejo numComplejo1 = new Complejo(1.0,1.0);
		Complejo numComplejo2 = new Complejo(3.0,5.0);
		
		numComplejo1.sumar(numComplejo2);
		System.out.println(numComplejo1);
	}

}
