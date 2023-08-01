package com.educacionit.patrones.observer.estandard.notificador;

import com.educacionit.patrones.observer.estandard.ILibroMalEstado;
import com.educacionit.patrones.observer.estandard.Subject;
import java.util.ArrayList;
import java.util.List;

public class AlarmaLibro implements Subject {
    private List<ILibroMalEstado> observadores = new ArrayList<ILibroMalEstado>();

    @Override
    public void attach(ILibroMalEstado observador) {
        observadores.add(observador);
    }

    @Override
    public void dettach(ILibroMalEstado observador) {
        observadores.remove(observador);
    }

    @Override
    public void notifyObservers() {
        for (ILibroMalEstado observador : observadores) {
            observador.update();
        }
    }
}
