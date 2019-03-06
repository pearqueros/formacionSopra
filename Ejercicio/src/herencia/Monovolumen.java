package herencia;

public class Monovolumen extends Coche {

	static int numeroMonovolumen;
	public Monovolumen(String fabricante, String matrícula, int ageMatriculacion, String propietario) {
		super(fabricante, matrícula, ageMatriculacion, propietario);
		super.incrementaVehiculo();
		numeroMonovolumen++;
	}
	
	public static void setNumeroMonovolumen(int numeroMonovolumen) {
		Monovolumen.numeroMonovolumen = numeroMonovolumen;
	}
}
