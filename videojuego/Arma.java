package videojuego;

public abstract class Arma {
	public String nombre;
	public String dano;
	public String tipo;
	
	public abstract void usar();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
