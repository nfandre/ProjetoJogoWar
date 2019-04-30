package br.edu.ifsp.spo.lg2a3.Jogo;

public class Jogador {
	private String NomeUsuario;
	
	
	
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

}
