package arrayReales;

public class ArrayReales implements Estadisticas {
	
	private double[] conjunto;
	double min;
	double max;

	//getters/setters
	
	public double[] getConjunto() {
		return conjunto;
	}

	public void setConjunto(double[] conjunto) {
		this.conjunto = conjunto;
	}

	public double minimo() {
		double min;
		int i;
		min=conjunto[0];
		
		for(i=0; i<conjunto.length;i++) {
			if (min>conjunto[i]){
				min=conjunto[i];
				}
		}
		this.min=min;
		System.out.println("El mínimo es: "+min);
		return min;
	}
	
	public double maximo() {
		double max;
		int i;
		max=conjunto[0];
		
		for(i=0; i<conjunto.length;i++) {
			if (max<conjunto[i]){
				max=conjunto[i];
				}
		}
		this.max=max;
		System.out.println("El máximo es: "+ max);
		return max;
	}
	
	public double sumatorio() {
		double suma = max+min;
		System.out.println("La suma de maximo y minimo es: " + suma);
		return suma;
	}
	
}
