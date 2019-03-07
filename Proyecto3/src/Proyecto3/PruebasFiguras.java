package Proyecto3;

import Proyecto3.Triangulo;

public class PruebasFiguras {

	public static void main(String[] args) {

		Triangulo triangulo = new Triangulo("Amarillo", 2.0, 4.0);
		System.out.println(triangulo + ". Su �rea es: " + triangulo.calculaArea());

		Cuadrado cuadrado = new Cuadrado("Azul", 3.0);
		System.out.println(cuadrado + ". Su �rea es: " + cuadrado.calculaArea());
	}

}
