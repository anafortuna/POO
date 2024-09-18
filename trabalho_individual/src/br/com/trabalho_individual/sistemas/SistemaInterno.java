package br.com.trabalho_individual.sistemas;

import br.com.trabalho_individual.io.LeituraEscrita;

public class SistemaInterno {

	public static void main(String[] args) throws InterruptedException {
		
		LeituraEscrita.leitor("banco");
		
		Menu menu = new Menu();
		menu.menuInicial();

	}

}
