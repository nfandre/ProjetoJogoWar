package br.edu.ifsp.spo.lg2a3.repositorio;

import java.util.ArrayList;
import java.util.Collection;

import br.edu.ifsp.spo.lg2a3.Jogo.Territorio;

public class TerritorioRepositorio {

	private static Collection<Territorio> territorios = new ArrayList<Territorio>();
	
	public TerritorioRepositorio(){
		Territorio t= new Territorio("Brasil");
		
		
		
		
		territorios.add(t);
	}
}
