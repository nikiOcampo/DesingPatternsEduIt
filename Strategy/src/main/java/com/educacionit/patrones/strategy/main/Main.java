package com.educacionit.patrones.strategy.main;

import com.educacionit.patrones.strategy.ListadoStrategy;
import com.educacionit.patrones.strategy.entidades.Alumno;
import com.educacionit.patrones.strategy.entidades.Colegio;
import com.educacionit.patrones.strategy.impl.CompetenciaInternacional;
import com.educacionit.patrones.strategy.impl.CompetenciaNacional;
import com.educacionit.patrones.strategy.impl.InterColegial;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Colegio colegio = new Colegio();
        List<Alumno> alumnos = colegio.getAlumnos();

        ListadoStrategy st = new CompetenciaInternacional();
        // Se puede evitar que el cliente conozca los strategy concretos

        List rta = st.getListado(alumnos);

        // Veamos el resultado del patron
        System.out.println("Los participantes son:");
        for (int i = 0; i < rta.size(); i++) {
            Alumno alumno = (Alumno) rta.get(i);
            System.out.println(alumno.getNombre());
        }
    }
}
