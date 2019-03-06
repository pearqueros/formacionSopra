package herencia;

public class Coche extends Vehiculo {

	private int numeroEirbag;
	private boolean climatizador;
	private int numeroPuertas;
	static int numeroCoche = 0;
	
	public int getNumeroEirbag() {
		return numeroEirbag;
	}

	public void setNumeroEirbag(int numeroEirbag) {
		this.numeroEirbag = numeroEirbag;
	}

	public boolean isClimatizador() {
		return climatizador;
	}

	public void setClimatizador(boolean climatizador) {
		this.climatizador = climatizador;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	public int getNumeroCoche() {
		return numeroCoche;
	}

	public Coche(String fabricante, String matrícula, int ageMatriculacion, String propietario) {
		super(fabricante, matrícula, ageMatriculacion, propietario);
	}
	
	@Override
	public String toString() {
		return super.toString() + "Coche [getNumeroEirbag()=" + getNumeroEirbag() + ", isClimatizador()=" + isClimatizador()
				+ ", getNumeroPuertas()=" + getNumeroPuertas() + ", getNumeroCoche()=" + getNumeroCoche() + "]";
	}

	public void incrementaVehiculo ()
	{
		super.numVehiculo++;
		numeroCoche++;
	}

}
