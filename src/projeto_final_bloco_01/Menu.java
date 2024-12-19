package projeto_final_bloco_01;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		int opcao = 1;
		String produto;
		
		Scanner leia = new Scanner(System.in);
		
		while(opcao != 0) {
			System.out.println("***********************************");
			System.out.println("                                   ");
			System.out.println("        Restaurante Japonês        ");
			System.out.println("                                   ");
			System.out.println("***********************************");
			System.out.println("                                   ");
			System.out.println("   1 - Adicionar produto           ");
			System.out.println("   2 - Listar todas os produtos    ");
			System.out.println("   3 - Atualizar produtos          ");
			System.out.println("   4 - Apagar produto              ");
			System.out.println("   0 - Sair                        ");
			System.out.println("                                   ");
			System.out.println("***********************************");
			System.out.println("Digite a opção desejada:           ");
			opcao = leia.nextInt();
			
			switch(opcao) {
				case 1:
					System.out.println("Adicionar produto");
					produto = leia.next();
				break;
				case 2:
					System.out.println("Listar todas os produtos");
				break;
				case 3:
					System.out.println("Atualizar produtos");
				break;
				case 4:
					System.out.println("Apagar produto");
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
