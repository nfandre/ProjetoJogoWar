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
}
