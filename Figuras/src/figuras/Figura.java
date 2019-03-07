package figuras;

public abstract class Figura {
	
	//Atributo color con getters/setters
	
	protected String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//Metodo abstracto Area

	public abstract double calcularArea();
	
}
