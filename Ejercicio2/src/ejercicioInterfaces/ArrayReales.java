package ejercicioInterfaces;

public class ArrayReales implements Estadisticas{

	private double[] numero ;
	
	@Override
	public double minimo() {
		double min = numero[0];
		for (int i=1; i<numero.length; i++) {
			if (numero[i]<min) {
				min=numero[i];
			}
		}
		return min;
	}

	@Override
	public double maximo() {
		double max = numero[0];
		for (int i=1; i<numero.length; i++) {
			if (numero[i]>max) {
				max=numero[i];
			}
		}
		return max;
	}

	@Override
	public double sumatorio() {
		double sum = numero[0];
		for (int i=1; i<numero.length; i++) {
			sum=sum + numero[i];
		}
		return sum;
	}

	public double[] getNumero() {
		return numero;
	}

	public void setNumero(double[] numero) {
		this.numero = numero;
	}
	
	
}
