package Proyecto1_1;

import java.util.Scanner;

public class Persona {

	String nombre;
	int edad;
	float altura;
	
	/*Cpnstructor de Persona*/
	public Persona() {
		this.altura=1.70f;
		this.nombre= "Luisa Perez";
		this.edad= 32;
		}
	
	public Persona(float alt, int ed, String n) {
		this.altura= alt;
		this.edad= ed;
		this.nombre= n;
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
	
	/*Solicita nombre */
	
	public void solicitaUsuario () {
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduzca el nombre:");
		String newNombre = sc.next();
		this.setNombre(newNombre);
		System.out.println("El nombre introducido es:"+ newNombre);
		System.out.println("Introduzca edad:");
		int newEdad = sc.nextInt();
		System.out.println("la edad introducida es:"+ newEdad);
		System.out.println("Introduzca altura");
		float newAltura = sc.nextFloat();
		System.out.println("la altura introducida es:"+ newAltura);
	}
	
	

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Persona))
			return false;
		Persona other = (Persona) obj;
		if (Float.floatToIntBits(altura) != Float.floatToIntBits(other.altura))
			return false;
		if (edad != other.edad)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	public String toString (){
        String mensaje="El usuario se llama "+nombre+" tiene "+edad+" años "+" y mide "+ altura;
        return mensaje;
    }
	
	
	
	/*METODO PRINCIPAL*/
	public static void main (String [] args) {
		Persona p= new Persona();
		p.solicitaUsuario();
		System.out.println(p);
		Persona p2= new Persona(1.7f,22,"Paula");
		System.out.println(p2);
	}
	
}
