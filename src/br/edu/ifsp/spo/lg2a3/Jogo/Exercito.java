package br.edu.ifsp.spo.lg2a3.Jogo;

public class Exercito {
	
	//private int QuantidadeExercito;
	private String Cor;
	private Territorio TerritorioAlocado;
	
	public Exercito( String Cor){
		
		//QuantidadeExercito = quantidadeExercito;
		//TipoExercito = tipoexercito;
	}
	
	public Territorio getTerritorioAlocado() {
		return TerritorioAlocado;
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

}
