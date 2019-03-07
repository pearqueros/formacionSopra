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
		String mensaje = "El fabricante del vehículo es " + fabricante + " cuyo propietario es " + propietario
				+ "\nLa matrícula del vehículo es " + matricula + " y el año de matriculación del mismo: " + anio
				+ "\nHay " + numeroVehiculos + " vehículos";
		return mensaje;
	}

}
