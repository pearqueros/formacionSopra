package com.vehiculos;

public class Todoterreno extends Coche {

	private boolean cuatroPorCuatro;
	private static int todoTerreno = 0;

	public Todoterreno() {
		super();
		todoTerreno++;
	}

	public Todoterreno(String fabricante, String matricula, int annio, String propietario, boolean climatizacion,
			int numPuertas, int numAirbags, boolean cuatroPorCuatro) {
		super(fabricante, matricula, annio, propietario, climatizacion, numPuertas, numAirbags);
		this.cuatroPorCuatro = cuatroPorCuatro;
		todoTerreno++;
	}

	public boolean iscuatroPorCuatro() {
		return cuatroPorCuatro;
	}

	public void setcuatroPorCuatro(boolean cuatroPorCuatro) {
		this.cuatroPorCuatro = cuatroPorCuatro;
	}

	public static int getTodoTerreno() {
		return todoTerreno;
	}

	@Override
	public String toString() {
		return "¿Es 4x4?: " + iscuatroPorCuatro() + "/nNúmero de todoTerrenos: " + getTodoTerreno() + "/n"
				+ super.toString();
	}

}
