package figuras;

public class MainCuadrado {

	public static void main(String[] args) {
		Cuadrado square = new Cuadrado(3.00);
		
		square.setColor("azul");
		
		square.calcularArea();
		
		System.out.println("El color del cuadrado es: " + square.getColor() );
	}
}
