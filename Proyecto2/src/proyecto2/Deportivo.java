package proyecto2;

public class Deportivo extends Coche {

	private boolean esDescapotable;

	public Deportivo() {
		super();
	}

	public Deportivo(String fabricante, String matricula, int anio, String propietario, boolean climatizador,
			int numeroPuertas, int numeroAirbags, boolean esDescapotable) {
		super(fabricante, matricula, anio, propietario, climatizador, numeroPuertas, numeroAirbags);
		this.esDescapotable = esDescapotable;
	}

	public boolean isEsDescapotable() {
		return esDescapotable;
	}

	public void setEsDescapotable(boolean esDescapotable) {
		this.esDescapotable = esDescapotable;
	}

	public String toString() {
		String mensaje = super.toString() + " ¿Es descapotable? " + esDescapotable;
		return mensaje;
	}
}
