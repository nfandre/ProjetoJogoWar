package br.edu.ifsp.spo.lg2a3.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.edu.ifsp.spo.lg2a3.Jogo.Continente;
import br.edu.ifsp.spo.lg2a3.Jogo.Territorio;

class ContinenteTest {

	
	@Test
	void verificarCriacaoContinente(){
		Continente  c = new Continente();
		
		assertNotNull(c);
	
	}
	
	@Test
	void verificar_adicionar_territorio_continente(){
		Continente c = new Continente();
		
		Territorio t = new Territorio("Brasil");
		c.adicionarTerritoriosAoContinente(t);
		
		assertNotNull(c.getTerritorios());
		
		
	}

}
