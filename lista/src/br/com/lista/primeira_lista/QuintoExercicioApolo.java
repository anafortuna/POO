package br.com.lista.primeira_lista;

import java.util.Scanner;
import java.util.logging.Logger;

import br.com.lista.utils.Util;

/*
 * Lista de Exercícios 1 - Exercício 5 - Apolo
 * Escreve na tela o resultado das expressões:
 * a. 2 + 3 - 5 * 8 - 4 + 354 - 521 + 7 * 66
 * b. 2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9
 */

public class QuintoExercicioApolo {
	
	//Instância do Logger
	private static Logger logger = Util.setupLogger();

	public static void main(String[] args) {
			
			String opcao;
			int a;
			int b;
			boolean verifica = false;
			
			//Instância Scanner
			Scanner sc = new Scanner(System.in);

			logger.info("Dentre as expressões:");
			logger.info("(1) 2 + 3 - 5 * 8 - 4 + 354 - 521 + 7 * 66");
			logger.info("(2) 2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9");
			logger.info("Qual delas deseja resolver? Digite 1 ou 2: ");
			opcao = sc.next();

			while(!verifica) {
				if(opcao.equals("1")) {
					a = 2 + 3 - 5 * 8 - 4 + 354 - 521 + 7 * 66;
					String resultado1 = "O resultado da expressão é: " + a + ".";
					logger.info(resultado1);
					verifica = true;
				} else if (opcao.equals("2")) {
					b = 2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9;
					String resultado2 ="O resultado da expressão é: " + b + "."; 
					logger.info(resultado2);
					verifica = true;
				}else {
					logger.info("Entrada inválida!");
					logger.info("Qual expressão deseja resolver? ");	
					opcao = sc.next();
				}
			}
			
			sc.close();
	}

}
