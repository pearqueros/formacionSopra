package PracticaT4;

import java.util.Scanner;

public class Persona {

	String nombre;
	int edad;
	float altura;
	

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
	
	
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduzca su nombre");
		String nombreIntroducido = scanner.nextLine();
		
		System.out.println("Introduzca su edad");
		int edadIntroducida = scanner.nextInt();
		
		System.out.println("Introduzca su altura");
		float alturaIntroducida = scanner.nextFloat();
		
		Persona persona1 = new Persona();
		Persona persona2 = new Persona(nombreIntroducido, edadIntroducida, alturaIntroducida);
		

}
	public Persona() {
		
		nombre = "Luisa Peréz";
		edad = 32;
		altura = 1.70f;
		
		
	}
	
	public Persona(String nombreIntroducido, int edadIntroducida, float alturaIntroducida) {
		
		this.nombre = nombreIntroducido;
		this.edad = edadIntroducida;
		this.altura = alturaIntroducida;
		
		
		System.out.println("Nombre:" + nombreIntroducido);
		System.out.println("Edad:" + edadIntroducida);
		System.out.println("Altura:" + alturaIntroducida);
	}
	
	
}


