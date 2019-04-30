package br.edu.ifsp.spo.lg2a3.Jogo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;



public class Pais {
	
	private static int quantidadeTerritorios;
	private static Collection <Territorio> Pais = new ArrayList<Territorio>();
	
	
	 public void separarTerritorios(Collection<Jogador> jogadores, Map<Integer, Exercito> exercitos ) {
		 
		 int quantidadeJogadores = jogadores.size();
		 //partida com 6 jogadores
		 if(quantidadeJogadores == 6) {
			 
			 
			 
			 
			 
		 }
		 
	 }


	public static Collection<Territorio> getPais() {
		return Pais;
	}


	public static void setPais(Collection<Territorio> pais) {
		Pais = pais;
	}
	 
	 
	 
}
