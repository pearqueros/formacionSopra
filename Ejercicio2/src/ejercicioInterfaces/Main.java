package ejercicioInterfaces;

public class Main {
	
	public static void main(String[] args) {
		
		//Ejercicio1
		ArrayReales array1 = new ArrayReales();
		double[] arrayNumeros= {1.0, 2.0, 4.0};
		array1.setNumero(arrayNumeros);
		System.out.println("El maximo es: " + array1.maximo() + " el minimo es: " + array1.minimo()+ " y el sumatorio es: " + array1.sumatorio());
		//Ejercicio2
		Math3 prueba1 = new Math3();
		int[] arrayEnteros = {1,2,3,4,5};
		prueba1.min(arrayNumeros);
		prueba1.max(arrayEnteros);
		System.out.println("El maximo de double es: " + prueba1.max(arrayNumeros)+ " el minimo de enteros es: " + prueba1.min(arrayEnteros));
		//Ejercicio3
		ClaseRelaciones prueba2 = new ClaseRelaciones();
		ClaseRelaciones b = new ClaseRelaciones();
		prueba2.setNumero(4);
		b.setNumero(3);
		System.out.println("-Es mayor? "+prueba2.esMayor(b)+ "  -Es menor? " +prueba2.esMenor(b)+ "  -Es igual? "+ prueba2.esIgual(b));
		System.out.println(5/0);
	
	}
}
