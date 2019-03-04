package com.persona;

import java.util.Scanner;

public class Persona {

	private String nombre;
	private int edad;
	private float altura;
	
	public Persona() {
		this.altura = 1.70f;
		this.edad = 32;
		this.nombre = "Luisa Pérez";
		
	}
	public Persona(String nombre, int edad, float altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public void solicitarImprimirNombre() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduzca el nombre: ");
		this.setNombre(scanner.next());
		System.out.print("Introduzca su edad: ");
		this.setEdad(scanner.nextInt());
		System.out.print("Introduzca su altura: ");
		this.setAltura(scanner.nextFloat());
		System.out.print(toString());
	}
	@Override
	public String toString() {
		return "El usuario se llama "+ this.getNombre() + " cuya edad es "+ this.getEdad()+" y su altura es: "+ this.getAltura();
	}
	
	
	
}
