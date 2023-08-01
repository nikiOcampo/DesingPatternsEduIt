package patrones.templete;

import patrones.templete.entidades.Cliente;
import patrones.templete.entidades.Empleado;
import patrones.templete.entidades.Persona;
import patrones.templete.entidades.Socio;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p = new Cliente(12121);
		System.out.println("El cliente dice: ");
		System.out.println(p.identificate());
		
		System.out.println("El empleado dice: ");
		p = new Empleado("AD 41252");
		System.out.println(p.identificate());
		
		System.out.println("El socio dice: ");
		p= new Socio(46232);
		System.out.println(p.identificate());
	}

}
