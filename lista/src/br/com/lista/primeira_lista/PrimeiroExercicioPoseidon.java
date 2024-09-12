package br.com.lista.primeira_lista;

import java.util.Scanner;
import java.util.logging.Logger;
import br.com.lista.utils.Util;

/*
 * Lista de Exercícios 1 - Exercício 1 - Poseidon
 * Escreva e leia o nome e o sobrenome
 */

public class PrimeiroExercicioPoseidon {

	//Instância do Logger
	private static Logger logger = Util.setupLogger();
	
	public static void main(String[] args) {
		
		//Declaração de variáveis
		String nome;
		String sobrenome;
		
		//Instância Scanner - entrada de dados
		Scanner sc = new Scanner(System.in);
		
		//Saída de dados
		logger.info("Digite o seu nome: ");
		
		//Entrada de dados
		nome = sc.nextLine(); //nextLine para que seja possível a digitação de mais de um nome
		
		//Saída de dados
		logger.info("Digite seu sobrenome: ");
		
		//Entrada de dados
		sobrenome = sc.nextLine();
		
		//Fechamento do Scanner
		sc.close();
		
		//Saída de dados - Final
		logger.info("Olá, " + nome + " " + sobrenome + "! Seja bem-vindo(a) ao universo da programação!");
		
		
	}

}
