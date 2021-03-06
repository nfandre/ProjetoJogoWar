package br.edu.ifsp.spo.lg2a3.Jogo;

import java.util.ArrayList;

public class Territorio {
	
	private String Nome;
	private Jogador jogadorDono;
	private Continente Continente;
	private ArrayList<Territorio> fronteiras = new ArrayList<Territorio>();
	
	public Territorio(String nome) {
		Nome =nome;
	}
		
	public Jogador getJogadorDono() {
		return jogadorDono;
	}

	public void setJogadorDono(Jogador jogadorDono) {
		this.jogadorDono = jogadorDono;
	}

	public boolean verificarFronteiraOutroTerritorio(Territorio territorio) {
		boolean retorno= false;
		for(Territorio fronteira: territorio.getFronteiras()) {
			if(this.equals(fronteira)) {
				retorno = true;
				break;
			}
		}
		
		return retorno;
	}
	
	public ArrayList<Territorio> getFronteiras() {
		return fronteiras;
	}

	public void setFronteiras(ArrayList<Territorio> fronteiras) {
		this.fronteiras = fronteiras;
	}

	public Continente getContinente() {
		return Continente;
	}

	public void setContinente(Continente continente) {
		Continente = continente;
	}

	public String getNome() {
		return Nome;
	}
	
	@Override
	public String toString() {
		return "Territorio [Nome=" + Nome + ", jogadorDono=" + jogadorDono + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		boolean resultado = false;
		
		if(obj.getClass() == this.getClass()) {
			Territorio outro = (Territorio)obj;
			
			resultado = this.getNome().equals(outro.getNome());
			
		}
		return resultado;
	}
	
	 
	
}
