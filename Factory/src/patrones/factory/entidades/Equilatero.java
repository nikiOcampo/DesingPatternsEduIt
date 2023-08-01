package patrones.factory.entidades;

public class Equilatero extends Triangulo {

	public Equilatero(int anguloA, int anguloB, int anguloC) {
		super(anguloA, anguloB, anguloC);
	}

	@Override
	public String getDescripcion() {
		return "Soy un Triangulo Equilatero";
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
