package com.educacionit.patrones.observer.estandard.main;

import com.educacionit.patrones.observer.estandard.entidades.Libro;
import com.educacionit.patrones.observer.estandard.notificador.AlarmaLibro;
import com.educacionit.patrones.observer.estandard.notificador.Biblioteca;
import com.educacionit.patrones.observer.estandard.observados.Administracion;
import com.educacionit.patrones.observer.estandard.observados.Compras;
import com.educacionit.patrones.observer.estandard.observados.Stock;

public class Main {
    public static void main(String[] args) {
        AlarmaLibro alarmas = new AlarmaLibro();
        alarmas.attach(new Compras());
        alarmas.attach(new Administracion());
        alarmas.attach(new Stock());

        Libro libro = new Libro();
        libro.setEstado("MALO");

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.setAlarma(alarmas);
        biblioteca.devuelveLibro(libro);
    }
}
