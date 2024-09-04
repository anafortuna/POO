package br.com.aula_poo.balanco;

public class DoubleBalancoTri {

	public static void main(String[] args) {
		
		//Criar instâncias Double
		Double gastosJaneiro = new Double(15000);
		Double gastosFevereiro = new Double(23000);
		Double gastosMarco = new Double(17000);
		
		Double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco; 
		
		System.out.print("O gasto total do primeiro trimestre é " + gastosTrimestre + ".");


	}

}
