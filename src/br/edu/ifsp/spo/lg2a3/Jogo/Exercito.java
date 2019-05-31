package br.edu.ifsp.spo.lg2a3.Jogo;

public class Exercito {
	
	private int QuantidadeExercito;
	private String Cor;
	
	public Exercito(int quantidadeExercito, TipoExercito tipoexercito, String Cor){
		
		QuantidadeExercito = quantidadeExercito;
	}
	
	
	
	
	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

	public int getQuantidadeExercito() {
		return QuantidadeExercito;
	}
	public void setQuantidadeExercito(int quantidadeExercito) {
		QuantidadeExercito = quantidadeExercito;
	}
}
