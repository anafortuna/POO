package br.com.lista.segunda_lista;

import java.util.Scanner;
import java.util.logging.Logger;
import br.com.lista.utils.Util;

public class ExercicioSeis {

	// Instância do Logger
	private static Logger logger = Util.setupLogger();

	public static void main(String[] args) {
		// Declaração de variáveis
		int inicioIntervalo = 0;
		int finalIntervalo = 0;
		int somaInicio = 0;
		int restoInicio = 0;
		int nInicio = 0;
		int somaFinal = 0;
		int restoFinal = 0;
		int nFinal = 0;
		int somaTotal = 0;
		boolean validacaoIntervalo = false;

		Scanner sc = new Scanner(System.in);

		while (!validacaoIntervalo) {
			logger.info("Digite o primeiro número do intervalo: "); 
			inicioIntervalo = sc.nextInt(); 
			logger.info("Digite o último número do intervalo: "); 
			finalIntervalo = sc.nextInt(); 
			if ((finalIntervalo - inicioIntervalo) < 100) {
				logger.info("O intervalo deve ser maior que 100!\n");
			} else {
				validacaoIntervalo = true;
			}
		}

		String informacao = String.format("Dentro do intervalo [%d, %d] temos que: ", inicioIntervalo, finalIntervalo);
		logger.info(informacao);
		logger.info("Os 3 primeiros múltiplos de 6 desse intervalo são: ");

		while (nInicio < 3) { // Laço para coletar 3 números múltiplos de 6 a partir do início do intervalo
			restoInicio = inicioIntervalo % 6; // Verifica se o número é múltiplo de 6
			if (restoInicio == 0) { // Caso seja:
				somaInicio += inicioIntervalo; // Soma o número na variável somaInicio
				nInicio += 1; // nInicio aumenta 1, visto que encontramos um múltiplo
				String inicioIntervaloS = String.valueOf(inicioIntervalo); 
				logger.info(inicioIntervaloS);
				inicioIntervalo += 1; // Verificamos o próximo número do intervalo
			} else { // Caso não seja
				inicioIntervalo += 1; // Verificamos o próximo número do intervalo
			}
		}

		logger.info("Os 3 últimos múltiplos de 6 desse intervalo são:");

		while (nFinal < 3) { // Laço para coletar 3 números múltiplos de 6 anteriores ao final do intervalo
			restoFinal = finalIntervalo % 6; // Verifica se o número é múltiplo de 6
			if (restoFinal == 0) { // Caso seja:
				somaFinal += finalIntervalo; // Soma o número na variável somaFinal
				nFinal += 1; // nFinal aumenta 1, visto que encontramos um múltiplo
				String finalIntervaloS = String.valueOf(finalIntervalo);
				logger.info(finalIntervaloS);
				finalIntervalo -= 1; // Verificamos o número anterior do intervalo
			} else { // Caso não seja
				finalIntervalo -= 1; // Verificamos o número anterior do intervalo
			}
		}

		somaTotal = somaInicio + somaFinal; // Somamos somaInicio com somaFinal para determinar o valor da somaTotal

		String resultado = String.format("A soma total desses 6 múltiplos é: %d.", somaTotal); 
		logger.info(resultado);

		sc.close();
	}
}
