package com.clases;

public class Circulo extends Figura {
	private double radio;
	private static final double PI = 3.14;

	public Circulo() {
		super();
	}

	public Circulo(String color, double radio) {
		super(color);
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public double calcularArea() {
		return Math.pow(getRadio(), getRadio()) * PI;
	}

}
