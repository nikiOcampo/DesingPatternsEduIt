package a;

import java.util.List;

import com.educacionit.patrones.state.entidades.Persona;

public class SoloPrioridad implements EstadoVentanilla{

	@Override
	public void atende(List<Persona> clientes) {
		System.out.println("Atiendo prioritarios solamente");
		
	}

}
