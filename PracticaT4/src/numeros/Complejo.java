package numeros;

public class Complejo {

	private double numReal;
	private double numImaginario;
	
	public Complejo() {
		this.numReal = 0.0;
		this.numImaginario = 0.0;
	}
	
	public Complejo(double numReal, double numImaginario) {
		this.numReal = numReal;
		this.numImaginario = numImaginario;
	}
	public double getNumReal() {
		return numReal;
	}
	public void setNumReal(int numReal) {
		this.numReal = numReal;
	}
	public double getNumImaginario() {
		return numImaginario;
	}
	public void setNumImaginario(int numImaginario) {
		this.numImaginario = numImaginario;
	}
	
	public void sumar(Complejo b) {
		double sumReal = this.getNumReal() + b.getNumReal();
		double sumImaginario = this.getNumImaginario() + b.getNumImaginario();		
		System.out.println("El resultado de la suma es: "+sumReal+" + "+sumImaginario+"j");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getNumReal()+" + "+ this.getNumImaginario()+"j";
	}
	
	
}
