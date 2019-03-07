package proyecto2;

public class Vehiculo {

	private String fabricante;
	private String matricula;
	private int anio;
	private String propietario;
	private static int numeroVehiculos;

	public Vehiculo() {
	}

	public Vehiculo(String fabricante, String matricula, int anio, String propietario) {
		super();
		this.fabricante = fabricante;
		this.matricula = matricula;
		this.anio = anio;
		this.propietario = propietario;
		numeroVehiculos++;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public static int getNumeroVehiculos() {
		return numeroVehiculos;
	}

	public void setNumeroVehiculos(int numeroVehiculos) {
		this.numeroVehiculos = numeroVehiculos;
	}

	public String toString() {
		String mensaje = "El fabricante del veh�culo es " + fabricante + " cuyo propietario es " + propietario
				+ "\nLa matr�cula del veh�culo es " + matricula + " y el a�o de matriculaci�n del mismo: " + anio
				+ "\nHay " + numeroVehiculos + " veh�culos";
		return mensaje;
	}

}
