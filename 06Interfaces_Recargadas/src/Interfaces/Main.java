package Interfaces;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
	List<Vehículos> listaVehículos = new ArrayList<Vehículos>();
	
	Coche coche = new Coche();
	coche.setId("001");
	coche.setNombre("Mercedes");
	coche.setPotencia(0);
	
	Vehículos V1 = coche;
	listaVehículos.add(coche);
	
	Moto moto = new Moto();
	moto.setId("002");
	moto.setNombre("Yamaha");
	moto.setPotencia(0);
	
	Vehículos V2 = moto;
	listaVehículos.add(moto);
	
	Barco barco = new Barco();
	barco.setId("003");
	barco.setNombre("Titanic");
	barco.setPotencia(15);
	
	Vehículos V3 = barco;
	listaVehículos.add(barco);
	
	Avión avión = new Avión();
	avión.setId("004");
	avión.setNombre("Boeing");
	avión.setPotencia(50);
	
	Vehículos V4 = avión;
	listaVehículos.add(avión);
}
}