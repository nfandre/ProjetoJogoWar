package br.edu.ifsp.spo.lg2a3.Jogo;

import java.util.ArrayList;
import java.util.Collection;

public class Jogador {
	private String NomeUsuario;
	private  Collection <Territorio> Territorios = new ArrayList<Territorio>();
	
	public Jogador() {
		
	}
	public Jogador(String nomeUsuario) {
		this.NomeUsuario = nomeUsuario;
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
	public void adicionarTerritoriosJogador(Territorio t) {
		this.Territorios.add(t);
	}
	@Override
	public String toString() {
		return "Jogador [NomeUsuario=" + NomeUsuario + "]";
	}

	

}
