package br.edu.ifsp.spo.lg2a3.tests;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import br.edu.ifsp.spo.lg2a3.Jogo.Jogador;
import br.edu.ifsp.spo.lg2a3.Jogo.Territorio;

class JogadorTest {
	@Test
	void verificar_criacao_jogador() {
		String nome = "andre";
		
		Jogador j = new Jogador();
		j.setNomeUsuario(nome);
		
		assertNotNull(j);
		assertEquals(nome, j.getNomeUsuario());
	}
	@Test
	void verificar_adicionar_territorio_jogador() {
		String nome = "andre";
		Territorio t1 = new Territorio("Brasil");
		Territorio t2 = new Territorio("Argentina");
		
		
		Jogador j = new Jogador();
		j.setNomeUsuario(nome);
		j.adicionarTerritoriosJogador(t1);
		j.adicionarTerritoriosJogador(t2);
		
		assertNotNull(j);
		assertEquals(t1.getNome(), j.getTerritorios().get(0).getNome());
		assertEquals(t2.getNome(), j.getTerritorios().get(1).getNome());
	}
	
	@Test
	void verificar_quantidade_da_divisao_do_exercito_de_acordo_com_territorio() {
		
		int qtdTerritorioPar = 6;
		int qtdTerritorioImpar = 9;
		int retornoPar = qtdTerritorioPar/2;
		int retornoImpar = qtdTerritorioImpar/2 +1;
		
		Jogador j = new Jogador();
		
		assertEquals(retornoPar, j.dividirExercitoNumeroTerritorio(qtdTerritorioPar));
		assertEquals(retornoImpar, j.dividirExercitoNumeroTerritorio(qtdTerritorioImpar));
	}
	
	@Test
	void verificar_divivir_exercito_de_acordo_com_territorio() {
		Jogador j1 = new Jogador();
		Jogador j2 = new Jogador();
		Territorio Moscou = new Territorio("Moscou");
		Territorio Suecia = new Territorio("Suecia");
		
		//6 territorios portanto 3 exercitos
		j1.adicionarTerritoriosJogador(Moscou);
		j1.adicionarTerritoriosJogador(Moscou);
		j1.adicionarTerritoriosJogador(Moscou);
		j1.adicionarTerritoriosJogador(Moscou);
		j1.adicionarTerritoriosJogador(Moscou);
		j1.adicionarTerritoriosJogador(Moscou);
		
		//7 territorios portatanto 4 exercitos
		j2.adicionarTerritoriosJogador(Suecia);
		j2.adicionarTerritoriosJogador(Suecia);
		j2.adicionarTerritoriosJogador(Suecia);
		j2.adicionarTerritoriosJogador(Suecia);
		j2.adicionarTerritoriosJogador(Suecia);
		j2.adicionarTerritoriosJogador(Suecia);
		j2.adicionarTerritoriosJogador(Suecia);
		
		j1.colocarExercitosDeAcordoComTerritorios(j1, "rosa");
		j2.colocarExercitosDeAcordoComTerritorios(j2, "Azul");
		System.out.println(j1.getExercitos().size());
		assertEquals(3, j1.getExercitos().size());
		assertEquals(4, j2.getExercitos().size());

		
	}
}
