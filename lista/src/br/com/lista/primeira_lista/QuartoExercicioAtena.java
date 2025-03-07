package br.com.lista.primeira_lista;

import java.util.Scanner;
import java.util.logging.Logger;
import br.com.lista.utils.Util;

/*
 * Lista de Exercícios 1 - Exercício 4 - Atena
 * Lê uma temperatura em graus celsius, e devolve sua equivalência
 * na escala fahrenheit.
 */

public class QuartoExercicioAtena {
	
	//Instância do Logger
	private static Logger logger = Util.setupLogger();

	public static void main(String[] args) {

		double celsius;
		double farenheit;
		
		//Instância Scanner
		Scanner sc = new Scanner(System.in);
		
		logger.info("Digite a temperatura em ºC: ");
		celsius = sc.nextDouble();
		
		sc.close();
		
		farenheit = (celsius*1.8) + 32;
		
		String resultado = "A temperatura em ºF é: " + farenheit + ".";
		logger.info(resultado);

	}

}
