package com.educacionit.patrones.abstractfactory.impl;

import com.educacionit.patrones.abstractfactory.AbstractFactory;
import com.educacionit.patrones.abstractfactory.elements.Color;
import com.educacionit.patrones.abstractfactory.elements.TV;
import com.educacionit.patrones.abstractfactory.elements.concrete.Amarillo;
import com.educacionit.patrones.abstractfactory.elements.concrete.Plasma;

public class FactoryPlasmaAmarillo extends AbstractFactory {
    @Override
    public Color createColor() {
        return new Amarillo();
    }

    @Override
    public TV createTV() {
        return new Plasma();
    }
}
