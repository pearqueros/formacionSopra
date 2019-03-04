
package PracticaT4;			//Paquete principal

import java.util.Scanner;		//Imports

public class Persona {		//Definicion de la clase

//Atributos
	private String nombre;
	private int edad;
	private float altura;
	
//Getters and Setters	
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
	
//Metodo main
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	

	System.out.println("Introduzca el nombre de usuario: ");
	String nombreIntro = scanner.next();

	
	System.out.println("Introduzca la edad del usuario: ");
	int edadIntro = scanner.nextInt();

	
	System.out.println("Introduzca la altura del usuario: ");
	float alturaIntro = scanner.nextFloat();
	
	
	
	
	Persona persona1 = new Persona();	//Creamos a Luisa perez
	Persona persona2 = new Persona(nombreIntro, edadIntro, alturaIntro);

	
//Mostramos los atributos de la segunda persona
	System.out.println("El nombre del usuario es: "+persona2.nombre);
	System.out.println("La edad del usuario es: "+persona2.edad);
	System.out.println("La altura del usuario es: "+persona2.altura);
	

	}

	
//Primer Constructor,parámetros fijos
		public Persona () {
			
			nombre="Luisa Perez";
			edad=32;
			altura=1.70f;
		}

//Segundo Constructor, le pasamos los parámetros
	public Persona (String nombre,int edad,float altura) {
		
		
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
	}

}


