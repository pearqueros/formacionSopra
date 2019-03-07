package interfaces;

public class ArrayReales implements Estadisticas {
	private double[] at;

	@Override
	public double minimo() {
		// TODO Auto-generated method stub
		double min = at[0];
		for (double d : at) {
			if(min>=d)
			{
				min = d;
			}
		}
		return min;
	}

	@Override
	public double maxima() {
		// TODO Auto-generated method stub
		double max = at[0];
		for (double d : at) {
			if(d>=max)
			{
				max = d;
			}
		}
		return max;
	}

	@Override
	public double sumatorio() {
		// TODO Auto-generated method stub
		double result = 0.0;
		for (double d : at) 
		{
			result = result + d;
		}
		return result;
	}

	public double[] getAt() {
		return at;
	}

	public void setAt(double[] at) {
		this.at = at;
	}
	
	
}
