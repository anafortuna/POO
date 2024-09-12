package br.com.lista.segunda_lista;

import java.util.Scanner;
import java.util.logging.Logger;
import br.com.lista.utils.Util;

public class ExercicioTres {

	public static void chamarMain() {
		// Chama o método main diretamente
		String[] args = {}; // Cria um array vazio para os argumentos
		ExercicioTres.main(args);
	}

	//Instância do Logger
	private static Logger logger = Util.setupLogger();
	
	public static void main(String[] args) {
		
		String opcao;
		String confirmacao;
		String[] produtosComEstoque = {"Produtos com Estoque", "Sabonete", "Shampoo", "Condicionador"};
		String[] produtosSemEstoque = {"Produtos sem Estoque", "Hidratante", "Desodorante", "Pasta de dente"};
		
		Scanner sc = new Scanner(System.in);
		
		String entrada = "Digite 1 para listar 'Produtos com Estoque', 2 para listar 'Produtos sem Estoque' ou 3 para Sair: "; 
		logger.info(entrada);
		opcao = sc.next();
	
		while(!opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3")){
			logger.info("Entrada inválida.\n");
			logger.info("Digite 1 para listar 'Produtos com Estoque', 2 para listar 'Produtos sem Estoque' ou 3 para Sair: ");
			opcao = sc.next();
		}
		
		switch(opcao) {
			case "1":
				logger.info("\nVocê escolheu a opção 1: Listar 'Produtos com Estoque'.");
				for(int i = 0; i < 4; i++) {
					logger.info(produtosComEstoque[i]);
				}
			break;
			case "2":
				logger.info("\nVocê escolheu a opção 2: Listar 'Produtos sem Estoque'.");
				for(int i = 0; i < 4; i++) {
					logger.info(produtosSemEstoque[i]);
				}
			break;
			case "3":
				logger.info("\nVocê escolheu a opção 3. Tem certeza que deseja Sair? Digite 'S'para Sim ou 'N' para Não: ");
				confirmacao = sc.next();
				switch(confirmacao) {
					case "S":
						logger.info("Volte logo!");
					break;
					case "N":
						chamarMain();
					break;
					default:
						while(!confirmacao.equals("S") && !confirmacao.equals("N")) {
							logger.info("Opção inválida! Digite 'S' para Sim ou 'N' para Não: ");
							confirmacao = sc.next();
								if(confirmacao.equals("S")) {
									logger.info("Volte logo!");	
								} else if(confirmacao.equals("N")) {
									chamarMain();
								}
						}
					break;	
				}
			break;
			default: 
				logger.info("Opção inválida! Tente novamente!");
				logger.info(entrada);
				opcao = sc.next();
		}
		
		sc.close();
			
	}
		
}



