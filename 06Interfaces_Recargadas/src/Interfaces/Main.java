package Interfaces;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
	List<Veh�culos> listaVeh�culos = new ArrayList<Veh�culos>();
	
	Coche coche = new Coche();
	coche.setId("001");
	coche.setNombre("Mercedes");
	coche.setPotencia(0);
	
	Veh�culos V1 = coche;
	listaVeh�culos.add(coche);
	
	Moto moto = new Moto();
	moto.setId("002");
	moto.setNombre("Yamaha");
	moto.setPotencia(0);
	
	Veh�culos V2 = moto;
	listaVeh�culos.add(moto);
	
	Barco barco = new Barco();
	barco.setId("003");
	barco.setNombre("Titanic");
	barco.setPotencia(15);
	
	Veh�culos V3 = barco;
	listaVeh�culos.add(barco);
	
	Avi�n avi�n = new Avi�n();
	avi�n.setId("004");
	avi�n.setNombre("Boeing");
	avi�n.setPotencia(50);
	
	Veh�culos V4 = avi�n;
	listaVeh�culos.add(avi�n);
}
}