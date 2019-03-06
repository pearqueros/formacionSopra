package herencia;

public class Bicicleta extends Vehiculo {
	
	static int numeroBicicleta;	

	public enum TipoBicicleta
	{
		MOUNTAIN("Monta�a"), ROAD("Carretera"),
		CITY("Ciudad"); 
		
		private String nombreBicicleta;
		
		private TipoBicicleta (String nombreBicicleta){
			this.nombreBicicleta = nombreBicicleta;
		}

		public String getNombreBicicleta() {
			return nombreBicicleta;
		}
	};
	
	private TipoBicicleta tipo = TipoBicicleta.MOUNTAIN;
	
	public Bicicleta(String fabricante, String matr�cula, int ageMatriculacion, String propietario) {
		super(fabricante, matr�cula, ageMatriculacion, propietario);
		super.numVehiculo++;
		numeroBicicleta++;
	}

	public static int getNumeroBicicleta() {
		return numeroBicicleta;
	}

	public TipoBicicleta getTipo() {
		return tipo;
	}

	public void setTipo(TipoBicicleta tipo) {
		this.tipo = tipo;
	}	

	@Override
	public String toString() {
		return super.toString() +  "Tipo de bicicleta : " + tipo.getNombreBicicleta();
	}

}
