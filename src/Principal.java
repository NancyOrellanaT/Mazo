

public class Principal {

	public static void main(String[] args) {
		Juego juego = new Juego();
		System.out.println("Mazo inicial: ");
		juego.mostrarMazo();
		System.out.println("-----------------------------------------------");
		System.out.println("Mazo desordenado: ");
		juego.desordenarMazo();
		juego.mostrarMazo();
		System.out.println("-----------------------------------------------");
		System.out.println("Mazo ordenado: ");
		juego.ordenarMazo();
		juego.mostrarMazo();
	}

}
