package herencia;

public class Deportivo extends Coche {

	private int numeroAirbarg;
	private boolean descapotable;
	static int numeroDeportivo;
	public Deportivo(String fabricante, String matrícula, int ageMatriculacion, String propietario) {
		super(fabricante, matrícula, ageMatriculacion, propietario);
		super.incrementaVehiculo();
		numeroDeportivo++;
	}
	public int getNumeroAirbarg() {
		return numeroAirbarg;
	}
	public void setNumeroAirbarg(int numeroAirbarg) {
		this.numeroAirbarg = numeroAirbarg;
	}
	public boolean isDescapotable() {
		return descapotable;
	}
	public void setDescapotable(boolean descapotable) {
		this.descapotable = descapotable;
	}
	public static int getNumeroDeportivo() {
		return numeroDeportivo;
	}
	@Override
	public String toString() {
		return super.toString() + "Deportivo [getNumeroAirbarg()=" + getNumeroAirbarg() + ", isDescapotable()=" + isDescapotable() + "]";
	}
	
	
}
