package br.edu.ifsp.spo.lg2a3.repositoriosTests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import br.edu.ifsp.spo.lg2a3.Jogo.Continente;
import br.edu.ifsp.spo.lg2a3.Jogo.Jogador;
import br.edu.ifsp.spo.lg2a3.Jogo.Territorio;
import br.edu.ifsp.spo.lg2a3.repositorio.ContinenteRepositorio;
import br.edu.ifsp.spo.lg2a3.repositorio.JogadorRepositorio;

class ContinenteRepositorioTest {
	
	@Test
	void verificar_separa_territorios_jogadores() {
		//configuração
		
		int qtdJogadores = 2;
		int i = 0;
		Jogador j1= new Jogador("andre");
		Jogador j2= new Jogador("alisson");
		ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
		jogadores.add(j1);
		jogadores.add(j2);
		
		
		Continente Africa = new Continente("Africa");	
		Territorio AfricaSul = new Territorio("AfricaSul");
		Territorio Congo = new Territorio("Congo");
		Africa.Territorios.add(AfricaSul);
		Africa.Territorios.add(Congo);
		
		Continente Europa = new Continente("Europa");
		Territorio Moscou = new Territorio("Moscou");
		Territorio Suecia = new Territorio("Suecia");
		Europa.adicionarTerritoriosAoContinente(Moscou);
		Europa.adicionarTerritoriosAoContinente(Suecia);
		
		ContinenteRepositorio.Continentes.add(Africa);
		ContinenteRepositorio.Continentes.add(Europa);
		ContinenteRepositorio cr = new ContinenteRepositorio();
		
		//execução
		JogadorRepositorio jr = new JogadorRepositorio(jogadores);
		cr.separarTerritoriosJogadores(jogadores.size(), jr);
		
		//asserção 
		for(Continente c: ContinenteRepositorio.Continentes) {
			for(Territorio t: c.Territorios) {	
				
				if(i == qtdJogadores)
					i = 0;
					
			 	assertEquals(jr.getJogadores().get(i).getNomeUsuario(), t.getJogadorDono().getNomeUsuario());
			 	//assertEquals(, jr.getJogadores().get(i).getTerritorios());
			 	i++;
			}
		}
	}
}
