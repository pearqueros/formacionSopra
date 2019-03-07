package proyecto2;

public class Motocicleta extends Vehiculo {

	private boolean tieneCasco;

	/* Constructores */
	public Motocicleta() {
		super();
	}

	public Motocicleta(String fabricante, String matricula, int anio, String propietario, boolean tieneCasco) {
		super(fabricante, matricula, anio, propietario);
		this.tieneCasco = tieneCasco;
	}

	public boolean isTieneCasco() {
		return tieneCasco;
	}

	public void setTieneCasco(boolean tieneCasco) {
		this.tieneCasco = tieneCasco;
	}

	public String toString() {
		String mensaje = super.toString() + "\nLa motocicleta tiene casco: " + tieneCasco;
		return mensaje;
	}

}
