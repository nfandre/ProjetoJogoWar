package br.edu.ifsp.spo.lg2a3.Jogo;


public class Territorio {
	
	private String Nome;
	private Jogador jogadorDono;
	private Continente Continente;

	
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
		
		return retorno;
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
	
	 
}
