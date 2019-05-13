package br.edu.ifsp.spo.lg2a3.Jogo;

import java.util.Collection;
import java.util.Map;

public class Jogador {
	private String NomeUsuario;
	Map<Integer, Exercito> exercitos;
	
	public Jogador() {
		
	}
	public Jogador(String nomeUsuario) {
		NomeUsuario = nomeUsuario;
	}
	
	public void separarExercitos(Collection<Jogador> jogadores, Map<Integer, Exercito> exercitos ) {
		 
		 int quantidadeJogadores = jogadores.size();
		 //partida com 6 jogadores
		 if(quantidadeJogadores == 6) {
			 
			 for(Jogador jogador: jogadores) {
				 
				 jogador.setExercitos(exercitos);
			 } 
			 
		 }
		 
	 }
	
	
	
	
	public String getNomeUsuario() {
		return NomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		NomeUsuario = nomeUsuario;
	}
	public Map<Integer, Exercito> getExercitos() {
		return exercitos;
	}
	public void setExercitos(Map<Integer, Exercito> exercitos) {
		this.exercitos = exercitos;
	}
	

}
