package patrones.singleton;

public class Main {

	public static void main(String[] args) {
		//Singleton s2 = new Singleton();
		// lanza un error ya que el constructor esta privatizado.
		Singleton s1 = Singleton.getInstance();
		// forma correcta de convocar al Singleton
	}

}
