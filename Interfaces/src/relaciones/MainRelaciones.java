package relaciones;

public class MainRelaciones {
	
	public static void main(String[] args) {
		Relacionados a = new Relacionados();
		Relacionados b = new Relacionados();
		
		a.setValor(6);
		b.setValor(5);
		
		a.esMayor(b);
		a.esMenor(b);
		a.esIgual(b);
	}

}
