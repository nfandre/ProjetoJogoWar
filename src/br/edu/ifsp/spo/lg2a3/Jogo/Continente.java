package br.edu.ifsp.spo.lg2a3.Jogo;

import java.util.ArrayList;


public class Continente {
	
	//private static int quantidadeTerritorios;
	public  ArrayList <Territorio> Territorios = new ArrayList<Territorio>();
	private String Nome;

	public Continente() {
		
	}
	public Continente(String nome) {
		this.Nome =nome;
	}	
	
	public void adicionarTerritoriosAoContinente(Territorio territorio) {
		territorio.setContinente(this);
		Territorios.add(territorio);
	}



	public ArrayList<Territorio> getTerritorios() {
		return Territorios;
	}



	public void setTerritorios(ArrayList<Territorio> territorios) {
		Territorios = territorios;
	}
	
	


	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	@Override
	public String toString() {
		return "Continente [Nome=" + Nome + "]";
	}
	
	
	
	 
}
