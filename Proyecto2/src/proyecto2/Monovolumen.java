package proyecto2;

public class Monovolumen extends Coche {

	public Monovolumen() {
		super();
	}

	public Monovolumen(String fabricante, String matricula, int anio, String propietario, boolean climatizador,
			int numeroPuertas, int numeroAirbags) {
		super(fabricante, matricula, anio, propietario, climatizador, numeroPuertas, numeroAirbags);
	}

	public String toString() {
		return super.toString();
	}

}
