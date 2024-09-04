package br.com.aula_poo.balanco;

import java.math.BigDecimal; //Classe para usar BigDecimal

public class BigDecimalBalancoTri {

	public static void main(String[] args) {
		
		//Criar instâncias de BigDecimal
		BigDecimal gastosJaneiro = new BigDecimal("15000");
		BigDecimal gastosFevereiro = new BigDecimal("23000");
		BigDecimal gastosMarco = new BigDecimal("17000");
		
		//Realizar a soma
		BigDecimal gastosTrimestre = gastosJaneiro.add(gastosFevereiro).add(gastosMarco);
		
		System.out.print("O gasto total do primeiro trimestre é " + gastosTrimestre + ".");


	}

}
