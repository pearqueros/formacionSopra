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


// Definimos el metodo main y dentro el programa con la consola.

public static void main(String[] args) {
	Persona persona1 = new Persona();
	
	Scanner scanner = new Scanner(System.in);
	
	//Nombre
	
	System.out.println("Introduzca su nombre");
	persona1.setNombre(scanner.next());
	System.out.println("Su nombre es: " +  persona1.getNombre() +"\n");
	
	//Edad
	
	System.out.println("Introduzca su edad");
	persona1.setEdad(scanner.nextInt());
	System.out.println("Su edad es: " + persona1.getEdad() + " años.\n");
	
	//Altura
	
	System.out.println("Introduzca su altura");
	persona1.setAltura(scanner.nextFloat());
	System.out.println("Su altura es: " + persona1.getAltura() + " metros.\n");
	
	Persona persona2 = new Persona("Luisa Perez", 32, (float) 1.7f);
}


// Aquí definimos los constructores Persona.


public Persona() {
}
public Persona(String nombre, int edad, float altura) {
	this.nombre = nombre;
	this.edad = edad;
	this.altura = altura;
	
	System.out.println("nombre=" + nombre);
	System.out.println("edad=" + edad);
	System.out.println("altura=" + altura);

	}





}
