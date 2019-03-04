package Ejercicio1;

import java.util.Scanner;

import javax.activation.MailcapCommandMap;

public class Persona {
	
	String nombre;
	int edad;
	float altura;
//nombre	
	String getNombre() { 
		return nombre;
	}
	void setNombre(String nom){
		nombre=nom;
	}	
//Edad
	
	int getEdad() { 
		return edad;
	}
	void setEdad(int age){
		edad=age;
	}
//altura	
	float getAltura() { 
		return altura;
	}
	void setAltura(float alt){
		altura=alt;
	}	

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		Scanner Scanner2 = new Scanner(System.in);
		Scanner Scanner3 = new Scanner(System.in);		
		System.out.print("Introduzca su nombre : ");		
		String nombre = Scanner.next();
		String nLuisa = "Luisa Pérez";
	    int eLuisa = 32;
	    float aLuisa = 1.70F;
	
		
		System.out.print("Introduzca su edad : ");
		int edad = Scanner2.nextInt(); 

		
		System.out.print("Introduzca su altura : ");
		float altura = Scanner3.nextFloat();
//		muestro en pantalla
		System.out.print("***** RESUSTADO *******"+"\n");			
		System.out.print("Su nombre es : "+ nombre+"\n");		
		System.out.print("Su edad es : "+edad+"\n");			
		System.out.print("Su altura es : "+altura+"\n");
		
	    Persona Persona2 = new Persona(nLuisa,eLuisa,aLuisa);    
		System.out.print(Persona2.getNombre()+"\n");		
		System.out.print(Persona2.getEdad()+"\n");			
		System.out.print(Persona2.getAltura()+"\n");	    
	}
    public Persona (String nombre, int edad, float altura) {
   	 this.nombre=nombre;
   	 this.edad=edad;
   	 this.altura=altura;
    }
    public Persona () {
       }    
}
