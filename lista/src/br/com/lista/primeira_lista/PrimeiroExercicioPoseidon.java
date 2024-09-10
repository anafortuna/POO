package br.com.lista.primeira_lista;

import java.util.Scanner;

/*
 * Lista de Exercícios 1 - Exercício 1 - Poseidon
 * Escreva e leia o nome e o sobrenome
 */
public class PrimeiroExercicioPoseidon {

	public static void main(String[] args) {
		
		//Declaração de variáveis
		String nome;
		String sobrenome;
		
		//Instância Scanner - entrada de dados
		Scanner sc = new Scanner(System.in);
		
		//Saída de dados
		System.out.print("Digite o seu nome: ");
		
		//Entrada de dados
		nome = sc.nextLine(); //nextLine para que seja possível a digitação de mais de um nome
		
		//Saída de dados
		System.out.print("Digite seu sobrenome: ");
		
		//Entrada de dados
		sobrenome = sc.nextLine();
		
		//Fechamento do Scanner
		sc.close();
		
		//Saída de dados - Final
		System.out.println("Olá, " + nome + " " + sobrenome + "! Seja bem-vindo(a) ao universo da programação!");
		
		
	}

}
