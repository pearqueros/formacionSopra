package Proyecto4;

public class Pruebas {

	public static void main(String[] args) {

		System.out.print("PRUEBAS DE LA CLASE ArrayReales\n");
		double array1[] = { 2.1, 3.0, 4.0, 2.0 };
		ArrayReales arrays = new ArrayReales(array1);
		System.out.println("El máximo es: " + arrays.maximo());
		System.out.println("El mínimo es: " + arrays.minimo());
		System.out.println("La suma total de los elementos del array es: " + arrays.sumatorio());

		System.out.print("PRUEBAS DE LA CLASE finalMath3\n");
		double array2[] = { 2.0, 1.0, 5.0, 6.0 };
		Final_Math3 finalMath3= new Final_Math3();
		System.out.println("El máximo es: " + finalMath3.max(array2));
		System.out.println("El minimo es: " + finalMath3.min(array2));
		
		System.out.print("PRUEBAS DE LA CLASE Relaciones\n");
		int array3[]= {1,2,3,4};
		System.out.println("El máximo es: " + finalMath3.max(array3));
		System.out.println("El máximo es: " + finalMath3.min(array3));
		
		RelacionesImpl relaciones1= new RelacionesImpl();
		RelacionesImpl relaciones2= new RelacionesImpl();
		relaciones1.setA(2);
		relaciones2.setA(3);
		System.out.print("a es igual que b: "+relaciones1.equals(relaciones2));
		System.out.print("\na es mayor que b: "+relaciones1.esMayor(relaciones2));
		System.out.print("\na es menor que b: "+relaciones1.esMenor(relaciones2));
		
	}

}
