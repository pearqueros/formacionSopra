package com.clases;

public class Triangulo extends Figura {
	private double base;
	private double altura;

	public Triangulo() {
		super();
	}

	public Triangulo(String color, double base, double altura) {
		super(color);
		this.altura = altura;
		this.base = base;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return (getBase() * getAltura() / 2);
	}

}
