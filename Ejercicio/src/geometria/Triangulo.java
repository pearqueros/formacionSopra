package geometria;

public class Triangulo extends Figura {
	
	private double base;
	private double altura;
	
	public Triangulo(double base, double altura,  String color)
	{
		super.setColor(color);
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

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return (getBase()*getAltura())/2;
	}
	
	@Override
	public String toString() {
		return "El area del triangulo es " + calcularArea();
	}

}
