package ejercicioInterfaces;

public final class Math3 implements Extremos{

	@Override
	public int min(int[] a) {
		int minimoInt = a[0];
		for (int i : a) {
			if (minimoInt>i) {
				minimoInt = i;
			}
		} 
		//		for (int i = 0; i < a.length; i++) {
//			if (minimoInt>a[i]) {
//				minimoInt = a[i];
//			}
//		}
		return minimoInt;
	}

	@Override
	public int max(int[] a) {
		int maximoInt=a[0];
		for (int i = 0; i < a.length; i++) {
			if (maximoInt<a[i]) {
				maximoInt = a[i];
			}
		}
		return maximoInt;
	}

	@Override
	public double min(double[] a) {
		double minimoDouble=a[0];
		for (int i = 0; i < a.length; i++) {
			if (minimoDouble>a[i]) {
				minimoDouble = a[i];
			}
		}
		return minimoDouble;
	}

	@Override
	public double max(double[] a) {
		double maximoDouble=a[0];
		for (int i = 0; i < a.length; i++) {
			if (maximoDouble<a[i]) {
				maximoDouble = a[i];
			}
		}
		return maximoDouble;
	}
}
