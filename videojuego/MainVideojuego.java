package videojuego;

public class MainVideojuego {

	public static void main(String[] args) {
		Guerrero g1 = new Guerrero();
		g1.setNombre("Conan");
		g1.setVida(30);
		g1.setStat(13);
		Espada espada = new Espada();
		g1.setArma(espada);
		g1.atacar();

		Mago m1 = new Mago();
		m1.setNombre("Gandalf");
		m1.setVida(20);
		m1.setStat(17);
		Hechizo hechizo = new Hechizo();
		m1.setArma(hechizo);
		m1.atacar();
		

	}
}
