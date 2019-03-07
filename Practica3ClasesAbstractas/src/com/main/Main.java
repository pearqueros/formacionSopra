package com.main;

import com.clases.Circulo;
import com.clases.Cuadrado;
import com.clases.Figura;
import com.clases.Triangulo;

public class Main {

	public static void main(String[] args) {
		Figura cuadrado = new Cuadrado("Blanco", 5);
		System.out.println("El área del cuadrado es: "+ cuadrado.calcularArea());
		
		Figura triangulo = new Triangulo("Azul", 3.5, 1.5);
		System.out.println("El área del triángulo es: "+ triangulo.calcularArea());
		
		Figura circulo = new Circulo("rojo", 2);
		System.out.println("El área del círculo es: "+ circulo.calcularArea());
		

	}

}
