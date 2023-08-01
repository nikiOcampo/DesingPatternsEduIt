package com.educacionit.patrones.strategy.impl;

import com.educacionit.patrones.strategy.ListadoStrategy;
import java.util.List;

public class InterColegial implements ListadoStrategy {
    @Override
    public List getListado(List lista) {
        return lista.subList(0, 5);
    }
}
