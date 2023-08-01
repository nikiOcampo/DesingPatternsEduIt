/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.educacionit.patrones.strategy.impl;

import com.educacionit.patrones.strategy.ListadoStrategy;
import java.util.ArrayList;
import java.util.List;

public class CompetenciaInternacional implements ListadoStrategy {
    @Override
    public List getListado(List lista) {
        List resultado = new ArrayList();
        resultado.add(lista.get(0));
        return resultado;
    }
}
