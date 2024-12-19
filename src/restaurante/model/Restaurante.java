package restaurante.model;

public abstract class Restaurante {
	
	String nome;
	int valor;
	int quantidade;
	int total;
	
	public Restaurante (String nome, int valor, int quantidade, int total) {
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
		this.total = total;
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}

}
