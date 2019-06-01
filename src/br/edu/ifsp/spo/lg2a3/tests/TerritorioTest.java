package br.edu.ifsp.spo.lg2a3.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.edu.ifsp.spo.lg2a3.Jogo.Jogador;
import br.edu.ifsp.spo.lg2a3.Jogo.Territorio;

class TerritorioTest {

	@Test
	void criar_territorio() {
		String nomeTerritorio = "Brasil";
		Territorio t = new Territorio(nomeTerritorio);
		
		
		assertNotNull(t);
		assertEquals(t.getNome(), nomeTerritorio);
		
	}
	
	@Test
	void adicionar_jogador_territorio(){
		String nomeTerritorio = "Brasil";
		
		Jogador j = new Jogador("Andre");
		Territorio t = new Territorio(nomeTerritorio);
		t.setJogadorDono(j);
		
		assertNotNull(t);
		assertEquals(j.getNomeUsuario(), t.getJogadorDono().getNomeUsuario());
	}
	
	@Test
	void verificar_to_string() {
		String nomeTerritorio = "Brasil";
		
		String str = "Territorio [Nome=Brasil, jogadorDono=Jogador [NomeUsuario=Andre]]";
		Jogador j = new Jogador("Andre");
		Territorio t = new Territorio(nomeTerritorio);
		t.setJogadorDono(j);
		
		assertNotNull(t);
		assertEquals(str, t.toString());
	}

}
