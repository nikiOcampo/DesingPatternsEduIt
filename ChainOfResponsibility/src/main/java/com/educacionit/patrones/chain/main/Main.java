package com.educacionit.patrones.chain.main;

import com.educacionit.patrones.chain.impl.Banco;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.solicitudPrestamo(5600);
    }
}
