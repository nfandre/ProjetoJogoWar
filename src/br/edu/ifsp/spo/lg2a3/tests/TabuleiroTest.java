package br.edu.ifsp.spo.lg2a3.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import br.edu.ifsp.spo.lg2a3.Jogo.Continente;
import br.edu.ifsp.spo.lg2a3.Jogo.Jogador;
import br.edu.ifsp.spo.lg2a3.Jogo.Tabuleiro;
import br.edu.ifsp.spo.lg2a3.Jogo.Territorio;
import br.edu.ifsp.spo.lg2a3.repositorio.JogadorRepositorio;

class TabuleiroTest {

	@Test
	void verificar_pegar_continentes(){
		Tabuleiro a = new Tabuleiro();
		
		a.pegarContinentesTxt();
		try {
			String nomeContinente;
			BufferedReader arquivo = new BufferedReader(new FileReader("src/br/edu/ifsp/spo/lg2a3/arquivos/Continentes.txt"));
			assertNotNull(arquivo);
			int i=0;
			while((nomeContinente = arquivo.readLine())!=null) {
				assertEquals(nomeContinente, a.getContinentes().get(i).getNome());
				i++;	

			}
			
			arquivo.close();
		}catch(Exception  ex) {
			System.out.println(ex.getMessage());
		}	
	}
	@Test
	void verificar_pegar_territorios() {
		Tabuleiro a = new Tabuleiro();
		a.pegarContinentesTxt();
		
		ArrayList<Territorio> territorios = a.pegarTerritoriosText(a.getContinentes().get(0));
		try {
			String nomeTerritorio;
			String arquivoConsulta ="Territorios"+a.getContinentes().get(0).getNome()+".txt";
			int i=0;
			BufferedReader arquivo = new BufferedReader(new FileReader("src/br/edu/ifsp/spo/lg2a3/arquivos/"+arquivoConsulta));			
			while((nomeTerritorio = arquivo.readLine())!=null) {
				assertEquals(nomeTerritorio, territorios.get(i).getNome());
				i++;			
			}

			arquivo.close();	
		}catch(Exception  ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	@Test
	void verificar_adicionar_territorio_continente() {
		Tabuleiro a = new Tabuleiro();
		a.pegarContinentesTxt();
		a.AdicionarTerritoriosAosContinentes();
		int i=0;
		for(Continente c: a.getContinentes()) {
			i=0;
			ArrayList<Territorio> territorios = a.pegarTerritoriosText(c);
			for(Territorio t: c.getTerritorios()) {
				assertEquals(territorios.get(i).getNome(), t.getNome());
				i++;
			}
		}	
	}
	
	@Test
	void verificar_separacao_de_fronteiras() {
		Tabuleiro a = new Tabuleiro();
		int i=0;
		a.AdicionarFronteirasAosTerritorios();
		for(Continente c: a.getContinentes()) {

			for(Territorio t: c.getTerritorios()) {		
				i=0;	
				ArrayList<Territorio> territoriosFronteiras = a.adicionarFronteirasTerritorios(t);
				for(Territorio ts: t.getFronteiras()) {
					assertEquals(territoriosFronteiras.get(i).getNome(), ts.getNome());
					i++;
				}
			}

		}	
	}
	@Test
	void verificar_separa_territorios_jogadores() {
		int qtdJogadores = 2;
		int i = 0;
		Tabuleiro a = new Tabuleiro();
		Jogador j1= new Jogador("andre");
		Jogador j2= new Jogador("alisson");
		ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
		jogadores.add(j1);
		jogadores.add(j2);
		
		JogadorRepositorio jr = new JogadorRepositorio(jogadores);
		a.separarTerritoriosJogadores(jogadores.size(), jr);
		
		for(Continente c: a.getContinentes()) {
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
