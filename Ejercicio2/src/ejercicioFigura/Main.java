package ejercicioFigura;

public class Main {

	
	
	public static void main(String[] args) {
		
		Triangulo triangulo1 = new Triangulo(3.0, 4.0);
		Cuadrado cuadrado1 = new Cuadrado(2.0);
		
		double areaCuadrado = cuadrado1.calcularArea();
		double areaTriangulo = triangulo1.calcularArea();
		
		System.out.println("El area del cuadrado es: "+ areaCuadrado);
		System.out.println("El area del triangulo es: "+ areaTriangulo);
	}
	
	
}
