package relaciones;
import java.util.Scanner;

public class MainRelacion {
	public static void main(String[] args) {
		
		//Creamos objetos
		
		Scanner scan = new Scanner(System.in);
		Relacion relax = new Relacion();
		Relacion b = new Relacion();
		
		//Pedimos los números por pantalla
		
		System.out.println("primer numero");
		relax.setValor(scan.nextInt());
		System.out.println("segundo numero");
		b.setValor(scan.nextInt());
		
		scan.close();
		
		//Aplicamos los métodos
		relax.esMayor(b);
		relax.esMenor(b);
		relax.esIgual(b);
		
	
}
}