package interfaces;

public class MainArrayReales {
	public static void main(String[] args) {
		ArrayReales array = new ArrayReales();
		
		array.setLista(new double [] {5,2,3,1,4});
		
		array.minimo();
		array.maximo();
		array.sumatorio();
	}

}
