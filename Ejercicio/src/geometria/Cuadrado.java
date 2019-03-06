package geometria;

public class Cuadrado extends Figura {
	private double lado;
	
	public Cuadrado(double lado, String color)
	{
		super.setColor(color);
		this.lado = lado;
	}
	
	public double getLado() {
		return lado;
	}
	
	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return getLado()*getLado();
	}

	@Override
	public String toString() {
		return "El area del cuadrado es " + calcularArea() + " Es de color " +super.getColor();
	}
	
	

}
