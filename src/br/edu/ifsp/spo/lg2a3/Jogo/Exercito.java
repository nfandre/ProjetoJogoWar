package br.edu.ifsp.spo.lg2a3.Jogo;

public class Exercito {
	
	private int QuantidadeExercito;
	private String Cor;
	private Territorio TerritorioAlocado;
	private TipoExercito TipoExercito;
	
	public Exercito(int quantidadeExercito, TipoExercito tipoexercito, String Cor){
		
		QuantidadeExercito = quantidadeExercito;
		TipoExercito = tipoexercito;
	}
	
	public Territorio getTerritorioAlocado() {
		return TerritorioAlocado;
	}

	

	public TipoExercito getTipoExercito() {
		return TipoExercito;
	}

	public void setTipoExercito(TipoExercito tipoExercito) {
		TipoExercito = tipoExercito;
	}

	public void setTerritorioAlocado(Territorio territorioAlocado) {
		TerritorioAlocado = territorioAlocado;
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
