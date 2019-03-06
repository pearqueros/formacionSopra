package com.vehiculos;

public class Coche extends Vehiculo {

	private boolean climatizacion;
	private int numPuertas;
	private int numAirbags;
	private static int numCoches =0;

	public Coche() {
		super();
		numCoches++;
	}

	public Coche(String fabricante, String matricula, int annio, String propietario, boolean climatizacion,
			int numPuertas, int numAirbags) {
		super(fabricante, matricula, annio, propietario);
		this.numAirbags = numAirbags;
		this.climatizacion = climatizacion;
		this.numPuertas = numPuertas;
		numCoches++;
	}

	public boolean isClimatizacion() {
		return climatizacion;
	}

	public void setClimatizacion(boolean climatizacion) {
		this.climatizacion = climatizacion;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public int getNumAirbags() {
		return numAirbags;
	}

	public void setNumAirbags(int numAirbags) {
		this.numAirbags = numAirbags;
	}

	public static int getNumCoches() {
		return numCoches;
	}

	@Override
	public String toString() {
		return "Número de puertas: " + getNumPuertas() + "\n¿Tiene climatización?: " + isClimatizacion()
				+ "\nNúmero de Airbags: " + isClimatizacion() + "\nNúmero de coches: " + getNumCoches() + 
				"\n" + super.toString();
	}
}
