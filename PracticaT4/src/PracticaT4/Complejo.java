package PracticaT4;

public class Complejo {

	double parteReal;
	double parteImag;
	
	public Complejo() {
		
		parteReal = 0;
		parteImag = 0;
	}
	 public Complejo(double parteReal, double parteImag) {
		 this.parteReal = parteReal;
		 this.parteImag = parteImag;
	 }
	 
	public double getParteReal() {
		return parteReal;
	}
	
	public void setParteReal(double parteReal) {
		this.parteReal = parteReal;
	}
	
	public double getParteImag() {
		return parteImag;
	}
	
	public void setParteImag(double parteImag) {
		this.parteImag = parteImag;
	}
	 
	
	public String toString(Complejo numero) {
		String cadena;
		cadena = numero.parteReal +"+"+numero.parteImag;
		return cadena;
	}
	
	
	public void sumar(Complejo b) {
		
		double sumReal = this.parteReal + b.parteReal;
		double sumImag = this.parteImag + b.parteImag;
		System.out.println("La suma de la parte real es:"+ sumReal);
		System.out.println("La suma de la parte imaginaria es:"+ sumImag);
	}
	
	public static void main(String[] args) {
		
		Complejo numero1 = new Complejo(1.0, 2.3);
		Complejo numero2 = new Complejo(2.4, 3.6);
		
		numero1.sumar(numero2);
		
	}
		
}
