package br.edu.ifsp.spo.lg2a3.repositorio;

import java.util.ArrayList;

import br.edu.ifsp.spo.lg2a3.Jogo.Continente;
import br.edu.ifsp.spo.lg2a3.Jogo.Territorio;

public class ContinenteRepositorio {
	public static ArrayList <Continente> Continentes = new ArrayList<Continente>();
	
	public ContinenteRepositorio() {
		
	}

	public static ArrayList<Continente> getContinetes() {
		return Continentes;
	}

	public static void setContinetes(ArrayList<Continente> continetes) {
		Continentes = continetes;
		
	}
	public void separarTerritoriosJogadores(int quantidadeJogadores, JogadorRepositorio jr) {
		int i=0;
		for(Continente c: ContinenteRepositorio.Continentes) {
			for(Territorio t: c.Territorios) {
				//inicializar variavel para comecar a percorrer a lista de jogadores	
				if(i==quantidadeJogadores)
					i=0;
				
				t.setJogadorDono(jr.getJogadores().get(i));
				jr.getJogadores().get(i).adicionarTerritoriosJogador(t);
				i++;
				

			}
		}
	}
	//ExibirLista
	
//	public void exibirListaTerritoriosPorUsuario(){
//		for(Continente c: ContinenteRepositorio.Continentes) {
//			System.out.println(c.getNome() +c.Territorios.size());
//			for(Territorio t: c.Territorios) {
//				System.out.println(t.toString());
//			}
//		}
//	}

}
