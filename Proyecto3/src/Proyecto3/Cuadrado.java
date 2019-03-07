package Proyecto3;

public class Cuadrado extends Figura {

	private double lado;

	public Cuadrado() {
		super();
	}

	public Cuadrado(String color, double lado) {
		super(color);
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public String toString() {
		String mensaje = super.toString() + " y su lado mide: " + lado + " cm";
		return mensaje;
	}

	@Override
	public double calculaArea() {
		return lado * lado;
	}

}
