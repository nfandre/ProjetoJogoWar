package br.edu.ifsp.spo.lg2a3.Jogo;

import java.util.ArrayList;
import java.util.Collection;

public class Jogador {
	private String NomeUsuario;
	private  Collection <Territorio> Territorios = new ArrayList<Territorio>();
	
	public Jogador() {
		
	}
	public Jogador(String nomeUsuario) {
		NomeUsuario = nomeUsuario;
	}	
	
	public String getNomeUsuario() {
		return NomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		NomeUsuario = nomeUsuario;
	}
	public Collection<Territorio> getTerritorios() {
		return Territorios;
	}
	public void setTerritorios(Collection<Territorio> territorios) {
		Territorios = territorios;
	}
	@Override
	public String toString() {
		return "Jogador [NomeUsuario=" + NomeUsuario + "]";
	}

	

}
