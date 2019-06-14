package br.edu.ifsp.spo.lg2a3.repositorio;
import java.util.ArrayList;

import br.edu.ifsp.spo.lg2a3.Jogo.Jogador;
import br.edu.ifsp.spo.lg2a3.Jogo.TipoExercito;

public class JogadorRepositorio {
	
	private  ArrayList<Jogador> Jogadores = new ArrayList<Jogador>();

	

	public JogadorRepositorio(ArrayList<Jogador> jogadores) {
		getJogadores().addAll(jogadores);
	}
	

	public void colocarExercitosDeAcordoComTerritorios( ArrayList<Jogador> jogadores, ArrayList<TipoExercito> tipo, ArrayList<String> cor) {
		int i=0;
		for(Jogador j: jogadores) {

			j.colocarExercitosDeAcordoComTerritorios(j, tipo.get(i), cor.get(i));
			i++;
		}
	}

	
//	public Jogador buscarJogadorPorTerritorio(ArrayList <Territorio> territorios) {
//		
//		
//		for(Jogador j : this.getJogadores()) {
//			j.getTerritorios()
//		}
//		return null;
//		return null;
//		
//	}
	
	
	
	public void setJogadores(ArrayList<Jogador> jogadores) {
		Jogadores = jogadores;
	}
	

	public ArrayList<Jogador> getJogadores() {
		return Jogadores;
	}


	
	
	
	

	
	
}
