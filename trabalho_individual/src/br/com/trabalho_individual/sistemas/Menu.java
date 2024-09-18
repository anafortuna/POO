package br.com.trabalho_individual.sistemas;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;

import br.com.trabalho_individual.io.Relatorio;
import br.com.trabalho_individual.usuarios.Estudante;
import br.com.trabalho_individual.utils.Util;

public class Menu {

    private boolean autenticado = false;
    private Scanner sc = new Scanner(System.in);

    public void menuInicial() throws InterruptedException {
        Util.setupLogger().log(Level.INFO, "Seja bem-vindo(a) ao SIGA - Sistema de Gestão Acadêmica.");
        Thread.sleep(2500);
        Util.setupLogger().log(Level.INFO, "Digite o que deseja fazer: \n[1] Fazer login \n[2] Sair \nDigite a opção: ");

        int escolha = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                escolha = sc.nextInt();
                sc.nextLine(); 
                entradaValida = true;
            } catch (InputMismatchException e) {
                Util.setupLogger().log(Level.INFO, "Entrada inválida!");
                Util.setupLogger().log(Level.INFO, "Por favor, digite o que deseja fazer: \n[1] Fazer login \n[2] Sair \nDigite a opção: ");
                sc.nextLine();
            }
        }

        switch (escolha) {
            case 1:
                menuPrincipal(autenticacao());
                break;
            case 2:
            	Thread.sleep(2000);
                Util.setupLogger().log(Level.INFO, "Espero vê-lo novamente em breve!");
                return;
            default:
                Util.setupLogger().log(Level.INFO, "Entrada inválida! Por favor, tente novamente.");
                Thread.sleep(3000);
                menuInicial();
                break;
        }
    }

    private Estudante autenticacao() throws InterruptedException {
        String login;
        String senha;

        while (!autenticado) {
            Util.setupLogger().log(Level.INFO, "Digite o nome de usuário: ");
            login = sc.nextLine();
            Util.setupLogger().log(Level.INFO, "Digite a senha: ");
            senha = sc.nextLine();

            boolean loginValido = false;
            for (Map.Entry<Integer, Estudante> estudante : Estudante.getMapaEstudante().entrySet()) {
                if (estudante.getValue().getLogin().equals(login) && estudante.getValue().getSenha().equals(senha)) {
                    autenticado = true;
                    loginValido = true;
                    Thread.sleep(2000);
                    Util.setupLogger().log(Level.INFO, "Login efetuado com sucesso!");
                    Thread.sleep(2000);
                    return estudante.getValue();
                }
            }

            if (!loginValido) {
            	Thread.sleep(2000);
                Util.setupLogger().log(Level.INFO, "Login ou senha incorretos. Tente novamente.");
                Thread.sleep(2000);
            }
        }

       return null;
    }

    private void menuPrincipal(Estudante estudante) throws InterruptedException {
        
    	try {
    		 Util.setupLogger().log(Level.INFO, () -> "Bem-vindo(a), " + estudante.getNome() + ".");
    	}catch (NullPointerException e) {
    		Util.setupLogger().log(Level.INFO, "Ocorreu um erro! O objeto é nulo.");
    		e.printStackTrace();
    	}
   
        Util.setupLogger().log(Level.INFO,
                "O que você gostaria de fazer? \n[1] Ver relatório impresso \n[2] Ver relatório na tela \n[3] Sair \nDigite a opção: ");
        int opcao = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                opcao = sc.nextInt();
                sc.nextLine();
                entradaValida = true;
            } catch (InputMismatchException e) {
                Util.setupLogger().log(Level.INFO, "Entrada inválida!");
                Util.setupLogger().log(Level.INFO,
                        "O que você gostaria de fazer? \n[1] Ver relatório impresso \n[2] Ver relatório na tela \n[3] Sair \nDigite a opção: ");
                sc.nextLine(); 
            }
        }

        switch (opcao) {
            case 1:
                menuRelatorio('t');
                break;
            case 2:
                menuRelatorio('c');
                break;
            case 3:
            	Util.setupLogger().log(Level.INFO, "Tudo bem! Espero que volte em breve!");
            	Thread.sleep(2000);
            	return;
            default:
                Util.setupLogger().log(Level.INFO, "Opção inválida, tente novamente!");
                Thread.sleep(2000);
                menuPrincipal(estudante);
                break;
        }
    }

    private void menuRelatorio(char op) throws InterruptedException {
        
    	Util.setupLogger().log(Level.INFO, "Digite a opção desejada: \n[1] Nota \n[2] Professor \n[3] Voltar ao menu anterior \nDigite a opção: ");
    	
    	int relatorio = 0;
    	boolean entradaValida = false;

        while (!entradaValida) {
            try {
                relatorio = sc.nextInt();
                sc.nextLine();
                entradaValida = true;
            } catch (InputMismatchException e) {
                Util.setupLogger().log(Level.INFO, "Entrada inválida!");
                Util.setupLogger().log(Level.INFO, "Digite a opção desejada: \n[1] Nota \n[2] Professor \n[3] Voltar ao menu anterior \nDigite a opção: ");
                sc.nextLine(); 
            }
        }
    	
    	switch (op) {
            case 't':
            	if(relatorio == 1) {
            		Relatorio.relatorioNota('t');
            		Thread.sleep(2000);
            		Util.setupLogger().log(Level.INFO, "Relatório impresso com sucesso!");
            	} else if (relatorio == 2) {
            		Relatorio.relatorioProfessor('t');
            		Thread.sleep(2000);
            		Util.setupLogger().log(Level.INFO, "Relatório impresso com sucesso!");
            	}else if (relatorio == 3) {
            		Util.setupLogger().log(Level.INFO, "Ok. Estamos te redirecionando.");
            		Thread.sleep(2000);
            		menuPrincipal(Estudante.getMapaEstudante().values().iterator().next());	
            	}else {
                    Util.setupLogger().log(Level.INFO, "Entrada inválida! Tente novamente.");
                    Thread.sleep(2000);
                    menuRelatorio(op);
            	}
                break;
            case 'c':
            	if(relatorio == 1) {
            		Thread.sleep(2000);
            		Relatorio.relatorioNota('c');
            	} else if (relatorio == 2) {
            		Thread.sleep(2000);
            		Relatorio.relatorioProfessor('c');
            	}else if (relatorio == 3) {
            		Util.setupLogger().log(Level.INFO, "Ok. Estamos te redirecionando.");
            		Thread.sleep(2000);
            		menuPrincipal(Estudante.getMapaEstudante().values().iterator().next());
            	}else {
                    Util.setupLogger().log(Level.INFO, "Entrada inválida! Tente novamente.");
                    Thread.sleep(2000);
                    menuRelatorio(op);
            	}
                break;
            default:
                Util.setupLogger().log(Level.INFO, "Opção inválida!");
                Thread.sleep(2000);
                menuPrincipal(Estudante.getMapaEstudante().values().iterator().next()); 
                break;
        }
    }
}
