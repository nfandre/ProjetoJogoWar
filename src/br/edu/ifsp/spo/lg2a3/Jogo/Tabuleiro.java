package br.edu.ifsp.spo.lg2a3.Jogo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;


public class Tabuleiro {
	
	private ArrayList<Continente> continentes = new ArrayList <Continente>();
	
	
	public Tabuleiro() {
		setUp();
			
		
	}
	public void pegarContinentesTxt() {
		try {
			String nomeContinente;
			BufferedReader arquivo = new BufferedReader(new FileReader("src/br/edu/ifsp/spo/lg2a3/arquivos/Continentes.txt"));
			while((nomeContinente = arquivo.readLine())!=null) {
				Continente continenteX = new Continente(nomeContinente);
				this.continentes.add(continenteX);				
			}
			arquivo.close();
			
		}catch(Exception  ex) {
			System.out.println(ex.getMessage());
		}

	}
	public ArrayList<Territorio> pegarTerritoriosText( Continente c) {
		ArrayList<Territorio> territorios = new ArrayList<Territorio>();
		try {
			String nomeTerritorio;
			String arquivoConsulta ="Territorios"+c.getNome()+".txt";
			BufferedReader arquivo = new BufferedReader(new FileReader("src/br/edu/ifsp/spo/lg2a3/arquivos/"+arquivoConsulta));
			
			while((nomeTerritorio = arquivo.readLine())!=null) {
				Territorio t = new Territorio(nomeTerritorio);	
				territorios.add(t);
			}
			arquivo.close();	
		}catch(Exception  ex) {
			System.out.println(ex.getMessage());
		}
		return territorios;
		
	}
	
	public void AdicionarTerritoriosAosContinentes() {
		for(Continente c: this.getContinentes()) {
			c.setTerritorios(pegarTerritoriosText(c));		
		}			
	}
	
	
	public void setUp() {

		pegarContinentesTxt();
		AdicionarTerritoriosAosContinentes();
		
		
		
//		Continente Africa = new Continente("Africa");
//		Continente Europa = new Continente("Europa");
//		Continente AmericaSul = new Continente("AmericaSul");
//		Continente AmericaNorte = new Continente("AmericaNorte");
//		Continente Oceania = new Continente("Oceania ");
//		Continente Asia = new Continente("Asia");
//		
//		//AdicionandoContinentes a uma lista no tabuleiro
//		this.continentes.add(Africa);
//		this.continentes.add(Europa);
//		this.continentes.add(AmericaSul);
//		this.continentes.add(AmericaNorte);
//		this.continentes.add(Oceania);
//		this.continentes.add(Asia);
//		
//		//territorios da america do sul
//		Territorio Brasil = new Territorio("Brasil");
//		Territorio ArgentinaUruguai = new Territorio("ArgentinaUruguai");
//		Territorio PeruBoliviaChile = new Territorio("PeruBoliviaChile");
//		Territorio ColombiaVenezuela = new Territorio("ColombiaVenezuela");
//		
//		AmericaSul.adicionarTerritoriosAoContinente(Brasil);
//		AmericaSul.adicionarTerritoriosAoContinente(ArgentinaUruguai);
//		AmericaSul.adicionarTerritoriosAoContinente(PeruBoliviaChile);
//		AmericaSul.adicionarTerritoriosAoContinente(ColombiaVenezuela);
//
//		
//		//territorios da america do norte
//		Territorio Mexico = new Territorio("Mexico");
//		Territorio California = new Territorio("California");
//		Territorio Vancouver = new Territorio("Vancouver");
//		Territorio Alaska = new Territorio("Alaska");
//		Territorio Mackenzie = new Territorio("Mackenzie");
//		Territorio Offawa = new Territorio("Offawa");
//		Territorio Labrador = new Territorio("Labrador");
//		Territorio NovaYork = new Territorio("NovaYork");
//		Territorio Gruelandia = new Territorio("Gruelandia");
//		
//		AmericaNorte.adicionarTerritoriosAoContinente(Mexico);
//		AmericaNorte.adicionarTerritoriosAoContinente(California);
//		AmericaNorte.adicionarTerritoriosAoContinente(Vancouver);
//		AmericaNorte.adicionarTerritoriosAoContinente(Alaska);
//		AmericaNorte.adicionarTerritoriosAoContinente(Offawa);
//		AmericaNorte.adicionarTerritoriosAoContinente(Mackenzie);
//		AmericaNorte.adicionarTerritoriosAoContinente(Labrador);
//		AmericaNorte.adicionarTerritoriosAoContinente(NovaYork);
//		AmericaNorte.adicionarTerritoriosAoContinente(Gruelandia);
//		
//		//territorios da africa
//		Territorio AfricaSul = new Territorio("AfricaSul");
//		Territorio Congo = new Territorio("Congo");
//		Territorio Madagascar = new Territorio("Madagascar");
//		Territorio Sudao = new Territorio("Sudao");
//		Territorio NigeriaArgela = new Territorio("NigeriaArgela");
//		Territorio Egito = new Territorio("Egito");
//		
//		Africa.adicionarTerritoriosAoContinente(AfricaSul);
//		Africa.adicionarTerritoriosAoContinente(Congo);
//		Africa.adicionarTerritoriosAoContinente(Madagascar);
//		Africa.adicionarTerritoriosAoContinente(Sudao);
//		Africa.adicionarTerritoriosAoContinente(NigeriaArgela);
//		Africa.adicionarTerritoriosAoContinente(Egito);
//		
//		//territorios da Europa
//		Territorio Moscou = new Territorio("Moscou");
//		Territorio Suecia = new Territorio("Suecia");
//		Territorio Alemanha = new Territorio("Alemanha");
//		Territorio JugoslaviaPolonia = new Territorio("JugosláviaPolonia");
//		Territorio Inglaterra = new Territorio("Inglaterra");
//		Territorio Islandia = new Territorio("Islandia");
//		Territorio EspanhaPortugal = new Territorio("EspanhaPortugal");
//		Territorio FrancaItalia = new Territorio("FrancaItalia");
//		
//		Europa.adicionarTerritoriosAoContinente(Moscou);
//		Europa.adicionarTerritoriosAoContinente(Suecia);
//		Europa.adicionarTerritoriosAoContinente(Alemanha);
//		Europa.adicionarTerritoriosAoContinente(JugoslaviaPolonia);
//		Europa.adicionarTerritoriosAoContinente(Inglaterra);
//		Europa.adicionarTerritoriosAoContinente(Islandia);
//		Europa.adicionarTerritoriosAoContinente(EspanhaPortugal);
//		Europa.adicionarTerritoriosAoContinente(FrancaItalia);
//		
//		//territorios da Oceania
//		Territorio Australia = new Territorio("Australia");
//		Territorio Sumatra = new Territorio("Sumatra");
//		Territorio Borneo = new Territorio("Borneo");
//		Territorio NovaGuine = new Territorio("NovaGuine");
//		
//		Oceania.adicionarTerritoriosAoContinente(Australia);
//		Oceania.adicionarTerritoriosAoContinente(Sumatra);
//		Oceania.adicionarTerritoriosAoContinente(Borneo);
//		Oceania.adicionarTerritoriosAoContinente(NovaGuine);
//		
//		//territorios asia
//		Territorio Vietna = new Territorio("Vietna");
//		Territorio India = new Territorio("India");
//		Territorio China = new Territorio("China");
//		Territorio OrienteMedio = new Territorio("OrienteMedio");
//		Territorio Aral = new Territorio("Aral");
//		Territorio Mangolia = new Territorio("Mangolia");
//		Territorio Omsk = new Territorio("omsk");
//		Territorio Dudinka = new Territorio("dudinka");
//		Territorio tchita = new Territorio("tchita");
//		Territorio Siberia = new Territorio("Siberia");
//		Territorio vladivostok = new Territorio("vladivostok");
//		
//		Asia.adicionarTerritoriosAoContinente(Vietna);
//		Asia.adicionarTerritoriosAoContinente(India);
//		Asia.adicionarTerritoriosAoContinente(China);
//		Asia.adicionarTerritoriosAoContinente(OrienteMedio);
//		Asia.adicionarTerritoriosAoContinente(Aral);
//		Asia.adicionarTerritoriosAoContinente(Mangolia);
//		Asia.adicionarTerritoriosAoContinente(Omsk);
//		Asia.adicionarTerritoriosAoContinente(Dudinka);
//		Asia.adicionarTerritoriosAoContinente(tchita);
//		Asia.adicionarTerritoriosAoContinente(Siberia);
//		Asia.adicionarTerritoriosAoContinente(vladivostok);
	}

	public ArrayList<Continente> getContinentes() {
		return continentes;
	}

	public void setContinentes(ArrayList<Continente> continentes) {
		this.continentes = continentes;
	}
}
