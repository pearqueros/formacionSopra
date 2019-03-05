package numeros;

/**
 * 
 * @author fjreina
 *
 */
public class Complejo {
/**
 * Propiedades
 */
private double real;
private double imag;

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
/**
 * Constructor Default
 */
public Complejo()
{
	real = 0.0;
	imag = 0.0;
}
/**
 * Constructor
 * @param real
 * @param imag
 */
public Complejo(double real, double imag)
{
	this.real = real;
	this.imag = imag;
}

/**
 * toString
 */
public String toString()
{
	String result;
	result = getReal() + " + " + getImag() + "i";
	return result;
}
/**
 * 
 * @param Complejo
 */
public void sumar(Complejo b)
{
	setImag(b.imag + getImag());
	setReal(b.real + getReal());
}
}
