package PracticaGit;

public class Complejo {

	private double real;
	private double imag;
	private double suma;
	
	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImag() {
		return imag;
	}

	public void setImag(double imag) {
		this.imag = imag;
	}
	
	
	//Constructores

	public double getSuma() {
		return suma;
	}

	public void setSuma(double suma) {
		this.suma = suma;
	}

	public Complejo() {
	}
	
	public Complejo(double real, double imag) {
		this.real=real;
		this.imag=imag;
	}
	
	//Metodos
	
	public String toString() {
		
//		System.out.println(real + " +i" + imag);
		
		return String.valueOf(real) + " +i" +String.valueOf(imag);
		
		
		}
	
	
	
	public void sumar(Complejo b) {
		
		double sumReal = this.getReal() +b.getReal();
		double sumImag = this.getImag() +b.getImag();
		
		
	System.out.println(sumReal +" "+sumImag);
	}
}
