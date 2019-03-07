package proyecto2;

public class Todoterreno extends Coche {

	private boolean es4X4;
	private static int numTodoTerrenos;

	public Todoterreno() {
		super();
		numTodoTerrenos++;
	}

	public Todoterreno(String fabricante, String matricula, int anio, String propietario, boolean climatizador,
			int numeroPuertas, int numeroAirbags, boolean es4X4) {
		super(fabricante, matricula, anio, propietario, climatizador, numeroPuertas, numeroAirbags);
		this.es4X4 = es4X4;
		numTodoTerrenos++;
	}

	public boolean esEs4X4() {
		return es4X4;
	}

	public void setEs4X4(boolean es4x4) {
		es4X4 = es4x4;
	}

	public String toString() {
		String mensaje = super.toString() + " ¿Es 4x4? " + es4X4+ " y hay "+numTodoTerrenos+" todoterrenos";
		return mensaje;
	}

}
