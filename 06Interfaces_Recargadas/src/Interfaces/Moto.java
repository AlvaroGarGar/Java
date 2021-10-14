package Interfaces;

public class Moto extends Vehículos implements Movible{

	@Override
	public String moverse(int X) {
		// TODO Auto-generated method stub
		String RMoto="La moto " + nombre + " se ha movido " + X + "metros";
		return RMoto;
	}

}
