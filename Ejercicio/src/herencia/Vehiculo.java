package herencia;

public class Vehiculo {
	private String fabricante;
	private String matrícula;
	private int ageMatriculacion;
	private String propietario;
	static int numVehiculo = 0;

	public Vehiculo(String fabricante, String matrícula, int ageMatriculacion, String propietario) {
		this.fabricante = fabricante;
		this.matrícula = matrícula;
		this.ageMatriculacion = ageMatriculacion;
		this.propietario = propietario;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getMatrícula() {
		return matrícula;
	}

	public void setMatrícula(String matrícula) {
		this.matrícula = matrícula;
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
		return "Vehiculo [getFabricante()=" + getFabricante() + ", getMatrícula()=" + getMatrícula()
				+ ", getAgeMatriculacion()=" + getAgeMatriculacion() + ", getPropietario()=" + getPropietario() + "]";
	}

}
