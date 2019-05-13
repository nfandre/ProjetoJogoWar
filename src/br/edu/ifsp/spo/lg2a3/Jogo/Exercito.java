package br.edu.ifsp.spo.lg2a3.Jogo;

public class Exercito {
	
	private int QuantidadeExercito;
	
	
	public Exercito(int quantidadeExercito, TipoExercito tipoexercito){
		
		QuantidadeExercito = quantidadeExercito;
	}
	
	
	
	
	public int getQuantidadeExercito() {
		return QuantidadeExercito;
	}
	public void setQuantidadeExercito(int quantidadeExercito) {
		QuantidadeExercito = quantidadeExercito;
	}
}
