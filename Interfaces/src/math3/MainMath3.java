package math3;

public class MainMath3 {
	public static void main(String[] args) {
		Math3 array1 = new Math3();
		
		int [] a = {1,2,3,4};
		double [] b = {0.1,0.2,0.3,0.4};
		
		array1.min(a);
		array1.min(b);
		
		array1.max(a);
		array1.max(b);
	}
}
