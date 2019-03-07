package proyecto2;

public class Coche extends Vehiculo {

	private boolean climatizador;
	private int numeroPuertas;
	private int numeroAirbags;
	private static int numCoches;

	public Coche() {
		super();
		numCoches++;
	}

	public Coche(String fabricante, String matricula, int anio, String propietario, boolean climatizador,
			int numeroPuertas, int numeroAirbags) {
		super(fabricante, matricula, anio, propietario);
		this.climatizador = climatizador;
		this.numeroPuertas = numeroPuertas;
		this.numeroAirbags = numeroAirbags;
		numCoches++;
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

	public int getNumeroAirbags() {
		return numeroAirbags;
	}

	public void setNumeroAirbags(int numeroAirbags) {
		this.numeroAirbags = numeroAirbags;
	}

	public String toString() {
		String mensaje = super.toString() + "\nEl coche tiene climatizador: " + climatizador + ", tiene "
				+ numeroPuertas + " puertas, tiene " + numeroAirbags + " sensores de airbags y hay "+numCoches+" coches.";
		return mensaje;
	}

}
