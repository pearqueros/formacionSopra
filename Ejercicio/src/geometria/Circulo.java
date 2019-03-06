package geometria;

public class Circulo extends Figura {

	private double radio;
	
	public Circulo(double radio, String color){
		super.setColor(color);
		this.radio = radio;
	}
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return (Math.pow(radio,2)*Math.PI);
	}
	
	@Override
	public String toString() {
		return "El area del circulo es " + calcularArea();
	}

}
