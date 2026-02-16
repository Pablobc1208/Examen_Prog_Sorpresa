package examenSorpresa;

import java.util.*;

public class GestorCampaña {
	private ArrayList<Unidad> unidades = new ArrayList<>(); 
	private ArrayList <General>generales = new ArrayList<>(); 
	private ArrayList <Ejercito>ejercitos = new ArrayList<>();
	private ArrayList<Mejora> mejoras = new ArrayList<>(); 
	private ArrayList <Batalla>batallas = new ArrayList<>();

	public void registrarUnidad(Unidad u) {
	    unidades.add(u);
	}

	public void registrarGeneral(General g) {
	    generales.add(g);
	}

	public void crearMejora(Mejora m) {
	    mejoras.add(m);
	}

	public Ejercito crearEjercito() {
	    Ejercito e = new Ejercito();
	    ejercitos.add(e);
	    return e;
	}

	public void listarUnidades() {
	    for (Unidad u : unidades) {
	        System.out.println(u);
	    }
	}

	public ArrayList<Ejercito> getEjercitos() {
	    return ejercitos;
	}
	}

