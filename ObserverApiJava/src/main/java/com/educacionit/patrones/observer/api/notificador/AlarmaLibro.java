package com.educacionit.patrones.observer.api.notificador;

import com.educacionit.patrones.observer.api.entidades.Libro;
import java.util.Observable;

public class AlarmaLibro extends Observable {
    public void disparaAlarma(Libro libro) {
        setChanged();
        notifyObservers("Rompieron el libro: " + libro.getTiulo());
    }
}
