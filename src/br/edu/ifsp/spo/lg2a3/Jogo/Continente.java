package br.edu.ifsp.spo.lg2a3.Jogo;

import java.util.ArrayList;
import java.util.Collection;

public class Continente {
	
	//private static int quantidadeTerritorios;
	private  Collection <Territorio> Territorios = new ArrayList<Territorio>();
	


	public Continente() {
		
	}

	
	
	public void adicionarTerritoriosAoContinente(Territorio territorio) {
		Territorios.add(territorio);
	}
	
	 
	public Collection<Territorio> getTerritorios() {
		return Territorios;
	}



	public void setTerritorios(Collection<Territorio> territorios) {
		Territorios = territorios;
	}

	 
}
