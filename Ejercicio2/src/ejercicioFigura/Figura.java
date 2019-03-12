package ejercicioFigura;

public abstract class Figura {
	
	private String color;

	public abstract double calcularArea();

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}