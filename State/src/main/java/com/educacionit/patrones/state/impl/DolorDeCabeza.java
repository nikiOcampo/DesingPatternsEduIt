package com.educacionit.patrones.state.impl;

import com.educacionit.patrones.state.SaludState;

public class DolorDeCabeza implements SaludState {
    @Override
    public String comoTeSentis() {
        return "Todo mal: me duele la cabeza";
    }
}
