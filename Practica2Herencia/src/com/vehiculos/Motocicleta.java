package com.vehiculos;

public class Motocicleta extends Vehiculo{

	private boolean tieneCasco;

	public Motocicleta() {
		super();
	}

	public Motocicleta(String fabricante, String matricula, int annio, String propietario,boolean tieneCasco) {
		super(fabricante, matricula, annio, propietario);
		this.tieneCasco= tieneCasco;
	}

	public boolean isTieneCasco() {
		return tieneCasco;
	}

	public void setTieneCasco(boolean tieneCasco) {
		this.tieneCasco = tieneCasco;
	}

	@Override
	public String toString() {
		return "¿La moto tiene casco?: "+isTieneCasco()+"\n"+super.toString();
	}
	
	

}
