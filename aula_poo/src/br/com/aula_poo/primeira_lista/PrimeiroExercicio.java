package br.com.aula_poo.primeira_lista;

import java.util.Scanner;

/*
 * Lista 1 - Exercício 1 - Poseidon
 * Escreva e leia o nome e o sobrenome.
 */
public class PrimeiroExercicio {

	public static void main(String[] args) {
		//instância para o "leia"
		Scanner sc = new Scanner(System.in);
		//cadeia nome
		String nome;
		//cadeia sobrenome
		String sobrenome;
		//escreva("Digite o seu nome: ")
		System.out.print("Digite o seu nome: ");
		//leia(nome)
		nome = sc.nextLine();
		//escreva("Digite o seu sobrenome: ")
		System.out.print("Digite o seu sobrenome: ");
		//leia(sobrenome)
		sobrenome = sc.nextLine();
		System.out.println("Olá, " + nome + " " + sobrenome + ". Seja bem-vindo ao mundo de POO!");
		//System.out.printf("Olá, %s %s", nome, sobrenome);
		sc.close();
	}
}