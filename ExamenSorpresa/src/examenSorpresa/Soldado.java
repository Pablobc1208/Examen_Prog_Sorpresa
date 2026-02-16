package examenSorpresa;

public class Soldado extends Unidad implements Atacante{
	private String tipo;
	
	
	public Soldado(int id, String nombre, int ataqueBase, int defensaBase, int experiencia, int multiplicadores,int saludActual, int saludMaxima, String tipo) {
		super(id, nombre, ataqueBase, defensaBase, experiencia, multiplicadores, saludActual, saludMaxima);
		this.tipo = tipo;
	
	}

	



	public int calcularEfectividad() {
		return 100 + experiencia * 10;
		Soldado infanteria = new Soldado(1,"infanteria",0 ,0 ,15 ,0 ,100 ,100 , "infanteria");
		
	}
	
	
	//Sobre escritura de metodos de la Interfaz
	@Override
	public int calcularDano() {
		return 0;
	}

	@Override
	public void recibirDano(int puntos, int saludMaxima) {
		
	}

	@Override
	public boolean estaOperativo(int saludActual) {
		return false;
	}
	
	public void atacar(Atacante enemigo) {
		
	}

	
	
}
