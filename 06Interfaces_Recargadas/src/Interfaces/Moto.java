package Interfaces;

public class Moto extends Veh�culos implements Movible{

	@Override
	public String moverse(int X) {
		// TODO Auto-generated method stub
		String RMoto="La moto " + nombre + " se ha movido " + X + "metros";
		return RMoto;
	}

}
