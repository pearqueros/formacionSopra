package herencia;

public class Todoterreno extends Coche {
	private boolean cuatroXcuatro;
	static int numTodoterreno = 0;

	public Todoterreno(String fabricante, String matr�cula, int ageMatriculacion, String propietario) {
		super(fabricante, matr�cula, ageMatriculacion, propietario);
		super.incrementaVehiculo();
		numTodoterreno++;
	}

	public boolean isCuatroXcuatro() {
		return cuatroXcuatro;
	}

	public void setCuatroXcuatro(boolean cuatroXcuatro) {
		this.cuatroXcuatro = cuatroXcuatro;
	}

	public static int getNumTodoterreno() {
		return numTodoterreno;
	}

	@Override
	public String toString() {
		return super.toString()+ "Todoterreno [cuatroXcuatro=" + cuatroXcuatro + "]";
	}
	
	
}
