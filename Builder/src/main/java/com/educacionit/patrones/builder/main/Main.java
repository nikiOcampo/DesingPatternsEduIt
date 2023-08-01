package com.educacionit.patrones.builder.main;

import com.educacionit.patrones.builder.FordBuilder;
import com.educacionit.patrones.builder.concretos.Auto;
import com.educacionit.patrones.builder.constructor.Concesionaria;

public class Main {
    public static void main(String[] args) {
        Concesionaria concesionaria = new Concesionaria();
        concesionaria.setAutoBuilder(new FordBuilder());
        concesionaria.construirAuto();
        Auto auto = concesionaria.getAuto();
        System.out.println(auto.getMarca());
    }
}
