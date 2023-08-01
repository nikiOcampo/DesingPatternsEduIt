package patrones.decorator;

import patrones.decorator.decorator.AireAcondicionado;
import patrones.decorator.decorator.CdPlayer;
import patrones.decorator.decorator.Gasoil;
import patrones.decorator.decorator.Mp3Player;
import patrones.decorator.entidades.FiatUno;
import patrones.decorator.entidades.FordFiesta;
import patrones.decorator.interfaz.Vendible;

public class Main {

	public static void main(String[] args) {
		Vendible auto = new FiatUno();
		auto = new CdPlayer(auto);
		auto = new Gasoil(auto);
		System.out.println(auto.getDescripcion());
		System.out.println("Su precio es: " + auto.getPrecio());
		Vendible auto2 = new FordFiesta();
		auto2 = new Mp3Player(auto2);
		auto2 = new Gasoil(auto2);
		auto2 = new AireAcondicionado(auto2);
		System.out.println(auto2.getDescripcion());
		System.out.println("Su precio es: " + auto2.getPrecio());
	}

}
