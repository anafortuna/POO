package br.com.lista.segunda_lista;

import java.util.Scanner;
import java.util.logging.Logger;
import br.com.lista.utils.Util;

public class ExercicioSete {

	// Instância do Logger
	private static Logger logger = Util.setupLogger();

	public static void main(String[] args) {

		// Declaração de variáveis
		int numeroDeEstudantes = 0;
		int estudantesDisc1 = 0;
		int estudantesDisc2 = 0;
		int mediaEstudantesMadrugadaInteiro = 0;
		int percentualDaTurmaInteiro = 0;
		double estudantesDisc1Real = 0;
		double estudantesDisc2Real = 0;
		double mediaEstudantesMadrugada = 0;
		double percentualDaTurma = 0;
		String opcao;
		boolean validacao = false;

		Scanner sc = new Scanner(System.in);

		while (!validacao) {
			// Pede ao usuário que insira a quantidade total de alunos da turma
			logger.info("Quantos estudantes estão na turma? ");
			numeroDeEstudantes = sc.nextInt();

			String confirmacao = String.format(
					"A turma tem %d alunos. Esse número está correto? Digite 'S' para Sim e 'N' para Não: ",
					numeroDeEstudantes);
			logger.info(confirmacao);
			opcao = sc.next();

			switch (opcao) {
			case "S":
				logger.info("Muito bem, vamos lá!");
				validacao = true;
				break;
			case "s":
				logger.info("Muito bem, vamos lá!");
				validacao = true;
				break;	
			case "N":
				logger.info("Vamos tentar novamente.");
				break;
			case "n":
				logger.info("Vamos tentar novamente.");
				break;	
			default:
				while (!opcao.equals("S") && !opcao.equals("s") && !opcao.equals("N") && !opcao.equals("n")) {
					logger.info("Você digitou um valor inválido.");
					logger.info("Digite 'S' para Sim e 'N' para Não: ");
					opcao = sc.next();
					if (opcao.equals("S") || opcao.equals("s")) {
						logger.info("Muito bem, vamos lá!");
						validacao = true;
					} else if (opcao.equals("N") || opcao.equals("n")) {
						logger.info("Vamos tentar novamente.");
					}
				}
				break;
			}
		}

		estudantesDisc1Real = Math.round(0.35 * numeroDeEstudantes); // Número de alunos que estudam de madrugada na disciplina 1
		estudantesDisc2Real = Math.round(estudantesDisc1Real + (0.3 * estudantesDisc1Real)); // Número de alunos que estudam de madrugada na disciplina 2

		estudantesDisc1 = (int) estudantesDisc1Real;
		estudantesDisc2 = (int) estudantesDisc2Real;

		String informacao1 = String.format("Na disciplina 1, %d alunos estudam de madrugada.", estudantesDisc1);
		logger.info(informacao1);
		String informacao2 = String.format("Na disciplina 2, %d alunos estudam de madrugada.", estudantesDisc2);
		logger.info(informacao2);

		mediaEstudantesMadrugada = Math.round((estudantesDisc1Real + estudantesDisc2Real) / 2); // Cálculo de quantos alunos, em média, estudam de madrugada nas duas disciplinas
		mediaEstudantesMadrugadaInteiro = (int) mediaEstudantesMadrugada;

		percentualDaTurma = Math.round((mediaEstudantesMadrugada / numeroDeEstudantes) * 100); // Cálculo do percentual de quantos alunos estudam de madrugada
														
		percentualDaTurmaInteiro = (int) percentualDaTurma;

		// Escreve na tela os resultados da média e do percentual dos alunos que estudam de madrugada
		String resultado = String.format("Logo, temos que, em média, %d alunos estudam de madrugada, o que equivale a, aproximadamente, %d%% do total de estudantes da turma.", mediaEstudantesMadrugadaInteiro, percentualDaTurmaInteiro);
		logger.info(resultado);

		sc.close();
	}
}
