package interfaces;

public final class Math3 implements Extremos {

	@Override
	public int min(int[] a) {
		// TODO Auto-generated method stub
		int min = a[0];
		for (int d : a) 
		{
			if(min>=d)
			{
				min = d;
			}
		}
		return min;
	}

	@Override
	public int max(int[] a) {
		// TODO Auto-generated method stub
		int max = a[0];
		for (int d : a) 
		{
			if(d>=max)
			{
				max = d;
			}
		}
		return max;
	}

	@Override
	public double min(double[] a) {
		// TODO Auto-generated method stub
		double min = a[0];
		for (double d : a) {
			if(min>=d)
			{
				min = d;
			}
		}
		return min;
	}

	@Override
	public double max(double[] a) {
		// TODO Auto-generated method stub
		double max = a[0];
		for (double d : a) {
			if(d>=max)
			{
				max = d;
			}
		}
		return max;
	}

}
