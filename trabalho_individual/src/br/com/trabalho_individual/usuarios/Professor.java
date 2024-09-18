package br.com.trabalho_individual.usuarios;

import java.util.HashMap;
import java.util.Map;

public class Professor extends Usuario {
	
	String tipo = "Professor";
	int idProfessor;
	int fkFaculdade;
	String disciplina;
	static Map<Integer, Professor> mapaProfessor = new HashMap<>();
	
	public Professor() {
		super();
	}
	
	public Professor(int idUsuario, String nome, String cpf, String email) {
		super(idUsuario, nome, cpf, email);
	}

	public Professor(String tipo, int idUsuario, String nome, String cpf, String email, int idProfessor, int fkFaculdade, String disciplina) {
		super(idUsuario, nome, cpf, email);
		this.idProfessor = idProfessor;
		this.fkFaculdade = fkFaculdade;
		this.disciplina = disciplina;
	}

	public String getTipo() {
		return tipo;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public int getIdProfessor() {
		return idProfessor;
	}

	public int getFkFaculdade() {
		return fkFaculdade;
	}
	
	public static Map<Integer, Professor> getMapaProfessor() {
		return mapaProfessor;
	}

	@Override
	public String toString() {
		return "Professor [idProfessor=" + idProfessor + ", fkFaculdade=" + fkFaculdade + ", disciplina=" + disciplina
				+ ", idUsuario=" + idUsuario + ", nome=" + nome + ", cpf=" + cpf + ", email=" + email + "]";
	}
	
}
