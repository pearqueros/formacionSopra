package PracticaT4;

public class Complejo {

	private double real;
	private double imag;
//Constructores	
	public Complejo() {
		real=0;
		imag=0;
	}
	
	public Complejo(double real, double imag) {
		this.real=real;
		this.imag=imag;
	}
//Getters and Setters
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

//Convertir en String
	public String toString(Complejo numero) {
		String cadena;
		cadena = numero.real+"+"+numero.imag;
		return cadena; 
	}
//Metodo para sumar	
	public void sumar(Complejo b)
	{
		double sumaReal = this.real + b.real;
		double sumaImag = this.imag + b.imag;
		System.out.println("La suma de la parte real es: " + sumaReal + " y la suma de la parte imaginaria es: " + sumaImag);
	}
//Metodo main	
	public static void main(String[] args) {
		
		Complejo numero1 = new Complejo(3, 4);
		Complejo numero2 = new Complejo(5, 6);
		
		numero1.sumar(numero2); //le sumamos al objeto numero1 el objeto numero2
		
	}
	

}
