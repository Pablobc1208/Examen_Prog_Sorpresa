package examenSorpresa;

<<<<<<< HEAD
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
=======
public class Mejora{

	String descripcion;
	int efecto;
	int bonusAtaque;
	int bonusDefensa;


	//Constructor

	public Mejora(String descripcion, int efecto, int bonusAtaque, int bonusDefensa) {
		this.descripcion=descripcion;
		this.efecto=efecto;

	}


	//Métodos

	public void aplicarAUnidad(Unidad u) {

	}

	public void aplicarAEjercito(Ejercito u) {

	}







	//Mostrar info
	@Override
	public String consultarInfo() {

		return "ID: " + id + "\nNombre: " + nombre + "\nAtaque base: " + ataqueBase + "\nDefensa base: " + defensaBase + "\nExperiencia: " + experiencia + "\nMultiplicadores: " + multiplicadores + "\nSalud Máxima: " + saludMaxima + "\nSalud Actual: " + saludActual;

	}

>>>>>>> 31826d845a572b5b07b9b0b5f9666c24db22e03f

}

