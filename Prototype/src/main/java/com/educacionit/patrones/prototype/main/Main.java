package com.educacionit.patrones.prototype.main;

import com.educacionit.patrones.prototype.TV;
import com.educacionit.patrones.prototype.TvPrototype;

public class Main {
    public static void main(String[] args) throws Exception {
        TvPrototype tvp = new TvPrototype();
        TV tv = (TV) tvp.prototipo("Plasma");

        System.out.println(tv.getPrecio());
    }
}
