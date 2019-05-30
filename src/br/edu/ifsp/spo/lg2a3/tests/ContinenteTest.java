package br.edu.ifsp.spo.lg2a3.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;


import org.junit.jupiter.api.Test;

import br.edu.ifsp.spo.lg2a3.Jogo.Continente;
import br.edu.ifsp.spo.lg2a3.Jogo.Territorio;

class ContinenteTest {

	
	@Test
	void verificarCriacaoContinente(){
		String nomeContinente="AmericaSul";
		ArrayList <Territorio> territorios = new ArrayList<Territorio>();
		
		Continente  c = new Continente(nomeContinente);
		
		c.setTerritorios(territorios);
		assertNotNull(c);
		assertEquals(nomeContinente, c.getNome());
	
	}
	
	@Test
	void verificar_adicionar_territorio_continente(){
		Continente c = new Continente();
		
		Territorio t = new Territorio("Brasil");
		c.adicionarTerritoriosAoContinente(t);
		
		assertNotNull(c.getTerritorios());
		
		
	}
	@Test
	void verificarSetarNomeContinente() {
		String nomeContinente="AmericaSul";
		
		Continente c = new Continente();
		c.setNome(nomeContinente);
		
		assertNotNull(c);
		assertEquals(nomeContinente, c.getNome());
	}
	
	@Test
	void verificarToString() {
		String nomeContinente="AmericaSul";
		String str ="Continente [Nome=AmericaSul]";
		Continente c = new Continente();
		c.setNome(nomeContinente);
		
		assertNotNull(c);
		assertEquals(str, c.toString());
	}

}
