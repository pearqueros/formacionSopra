package figuras;

public class Triangulo extends Figura{
	
	private double base;
	private double altura;
	
	
	//constructor
	public Triangulo(double base, double altura) {
		super();
		this.base= base;
		this.altura=altura;
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



	//area
	@Override
	public double calcularArea() {
		double area=base*altura*0.50;
		System.out.println("El área del triangulo es: "+ area+"cm2");
		return area;
	}

}
