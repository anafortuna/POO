package br.com.trabalho_individual.usuarios;

import java.util.HashMap;
import java.util.Map;


public class Estudante extends Usuario {

	String tipo = "Estudante";
	int idEstudante;
	int fkFaculdade;
	int fkProfessor;
	String login;
	String Senha;
	double nota;
	static Map<Integer, Estudante> mapaEstudante = new HashMap<>();
	
	public Estudante() {
		super();
	}
	
	public Estudante(int idUsuario, String nome, String cpf, String email) {
		super(idUsuario, nome, cpf, email);
	}

	

	public Estudante( String tipo, int idUsuario, String nome, String cpf, String email, int idEstudante, int fkFaculdade, int fkProfessor, String login, String senha, double nota) {
		super(idUsuario, nome, cpf, email);
		this.tipo = tipo;
		this.idEstudante = idEstudante;
		this.fkFaculdade = fkFaculdade;
		this.fkProfessor = fkProfessor;
		this.login = login;
		Senha = senha;
		this.nota = nota;
	}


	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return Senha;
	}

	public void setSenha(String senha) {
		Senha = senha;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public String getTipo() {
		return tipo;
	}

	public int getIdEstudante() {
		return idEstudante;
	}

	public int getFkFaculdade() {
		return fkFaculdade;
	}

	public int getFkProfessor() {
		return fkProfessor;
	}

	public static Map<Integer, Estudante> getMapaEstudante() {
		return mapaEstudante;
	}

	@Override
	public String toString() {
		return "Estudante [tipo=" + tipo + ", idEstudante=" + idEstudante + ", fkFaculdade=" + fkFaculdade
				+ ", fkProfessor=" + fkProfessor + ", login=" + login + ", Senha=" + Senha + ", nota=" + nota
				+ ", idUsuario=" + idUsuario + ", nome=" + nome + ", cpf=" + cpf + ", email=" + email + "]";
	}

}
