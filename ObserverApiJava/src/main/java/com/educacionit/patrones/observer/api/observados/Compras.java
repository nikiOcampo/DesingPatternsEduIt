package com.educacionit.patrones.observer.api.observados;

import java.util.Observable;
import java.util.Observer;

public class Compras implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(arg);
        System.out.print("Compras: ");
        System.out.println("Solicito nueva cotizacion...");
    }
}
