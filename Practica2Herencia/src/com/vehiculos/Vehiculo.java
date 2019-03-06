package com.vehiculos;

public class Vehiculo {

	private String fabricante;
	private String matricula;
	private int annio;
	private String propietario;
	private static int numVehiculo = 0;
	
	public Vehiculo () {
		numVehiculo ++;
	}
	public Vehiculo(String fabricante, String matricula, int annio, String propietario) {
		this.fabricante = fabricante;
		this.matricula = matricula;
		this.annio = annio;
		this.propietario = propietario;
		numVehiculo ++;
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
	public int getAnnio() {
		return annio;
	}
	public void setAnnio(int annio) {
		this.annio = annio;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	public static int getNumVehiculo() {
		return numVehiculo;
	}
	@Override
	public String toString() {
		return "El fabricante de este vehículo es "+getFabricante()+"\nEl propietario es: "+getPropietario() 
		+"\nLa matrícula de este vehículo es: "+getMatricula() 
		+"\nEl año de matriculación es: "+getAnnio()
		+"\nEl número de vehículos:  "+getNumVehiculo();
	}
	
	
	
}
