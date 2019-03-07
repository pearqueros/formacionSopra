package figuras;

public class Cuadrado extends Figura {

	private double lado;
	
	
	//constructor
	public Cuadrado(double lado) {
		super();
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}
	
	//area
	@Override
	public double calcularArea() {
		double area=lado*lado;
		System.out.println("El área del cuadrado es: "+ area+"cm2");
		return area;
	}
}
