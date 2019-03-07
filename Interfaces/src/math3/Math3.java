package math3;

public class Math3 implements Extremos{
	
	public double [] list;
	
	
	
	public double[] getList() {
		return list;
	}

	public void setList(double[] list) {
		this.list = list;
	}

	public int min(int [] a) {
		int min;
		min = a[0];
		for (int i = 0; i < a.length; i++){
			if (min > a[i]) {
			min = a[i];}
		}
		
		System.out.println("El valor minimo es: " +min);
		return min;
	}

	public double min(double [] a) {
		double min;
		min = a[0];
		for (int i = 0; i < a.length; i++){
			if (min > a[i]) {
			min = a[i];}
		}
		
		System.out.println("El valor minimo es: " +min);
		return min;
	}
	
	public int max(int [] a) {
		int max;
		max = a[0];
		for (int i = 0; i < a.length; i++){
			if (max < a[i]) {
			max = a[i];}
		}
		System.out.println("El valor maximo es: " +max);
		return max;
	}
	
	public double max(double [] a) {
		double max;
		max = a[0];
		for (int i = 0; i < a.length; i++){
			if (max < a[i]) {
			max = a[i];}
		}
		System.out.println("El valor maximo es: " +max);
		return max;
	}
	
	
}
