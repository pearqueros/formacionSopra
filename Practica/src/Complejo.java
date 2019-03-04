
public class Complejo {
	
	double real;
	double imag;
	
	public Complejo() {
	}
	
	public Complejo(double real, double imag) {
		this.real = real;
		this.imag = imag;
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
		//System.out.println(real + " + " + imag + "i");
		
		return String.valueOf(real) + " + " + String.valueOf(imag)+"i";
	}

	
	//Sumamos dos complejos
	
	double suma;
	public void sumar(Complejo b) {
		double sumReal = this.getReal() + b.getReal();
		double sumImag = this.getImag() + b.getImag();
		
		System.out.println(sumReal + " " + sumImag);
		
	 	}

	public double getSuma() {
		return suma;
	}

	public void setSuma(double suma) {
		this.suma = suma;
	}
	
	
	

}
