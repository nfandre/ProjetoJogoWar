package br.edu.ifsp.spo.lg2a3.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.edu.ifsp.spo.lg2a3.Jogo.Dado;

class DadoTest {

	@Test
	void verificar_criacao_dado(){
		int quantidadeLados = 6;
		
		Dado dado = new Dado(quantidadeLados);
		
		assertNotNull(dado);
		assertEquals(quantidadeLados, dado.getQuantidadeLado());
		assertEquals(quantidadeLados, dado.getLadosCollection().size());
		int i = 1;
		for(int n: dado.getLadosCollection()) {
			assertEquals(n, i);
			i++;
		}
	}
	
	@Test
	void verificar_realizacao_rolagem() {
		int quantidadeLados = 6;
		int rolagem1;
		int rolagem2;
		
		Dado dado = new Dado(quantidadeLados);
		
		rolagem1 = dado.realizarRolagem();
		rolagem2 = dado.realizarRolagem();
		assertNotEquals(rolagem1, rolagem2);

	}
	
	
}
