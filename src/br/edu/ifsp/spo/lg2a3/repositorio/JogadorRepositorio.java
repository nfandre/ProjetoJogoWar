package br.edu.ifsp.spo.lg2a3.repositorio;
import java.util.ArrayList;
import java.util.Collection;

import br.edu.ifsp.spo.lg2a3.Jogo.Jogador;

public class JogadorRepositorio {
	
	private static Collection<Jogador> jogadores = new ArrayList<Jogador>();

	
	
	
	
	public static Collection<Jogador> getJogadores() {
		return jogadores;
	}

	public static void setJogadores(Collection<Jogador> jogadores) {
		JogadorRepositorio.jogadores = jogadores;
	}
	
	
}
