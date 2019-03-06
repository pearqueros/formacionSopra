package herencia;

public class Monovolumen extends Coche {

	static int numeroMonovolumen;
	public Monovolumen(String fabricante, String matr�cula, int ageMatriculacion, String propietario) {
		super(fabricante, matr�cula, ageMatriculacion, propietario);
		super.incrementaVehiculo();
		numeroMonovolumen++;
	}
	
	public static void setNumeroMonovolumen(int numeroMonovolumen) {
		Monovolumen.numeroMonovolumen = numeroMonovolumen;
	}
}
