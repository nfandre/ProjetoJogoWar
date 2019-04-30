package br.edu.ifsp.spo.lg2a3.Jogo;

public class Exercito extends Jogador {
	
	private int QuantidadeExercito;
	
	
	public Exercito(String nomeUsuario, int quantidadeExercito, TipoExercito tipoexercito){
		super(nomeUsuario);
		QuantidadeExercito = quantidadeExercito;
	}
	

	public int getQuantidadeExercito() {
		return QuantidadeExercito;
	}
	public void setQuantidadeExercito(int quantidadeExercito) {
		QuantidadeExercito = quantidadeExercito;
	}
}
