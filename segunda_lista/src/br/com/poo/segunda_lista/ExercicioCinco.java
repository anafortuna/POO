package br.com.poo.segunda_lista;

import java.util.Scanner;

public class ExercicioCinco {
	
	public static void main(String[] args) {
		
		// Declaração de variáveis
        double horasQuebradas, minutos;
        int horas, segundos;

        // Criação do objeto Scanner para leitura de dados do usuário
        Scanner sc = new Scanner(System.in);

        // Pede ao usuário que informe um número de horas
        System.out.print("Digite o número de horas a ser convertido em segundos: ");
        horasQuebradas = sc.nextDouble();

        System.out.println("No valor informado, temos: ");

        // Converte a parte inteira de horas
        horas = (int) horasQuebradas;

        // Calcula minutos
        minutos = (horasQuebradas - horas) * 60;
        minutos = Math.round(minutos); // Arredonda os minutos

        System.out.printf("%d horas e %.0f minutos.%n", horas, minutos);

        // Converte o número de horas informado em segundos
        segundos = (int) (horasQuebradas * 3600);

        // Escreve na tela o passo a passo da conversão e o valor final
        System.out.println("Para calcular o valor em segundos, sabemos que:");
        System.out.println("1 hora = 3600 segundos");
        System.out.printf("Então, temos que %.2f horas equivalem a:%n", horasQuebradas);
        System.out.printf("%.2f * 3600 = %d segundos.%n", horasQuebradas, segundos);
        
        // Fecha o scanner
        sc.close();
		
	}

}
