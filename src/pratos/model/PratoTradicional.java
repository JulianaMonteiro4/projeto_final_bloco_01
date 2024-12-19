package pratos.model;

public class PratoTradicional extends Pratos{
	
	private String adicional;

	public PratoTradicional(int nome, int valor, int total, String adicional) {
		super(nome, valor, total);
		this.adicional = adicional;
	}

	public String getAdicional() {
		return adicional;
	}

	public void setAdicional(String adicional) {
		this.adicional = adicional;
	}

}
