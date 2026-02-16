package examenSorpresa;

import java.util.*;

public class Ejercito {


	private String nombre;

	private List<Unidad> listarUnidades = new ArrayList<Unidad>();  


	//Constructor
	public Ejercito (String nombre) {
		this.nombre=nombre;
		
	}


	//Métodos


	//Listar


	public void anadirUnidad (Unidad u) {

	}


	boolean eliminarUnidadPorId(String id) {

		listarUnidades.remove(id);

		return true;
	}

	

	public void mostrarListado() {
		for (Unidad u : listarUnidades) {

		}
	}
	
	


	void asignarGeneral(General g) {
		
	}

}
