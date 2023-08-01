package patrones.factory.entidades;

public abstract class Triangulo {
	private int ladoA;
	private int ladoB;
	private int ladoC;

	public Triangulo(int ladoA, int ladoB, int ladoC) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}

	public abstract String getDescripcion();

	public abstract double getSuperficie();

	public abstract void dibujate();
}
