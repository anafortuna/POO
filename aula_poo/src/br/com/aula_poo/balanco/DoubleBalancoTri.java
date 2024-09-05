package br.com.aula_poo.balanco;

public class DoubleBalancoTri {

	public static void main(String[] args) {
		
		//Criar instâncias Double
		Double gastosJaneiro = 15000.;
		Double gastosFevereiro = 23000.;
		Double gastosMarco = 17000.;
		
		double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco; 
		
		System.out.print("O gasto total do primeiro trimestre é " + gastosTrimestre + ".");


	}

}
