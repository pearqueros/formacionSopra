package figuras;

public class MainTriangulo {
	
	public static void main(String[] args) {
		
		Triangulo triangle = new Triangulo(0.50,1.00);
		
		triangle.setColor("amarillo");
		
		triangle.calcularArea();
		
		System.out.println("El color del triángulo es: "+ triangle.getColor());
		
		
	}
	
	}
