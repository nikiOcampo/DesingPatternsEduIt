package patrones.factory;

import patrones.factory.entidades.Equilatero;
import patrones.factory.entidades.Escaleno;
import patrones.factory.entidades.Isosceles;
import patrones.factory.entidades.Triangulo;

public class TrianguloFactory {
	public Triangulo createTriangulo(int ladoA, int ladoB, int ladoC) {
		if ((ladoA == ladoB) && (ladoA == ladoC)) {
			return new Equilatero(ladoA, ladoB, ladoC);
		} else if ((ladoA != ladoB) && (ladoA != ladoC) && (ladoB != ladoC)) {
			return new Escaleno(ladoA, ladoB, ladoC);
		} else {
			return new Isosceles(ladoA, ladoB, ladoC);
		}
	}

}
