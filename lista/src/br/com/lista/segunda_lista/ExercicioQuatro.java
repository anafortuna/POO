package br.com.lista.segunda_lista;

import java.util.Scanner;
import java.util.logging.Logger;

import br.com.lista.utils.Util;

public class ExercicioQuatro {
	
	//Instância do Logger
	private static Logger logger = Util.setupLogger();
		
	public static void main(String[] args) {
		
		double angulo1 = 0;
		double angulo2 = 0;
		double angulo3 = 0;
		double somaAngulos = 0;
		boolean dadosValidos = false;
		
		Scanner sc = new Scanner(System.in);
		
		while(!dadosValidos) {
			logger.info("Digite o valor do primeiro ângulo do triângulo: ");
			angulo1 = sc.nextDouble();
			logger.info("Digite o valor do segundo ângulo do triângulo: ");
			angulo2 = sc.nextDouble();
			logger.info("Digite o valor do terceiro ângulo do triângulo: ");
			angulo3 = sc.nextDouble();	
		
			somaAngulos = angulo1 + angulo2 + angulo3;
			
			if(somaAngulos == 180) {
				dadosValidos = true;	
			}else {
				logger.info("Os ângulos informados não compõem um triângulo.");
				logger.info("O ângulos internos de um triângulo devem somar 180º. Tente novamente.\n");
				
			}
		}
		
		if(angulo1 < 90 && angulo2< 90 && angulo3 < 90) {
			logger.info("O triângulo é acutângulo!");
		}else if(angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
			logger.info("O triângulo é retângulo!");	
		}else if(angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
			logger.info("O triângulo é obtusângulo!");
		}
		
		sc.close();

	}	
}

