package com.educacionit.patrones.abstractfactory.impl;

import com.educacionit.patrones.abstractfactory.AbstractFactory;
import com.educacionit.patrones.abstractfactory.elements.Color;
import com.educacionit.patrones.abstractfactory.elements.TV;
import com.educacionit.patrones.abstractfactory.elements.concrete.Azul;
import com.educacionit.patrones.abstractfactory.elements.concrete.LCD;

public class FactoryLcdAzul extends AbstractFactory {
    @Override
    public Color createColor() {
        return new Azul();
    }

    @Override
    public TV createTV() {
        return new LCD();
    }
}
