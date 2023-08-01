package com.educacionit.patrones.state.impl;

import com.educacionit.patrones.state.SaludState;

public class DolorDePanza implements SaludState {
    @Override
    public String comoTeSentis() {
        return "Todo mal: me duele la panza";
    }
}
