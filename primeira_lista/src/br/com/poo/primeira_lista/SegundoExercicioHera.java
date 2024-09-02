package br.com.poo.primeira_lista;

/*
 * Lista de Exercícios 1 - Exercício 2 - Hera
 * O programa irá solicitar a entrada da idade de 5 colegas, além 
 * da do usuário e imprimirá a soma delas. 
 */

import java.util.Scanner;

public class SegundoExercicioHera {

	public static void main(String[] args) {
		
		//Declaração de variáveis
		int i;
		int[] idades = new int[5];
		int minhaIdade;
		int somaIdadesColegas = 0;
		int somaTotal = 0;
		
		try (Scanner sc = new Scanner(System.in)) {
			for (i = 0; i < 5; i++) { //Laço para capturar 5 idades de colegas
				System.out.print("Digite a idade do colega " + (i + 1) + ": ");
				idades[i] = sc.nextInt();
			}
			
			System.out.print("Qual a sua idade? ");
			minhaIdade = sc.nextInt();
		}
		
		for (i = 0; i < 5; i++) { //Laço para somas as 5 idades de colegas
			somaIdadesColegas += idades[i];
		}
		
		somaTotal = somaIdadesColegas + minhaIdade;
		
		System.out.println("O tempo de vida meu e dos meus colegas é " + somaTotal + ".");
	
	}

}