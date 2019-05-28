package br.edu.ifsp.spo.lg2a3.repositorio;

import java.util.ArrayList;

import br.edu.ifsp.spo.lg2a3.Jogo.Continente;

public class ContinenteRepositorio {
	public static ArrayList <Continente> Continentes = new ArrayList<Continente>();
	
	public ContinenteRepositorio() {
		
	}

	public static ArrayList<Continente> getContinetes() {
		return Continentes;
	}

	public static void setContinetes(ArrayList<Continente> continetes) {
		Continentes = continetes;
	}

}
