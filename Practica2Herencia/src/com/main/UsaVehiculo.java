package com.main;

import com.vehiculos.Bicicleta;
import com.vehiculos.Coche;
import com.vehiculos.Deportivo;
import com.vehiculos.Monovolumen;
import com.vehiculos.Motocicleta;
import com.vehiculos.TipoBicicleta;
import com.vehiculos.Todoterreno;
import com.vehiculos.Vehiculo;

public class UsaVehiculo {

	public static void main(String[] args) {
		
		Vehiculo bicicleta = new Bicicleta("Fabricante","ABCD",1985,"Pepe",TipoBicicleta.CARRETERA);
		System.out.println(bicicleta);
		
		Vehiculo bicicleta2 = new Bicicleta("Fabricante","ABCD",1980,"Pepe",TipoBicicleta.MONTANIA);
		System.out.println(bicicleta2);
		
	    Vehiculo moto = new Motocicleta("Fabricante", "MOTOCICLETA", 1995, "Propietario",true);
		System.out.println(moto);
		
		Vehiculo coche = new Coche("Fabricante", "COCHE", 1999, "Propietario",true, 4, 2);
		System.out.println(coche);

		Vehiculo todoterreno = new Todoterreno("Fabricante", "TODOTERRENO", 1998, "Propietario",true, 4, 2, false);
		System.out.println(todoterreno);
		
		Vehiculo deportivo = new Deportivo("Fabricante", "DEPORTIVO", 2000, "Propietario",true, 4, 2, true);
		System.out.println(deportivo);
		
		Vehiculo monovolumen = new Monovolumen("Fabricante", "MONOVOLUMEN", 1990, "Propietario",true, 4, 2);
		System.out.println(monovolumen);
		
		
	}

}
