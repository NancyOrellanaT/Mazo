import java.util.Random;

public class Juego {
	private Carta [] cartas;
	
	public Juego() {
		cartas = new Carta[13];
		
		for(int i = 0; i < cartas.length; i++) {
			cartas[i] = new Carta(i + 1, "\u2660");
		}
	}
	
	public void desordenarMazo() {
		
		Random rnd = new Random();
		int [] numeros =  new int[cartas.length];
		
		for(int i = 0; i < cartas.length; i++) {
			
			int numero = (int) rnd.nextInt(cartas.length - 1);
			
			while(revisarNumeros(numeros, numero)) {
				numero = (int) rnd.nextInt(cartas.length) + 1;
			}
			
			numeros[i] = numero;
			cartas[i] = new Carta(numero, "\u2660");
		}
	}
	
	public boolean revisarNumeros(int [] numeros, int numero) {
		boolean numeroRepetido = false;
		
		for(int i = 0; i < numeros.length; i++) {
			if(numero == numeros[i]) {
				numeroRepetido = true;
				break;
			}
			else {
				numeroRepetido = false;
			}
		}	
		return numeroRepetido;
	}
	
	public void ordenarMazo() {
		for(int i = 0; i < cartas.length - 1; i++)
        {
            for(int j = 0; j < cartas.length - 1; j++)
            {
                if (cartas[j].getValor() < cartas[j + 1].getValor())
                {
                    Carta tmp = cartas[j+1];
                    cartas[j+1] = cartas[j];
                    cartas[j] = tmp;
                }
            }
        }
	}
	
	public void mostrarMazo() {
		for(int i = 0; i < cartas.length; i++) {
			switch(cartas[i].getValor()) {
			case 1:
				System.out.println("Mazo[" + i + "]" + "= A " + cartas[i].getPalo());
				break;
			case 11:
				System.out.println("Mazo[" + i + "]" + "= J " + cartas[i].getPalo());
				break;
			case 12:
				System.out.println("Mazo[" + i + "]" + "= Q " + cartas[i].getPalo());
				break;
			case 13:
				System.out.println("Mazo[" + i + "]" + "= K " + cartas[i].getPalo());
				break;
			default:
				System.out.println("Mazo[" + i + "]" + "= "  + cartas[i].getValor() + " " + cartas[i].getPalo());
				break;
			}
		}
	}
}
