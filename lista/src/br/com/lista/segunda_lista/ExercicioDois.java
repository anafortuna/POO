package br.com.lista.segunda_lista;

import java.time.LocalDate;
import java.util.Scanner;

public class ExercicioDois {
	
	//Método para aguardar
	public void aguarde() {
		try {
			Thread.sleep(3000); // Pausa por 3000 milissegundos (2 segundos)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		int diaNascimento = 0;
		int mesNascimento = 0;
		int anoNascimento = 0;
		int minhaIdade = 0;
		String verificacao;
		boolean dadosValidos = false;
		
		ExercicioDois aguardar = new ExercicioDois();
		Scanner sc = new Scanner(System.in);
		LocalDate date = LocalDate.now();
		
		while(dadosValidos == false) {
			System.out.print("Digite o dia do seu nascimento: ");
			diaNascimento = sc.nextInt();
			System.out.print("Digite o mês do seu nascimento: ");
			mesNascimento = sc.nextInt();
			System.out.print("Digite o ano do seu nascimento: ");
			anoNascimento = sc.nextInt();
			
			System.out.println("A sua data de nascimento é: " + diaNascimento + "/" + mesNascimento + "/" + anoNascimento + ".");
			System.out.print("A data informada está correta? Digite 'S' para Sim e 'N' para Não: ");
			verificacao = sc.next();
			
				if(verificacao.equals("S")) {
					System.out.println("Legal! Vamos calcular a sua idade!");
					aguardar.aguarde();
					dadosValidos = true;
				}else if(verificacao.equals("N")) {
					System.out.println("Sem problemas! Vamos tentar novamente!");
				}else {
					while(!verificacao.equals("S") && !verificacao.equals("N")){
						System.out.println("Você digitou um valor inválido.");
						System.out.print("Digite 'S' para Sim e 'N' para Não: ");
						verificacao = sc.next();
							if(verificacao.equals("S")) {
								System.out.println("Legal! Vamos calcular a sua idade!");
								aguardar.aguarde();
								dadosValidos = true;
							}else if(verificacao.equals("N")) {
								System.out.println("Sem problemas! Vamos tentar novamente!");
							}
					}		
				}
		}
		
		int anoAtual = date.getYear();
		
		minhaIdade = anoAtual - anoNascimento;
		
		int mesAtual = date.getMonthValue();
		int diaMesAtual = date.getDayOfMonth();
		
		if(mesAtual <= mesNascimento) {
			if(mesAtual < mesNascimento) {
				minhaIdade = minhaIdade - 1;
			} else if(diaMesAtual < diaNascimento ) {
				minhaIdade = minhaIdade - 1;
			}
		}
		
		System.out.println("Você tem " + minhaIdade + " anos.");

		sc.close();
	}

}
