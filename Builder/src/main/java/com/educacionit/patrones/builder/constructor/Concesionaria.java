package com.educacionit.patrones.builder.constructor;

import com.educacionit.patrones.builder.AutoBuilder;
import com.educacionit.patrones.builder.concretos.Auto;

public class Concesionaria {

    private AutoBuilder autoBuilder;

    public void construirAuto() {
        autoBuilder.buildMarca();
        autoBuilder.buildModelo();
        autoBuilder.buildMotor();
        autoBuilder.buildPuertas();
    }

    public void setAutoBuilder(AutoBuilder ab) {
        autoBuilder = ab;
    }

    public Auto getAuto() {
        return autoBuilder.getAuto();
    }
}
