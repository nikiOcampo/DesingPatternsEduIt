package com.educacionit.patrones.facade.main;

import com.educacionit.patrones.facade.Inmobiliaria;
import com.educacionit.patrones.facade.entidades.Cliente;
import com.educacionit.patrones.facade.entidades.Interesado;
import com.educacionit.patrones.facade.modulos.AdministracionAlquiler;
import com.educacionit.patrones.facade.modulos.CuentasAPagar;
import com.educacionit.patrones.facade.modulos.MuestraPropiedad;
import com.educacionit.patrones.facade.modulos.VentaInmueble;

public class Main {

    public static void main(String[] args) {
        Cliente c = new Cliente();
        Interesado i = new Interesado();
        Inmobiliaria inmo = new Inmobiliaria();
        inmo.atencionCliente(c);
        inmo.atencionInteresado(i);

        MuestraPropiedad muestraPropiedad = new MuestraPropiedad();
        muestraPropiedad.mostraPropiedad(123);
        VentaInmueble venta = new VentaInmueble();
        venta.gestionaVenta();
        AdministracionAlquiler alquiler = new AdministracionAlquiler();
        alquiler.cobro(1200);
        CuentasAPagar cuentasAPagar = new CuentasAPagar();
        cuentasAPagar.pagoPropietario(1100);

        // Lo mismo pero despues del Facade
        Inmobiliaria inmo2 = new Inmobiliaria();
        inmo2.atencion(i);
        inmo2.atencion(c);
        inmo2.mostraPropiedad(123);
        inmo2.gestionaVenta();
        inmo2.cobraAlquiler(1200);
        inmo2.paga(1100);

    }
}
