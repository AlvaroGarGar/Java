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

		
		Guerrero g2 = new Guerrero();
		g2.setNombre("Legolas");
		g2.setVida(20);
		g2.setStat(15);
		Arco arco = new Arco(); 
		g2.setArma(arco);
		g2.atacar();
		
		Mago m1 = new Mago();
		m1.setNombre("Gandalf");
		m1.setVida(20);
		m1.setStat(17);
		Hechizo hechizo = new Hechizo();
		m1.setArma(hechizo);
		m1.atacar();
		
		Curandero c1 = new Curandero();
		c1.setNombre("Vivi");
		c1.setVida(25);
		c1.setStat(10);
		Rezo rezo = new Rezo();
		c1.setArma(rezo);
		c1.curar();
	}
}
