package relaciones;

public class Relacionados implements Relaciones {
	

	int valor;
	

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public boolean esMayor(Object b) {
		if (b instanceof Relacionados) {
			Relacionados becast = (Relacionados) b;
			if (this.getValor() > becast.getValor()) {
				System.out.println(" Es mayor ");
			return true;
			}
		}
			
			return false;
		}

	
	public boolean esMenor(Object b) {
		if (b instanceof Relacionados) {
			Relacionados becast = (Relacionados) b;
			if (this.getValor() < becast.getValor()) {
				System.out.println(" Es menor ");
			return true;
			}
		}
			
			return false;
		}
	
	public boolean esIgual(Object b) {
		if (b instanceof Relacionados) {
			Relacionados becast = (Relacionados) b;
			if (this.getValor() == becast.getValor()) {
				System.out.println(" Son iguales ");
			return true;
			}
		}
			
			return false;
		}


}
