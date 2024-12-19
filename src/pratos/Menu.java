package pratos;

import java.util.InputMismatchException;
import java.util.Scanner;

//import pratos.model.PratoTradicional;
import pratos.controller.PratosController;

public class Menu {

	public static void main(String[] args) {
		
		int opcao = 1;
		int produto, quantidade, valorTotal, pergunta;
		String adicional;
		
		
		
		Scanner leia = new Scanner(System.in);
		PratosController pratos = new PratosController();
		
		while(opcao != 0) {
			System.out.println("***********************************");
			System.out.println("                                   ");
			System.out.println("        Restaurante Japonês        ");
			System.out.println("                                   ");
			System.out.println("***********************************");
			System.out.println("                                   ");
			System.out.println("   1 - Mostrar Cardápio            ");
			System.out.println("   2 - Adicionar prato             ");
			System.out.println("   3 - Listar todas os pratos      ");
			System.out.println("   4 - Atualizar pratos            ");
			System.out.println("   5 - Apagar prato                ");
			System.out.println("   0 - Sair                        ");
			System.out.println("                                   ");
			System.out.println("***********************************");
			System.out.println("Digite a opção desejada:           ");
			
			try {
				opcao = leia.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("\nDigite um número inteiro");
				leia.nextLine();
				opcao = 0;
			}
			
			switch(opcao) {
				case 1:
					System.out.println("          Mostrar Cardápio         ");
					System.out.println("***********************************");
					System.out.println("                         ");
					System.out.println("   1 - Temaki - R$ 15,00 ");
					System.out.println("   2 - Sashimi -R$ 5,00  ");
					System.out.println("   3 - Sushi  - R$ 2,00  ");
					System.out.println("   4 - Hot Holl -R$ 2,00 ");
					System.out.println("   5 - Yakisoba -R$ 15,00");
					System.out.println("                         ");
				break;
				case 2:
					System.out.println("Adiciona o número do prato");
					produto = leia.nextInt();
					System.out.println("Digite a quantidade:");
					quantidade = leia.nextInt();
					
					switch (produto) {
					case 1:
						valorTotal = quantidade * 15;
						System.out.println("Valor total desse pedido: " + valorTotal);
						break;
					case 2:
						valorTotal = quantidade * 5;
						System.out.println("Valor total desse pedido: " + valorTotal);
						break;
					case 3:
						valorTotal = quantidade * 2;
						System.out.println("Valor total desse pedido: " + valorTotal);
						break;
					case 4:
						valorTotal = quantidade * 2;
						System.out.println("Valor total desse pedido: " + valorTotal);
						break;
					case 5:
						valorTotal = quantidade* 15;
						System.out.println("Valor total desse pedido: " + valorTotal);
						break;
					}
					
					System.out.println("Quer algum adicional? Digite 1 para adicionar e 2 para continuar");
					pergunta = leia.nextInt();
					
					switch (pergunta) {
					case 1:
						if(pergunta == 1) {
							System.out.println("Digite o que deseja a mais: ");
							adicional = leia.next();
							
							System.out.println(adicional + " foi adicionado com sucesso");
						}
						break;
					case 2:
						System.out.println("continuar...");
						break;
					}
				break;
				case 3:
					System.out.println("Listar todos os pratos");
					pratos.listarTodos();
					
				break;
				case 4:
					System.out.println("Atualizar pratos");
					System.out.println("Digite o número do prato");
					produto = leia.nextInt();
					
					var buscarPrato = pratos.buscarNaCollection(produto);
					
					if(buscarPrato != null) {
						System.out.println("O prato número: " + produto + " foi encontrado");
					}else {
						System.out.println("O prato número: " + produto + " não foi encontrado");
					}
					
				break;
				case 5:
					System.out.println("Apagar prato");
					System.out.println("\\nDigite o número do prato");
					produto = leia.nextInt();
					
					pratos.deletar(produto);
				break;
				case 0:
					System.out.println("Você saiu");
					break;
				default:
					System.out.println("\nOpção Inválida");
				break;
				
			}
		}
		
	}

}
