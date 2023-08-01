package com.educacionit.patrones.state.impl;

import com.educacionit.patrones.state.SaludState;

public class Saludable implements SaludState {
    @Override
    public String comoTeSentis() {
        return "Pipi Cucu!!";
    }
}
