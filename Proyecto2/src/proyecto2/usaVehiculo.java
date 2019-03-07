package proyecto2;

public class usaVehiculo {

	public static void main(String[] args) {

		Vehiculo v1 = new Vehiculo();
		System.out.println(v1);
		Vehiculo v2 = new Vehiculo("Fabricante", "1234CFD", 2019, "Paula");
		System.out.println(v2);

		Bicicleta b1 = new Bicicleta();
		System.out.println(b1);
		Bicicleta b2 = new Bicicleta("Fabricante", "1234CFD", 2019, "Paula", TipoBicicleta.CIUDAD);
		System.out.println(b2);

		Motocicleta m1 = new Motocicleta();
		System.out.println(m1);
		Motocicleta m2 = new Motocicleta("Fabricante", "1234CFD", 2019, "Paula", false);
		System.out.println(m2);

		Coche c1 = new Coche();
		System.out.println(c1);
		Coche c2 = new Coche("Fabricante", "1234CFD", 2019, "Paula", true, 4, 2);
		System.out.println(c2);

		Todoterreno t1 = new Todoterreno();
		System.out.println(t1);
		Todoterreno t2 = new Todoterreno("Fabricante", "1234CFD", 2019, "Paula", false, 4, 2, true);
		System.out.println(t2);

		Deportivo d1 = new Deportivo();
		System.out.println(d1);
		Deportivo d2 = new Deportivo("Fabricante", "1234CFD", 2019, "Paula", false, 4, 2, true);
		System.out.println(d2);

		Monovolumen mv1 = new Monovolumen();
		System.out.println(mv1);

	}

}
