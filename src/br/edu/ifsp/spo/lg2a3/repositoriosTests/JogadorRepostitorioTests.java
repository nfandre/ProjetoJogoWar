package br.edu.ifsp.spo.lg2a3.repositoriosTests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import br.edu.ifsp.spo.lg2a3.Jogo.Jogador;
import br.edu.ifsp.spo.lg2a3.Jogo.Territorio;
import br.edu.ifsp.spo.lg2a3.Jogo.TipoExercito;
import br.edu.ifsp.spo.lg2a3.repositorio.JogadorRepositorio;

class JogadorRepostitorioTests {
//	private JogadorRepositorio RepositorioTest;
//	
//	public JogadorRepositorio getRepositorioTest() {
//		return RepositorioTest;
//	}
//
//	public void setRepositorioTest(JogadorRepositorio repositorioTest) {
//		RepositorioTest = repositorioTest;
//	}

//	@Before
//	public void setUp() {
//		ArrayList<Jogador> JogadoresMock = new ArrayList<Jogador>();
//		
//		JogadoresMock.add(
//						new Jogador("Andre"));
//		JogadoresMock.add(
//				new Jogador("Alisson"));
//		JogadoresMock.add(
//				new Jogador("Wendell"));
//		
//		
//		Territorio Moscou = new Territorio("Moscou");
//		Territorio Suecia = new Territorio("Suecia");
//		Territorio AfricaSul = new Territorio("AfricaSul");
//		//6 territorios
//		JogadoresMock.get(0).adicionarTerritoriosJogador(Moscou);
//		JogadoresMock.get(0).adicionarTerritoriosJogador(Moscou);
//		JogadoresMock.get(0).adicionarTerritoriosJogador(Moscou);
//		JogadoresMock.get(0).adicionarTerritoriosJogador(Moscou);
//		JogadoresMock.get(0).adicionarTerritoriosJogador(Moscou);
//		JogadoresMock.get(0).adicionarTerritoriosJogador(Moscou);
//		JogadoresMock.get(0).adicionarTerritoriosJogador(Moscou);
//		
//		//7 Territorios
//		JogadoresMock.get(1).adicionarTerritoriosJogador(Suecia);
//		JogadoresMock.get(1).adicionarTerritoriosJogador(Suecia);
//		JogadoresMock.get(1).adicionarTerritoriosJogador(Suecia);
//		JogadoresMock.get(1).adicionarTerritoriosJogador(Suecia);
//		JogadoresMock.get(1).adicionarTerritoriosJogador(Suecia);
//		JogadoresMock.get(1).adicionarTerritoriosJogador(Suecia);
//		JogadoresMock.get(1).adicionarTerritoriosJogador(Suecia);
//		JogadoresMock.get(1).adicionarTerritoriosJogador(Suecia);
//		
//		// 8 Territorios
//		JogadoresMock.get(2).adicionarTerritoriosJogador(AfricaSul);
//		JogadoresMock.get(2).adicionarTerritoriosJogador(AfricaSul);
//		JogadoresMock.get(2).adicionarTerritoriosJogador(AfricaSul);
//		JogadoresMock.get(2).adicionarTerritoriosJogador(AfricaSul);
//		JogadoresMock.get(2).adicionarTerritoriosJogador(AfricaSul);
//		JogadoresMock.get(2).adicionarTerritoriosJogador(AfricaSul);
//		JogadoresMock.get(2).adicionarTerritoriosJogador(AfricaSul);
//		JogadoresMock.get(2).adicionarTerritoriosJogador(AfricaSul);
//		
//		JogadorRepositorio jr = new JogadorRepositorio(JogadoresMock);
//		setRepositorioTest(jr);
//	}
	
	@Test
	void  verificar_colocar_exercitos_de_acordo_com_quantidade_de_territorios_varios_Jogadores() {
		 ArrayList<String> cores = new ArrayList<String>();
		 ArrayList<TipoExercito> tipos = new ArrayList<TipoExercito>();
			ArrayList<Jogador> JogadoresMock = new ArrayList<Jogador>();
			
			JogadoresMock.add(
							new Jogador("Andre"));
			JogadoresMock.add(
					new Jogador("Alisson"));
			JogadoresMock.add(
					new Jogador("Wendell"));
			
			
			Territorio Moscou = new Territorio("Moscou");
			Territorio Suecia = new Territorio("Suecia");
			Territorio AfricaSul = new Territorio("AfricaSul");
			//6 territorios
			JogadoresMock.get(0).adicionarTerritoriosJogador(Moscou);
			JogadoresMock.get(0).adicionarTerritoriosJogador(Moscou);
			JogadoresMock.get(0).adicionarTerritoriosJogador(Moscou);
			JogadoresMock.get(0).adicionarTerritoriosJogador(Moscou);
			JogadoresMock.get(0).adicionarTerritoriosJogador(Moscou);
			JogadoresMock.get(0).adicionarTerritoriosJogador(Moscou);
			JogadoresMock.get(0).adicionarTerritoriosJogador(Moscou);
			
			//7 Territorios
			JogadoresMock.get(1).adicionarTerritoriosJogador(Suecia);
			JogadoresMock.get(1).adicionarTerritoriosJogador(Suecia);
			JogadoresMock.get(1).adicionarTerritoriosJogador(Suecia);
			JogadoresMock.get(1).adicionarTerritoriosJogador(Suecia);
			JogadoresMock.get(1).adicionarTerritoriosJogador(Suecia);
			JogadoresMock.get(1).adicionarTerritoriosJogador(Suecia);
			JogadoresMock.get(1).adicionarTerritoriosJogador(Suecia);
			JogadoresMock.get(1).adicionarTerritoriosJogador(Suecia);
			
			// 8 Territorios
			JogadoresMock.get(2).adicionarTerritoriosJogador(AfricaSul);
			JogadoresMock.get(2).adicionarTerritoriosJogador(AfricaSul);
			JogadoresMock.get(2).adicionarTerritoriosJogador(AfricaSul);
			JogadoresMock.get(2).adicionarTerritoriosJogador(AfricaSul);
			JogadoresMock.get(2).adicionarTerritoriosJogador(AfricaSul);
			JogadoresMock.get(2).adicionarTerritoriosJogador(AfricaSul);
			JogadoresMock.get(2).adicionarTerritoriosJogador(AfricaSul);
			JogadoresMock.get(2).adicionarTerritoriosJogador(AfricaSul);
			
			JogadorRepositorio jr = new JogadorRepositorio(JogadoresMock);
		 
		 
		 cores.add("Azul");
		 cores.add("Vermelho");
		 cores.add("rosa");
		 
		 tipos.add(TipoExercito.ataque);
		 tipos.add(TipoExercito.defesa);
		 tipos.add(TipoExercito.neutro);
		 
		 jr.colocarExercitosDeAcordoComTerritorios( jr.getJogadores(), tipos, cores);
		 
		 for(Jogador j: jr.getJogadores()) {
			 int qtdExercitoExperada = j.dividirExercitoNumeroTerritorio(j.getTerritorios().size());
			 assertEquals(qtdExercitoExperada, j.getExercitos().size());
		 }
	}

}
