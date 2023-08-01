package com.educacionit.patrones.observer.api.main;

import com.educacionit.patrones.observer.api.entidades.Libro;
import com.educacionit.patrones.observer.api.notificador.AlarmaLibro;
import com.educacionit.patrones.observer.api.notificador.Biblioteca;
import com.educacionit.patrones.observer.api.observados.Administracion;
import com.educacionit.patrones.observer.api.observados.Compras;
import com.educacionit.patrones.observer.api.observados.Stock;

public class Main {
    public static void main(String[] args) {
        AlarmaLibro alarmas = new AlarmaLibro();
        alarmas.addObserver(new Compras());
        alarmas.addObserver(new Administracion());
        alarmas.addObserver(new Stock());

        Libro libro = new Libro();
        libro.setTiulo("Windows es estable");
        libro.setEstado("MALO");

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.setAlarma(alarmas);
        biblioteca.devuelveLibro(libro);
    }
}
