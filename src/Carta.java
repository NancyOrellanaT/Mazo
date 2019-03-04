public class Carta {
	
	private int codigo;
	private String palo;
	private int valor;
	
	public Carta(int valor, String palo) {
		this.palo = palo;
		this.valor = valor;
	}
	
	public Carta(int valor, int codigo, String palo) {
		this.palo = palo;
		this.codigo = codigo;
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	

}
