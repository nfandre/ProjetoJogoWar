package br.edu.ifsp.spo.lg2a3.Jogo;

import java.util.ArrayList;
import java.util.Collections;


import br.edu.ifsp.spo.lg2a3.repositorio.JogadorRepositorio;

public class aplicacaoTeste {

	public static void main(String[] args) {
		
		//Teste do dado;
//		Dado d = new Dado(6);
//		
//		System.out.println(d.realizarRolagem());
//		System.out.println(d.realizarRolagem());
		
		Tabuleiro t = new Tabuleiro();
		
		
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
			
			 ArrayList<String> cores = new ArrayList<String>();
			 cores.add("Azul");
			 cores.add("Vermelho");
			 cores.add("rosa");
			 cores.add("Azul");
			 cores.add("Vermelho");
			 cores.add("rosa");
	
			//Deixando jogadores em ordem Aleatorios para separar territorios
			Collections.shuffle(jogadores);
			
			
			JogadorRepositorio jr = new JogadorRepositorio(jogadores);
			
			t.separarTerritoriosJogadores(jogadores.size(), jr);
			//System.out.println(jogadores.get(0).getTerritorios().size());
			t.exibirListaTerritoriosPorUsuario();
			
			jr.colocarExercitosDeAcordoComTerritorios(jogadores, cores);
			System.out.println();
			System.out.println("Posição dos exercitos seria alocada quando o jogador escolhesse as respectivas posições*");
			System.out.println("Usuarios:");
			for(Jogador  j: jogadores) {
				System.out.println("Nome: "+j.getNomeUsuario());
				System.out.println("Quantidade territorios: " + j.getTerritorios().size());
				System.out.println("Quantidade Exercitos: "+ j.getExercitos().size());
				for(Exercito e: j.getExercitos()) {
					System.out.println("Cor: "+e.getCor());
					System.out.println("Posição do exercito: "+e.getTerritorioAlocado());
				}
			}

		}
	}

}
