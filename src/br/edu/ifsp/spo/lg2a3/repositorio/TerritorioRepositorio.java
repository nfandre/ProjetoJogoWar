package br.edu.ifsp.spo.lg2a3.repositorio;

import java.util.ArrayList;

import br.edu.ifsp.spo.lg2a3.Jogo.Territorio;

public class TerritorioRepositorio {
	private ArrayList<Territorio> territorios = new ArrayList<Territorio>();

	public Territorio buscarTerritorioNome(String nome) {
		Territorio result =null;
		for(Territorio t: this.territorios) {
			if(t.getNome() == nome) {
				result = t;
				break;
			}
		}
		return result;
	}
}
