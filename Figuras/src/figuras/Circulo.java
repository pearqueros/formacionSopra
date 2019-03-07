package figuras;

public class Circulo extends Figura {
	
	private double radio;
	private static final double pi=3.14;
	
	
	//constructor
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	//area
	@Override
	public double calcularArea() {
		double area=pi*radio*radio;
		System.out.println("El área del circulo es: "+ area+"cm2");
		return area;
	}
}
