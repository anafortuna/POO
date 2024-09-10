package br.com.lista.segunda_lista;

import java.util.Scanner;

public class ExercicioUm {
	
	//Método para aguardar
	public void aguarde() {
		try {
		    Thread.sleep(3000); // Pausa por 3000 milissegundos (2 segundos)
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		String respostaUsuario;
		boolean verificaResposta = false;

		ExercicioUm aguardar = new ExercicioUm();
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Olá, viajante!");
		System.out.print("Quer saber qual o significado da vida, do universo e tudo mais? ");
		respostaUsuario = sc.next();
		
		
		while(verificaResposta == false) {
			if(respostaUsuario.equals("Sim")) {
				System.out.println("Então vou te contar!");
				aguardar.aguarde();
				System.out.println("É uma resposta fundamental!");
				aguardar.aguarde();
				System.out.println("O significado da vida, do universo e tudo mais é 42.");
				verificaResposta = true;
			} else if(respostaUsuario.equals("Não")) {
				System.out.println("Que pena! Nem todos estão prontos para essa resposta.");
				System.out.println("Quem sabe uma próxima vez!");
				verificaResposta = true;
			} else {
				System.out.print("Entrada inválida! Digite 'Sim' ou 'Não': ");
				respostaUsuario = sc.next();
			}

		}

		sc.close();
	}

}

