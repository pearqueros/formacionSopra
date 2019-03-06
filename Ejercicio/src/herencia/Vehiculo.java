package herencia;

public class Vehiculo {
	private String fabricante;
	private String matr�cula;
	private int ageMatriculacion;
	private String propietario;
	static int numVehiculo = 0;

	public Vehiculo(String fabricante, String matr�cula, int ageMatriculacion, String propietario) {
		this.fabricante = fabricante;
		this.matr�cula = matr�cula;
		this.ageMatriculacion = ageMatriculacion;
		this.propietario = propietario;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getMatr�cula() {
		return matr�cula;
	}

	public void setMatr�cula(String matr�cula) {
		this.matr�cula = matr�cula;
	}

	public int getAgeMatriculacion() {
		return ageMatriculacion;
	}

	public void setAgeMatriculacion(int ageMatriculacion) {
		this.ageMatriculacion = ageMatriculacion;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	@Override
	public String toString() {
		return "Vehiculo [getFabricante()=" + getFabricante() + ", getMatr�cula()=" + getMatr�cula()
				+ ", getAgeMatriculacion()=" + getAgeMatriculacion() + ", getPropietario()=" + getPropietario() + "]";
	}

}
