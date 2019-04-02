package br.edu.ifsp.spo.l2a3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Dado {
	
	private int QuantidadeLado;
	private Collection<Integer> LadosCollection = new ArrayList<Integer>();
	private static int rolagem;
	


	public Dado(int quantidadeLado) {
		setQuantidadeLado(quantidadeLado);
	colocarValores();
	}
	

	public void colocarValores() {
		
		for(int i = 1; i<=QuantidadeLado; i++) {
			LadosCollection.add(i);
		}
}
	
	public int realizarRolagem() {
		Random random = new Random();
		int novaRolagem;
		
		do {
			novaRolagem = random.nextInt(this.getLadosCollection().size())+1;
		}
		while(novaRolagem == getRolagem()); 

		setRolagem( novaRolagem);
		
		return getRolagem();
	}
	
	
	
	
	public int getQuantidadeLado() {
		return QuantidadeLado;
	}

	public void setQuantidadeLado(int quantidadeLado) {
		QuantidadeLado = quantidadeLado;
	}
	public Collection<Integer> getLadosCollection() {
		return LadosCollection;
	}

	public void setLadosCollection(Collection<Integer> ladosCollection) {
		LadosCollection = ladosCollection;
	}
	public static int getRolagem() {
		return rolagem;
	}

	public static void setRolagem(int rolagem) {
		Dado.rolagem = rolagem;
	}



}
