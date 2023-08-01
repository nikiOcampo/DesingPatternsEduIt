package com.educacionit.patrones.facade;

import com.educacionit.patrones.facade.entidades.Cliente;
import com.educacionit.patrones.facade.entidades.Interesado;
import com.educacionit.patrones.facade.entidades.Persona;
import com.educacionit.patrones.facade.entidades.Propietario;
import com.educacionit.patrones.facade.modulos.AdministracionAlquiler;
import com.educacionit.patrones.facade.modulos.CuentasAPagar;
import com.educacionit.patrones.facade.modulos.MuestraPropiedad;
import com.educacionit.patrones.facade.modulos.VentaInmueble;

public class Inmobiliaria {

    private MuestraPropiedad muestraPropiedad;
    private VentaInmueble venta;
    private CuentasAPagar cuentasAPagar;
    private AdministracionAlquiler alquiler;

    public Inmobiliaria() {
        muestraPropiedad = new MuestraPropiedad();
        venta = new VentaInmueble();
        cuentasAPagar = new CuentasAPagar();
        alquiler = new AdministracionAlquiler();
    }

    public void atencionCliente(Cliente c) {
        System.out.println("Atendiendo a un cliente");
    }

    public void atencionPropietario(Propietario p) {
        System.out.println("Atendiendo a un propietario");
    }

    public void atencionInteresado(Interesado i) {
        System.out.println("Atencion a un interesado en una propiedad");
    }

    public void atencion(Persona p) {
        if (p instanceof Cliente) {
            atencionCliente((Cliente) p);
        } else if (p instanceof Propietario) {
            atencionPropietario((Propietario) p);
        } else {
            atencionInteresado((Interesado) p);
        }
    }

    public void mostraPropiedad(int numeroPropiedad) {
        muestraPropiedad.mostraPropiedad(numeroPropiedad);
    }

    public void gestionaVenta() {
        venta.gestionaVenta();
    }

    public void paga(int monto) {
        cuentasAPagar.pagoPropietario(monto);
    }

    public void cobraAlquiler(double monto) {
        alquiler.cobro(monto);
    }
}