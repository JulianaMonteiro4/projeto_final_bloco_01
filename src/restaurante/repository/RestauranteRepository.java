package restaurante.repository;

public interface RestauranteRepository {
	
	public void listarTodos();
	public void adicionar();
	public void atualizar();
	public void deletar(int numero);

}
