package patrones.decorator.decorator;

import patrones.decorator.interfaz.Vendible;

public class Gasoil extends AutoDecorator {

	public Gasoil(Vendible vendible) {
		super(vendible);
	}

	@Override
	public String getDescripcion() {
		return getVendible().getDescripcion() + " + Gasoil";
	}

	@Override
	public int getPrecio() {
		return getVendible().getPrecio() + 1200;
	}

}
