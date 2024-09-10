package br.com.lista.primeira_lista;

import java.util.Scanner;

/*
 * Lista de Exercícios 1 - Exercício 5 - Apolo
 * Escreve na tela o resultado das expressões:
 * a. 2 + 3 - 5 * 8 - 4 + 354 - 521 + 7 * 66
 * b. 2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9
 */

public class QuintoExercicioApolo {

	public static void main(String[] args) {
			
			String opcao;
			int a;
			int b;
			boolean verifica = false;
			
			//Instância Scanner
			Scanner sc = new Scanner(System.in);

			System.out.println("Dentre as expressões:");
			System.out.println("(1) 2 + 3 - 5 * 8 - 4 + 354 - 521 + 7 * 66");
			System.out.println("(2) 2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9");
			System.out.print("Qual delas deseja resolver? Digite 1 ou 2: ");
			opcao = sc.next();

			while(verifica == false) {
				if(opcao.equals("1")) {
					a = 2 + 3 - 5 * 8 - 4 + 354 - 521 + 7 * 66;
					System.out.print("O resultado da expressão é: " + a + ".");
					verifica = true;
				} else if (opcao.equals("2")) {
					b = 2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9;
					System.out.print("O resultado da expressão é: " + b + ".");
					verifica = true;
				}else {
					System.out.println("Entrada inválida!");
					System.out.print("Qual expressão deseja resolver? ");	
					opcao = sc.next();
				}
			}
			
			sc.close();
	}

}
