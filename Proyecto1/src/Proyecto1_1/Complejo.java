package Proyecto1_1;

public class Complejo {

	
	double real;
	double imag;
	
	/*Constructor a cero*/
	
	public Complejo() {
		this.real= 0.0;
		this.imag=0.0;
	}
	
	/*constructor parametros*/
	
	public Complejo(double real, double imag) {
		this.real= real;
		this.imag= imag;
		
	}
	
	
	
	
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

	
	@Override
	public String toString() {
		return "Complejo [real=" + real + ", imag=" + imag + "]";
	}

	
	/*Metodo suma*/
	
	public void sumaNumeros(Complejo b) {
		double sumaI= this.imag+b.imag;
		double sumaR= this.real+ b.real;
		
		System.out.println("la suma de la parte real es "+ sumaR + "la suma de la parte imaginaria es "+ sumaI);
		
	}
	/*METODO PRINCIPAL*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Complejo c= new Complejo();
		Complejo c2= new Complejo (2.0,1.0);
		Complejo c3= new Complejo (4.0,3.0);
		c.sumaNumeros(c);
		c2.sumaNumeros(c3);
	}

}
