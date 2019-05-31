package br.edu.ifsp.spo.lg2a3.repositorio;
import java.util.ArrayList;

import br.edu.ifsp.spo.lg2a3.Jogo.Exercito;
import br.edu.ifsp.spo.lg2a3.Jogo.Jogador;
import br.edu.ifsp.spo.lg2a3.Jogo.TipoExercito;

public class JogadorRepositorio {
	
	private  ArrayList<Jogador> Jogadores = new ArrayList<Jogador>();



	public JogadorRepositorio(ArrayList<Jogador> jogadores) {
		getJogadores().addAll(jogadores);
	}
	

	public void colocarExercitosDeAcordoComTerritorios( ArrayList<Jogador> jogadores, TipoExercito tipo, String cor) {
		for(Jogador j: jogadores) {
			int qtdExercitoReceber = dividirExercitoNumeroTerritorio(j.getTerritorios().size());
			int i=0;
			ArrayList<Exercito> exercitos = new ArrayList<Exercito>();
			for(i=0; i<qtdExercitoReceber; i++) {
				Exercito exercito = new Exercito(10, tipo, cor );
				exercitos.add(exercito);
			}
			
			j.setExercitos(exercitos);
			
		}
	}
	public int dividirExercitoNumeroTerritorio(int qtdTerritorio) {
		int retorno;
		if(qtdTerritorio%2 ==0) {
			retorno =  qtdTerritorio/2;
		}else {
			retorno = qtdTerritorio/2 + 1;
		}
		
		return retorno;
	}
	
	public void setJogadores(ArrayList<Jogador> jogadores) {
		Jogadores = jogadores;
	}
	

	public ArrayList<Jogador> getJogadores() {
		return Jogadores;
	}


	
	
	
	

	
	
}
