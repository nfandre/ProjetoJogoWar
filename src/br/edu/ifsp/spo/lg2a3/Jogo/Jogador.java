package br.edu.ifsp.spo.lg2a3.Jogo;

import java.util.ArrayList;

public class Jogador {
	private String NomeUsuario;
	private  ArrayList <Territorio> Territorios = new ArrayList<Territorio>();
	private ArrayList<Exercito> Exercitos = new ArrayList<Exercito>();
	
	public Jogador() {
		
	}
	public Jogador(String nomeUsuario) {
		this.NomeUsuario = nomeUsuario;
	}	
	
	public String getNomeUsuario() {
		return NomeUsuario;
	}
	
	public void setExercitos(ArrayList<Exercito> exercitos) {
		Exercitos = exercitos;
	}
	
	public ArrayList<Exercito> getExercitos() {
		return Exercitos;
	}
	public void setNomeUsuario(String nomeUsuario) {
		NomeUsuario = nomeUsuario;
	}
	public ArrayList<Territorio> getTerritorios() {
		return Territorios;
	}
	
	public void adicionarTerritoriosJogador(Territorio t) {
		this.Territorios.add(t);
	}
	public int dividirExercitoNumeroTerritorio(int qtdTerritorio) {
		int retorno;
		if(qtdTerritorio%2 ==0) {
			retorno =  qtdTerritorio/2;
		}else {
			retorno = qtdTerritorio/2 + 1;
		}
		
		return retorno;
	}
	public void colocarExercitosDeAcordoComTerritorios( Jogador jogador, TipoExercito tipo, String cor) {
			int qtdExercitoReceber = jogador.dividirExercitoNumeroTerritorio((jogador.getTerritorios().size()));
			int i=0;
			ArrayList<Exercito> exercitos = new ArrayList<Exercito>();
			for(i=0; i<qtdExercitoReceber; i++) {
				Exercito exercito = new Exercito(10, tipo, cor);
				exercitos.add(exercito);
			}	
			jogador.setExercitos(exercitos);
	}
	

	public Jogador atacar(Exercito exercitoAtaque, Exercito ExercitoDefesa, Jogador jogadorAtacar, Jogador jogadorReceberAtaque) {
		
		//verificar fronteiraa
		//if(exer)
		exercitoAtaque.getTerritorioAlocado();
		
		return jogadorAtacar;
		
	}
	
	
	@Override
	public String toString() {
		return "Jogador [NomeUsuario=" + NomeUsuario + "]";
	}

	

}
