package pratos.model;

public abstract class Pratos {
	
	int nome;
	int valor;
	int total;
	
	public Pratos (int nome, int valor, int total) {
		this.nome = nome;
		this.valor = valor;
		this.total = total;
		
	}
	
	public int getNome() {
		return ++ nome;
	}
	public void setNome(int nome) {
		this.nome = nome;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public void visualizar() {
		
		System.out.println("\n\n**************************");
		System.out.println("Detalhes do pedido:");
		System.out.println("******************************");
		System.out.println("Nome: " + this.nome);
		System.out.println("Valor: " + this.valor);
		System.out.println("Valor total: " + this.total);
	}

}
