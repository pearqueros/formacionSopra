package com.vehiculos;

public class Monovolumen extends Coche{

	
	public Monovolumen() {
		super();
	}

	public Monovolumen(String fabricante, String matricula, int annio, String propietario,
			boolean climatizacion, int numPuertas, int numAirbags) {
		super(fabricante, matricula, annio, propietario, climatizacion, numPuertas, numAirbags);
	}

	@Override
	public String toString() {
		return "Monovolumen"+ "/n"+super.toString();
	}

	
}
