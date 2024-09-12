package br.com.lista.primeira_lista;

import java.util.Scanner;
import java.util.logging.Logger;
import br.com.lista.utils.Util;

public class TerceiroExercicioZeusDois {

	// Instância do Logger
	private static final Logger logger = Util.setupLogger();

	public static void main(String[] args) {
		// Declaração de variáveis
		String entrada1;
		String entrada2;
		int numero1 = 0;
		int numero2 = 0;
		boolean verifica = false;
		int soma = 0;
		int subtracao = 0;
		int multiplicacao = 0;
		double divisao = 0;

		// Instância Scanner
		Scanner sc = new Scanner(System.in);

		logger.info("Digite o primeiro número: ");
		entrada1 = sc.nextLine();

		// Verificação do primeiro número
		while(!verifica) {
			try {
	            numero1 = Integer.parseInt(entrada1);
	            verifica = true;
	
	        } catch (NumberFormatException e) {
	            logger.warning("Por favor, digite um número inteiro válido.");
	            entrada1 = sc.nextLine();
	        }
		}

		// Leitura e validação do segundo número
		logger.info("Digite o segundo número: ");
		entrada2 = sc.nextLine();
		
		verifica = false;
		while(!verifica || entrada2.equals("0")) {
			if(entrada2.equals("0")) {
				logger.info("Não é possível realizar divisões por 0.");
				logger.info("Digite um número diferente de 0: ");
				entrada2 = sc.nextLine();
			} else {
				try {
		            numero2 = Integer.parseInt(entrada2);
		            verifica = true;
		        } catch (NumberFormatException e) {
		            logger.warning("Por favor, digite um número inteiro válido.");
		            entrada2 = sc.nextLine();
		        }	
			}
		}
		
		sc.close();

		// Cálculos
		soma = numero1 + numero2;
		subtracao = numero1 - numero2;
		multiplicacao = numero1 * numero2;
		divisao = (double) numero1 / numero2;

		// Formatação dos resultados
		String resultadoSoma = "Soma = " + soma + ".";
		String resultadoSubtracao = "Subtração = " + subtracao + ".";
		String resultadoMultiplicacao = "Multiplicação = " + multiplicacao + ".";
		String resultadoDivisao = String.format("Divisão = %.2f.", divisao);

		// Log dos resultados
		logger.info(resultadoSoma);
		logger.info(resultadoSubtracao);
		logger.info(resultadoMultiplicacao);
		logger.info(resultadoDivisao);
	}
}
