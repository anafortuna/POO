package br.com.lista.segunda_lista;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import br.com.lista.utils.Util;

public class ExercicioCinco {

	// Método para aguardar
	public void aguarde() {
		try {
			Thread.sleep(3000); // Pausa por 3000 milissegundos (2 segundos)
		} catch (InterruptedException e) {
			logger.log(Level.WARNING, "Interrupted!", e);
			Thread.currentThread().interrupt();
		}
	}

	// Instância do Logger
	private static Logger logger = Util.setupLogger();

	public static void main(String[] args) {

		double horasQuebradas;
		double minutos;
		int horas;
		int segundos;

		Scanner sc = new Scanner(System.in);
		ExercicioCinco aguardar = new ExercicioCinco();
		
		logger.info("Digite o número de horas a ser convertido em segundos: ");
		horasQuebradas = sc.nextDouble();

		logger.info("No valor informado, temos: ");

		// Converte a parte inteira de horas
		horas = (int) horasQuebradas;

		// Calcula minutos
		minutos = (horasQuebradas - horas) * 60;
		minutos = Math.round(minutos); // Arredonda os minutos

		String horasMinutos = String.format("%d horas e %.0f minutos.", horas, minutos);
		logger.info(horasMinutos);
		aguardar.aguarde();

		// Converte o número de horas informado em segundos
		segundos = (int) (horasQuebradas * 3600);

		// Escreve na tela o passo a passo da conversão e o valor final
		logger.info("Para calcular o valor em segundos, sabemos que:");
		logger.info("1 hora = 3600 segundos");
		aguardar.aguarde();
		String resultado1 = String.format("Então, temos que %.2f horas equivalem a: ", horasQuebradas);
		logger.info(resultado1);
		String resultado2 = String.format("%.2f * 3600 = %d segundos.", horasQuebradas, segundos);
		logger.info(resultado2);

		sc.close();

	}

}
