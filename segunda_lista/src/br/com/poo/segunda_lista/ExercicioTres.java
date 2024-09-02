package br.com.poo.segunda_lista;

import java.util.Scanner;

public class ExercicioTres {
	
	public static void chamarMain() {
		// Chama o método main diretamente
	    String[] args = {}; // Cria um array vazio para os argumentos
	    ExercicioTres.main(args);
	 }
	
	public static void main(String[] args) {
		
		String opcao;
		String confirmacao;
		String[] produtosComEstoque = {"Produtos com Estoque", "Sabonete", "Shampoo", "Condicionador"};
		String[] produtosSemEstoque = {"Produtos sem Estoque", "Hidratante", "Desodorante", "Pasta de dente"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite 1 para listar 'Produtos com Estoque', 2 para listar 'Produtos sem Estoque' ou 3 para Sair: ");
		opcao = sc.next();
	
		while(!opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3")){
			System.out.println("Entrada inválida.\n");
			System.out.print("Digite 1 para listar 'Produtos com Estoque', 2 para listar 'Produtos sem Estoque' ou 3 para Sair: ");
			opcao = sc.next();
		}
		
		switch(opcao) {
			case "1":
				System.out.println("\nVocê escolheu a opção 1: Listar 'Produtos com Estoque'.");
				for(int i = 0; i < 4; i++) {
					System.out.println(produtosComEstoque[i]);
				}
			break;
			case "2":
				System.out.println("\nVocê escolheu a opção 2: Listar 'Produtos sem Estoque'.");
				for(int i = 0; i < 4; i++) {
					System.out.println(produtosSemEstoque[i]);
				}
			break;
			case "3":
				System.out.print("\nVocê escolheu a opção 3. Tem certeza que deseja Sair? Digite 'S'para Sim ou 'N' para Não: ");
				confirmacao = sc.next();
				switch(confirmacao) {
					case "S":
						System.out.println("Volte logo!");
					break;
					case "N":
						chamarMain();
					break;
					default:
						while(!confirmacao.equals("S") && !confirmacao.equals("N")) {
							System.out.print("Opção inválida! Digite 'S' para Sim ou 'N' para Não: ");
							confirmacao = sc.next();
								if(confirmacao.equals("S")) {
									System.out.println("Volte logo!");	
								} else if(confirmacao.equals("N")) {
									chamarMain();
								}
						}
					break;	
				}
			break;
			
		}
		
		sc.close();
			
	}
		
}


