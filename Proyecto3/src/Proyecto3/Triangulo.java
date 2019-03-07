package Proyecto3;

public class Triangulo extends Figura {

	private double base;
	private double altura;

	public Triangulo() {
		super();
	}

	public Triangulo(String color, double base, double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String toString() {
		String mensaje = super.toString() + ", la base es: " + base + " y la altura: " + altura;
		return mensaje;
	}

	@Override
	public double calculaArea() {
		return (base * altura) / 2;
	}

}
