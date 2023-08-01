package patrones.factory.entidades;

public class Escaleno extends Triangulo {

	public Escaleno(int ladoA, int ladoB, int ladoC) {
		super(ladoA, ladoB, ladoC);
	}

	@Override
	public String getDescripcion() {
		return "Soy un Triangulo Escaleno";
	}

	@Override
	public double getSuperficie() {
		// Algoritmo para calcular superficie
		return 0;
	}

	@Override
	public void dibujate() {
		// Algoritmo para dibujarse
	}

}
