package interfaces;

public class ArrayReales implements Estadisticas {
	
	public double [] lista;
	double min;
	double max;
	double sum;
	
	
	public double[] getLista() {
		return lista;
	}

	public void setLista(double[] lista) {
		this.lista = lista;
	}

	public double minimo() {
		min = lista[0];
		for (int i = 0; i < lista.length; i++){
			if (min > lista[i]) {
			min = lista[i];}
		}
		
		System.out.println("El valor minimo es: " +min);
		return min;
	}
	
	public double maximo() {
		max = lista[0];
		for (int i = 0; i < lista.length; i++){
			if (max < lista[i]) {
			max = lista[i];}
		}
		System.out.println("El valor maximo es: " +max);
		return max;
	}
	
	public double sumatorio() {
		for (int i = 0; i < lista.length; i++){
			sum += lista[i];
		}
		System.out.println("El sumatorio vale: " + sum);
		return sum;
	}
	
}
