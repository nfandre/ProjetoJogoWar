package br.edu.ifsp.spo.lg2a3.Jogo;


public class Territorio {
	
	private String Nome;
	Jogador jogadorDono;

	
	public Territorio(String nome) {
		Nome =nome;
	}
	
	
	
	
	
	public Jogador getJogadorDono() {
		return jogadorDono;
	}



	public void setJogadorDono(Jogador jogadorDono) {
		this.jogadorDono = jogadorDono;
	}



	public String getNome() {
		return Nome;
	}

	@Override
	public String toString() {
		return "Territorio [Nome=" + Nome + ", jogadorDono=" + jogadorDono + "]";
	}
	
	 
}
