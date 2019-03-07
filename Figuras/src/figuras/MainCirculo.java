package figuras;

public class MainCirculo {
	public static void main(String[] args) {
		Circulo circle = new Circulo(3.00);
		
		circle.setColor("rosa");
		
		circle.calcularArea();
		
		System.out.println("El color del circulo es: " + circle.getColor() );
	}
}
