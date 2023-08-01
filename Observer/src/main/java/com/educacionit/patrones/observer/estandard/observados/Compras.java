package com.educacionit.patrones.observer.estandard.observados;

import com.educacionit.patrones.observer.estandard.ILibroMalEstado;

public class Compras implements ILibroMalEstado {
    @Override
    public void update() {
        System.out.println("Compras: ");
        System.out.println("Solicito nueva cotizacion...");
    }
}
