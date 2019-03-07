package Proyecto4;

public class ArrayReales implements Estadisticas{

	private double[] array;

	public ArrayReales(double[] array1) {
	this.array=array1;
	}

	@Override
	public double minimo() {
		double minimo = array[0];
		for (double d : array) {
			if (d < minimo) {
				d = minimo;
			}
		}
		return minimo;
	}

	@Override
	public double maximo() {
		double maximo= array[0];
		for(int i=0; i<array.length;i++) {
			if(array[i]>maximo) {
				maximo=array[i];
			}
		}
		return maximo;
	}

	@Override
	public double sumatorio() {
		double sumatorio=0.0;
		for(double d: array) {
			sumatorio=sumatorio + d;
		}
		return sumatorio;
	}
	
	

}
