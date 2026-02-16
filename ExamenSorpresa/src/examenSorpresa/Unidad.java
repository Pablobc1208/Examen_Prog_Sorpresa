package examenSorpresa;

import java.util.Random;

public abstract class Unidad implements Atacante{

	protected int id;
	protected String nombre;
	protected int ataqueBase;
	protected int defensaBase;
	protected int experiencia;
	protected int multiplicadores;
	protected int saludActual;
	protected int saludMaxima;

	//Constructor
	public Unidad (int id, String nombre, int ataqueBase, int defensaBase, int experiencia, int multiplicadores, int saludActual, int saludMaxima) {

		this.id=id;
		this.nombre=nombre;
		this.ataqueBase=ataqueBase;
		this.defensaBase=defensaBase;
		this.experiencia=experiencia;
		this.multiplicadores=multiplicadores;
		this.saludActual=saludActual;
		this.saludMaxima=saludMaxima;

	}


	//Métodos de la interfaz

	@Override
	public int calcularDano( ) {


		int dano = 0;

		Random random = new Random();

		return dano = (int) (calcularFuerzaTotal(int ataqueBase, int defensaBase, int experiencia, int multiplicadores)* 0.6);
	}



	@Override
	public void recibirDano (int puntos, int saludMaxima) {
		saludActual = saludMaxima(0, saludActual - saludMaxima(0, puntos - defensaBase/4));

	}


	@Override
	public boolean estaOperativo(int saludActual) {
		boolean operativo = false;
		if (saludActual > 0) {
			operativo = true;
		}
		return operativo;
	}


	//Método de la clase
	public int calcularFuerzaTotal(int ataqueBase, int defensaBase, int experiencia, int multiplicadores) {
		int fuerza = 0;
		fuerza = ataqueBase + defensaBase + (experiencia / 2) * fuerza * multiplicadores;

		return fuerza;	

	}
	
	public int saludMaxima (int puntos, int defensaBase) {
	
		return puntos - defensaBase/4;
	}
	
	//Método abstracto





}
