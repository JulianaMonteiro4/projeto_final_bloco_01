package pratos.controller;

import java.util.ArrayList;

import pratos.model.Pratos;
import pratos.repository.PratosRepository;

public class PratosController implements PratosRepository {
	
	private ArrayList<Pratos> listarPratos = new ArrayList<Pratos>();
	int numero = 0;
	
	@Override
	public void listarTodos() {
		for (var pratos : listarPratos) {
			pratos.visualizar();
		}
	}

	@Override
	public void adicionar(Pratos pratos) {
		listarPratos.add(pratos);
		System.out.println("O prato número: " + pratos.getNome() + " foi adicionado com sucesso");
	}

	@Override
	public void atualizar(Pratos pratos) {
		var buscarPrato = buscarNaCollection(pratos.getNome());
		
		if(buscarPrato != null) {
			listarPratos.set(listarPratos.indexOf(listarPratos), pratos);
			System.out.println("O prato número: " + pratos.getNome() + " foi atualizado com sucesso");
		}else {
			System.out.println("O prato número: " + pratos.getNome() + " não foi encontrado");
		}
	}

	@Override
	public void deletar(int numero) {
		var prato = buscarNaCollection(numero);
		
		if(prato != null) {
			if(listarPratos.remove(prato) == true) {
				System.out.println("O prato número: " + numero + " foi deletado com sucesso");
			}else {
				System.out.println("O prato número: " + numero + " não foi encontrado");
			}
		}
		
	}
	
	@Override
	public void visualizar() {
		// TODO Auto-generated method stub
		
	}
	
	public Pratos buscarNaCollection(int numero) {
		for (var pratos : listarPratos) {
			if (pratos.getNome() == numero) {
				return pratos;
			}
		}
		return null;
	}

}
