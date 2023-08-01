package com.educacionit.patrones.abstractfactory.main;

import com.educacionit.patrones.abstractfactory.AbstractFactory;
import com.educacionit.patrones.abstractfactory.EnsamblajeTV;
import com.educacionit.patrones.abstractfactory.impl.FactoryLcdAzul;
import com.educacionit.patrones.abstractfactory.impl.FactoryPlasmaAmarillo;

public class Main {
    public static void main(String[] args) {
        // Probando el factory LCD + Azul
        AbstractFactory f1 = new FactoryLcdAzul();
        EnsamblajeTV e1 = new EnsamblajeTV(f1);

        // Probando el factory Plasma + Amarillo
        AbstractFactory f2 = new FactoryPlasmaAmarillo();
        EnsamblajeTV e2 = new EnsamblajeTV(f2);
    }
}
