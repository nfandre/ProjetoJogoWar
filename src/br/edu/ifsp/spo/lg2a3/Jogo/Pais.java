package br.edu.ifsp.spo.lg2a3.Jogo;

import java.util.ArrayList;
import java.util.Collection;

public class Pais {
	
	//private static int quantidadeTerritorios;
	private static Collection <Territorio> Pais = new ArrayList<Territorio>();
	


	public static Collection<Territorio> getPais() {
		return Pais;
	}


	public static void setPais(Collection<Territorio> pais) {
		Pais = pais;
	}
	 
	 
	 
}
