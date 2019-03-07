package Proyecto4;

public class Final_Math3 implements Extremos{

	

	@Override
	public int min(int[] a) {
		int minimo= a [0];
		for (int i: a) {
			if(i<minimo) {
				minimo=i;
			}
		}
		return minimo;
	}

	@Override
	public int max(int[] a) {
		int maximo= a [0];
		for (int i: a) {
			if(i>maximo) {
				maximo=i;
			}
		}
		return maximo;
	}

	@Override
	public double min(double[] a) {
		double minimo= a [0];
		for (int i=0; i<a.length; i++) {
			if(a[i]<minimo) {
				minimo=a[i];
			}
			}
		return minimo;
	}

	@Override
	public double max(double[] a) {
		double maximo= a [0];
		for (double d2: a) {
			if(d2>maximo) {
				maximo=d2;
			}
		}
		return maximo;
	}
	

}
