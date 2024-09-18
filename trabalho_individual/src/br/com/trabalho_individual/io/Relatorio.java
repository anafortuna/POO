package br.com.trabalho_individual.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;

import br.com.trabalho_individual.locais.Faculdade;
import br.com.trabalho_individual.usuarios.Estudante;
import br.com.trabalho_individual.usuarios.Professor;
import br.com.trabalho_individual.utils.Util;

public class Relatorio {

	public static void escritor(String path) throws IOException {

		Scanner sc = new Scanner(System.in);
//		Util.setupLogger().log(Level.INFO, "Escreva o nome do arquivo: ");
//		String nome = sc.next();

		BufferedWriter buffWrite = new BufferedWriter(
				new FileWriter(LeituraEscrita.PATH_BASICO + path + LeituraEscrita.EXTENSAO, true)); // Com o true, ele
																									// adiciona novas
																									// informações no
																									// arquivo, caso não
																									// tenha o true, ele
																									// sobrescreve o
																									// arquivo
																									// existente.
		String linha = "";

		Util.setupLogger().log(Level.INFO, "Escreva algo:");
		linha = sc.nextLine();
		sc.close();
		buffWrite.append(linha + "\n");
		buffWrite.close();
	}

	public static void relatorioNota(char op) {
		String nome = "relatorio_nota";
		try {
			if (op == 't') {
				BufferedWriter buffWrite = new BufferedWriter(
						new FileWriter(LeituraEscrita.PATH_BASICO + nome + LeituraEscrita.EXTENSAO, true));
				LocalDateTime data = LocalDateTime.now();
				DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
				buffWrite.append(data.format(formato));
				buffWrite.append("\n############## INÍCIO ##############");
				for (Map.Entry<Integer, Estudante> estudante : Estudante.getMapaEstudante().entrySet()) {
					String nomeFaculdade = Faculdade.getMapaFaculdade().get(estudante.getValue().getFkFaculdade())
							.getNome();
					String nomeProfessor = Professor.getMapaProfessor().get(estudante.getValue().getFkProfessor())
							.getNome();
					String nomeDisciplina = Professor.getMapaProfessor().get(estudante.getValue().getFkProfessor())
							.getDisciplina();
					buffWrite.append("\nNome do estudante: " + estudante.getValue().getNome() + "\nEmail: "
							+ estudante.getValue().getEmail() + "\nFaculdade: " + nomeFaculdade
							+ "\nNome do Professor: " + nomeProfessor + "\nDisciplina: " + nomeDisciplina + "\nNota: "
							+ estudante.getValue().getNota() + "\n");
				}
				buffWrite.append("############### FIM ################");
				buffWrite.close();
			} else if (op == 'c') {
				LocalDateTime data = LocalDateTime.now();
				DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
				Util.setupLogger().log(Level.INFO, data.format(formato));
				Util.setupLogger().log(Level.INFO, "############## INÍCIO ##############");
				for (Map.Entry<Integer, Estudante> estudante : Estudante.getMapaEstudante().entrySet()) {
					String nomeFaculdade = Faculdade.getMapaFaculdade().get(estudante.getValue().getFkFaculdade())
							.getNome();
					String nomeProfessor = Professor.getMapaProfessor().get(estudante.getValue().getFkProfessor())
							.getNome();
					String nomeDisciplina = Professor.getMapaProfessor().get(estudante.getValue().getFkProfessor())
							.getDisciplina();
					Util.setupLogger().log(Level.INFO,
							() -> "\nNome do estudante: " + estudante.getValue().getNome() + "\nEmail: "
									+ estudante.getValue().getEmail() + "\nFaculdade: " + nomeFaculdade
									+ "\nNome do Professor: " + nomeProfessor + "\nDisciplina: " + nomeDisciplina
									+ "\nNota: " + estudante.getValue().getNota() + "\n");
				}
				Util.setupLogger().log(Level.INFO, "############### FIM ################");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void relatorioProfessor(char op) {
		String nome = "relatorio_professor";
		try {
			if (op == 't') {
				BufferedWriter buffWrite = new BufferedWriter(
						new FileWriter(LeituraEscrita.PATH_BASICO + nome + LeituraEscrita.EXTENSAO, true));
				LocalDateTime data = LocalDateTime.now();
				DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
				buffWrite.append(data.format(formato));
				buffWrite.append("\n############## INÍCIO ##############");
				for (Map.Entry<Integer, Professor> professor : Professor.getMapaProfessor().entrySet()) {
					String nomeFaculdade = Faculdade.getMapaFaculdade().get(professor.getValue().getFkFaculdade())
							.getNome();
					buffWrite.append("\nProfessor: " + professor.getValue().getNome() + "\nLeciona a disciplina de: "
							+ professor.getValue().getDisciplina() + "\nNa faculdade: " + nomeFaculdade + "\n");
				}
				buffWrite.append("############### FIM ################");
				buffWrite.close();
			} else if (op == 'c') {
				LocalDateTime data = LocalDateTime.now();
				DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
				Util.setupLogger().log(Level.INFO, data.format(formato));
				Util.setupLogger().log(Level.INFO, "############## INÍCIO ##############");
				for (Map.Entry<Integer, Professor> professor : Professor.getMapaProfessor().entrySet()) {
					String nomeFaculdade = Faculdade.getMapaFaculdade().get(professor.getValue().getFkFaculdade())
							.getNome();
					Util.setupLogger().log(Level.INFO, () -> "\nProfessor: " + professor.getValue().getNome() + "\nLeciona a disciplina de: "
							+ professor.getValue().getDisciplina() + "\nNa faculdade: " + nomeFaculdade + "\n");
				}
				Util.setupLogger().log(Level.INFO, "############### FIM ################");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
