package com.educacionit.patrones.abstractfactory.elements.concrete;

import com.educacionit.patrones.abstractfactory.elements.TV;

public class Plasma extends TV {
    @Override
    public String getDescripcion() {
        return "Plasma";
    }
}