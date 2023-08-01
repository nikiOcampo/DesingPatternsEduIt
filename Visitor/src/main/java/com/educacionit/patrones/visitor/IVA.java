package com.educacionit.patrones.visitor;

public class IVA implements Visitor {
    private final double impuestoNormal = 1.21;
    private final double impuestoReducido = 1.105;

    @Override
    public double visit(ProductoNormal normal) {
        return normal.getPrecio() * impuestoNormal;
    }

    @Override
    public double visit(ProductoDescuento reducido) {
        return reducido.getPrecio() * impuestoReducido;
    }
}
