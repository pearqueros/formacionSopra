package relaciones;

public class Relacion implements Relaciones {

	int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public boolean esMayor(Object b) {
		if (b instanceof Relacion) {
			Relacion becast = (Relacion) b;
			if (this.getValor() > becast.getValor()) {
				System.out.println("El primer número es mayor");
				return true;
			}
		}
		return false;
	}

	public boolean esMenor(Object b) {

		if (b instanceof Relacion) {
			Relacion becast = (Relacion) b;
			if (getValor() < becast.getValor()) {
				System.out.println("El primer número es menor");
				return true;
			} 
		} 
			return false;
		}


	public boolean esIgual(Object b) {
		if (b instanceof Relacion) {
			Relacion becast = (Relacion) b;
			if (getValor() == becast.getValor()) {
				System.out.println("Los números son iguales");
				return true;
			} 
		} 
			return false;
		}
	}

