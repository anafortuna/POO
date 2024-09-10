package br.com.lista.primeira_lista;

import java.util.Scanner;

/*
 * Lista de Exercícios 1 - Exercício 4 - Atena
 * Lê uma temperatura em graus celsius, e devolve sua equivalência
 * na escala fahrenheit.
 */

public class QuartoExercicioAtena {

	public static void main(String[] args) {

		double celsius;
		double farenheit;
		
		//Instância Scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em ºC: ");
		celsius = sc.nextDouble();
		
		sc.close();
		
		farenheit = (celsius*1.8) + 32;
		
		System.out.print("A temperatura em ºF é: " + farenheit + ".");

	}

}
