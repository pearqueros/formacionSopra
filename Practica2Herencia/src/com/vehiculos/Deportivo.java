package com.vehiculos;

public class Deportivo extends Coche {

	private boolean descapotable;
	private static int numDeportivo =0;

	public Deportivo() {
		super();
		numDeportivo++;
	}

	public Deportivo(String fabricante, String matricula, int annio, String propietario,
			boolean climatizacion, int numPuertas, int numAirbags,boolean descapotable) {
		super(fabricante, matricula, annio, propietario, climatizacion, numPuertas, numAirbags);
		this.descapotable = descapotable;
		numDeportivo++;
	}

	public boolean isDescapotable() {
		return descapotable;
	}

	public void setDescapotable(boolean isDescapotable) {
		this.descapotable = isDescapotable;
	}

	public static int getnumDeportivo() {
		return numDeportivo;
	}

	@Override
	public String toString() {
		return "¿Es descapotable?: "+isDescapotable()+"/nNúmero de deportivos: "+getnumDeportivo()+"/n"+super.toString();
	}
	
	
}
