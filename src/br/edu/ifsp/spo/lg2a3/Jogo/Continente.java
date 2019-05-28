package br.edu.ifsp.spo.lg2a3.Jogo;

import java.util.ArrayList;
import java.util.Collection;


public class Continente {
	
	//private static int quantidadeTerritorios;
	public static ArrayList <Territorio> Territorios = new ArrayList<Territorio>();

	public Continente() {
		
	}
	
	
	
	public void SeparaTerritorioQtdJogadores(int quantidadeJogadores, Collection <Jogador> jogadores) {
		int rotacao;
		

		if(quantidadeJogadores == 6) {
			
			rotacao= 7;
			Collection <Territorio> territorios = null;
			for(int i=0; i<rotacao; i++) {
				territorios.add(Territorios.get(i));
			}
			
			for(Jogador jogador: jogadores) {
				
				jogador.setTerritorios(territorios);
			}
		}
	}
	
	
	public void adicionarTerritoriosAoContinente(Territorio territorio) {
		Territorios.add(territorio);
	}



	public static ArrayList<Territorio> getTerritorios() {
		return Territorios;
	}



	public static void setTerritorios(ArrayList<Territorio> territorios) {
		Territorios = territorios;
	}
	
	 
}
