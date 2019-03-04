package PracticaGit;

public class MainComplex {
public static void main(String[] args) {
	
	Complejo complejo = new Complejo(1.44, 2.33);
	Complejo complejo2 = new Complejo(2.22, 6.66);
	

	
	System.out.println(complejo + "\n");
	
	complejo.sumar(complejo2);
	
}
}
