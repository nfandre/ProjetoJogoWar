package br.edu.ifsp.spo.lg2a3.Jogo;

public class Exercito extends Jogador {
	
	
	public Exercito(String nomeUsuario, int quantidadeExercito){
		super(nomeUsuario);
		QuantidadeExercito = quantidadeExercito;
	}
	
	int QuantidadeExercito;
	public int getQuantidadeExercito() {
		return QuantidadeExercito;
	}
	public void setQuantidadeExercito(int quantidadeExercito) {
		QuantidadeExercito = quantidadeExercito;
	}
}
