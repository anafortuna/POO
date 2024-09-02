package br.com.poo.primeira_lista;

import java.util.Scanner;

/*
 * Lista de Exercícios 1 - Exercício 3 - Zeus
 * Após ler dois números inteiros apresenta as operações de soma, 
 * subtração, multiplicação e divisão com eles.
 * Obs.: Com tratamento de possíveis erros.
 */

public class TerceiroExercicioZeus {

	public static void main(String[] args) {
		
		//Declaração de variáveis
		String entrada1;
		String entrada2;
		char numeros[] = {'-','0','1','2','3','4','5','6','7','8','9'};
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
		
		System.out.print("Digite o primeiro número: ");
		entrada1 = sc.nextLine();
		
		while(verifica == false) {
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
				System.out.print("Por favor, digite um número inteiro: ");
				entrada1 = sc.nextLine();
			}
		
		}
		
		System.out.print("Digite o segundo número: ");
		entrada2 = sc.nextLine();
		
		verifica = false;

		while(verifica == false || entrada2.equals("0")) {
			contador = 0;
			if(entrada2.equals("0")) {
				System.out.println("Não é possível realizar divisões por 0.");
				System.out.print("Digite um número diferente de 0: ");
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
					System.out.print("Por favor, digite um número inteiro: ");
					entrada2 = sc.nextLine();
				}
		
			}
		}
		
		sc.close();
		
		soma = numero1 + numero2;
		subtracao = numero1 - numero2;
		multiplicacao = numero1*numero2;
		divisao = (double) numero1/numero2;
		
		String divisaoFormatado = String.format("%.2f", divisao);
		
		System.out.println("Soma = " + soma + ".");
		System.out.println("Subtracao = " + subtracao + ".");
		System.out.println("Multiplicação = " + multiplicacao + ".");
		System.out.println("Divisão = " + divisaoFormatado + ".");
		
	}	
}
