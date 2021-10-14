package Interfaces;

public class Barco extends Vehículos implements Movible{

	@Override
	public String moverse(int X) {
		// TODO Auto-generated method stub
		int P = X + potencia * 2;
		String RBarco="El barco " + nombre + " se ha movido " + P + "metros";
		return RBarco;
	}

}
