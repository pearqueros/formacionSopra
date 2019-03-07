package math3;

public final class Math3 implements Extremos{
	
	public int min(int[] a) {
		int min;
		int i;
		min=a[0];
		
		for(i=0; i<a.length;i++) {
			if (min>a[i]){
				min=a[i];
				}
		}
		System.out.println("El mínimo entero es: "+min);
		return min;
	}
	
	public int max(int[] a) {
		int max;
		int i;
		max=a[0];
		
		for(i=0; i<a.length;i++) {
			if (max<a[i]){
				max=a[i];
				}
		}
		System.out.println("El máximo entero es: "+ max);
		return max;
	}
	
	public double min(double[] a) {
		double min;
		int i;
		min=a[0];
		
		for(i=0; i<a.length;i++) {
			if (min>a[i]){
				min=a[i];
				}
		}
		System.out.println("El mínimo con decimal es: "+min);
		return min;
	}
	
	public double max(double[] a) {
		double max;
		int i;
		max=a[0];
		
		for(i=0; i<a.length;i++) {
			if (max<a[i]){
				max=a[i];
				}
		}
		System.out.println("El máximo con decimal es: "+ max);
		return max;
	}
	
	
}
