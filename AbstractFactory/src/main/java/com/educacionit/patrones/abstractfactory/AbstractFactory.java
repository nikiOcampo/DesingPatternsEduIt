package com.educacionit.patrones.abstractfactory;

import com.educacionit.patrones.abstractfactory.elements.Color;
import com.educacionit.patrones.abstractfactory.elements.TV;

public abstract class AbstractFactory {
    public abstract TV createTV();

    public abstract Color createColor();
}
