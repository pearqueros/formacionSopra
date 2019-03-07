package Proyecto3;

public abstract class Figura {

	private String color;

	/* constructores */
	public Figura() {
		this.color = " ";
	}

	public Figura(String color) {
		this.color = color;
	}

	/* metodos get y set */
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return "El color de la figura es " + color;
	}

	public abstract double calculaArea();

}
