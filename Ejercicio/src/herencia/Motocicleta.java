package herencia;

public class Motocicleta extends Vehiculo {

	private boolean portaEquipaje;
	private boolean casco;
	private int cilindrada;
	static int numMotocicleta;
	
	public Motocicleta(String fabricante, String matrícula, int ageMatriculacion, String propietario) {
		super(fabricante, matrícula, ageMatriculacion, propietario);
		super.numVehiculo++;
		numMotocicleta++;
	}
	public boolean isPortaEquipaje() {
		return portaEquipaje;
	}
	public void setPortaEquipaje(boolean portaEquipaje) {
		this.portaEquipaje = portaEquipaje;
	}
	public boolean isCasco() {
		return casco;
	}
	public void setCasco(boolean casco) {
		this.casco = casco;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	public static int getNumMotocicleta() {
		return numMotocicleta;
	}
	@Override
	public String toString() {
		return super.toString()+ "Motocicleta [isPortaEquipaje()=" + isPortaEquipaje() + ", isCasco()=" + isCasco() + ", getCilindrada()="
				+ getCilindrada() + "]";
	}
	
	

}
