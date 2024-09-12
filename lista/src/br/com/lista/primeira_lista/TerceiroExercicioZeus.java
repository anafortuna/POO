package br.com.lista.primeira_lista;

import java.util.Scanner;
import java.util.logging.Logger;
import br.com.lista.utils.Util;

/*
 * Lista de Exercícios 1 - Exercício 3 - Zeus
 * Após ler dois números inteiros apresenta as operações de soma, 
 * subtração, multiplicação e divisão com eles.
 * Obs.: Com tratamento de possíveis erros.
 */

public class TerceiroExercicioZeus {
	
	//Instância do Logger
	private static Logger logger = Util.setupLogger();

	public static void main(String[] args) {
		
		//Declaração de variáveis
		String entrada1;
		String entrada2;
		char[] numeros = {'-','0','1','2','3','4','5','6','7','8','9'};
		int numero1 = 0;
		int numero2 = 0;
		int contador = 0;
		boolean verifica = false;
		int soma = 0;
		int subtracao = 0;
		int multiplicacao = 0;
		double divisao = 0;
		
		//Instância Scanner
		Scanner sc = new Scanner(System.in);
		
		logger.info("Digite o primeiro número: ");
		entrada1 = sc.nextLine();
		
		//Verificação do primeiro número
		while(!verifica) {
			contador = 0;
			for(int i = 0; i < entrada1.length(); i++) {
				char ch = entrada1.charAt(i);
				for(int j = 0; j < 11; j++) {
					if(ch == numeros[j]) {
						contador++;
					}
				}	
			}
			if(contador == entrada1.length()) {
				numero1 = Integer.parseInt(entrada1);
				verifica = true;
			} else {
				logger.info("Por favor, digite um número inteiro: ");
				entrada1 = sc.nextLine();
			}
		
		}
		
		logger.info("Digite o segundo número: ");
		entrada2 = sc.nextLine();
		
		//Verificação do segundo número
		verifica = false;

		while(!verifica || entrada2.equals("0")) {
			contador = 0;
			if(entrada2.equals("0")) {
				logger.info("Não é possível realizar divisões por 0.");
				logger.info("Digite um número diferente de 0: ");
				entrada2 = sc.nextLine();
			} else {
				for(int i = 0; i < entrada2.length(); i++) {
					char ch = entrada2.charAt(i);
					for(int j = 0; j < 11; j++) {
						if(ch == numeros[j]) {
							contador++;
						}
					}		
				}
				if(contador == entrada2.length()) {
					numero2 = Integer.parseInt(entrada2);
					verifica = true;
				} else {
					logger.info("Por favor, digite um número inteiro: ");
					entrada2 = sc.nextLine();
				}
		
			}
		}
		
		sc.close();
		
		soma = numero1 + numero2;
		String resultadoSoma = "Soma = " + soma + ".";
		
		subtracao = numero1 - numero2;
		String resultadoSubtracao = "Subtracao = " + subtracao + ".";
		
		multiplicacao = numero1*numero2;
		String resultadoMultiplicacao = "Multiplicação = " + multiplicacao + ".";
		
		divisao = (double) numero1/numero2;
		
		String divisaoFormatado = String.format("%.2f", divisao);
		String resultadoDivisao = "Divisão = " + divisaoFormatado + ".";
		
		logger.info(resultadoSoma);
		logger.info(resultadoSubtracao);
		logger.info(resultadoMultiplicacao);
		logger.info(resultadoDivisao);
		
	}	
}
