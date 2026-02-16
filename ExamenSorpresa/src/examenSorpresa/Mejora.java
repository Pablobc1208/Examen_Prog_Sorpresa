package examenSorpresa;

public class Mejora {
	private String descripcion;
	private int bonusAtaque;
	private int bonusDefensa;
	private boolean stackeable;

	public Mejora(String descripcion, int atk, int def, boolean stackeable) {
	this.descripcion = descripcion;
	this.bonusAtaque = atk;
	this.bonusDefensa = def;
	this.stackeable = stackeable;
	}

	public void aplicarAUnidad(Unidad u) {
	}

	public String getDescripcion() {
	return descripcion;
	}

	public boolean esStackeable() {
	return stackeable;
	}

}
