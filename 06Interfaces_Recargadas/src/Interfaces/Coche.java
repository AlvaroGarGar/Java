package Interfaces;

public class Coche extends Vehículos implements Movible{

	@Override
	public String moverse(int X) {
		// TODO Auto-generated method stub
		String RCoche="El coche " + nombre + " se ha movido " + X + "metros";
		return RCoche;
	}

}
