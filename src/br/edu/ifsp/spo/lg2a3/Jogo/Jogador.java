package br.edu.ifsp.spo.lg2a3.Jogo;

import java.util.ArrayList;

public class Jogador {
	private String NomeUsuario;
	private  ArrayList <Territorio> Territorios = new ArrayList<Territorio>();
	private ArrayList<Exercito> Exercitos = new ArrayList<Exercito>();
	private int RolagemDado;

	public Jogador() {
		
	}
	
	public int getRolagemDado() {
		return RolagemDado;
	}

	public void setRolagemDado() {
		RolagemDado = this.realizarRolagemDado();
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
	public void colocarExercitosDeAcordoComTerritorios( Jogador jogador, String cor) {
			int qtdExercitoReceber = jogador.dividirExercitoNumeroTerritorio((jogador.getTerritorios().size()));
			int i=0;
			ArrayList<Exercito> exercitos = new ArrayList<Exercito>();
			for(i=0; i<qtdExercitoReceber; i++) {
				Exercito exercito = new Exercito(cor);
				exercitos.add(exercito);
			}	
			jogador.setExercitos(exercitos);
	}
	public void deslocar(Territorio territorioTroca, Exercito exercitoTroca) {
			exercitoTroca.setTerritorioAlocado(territorioTroca);

	}
	public int realizarRolagemDado() {
		Dado d = new Dado(6);
		return d.realizarRolagem();
	}

	public Jogador atacar(Exercito exercitoAtaque, Exercito exercitoDefesa, Jogador jogadorAtacar, Jogador jogadorDefesa) {
		Jogador jogadorRetorno = null;
		//verificar fronteiraa
		if(exercitoAtaque.getTerritorioAlocado()
				.verificarFronteiraOutroTerritorio
				(exercitoDefesa.getTerritorioAlocado()) == true) {
			
			//verificar se é possivel atacar
			if(this.verificarPossibilidadeAtaque() == true) {
				
				//ver quem ganhou
				int qtdExercito = 0;
				if(this.getRolagemDado() > jogadorDefesa.getRolagemDado()) {
					qtdExercito = jogadorDefesa.getExercitos().size();
					jogadorDefesa.getExercitos().remove(qtdExercito-1);
					jogadorRetorno = this;
				}else
					if(this.getRolagemDado() < jogadorDefesa.getRolagemDado()) {
						qtdExercito	= this.getExercitos().size();
						this.getExercitos().remove(qtdExercito-1);
						jogadorRetorno = jogadorDefesa;
					}else {
						this.getExercitos().remove(qtdExercito-1);
						jogadorRetorno = jogadorDefesa;
					}
			}else {
				System.out.println("é necessário ter um exercito de ocupação");
			}
			
			
		}else {
			
			System.out.println("território não possui fronteira");
		}
		
		return jogadorRetorno;
		
	}
	public void RemoverExercitoDaLista(TipoExercito tipoExercito) {
		
		
	}
	public boolean verificarPossibilidadeAtaque() {
		boolean retorno = false;
		if(this.getExercitos().size() ==1 ) {
			retorno = false;
		}else {
			retorno = true;
		}
		return retorno;
			
		
	}
	
	//public int pegarIndexPorExercito(Exercito exercito) {
//			return this.getExercitos().get(index);
	//}
	
	@Override
	public String toString() {
		return "Jogador [NomeUsuario=" + NomeUsuario + "]";
	}

	

}
