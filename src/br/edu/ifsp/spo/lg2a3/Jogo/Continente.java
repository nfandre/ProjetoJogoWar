package br.edu.ifsp.spo.lg2a3.Jogo;

import java.util.ArrayList;
import java.util.Collection;

public class Continente {
	
	//private static int quantidadeTerritorios;
	private static Collection <Territorio> Territorios = new ArrayList<Territorio>();
	
	public Continente() {
		
	}

	
	
	public void adicionarTerritoriosAoContinente(Territorio territorio) {
		Territorios.add(territorio);
	}
	
	
	public static Collection<Territorio> getPais() {
		return Territorios;
	}


	public static void setPais(Collection<Territorio> pais) {
		Territorios = pais;
	}
	 
	 
	 
}
