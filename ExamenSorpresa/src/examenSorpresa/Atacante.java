package examenSorpresa;

public interface Atacante {
  
	//Métodos a implementar
	public int calcularDano();
	
	
	public void recibirDano (int puntos, int saludMaxima);
	
	
	
	public boolean estaOperativo(int saludActual);
}
