package patrones.factory;

import patrones.factory.entidades.Triangulo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrianguloFactory factory = new TrianguloFactory();
		Triangulo triangulo = factory.createTriangulo(10, 10, 10);
		System.out.println(triangulo.getDescripcion());
	}

}
