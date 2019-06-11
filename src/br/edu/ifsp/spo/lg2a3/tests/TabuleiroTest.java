package br.edu.ifsp.spo.lg2a3.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.FileReader;

import org.junit.jupiter.api.Test;

import br.edu.ifsp.spo.lg2a3.Jogo.Continente;
import br.edu.ifsp.spo.lg2a3.Jogo.Tabuleiro;

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
				System.out.println(i);
				assertEquals(nomeContinente, a.getContinentes().get(i).getNome());
				System.out.println( a.getContinentes().get(i).getNome());
				i++;	

			}
			
			arquivo.close();
			
		}catch(Exception  ex) {
			System.out.println(ex.getMessage());
		}	
	}

}
