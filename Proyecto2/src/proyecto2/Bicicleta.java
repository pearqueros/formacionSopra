package proyecto2;

public class Bicicleta extends Vehiculo {

	private TipoBicicleta tipoBicicleta;

	public Bicicleta() {
		super();
	}

	public Bicicleta(String fabricante, String matricula, int anio, String propietario, TipoBicicleta tipoBicicleta) {
		super(fabricante, matricula, anio, propietario);
		this.tipoBicicleta = tipoBicicleta;
	}

	public TipoBicicleta getTipoBicicleta() {
		return tipoBicicleta;
	}

	public void setTipoBicicleta(TipoBicicleta tipoBicicleta) {
		this.tipoBicicleta = tipoBicicleta;
	}

	public String toString() {
		String mensaje = super.toString() + "\nLa bicicleta es de: " + tipoBicicleta;
		return mensaje;
	}

}
