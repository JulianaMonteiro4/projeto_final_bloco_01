package pratos.repository;

import pratos.model.Pratos;

public interface PratosRepository {
	
	public void listarTodos();
	public void adicionar(Pratos pratos);
	public void atualizar(Pratos pratos);
	public void deletar(int numero);
	public void visualizar();

}
