package PracticaGit;

import java.util.Scanner;

public class Persona {

	private String nombre;
	private int edad;
	private float altura;
	
	
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
	
	//Método constructor.
	
	public Persona() {
	}
	
	public Persona(String nombre, int edad, float altura) {
		
		this.nombre = nombre;
		
		this.edad = edad;
		 
		this.altura = altura;
		
		System.out.println("nombre = " + nombre);
		
		System.out.println("edad = " + edad);
		
		System.out.println("altura = " + altura);
	}
	
	
	
}


