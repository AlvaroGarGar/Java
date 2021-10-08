package videojuego;

public class Mago extends Personaje{
	public void atacar() {
		System.out.println("Trágate el hechizo de " + getNombre());
		getArma();
	}
public void setArma(Hechizo hechizo) {
		
	}

}
