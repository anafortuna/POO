package br.com.trabalho_individual.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;

import br.com.trabalho_individual.locais.Faculdade;
import br.com.trabalho_individual.usuarios.Estudante;
import br.com.trabalho_individual.usuarios.Professor;
import br.com.trabalho_individual.utils.Util;



public class LeituraEscrita {

	static final String PATH_BASICO = "./temp/";
	static final String EXTENSAO = ".txt";

	public static void leitor(String path) {
		BufferedReader buffRead;
		try {
			buffRead = new BufferedReader(new FileReader(PATH_BASICO + path + EXTENSAO));
			String linha = "";

			while (true) {
				linha = buffRead.readLine();
				if (linha != null) {
					String[] dados = linha.split(";");
					//Estudante(String tipo, int idUsuario, String nome, String cpf, String email, int idEstudante, int fkFaculdade, int fkProfessor, String login, String senha, double nota)
					if (dados[0].equalsIgnoreCase("Estudante")) {
						Estudante estudante = new Estudante(dados[0], Integer.parseInt(dados[1]), dados[2], dados[3], dados[4], Integer.parseInt(dados[5]), Integer.parseInt(dados[6]), Integer.parseInt(dados[7]), dados[8], dados[9], Double.parseDouble(dados[10])); 
						//Util.setupLogger().log(Level.INFO, estudante::toString);
						Estudante.getMapaEstudante().put(Integer.parseInt(dados[5]), estudante);
					//Professor(String tipo, int idUsuario, String nome, String cpf, String email, int idProfessor, int fkFaculdade, String disciplina) 
					} else if (dados[0].equalsIgnoreCase("Professor")) {
						Professor professor = new Professor(dados[0], Integer.parseInt(dados[1]), dados[2], dados[3], dados[4], Integer.parseInt(dados[5]), Integer.parseInt(dados[6]), dados[7]);
						//Util.setupLogger().log(Level.INFO, professor::toString);
						Professor.getMapaProfessor().put(Integer.parseInt(dados[5]), professor);
					//Faculdade(String tipo, int idFaculdade, String nome, String cnpj, String telefone, double notaMec)	
					} else if (dados[0].equalsIgnoreCase("Faculdade")) {
						Faculdade faculdade = new Faculdade(dados[0], Integer.parseInt(dados[1]), dados[2], dados[3], dados[4], Double.parseDouble(dados[5]));
						//Util.setupLogger().log(Level.INFO, faculdade::toString);
						Faculdade.getMapaFaculdade().put(Integer.parseInt(dados[1]), faculdade);
					}
				} else {
					break;
				}
			}	
			buffRead.close();
		} catch (FileNotFoundException e) {
			String result = "Arquivo não encontrado no caminho " + PATH_BASICO + path + EXTENSAO;
			Util.setupLogger().log(Level.INFO, result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
