package Interfaces;

public class Avi�n extends Veh�culos implements Movible{

	@Override
	public String moverse(int X) {
		// TODO Auto-generated method stub
		int P = X + potencia * 3;
		String RAvi�n="El avi�n " + nombre + " se ha movido " + P + "metros";
		return RAvi�n;
	}

}
