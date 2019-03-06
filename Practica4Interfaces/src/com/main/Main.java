package com.main;

import com.clases.ArrayReales;
import com.clases.ClassRelaciones;
import com.clases.FinalMath3;

public class Main {

	public static void main(String[] args) {
		
		double[] array = {1,1,1,1,1,2};
		int[] arrayInt =  {1,1,1,1,1,2};
		ArrayReales arrays = new ArrayReales(array);
		
		System.out.println(arrays.minimo());
		System.out.println(arrays.maximo());
		System.out.println(arrays.sumatorio());
		
		FinalMath3 math = new FinalMath3();
		System.out.println(math.min(array));
		System.out.println(math.max(array));
		System.out.println(math.min(arrayInt));
		System.out.println(math.max(arrayInt));
		
		ClassRelaciones relaciones = new ClassRelaciones(10);
		ClassRelaciones relaciones2 = new ClassRelaciones(20);
		ClassRelaciones relaciones3 = new ClassRelaciones(5);
		System.out.println(relaciones.esIgual(relaciones));
		System.out.println(relaciones.esIgual(null));
		System.out.println(relaciones.esMayor(relaciones2));
		System.out.println(relaciones.esMenor(relaciones2));
		System.out.println(relaciones.esMayor(relaciones3));
		System.out.println(relaciones.esMenor(relaciones3));
	
		
		Object obj = new Integer(3);
		String str = (String) obj;
		System.out.println(str);}

	}

}
