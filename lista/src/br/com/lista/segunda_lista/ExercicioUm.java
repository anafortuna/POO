package br.com.lista.segunda_lista;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.lista.utils.Util;

public class ExercicioUm {
	
	//Método para aguardar
	public void aguarde() {
		try {
		    Thread.sleep(3000); // Pausa por 3000 milissegundos (2 segundos)
		} catch (InterruptedException e) {
			logger.log(Level.WARNING, "Interrupted!", e);
			 Thread.currentThread().interrupt();
		}
	}
	
	//Instância do Logger
	private static Logger logger = Util.setupLogger();
	
	public static void main(String[] args) {
		
		String respostaUsuario;
		boolean verificaResposta = false;

		ExercicioUm aguardar = new ExercicioUm();
		Scanner sc = new Scanner(System.in); 
		
		logger.info("Olá, viajante!");
		logger.info("Quer saber qual o significado da vida, do universo e tudo mais? ");
		respostaUsuario = sc.next();
		
		
		while(!verificaResposta) {
			if(respostaUsuario.equals("Sim")) {
				logger.info("Então vou te contar!");
				aguardar.aguarde();
				logger.info("É uma resposta fundamental!");
				aguardar.aguarde();
				logger.info("O significado da vida, do universo e tudo mais é 42.");
				verificaResposta = true;
			} else if(respostaUsuario.equals("Não")) {
				logger.info("Que pena! Nem todos estão prontos para essa resposta.");
				logger.info("Quem sabe uma próxima vez!");
				verificaResposta = true;
			} else {
				logger.info("Entrada inválida! Digite 'Sim' ou 'Não': ");
				respostaUsuario = sc.next();
			}

		}

		sc.close();
	}

}

