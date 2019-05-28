package br.edu.ifsp.spo.lg2a3.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.edu.ifsp.spo.lg2a3.Jogo.Territorio;

class TerritorioTest {

	@Test
	void criar_territorio() {
		String nomeTerritorio = "Brasil";
		Territorio t = new Territorio(nomeTerritorio);
		
		assertNotNull(t);
		assertEquals(t.getNome(), nomeTerritorio);
		
	}

}
