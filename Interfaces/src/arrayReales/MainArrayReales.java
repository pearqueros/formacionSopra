package arrayReales;

public class MainArrayReales {
	
public static void main(String[] args) {
	ArrayReales numeros = new ArrayReales();
	
	numeros.setConjunto(new double[]{1,2,3,5,0.5});
	
	numeros.minimo();
	numeros.maximo();
	numeros.sumatorio();
	}
}
