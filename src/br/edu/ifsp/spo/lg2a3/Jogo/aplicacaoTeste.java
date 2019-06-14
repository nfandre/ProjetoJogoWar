package br.edu.ifsp.spo.lg2a3.Jogo;

import java.util.ArrayList;
import java.util.Collections;

import br.edu.ifsp.spo.lg2a3.repositorio.ContinenteRepositorio;
import br.edu.ifsp.spo.lg2a3.repositorio.JogadorRepositorio;

public class aplicacaoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dado d = new Dado(6);
		
		System.out.println(d.realizarRolagem());
		System.out.println(d.realizarRolagem());
		
		int qtdJogador = 6;

		if (qtdJogador == 6) {
			Jogador j1 = new Jogador("A");
			Jogador j2 = new Jogador("B");
			Jogador j3 = new Jogador("C");
			Jogador j4 = new Jogador("D");
			Jogador j5 = new Jogador("E");
			Jogador j6 = new Jogador("F");
			ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
			jogadores.add(j1);
			jogadores.add(j2);
			jogadores.add(j3);
			jogadores.add(j4);
			jogadores.add(j5);
			jogadores.add(j6);
	
			//Deixando jogadores em ordem Aleatorios para separar territorios
			Collections.shuffle(jogadores);
			
			
			JogadorRepositorio jr = new JogadorRepositorio(jogadores);
			ContinenteRepositorio cr = new ContinenteRepositorio();
			
			cr.separarTerritoriosJogadores(jogadores.size(), jr);
			//cr.exibirListaTerritoriosPorUsuario();
			
			for(Jogador j:jogadores) {
				System.out.println(j.getTerritorios());
				System.out.println(j.getTerritorios().size());
			}
			
			Tabuleiro t = new Tabuleiro();
			t.pegarContinentesTxt();
			for(Continente  s: t.getContinentes()) {
				System.out.println(s.getNome());
			}

		}
	}

}
