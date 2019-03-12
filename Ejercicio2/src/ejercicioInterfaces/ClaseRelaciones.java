package ejercicioInterfaces;

public class ClaseRelaciones implements Relaciones {

	private int numero;
	@Override
	public boolean esMayor(Object b) {
		if(b instanceof ClaseRelaciones) {
			return this.numero > ((ClaseRelaciones)b).getNumero();
		}
		return false;
	}

	@Override
	public boolean esMenor(Object b) {
		if(b instanceof ClaseRelaciones) {
			return this.numero < ((ClaseRelaciones)b).getNumero();
		}
		return false;
	}

	@Override
	public boolean esIgual(Object b) {
		if(b instanceof ClaseRelaciones) {
			return this.numero == ((ClaseRelaciones)b).getNumero();
		}
		return false;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
