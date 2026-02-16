package examenSorpresa;

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


}

