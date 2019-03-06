package com.vehiculos;

public class Bicicleta extends Vehiculo {

	private TipoBicicleta tipoBicicleta;
	private static int numBicis;

	public Bicicleta() {
		super();
		this.tipoBicicleta = TipoBicicleta.CIUDAD;
		numBicis = 0;
	}

	public Bicicleta(String fabricante, String matricula, int annio, String propietario, TipoBicicleta tipoBicicleta) {
		super(fabricante, matricula, annio, propietario);
		this.tipoBicicleta = tipoBicicleta;
		numBicis++;
	}

	public TipoBicicleta getTipoBicicleta() {
		return tipoBicicleta;
	}

	public void setTipoBicicleta(TipoBicicleta tipoBicicleta) {
		this.tipoBicicleta = tipoBicicleta;
	}

	public int getNumBicis() {
		return numBicis;
	}

	@Override
	public String toString() {
		return "El tipo de bicicleta es: " + getTipoBicicleta() + "\nNúmeros de bicicletas: " + getNumBicis() + "\n"
				+ super.toString();
	}

}
