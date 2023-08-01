package patrones.factory.entidades;

public class Isosceles extends Triangulo {

	public Isosceles(int ladoA, int ladoB, int ladoC) {
		super(ladoA, ladoB, ladoC);
		}

	@Override
	public String getDescripcion() {
		return "Soy un Triangulo Isosceles";
	}

	public double getSuperficie() {
		// Algoritmo para calcular superficie
		return 0;
	}

	@Override
	public void dibujate() {
		// Algoritmo para dibujarse
	}

}
