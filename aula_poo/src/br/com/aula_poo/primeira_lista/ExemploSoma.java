package br.com.aula_poo.primeira_lista;

import java.util.Scanner;

public class ExemploSoma {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n1;
		int n2;
		int soma;
		
		System.out.print("Digite o primeiro número: ");
		n1 = sc.nextInt();
		System.out.print("Digite o segundo número: ");
		n2 = sc.nextInt();
		
		soma = n1 + n2;

		System.out.println("A soma é " + soma + ".");
		sc.close();
	
	}
}
