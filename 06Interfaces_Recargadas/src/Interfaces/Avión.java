package Interfaces;

public class Avión extends Vehículos implements Movible{

	@Override
	public String moverse(int X) {
		// TODO Auto-generated method stub
		int P = X + potencia * 3;
		String RAvión="El avión " + nombre + " se ha movido " + P + "metros";
		return RAvión;
	}

}
