package br.com.lista.segunda_lista;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.lista.utils.Util;

public class ExercicioDois {

	// Método para aguardar
	public void aguarde() {
		try {
			Thread.sleep(3000); // Pausa por 3000 milissegundos (2 segundos)
		} catch (InterruptedException e) {
			logger.log(Level.WARNING, "Interrupted!", e);
			Thread.currentThread().interrupt();
		}
	}
	
	//Instância do Logger
	private static Logger logger = Util.setupLogger();

	public static void main(String[] args) {

		int diaNascimento = 0;
		int mesNascimento = 0;
		int anoNascimento = 0;
		int minhaIdade = 0;
		String verificacao;
		boolean dadosValidos = false;

		ExercicioDois aguardar = new ExercicioDois();
		Scanner sc = new Scanner(System.in);
		LocalDate date = LocalDate.now();

		while (!dadosValidos) {
			logger.info("Digite o dia do seu nascimento: ");
			diaNascimento = sc.nextInt();
			logger.info("Digite o mês do seu nascimento: ");
			mesNascimento = sc.nextInt();
			logger.info("Digite o ano do seu nascimento: ");
			anoNascimento = sc.nextInt();

			String dataNascimento = "A sua data de nascimento é: " + diaNascimento + "/" + mesNascimento + "/" + anoNascimento + "."; 
			logger.info(dataNascimento);
			logger.info("A data informada está correta? Digite 'S' para Sim e 'N' para Não: ");
			verificacao = sc.next();

			if (verificacao.equals("S")) {
				logger.info("Legal! Vamos calcular a sua idade!");
				aguardar.aguarde();
				dadosValidos = true;
			} else if (verificacao.equals("N")) {
				logger.info("Sem problemas! Vamos tentar novamente!");
			} else {
				while (!verificacao.equals("S") && !verificacao.equals("N")) {
					logger.info("Você digitou um valor inválido.");
					logger.info("Digite 'S' para Sim e 'N' para Não: ");
					verificacao = sc.next();
					if (verificacao.equals("S")) {
						logger.info("Legal! Vamos calcular a sua idade!");
						aguardar.aguarde();
						dadosValidos = true;
					} else if (verificacao.equals("N")) {
						logger.info("Sem problemas! Vamos tentar novamente!");
					}
				}
			}
		}

		int anoAtual = date.getYear();

		minhaIdade = anoAtual - anoNascimento;

		int mesAtual = date.getMonthValue();
		int diaMesAtual = date.getDayOfMonth();
		
		if (mesAtual <= mesNascimento && (mesAtual < mesNascimento || diaMesAtual < diaNascimento)) {
				minhaIdade = minhaIdade - 1;
		}	
		
		String resultado = "Você tem " + minhaIdade + " anos."; 
		logger.info(resultado);

		sc.close();
	}

}
