package ejercicios;

public class Vehiculo {

	private int numPuertas;
	private int numRuedas;

	public Vehiculo(int numPuertas, int numRuedas) {
		this.numPuertas = numPuertas;
		this.numRuedas = numRuedas;
	}
	
	public void showInfo() {
		System.out.println("Soy un vehiculo.");
	}
}
