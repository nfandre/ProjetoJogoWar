package br.edu.ifsp.spo.lg2a3.Jogo;

import java.util.ArrayList;

public class Jogador {
	private String NomeUsuario;
	private  ArrayList <Territorio> Territorios = new ArrayList<Territorio>();
	
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
	public ArrayList<Territorio> getTerritorios() {
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
