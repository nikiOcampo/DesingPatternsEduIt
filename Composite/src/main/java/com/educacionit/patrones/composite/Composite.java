package com.educacionit.patrones.composite;

import com.educacionit.patrones.composite.entidades.IPersonal;
import java.util.ArrayList;
import java.util.List;

public class Composite implements IPersonal {
    private List<IPersonal> values = new ArrayList<IPersonal>();

    public void agrega(IPersonal personal) {
        values.add(personal);
    }

    @Override
    public void getDatosPersonal() {
        for (IPersonal personal : values) {
            personal.getDatosPersonal();
        }        
    }
}
