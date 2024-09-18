package br.com.trabalho_individual.locais;

import java.util.HashMap;
import java.util.Map;

public class Faculdade {

	String tipo = "Faculdade";
	int idFaculdade;
	String nome;
	String cnpj;
	String telefone;
	double notaMec;
	static Map<Integer, Faculdade> mapaFaculdade = new HashMap<>();
	
	public Faculdade() {
	
	}

	public Faculdade(String tipo, int idFaculdade, String nome, String cnpj, String telefone, double notaMec) {
		this.idFaculdade = idFaculdade;
		this.nome = nome;
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.notaMec = notaMec;
	}

	public double getNotaMec() {
		return notaMec;
	}

	public void setNotaMec(double notaMec) {
		this.notaMec = notaMec;
	}

	public String getTipo() {
		return tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getIdFaculdade() {
		return idFaculdade;
	}

	public static Map<Integer, Faculdade> getMapaFaculdade() {
		return mapaFaculdade;
	}
	
	@Override
	public String toString() {
		return "Faculdade [tipo=" + tipo + ", idFaculdade=" + idFaculdade + ", nome=" + nome + ", cnpj=" + cnpj
				+ ", telefone=" + telefone + ", notaMec=" + notaMec + "]";
	}
		
}
