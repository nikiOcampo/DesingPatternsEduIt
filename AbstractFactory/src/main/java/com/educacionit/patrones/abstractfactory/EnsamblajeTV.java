package com.educacionit.patrones.abstractfactory;

import com.educacionit.patrones.abstractfactory.elements.Color;
import com.educacionit.patrones.abstractfactory.elements.TV;

public class EnsamblajeTV {
    public EnsamblajeTV(AbstractFactory factory) {
        Color color = factory.createColor();
        TV tv = factory.createTV();
        color.colorea(tv);
    }
}
