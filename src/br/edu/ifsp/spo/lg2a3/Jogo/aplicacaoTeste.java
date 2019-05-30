package br.edu.ifsp.spo.lg2a3.Jogo;

import java.util.ArrayList;
import java.util.Collections;

import br.edu.ifsp.spo.lg2a3.repositorio.ContinenteRepositorio;
import br.edu.ifsp.spo.lg2a3.repositorio.JogadorRepositorio;

public class aplicacaoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dado d = new Dado(6);
		
		System.out.println(d.realizarRolagem());
		System.out.println(d.realizarRolagem());
		
//		Jogador	j1 = new Jogador("Andre");
//		
//		Jogador j2 = new Jogador("Alisson");
		
//		Exercito a = new Exercito(j1.getNomeUsuario() ,10, TipoExercito.ataque );
//		Exercito b = new Exercito(j2.getNomeUsuario(),6, TipoExercito.defesa);
//		Exercito c = new Exercito(j2.getNomeUsuario(),6,TipoExercito.ataque);
		
//		Territorio d1 = new Territorio();
		
//		d1.exercitos.put(1, a);
//		d1.exercitos.put(2, b);
//		
//		for(Exercito e: d1.exercitos.values()) {
//			System.out.println(e.getNomeUsuario() + e.getQuantidadeExercito());
//			System.out.println(j1.getNomeUsuario());
//		}
		
		
		
		Continente Africa = new Continente("Africa");
		Continente Europa = new Continente("Europa");
		Continente AmericaSul = new Continente("AmericaSul");
		Continente AmericaNorte = new Continente("AmericaNorte");
		Continente Oceania = new Continente("Oceania ");
		Continente Asia = new Continente("Asia");
		//AdicionandoContinentes a uma lista
		ContinenteRepositorio.Continentes.add(Africa);
		ContinenteRepositorio.Continentes.add(Europa);
		ContinenteRepositorio.Continentes.add(AmericaSul);
		ContinenteRepositorio.Continentes.add(AmericaNorte);
		ContinenteRepositorio.Continentes.add(Oceania);
		ContinenteRepositorio.Continentes.add(Asia);
		
		//territorios da america do sul
		Territorio Brasil = new Territorio("Brasil");
		Territorio ArgentinaUruguai = new Territorio("ArgentinaUruguai");
		Territorio PeruBoliviaChile = new Territorio("PeruBoliviaChile");
		Territorio ColombiaVenezuela = new Territorio("ColombiaVenezuela");
		
		AmericaSul.adicionarTerritoriosAoContinente(Brasil);
		AmericaSul.adicionarTerritoriosAoContinente(ArgentinaUruguai);
		AmericaSul.adicionarTerritoriosAoContinente(PeruBoliviaChile);
		AmericaSul.adicionarTerritoriosAoContinente(ColombiaVenezuela);

		
		//territorios da america do norte
		Territorio Mexico = new Territorio("Mexico");
		Territorio California = new Territorio("California");
		Territorio Vancouver = new Territorio("Vancouver");
		Territorio Alaska = new Territorio("Alaska");
		Territorio Mackenzie = new Territorio("Mackenzie");
		Territorio Offawa = new Territorio("Offawa");
		Territorio Labrador = new Territorio("Labrador");
		Territorio NovaYork = new Territorio("NovaYork");
		Territorio Gruelandia = new Territorio("Gruelandia");
		
		AmericaNorte.adicionarTerritoriosAoContinente(Mexico);
		AmericaNorte.adicionarTerritoriosAoContinente(California);
		AmericaNorte.adicionarTerritoriosAoContinente(Vancouver);
		AmericaNorte.adicionarTerritoriosAoContinente(Alaska);
		AmericaNorte.adicionarTerritoriosAoContinente(Offawa);
		AmericaNorte.adicionarTerritoriosAoContinente(Mackenzie);
		AmericaNorte.adicionarTerritoriosAoContinente(Labrador);
		AmericaNorte.adicionarTerritoriosAoContinente(NovaYork);
		AmericaNorte.adicionarTerritoriosAoContinente(Gruelandia);
		
		//territorios da africa
		Territorio AfricaSul = new Territorio("AfricaSul");
		Territorio Congo = new Territorio("Congo");
		Territorio Madagascar = new Territorio("Madagascar");
		Territorio Sudao = new Territorio("Sudao");
		Territorio NigeriaArgela = new Territorio("NigeriaArgela");
		Territorio Egito = new Territorio("Egito");
		
		Africa.adicionarTerritoriosAoContinente(AfricaSul);
		Africa.adicionarTerritoriosAoContinente(Congo);
		Africa.adicionarTerritoriosAoContinente(Madagascar);
		Africa.adicionarTerritoriosAoContinente(Sudao);
		Africa.adicionarTerritoriosAoContinente(NigeriaArgela);
		Africa.adicionarTerritoriosAoContinente(Egito);
		
		//territorios da Europa
		Territorio Moscou = new Territorio("Moscou");
		Territorio Suecia = new Territorio("Suecia");
		Territorio Alemanha = new Territorio("Alemanha");
		Territorio JugoslaviaPolonia = new Territorio("JugosláviaPolonia");
		Territorio Inglaterra = new Territorio("Inglaterra");
		Territorio Islandia = new Territorio("Islandia");
		Territorio EspanhaPortugal = new Territorio("EspanhaPortugal");
		Territorio FrancaItalia = new Territorio("FrancaItalia");
		
		Europa.adicionarTerritoriosAoContinente(Moscou);
		Europa.adicionarTerritoriosAoContinente(Suecia);
		Europa.adicionarTerritoriosAoContinente(Alemanha);
		Europa.adicionarTerritoriosAoContinente(JugoslaviaPolonia);
		Europa.adicionarTerritoriosAoContinente(Inglaterra);
		Europa.adicionarTerritoriosAoContinente(Islandia);
		Europa.adicionarTerritoriosAoContinente(EspanhaPortugal);
		Europa.adicionarTerritoriosAoContinente(FrancaItalia);
		
		//territorios da Oceania
		Territorio Australia = new Territorio("Australia");
		Territorio Sumatra = new Territorio("Sumatra");
		Territorio Borneo = new Territorio("Borneo");
		Territorio NovaGuine = new Territorio("NovaGuine");
		
		Oceania.adicionarTerritoriosAoContinente(Australia);
		Oceania.adicionarTerritoriosAoContinente(Sumatra);
		Oceania.adicionarTerritoriosAoContinente(Borneo);
		Oceania.adicionarTerritoriosAoContinente(NovaGuine);
		
		//territorios asia
		Territorio Vietna = new Territorio("Vietna");
		Territorio India = new Territorio("India");
		Territorio China = new Territorio("China");
		Territorio OrienteMedio = new Territorio("OrienteMedio");
		Territorio Aral = new Territorio("Aral");
		Territorio Mangolia = new Territorio("Mangolia");
		Territorio Omsk = new Territorio("omsk");
		Territorio Dudinka = new Territorio("dudinka");
		Territorio tchita = new Territorio("tchita");
		Territorio Siberia = new Territorio("Siberia");
		Territorio vladivostok = new Territorio("vladivostok");
		
		Asia.adicionarTerritoriosAoContinente(Vietna);
		Asia.adicionarTerritoriosAoContinente(India);
		Asia.adicionarTerritoriosAoContinente(China);
		Asia.adicionarTerritoriosAoContinente(OrienteMedio);
		Asia.adicionarTerritoriosAoContinente(Aral);
		Asia.adicionarTerritoriosAoContinente(Mangolia);
		Asia.adicionarTerritoriosAoContinente(Omsk);
		Asia.adicionarTerritoriosAoContinente(Dudinka);
		Asia.adicionarTerritoriosAoContinente(tchita);
		Asia.adicionarTerritoriosAoContinente(Siberia);
		Asia.adicionarTerritoriosAoContinente(vladivostok);
		
		int qtdJogador = 6;

		if (qtdJogador == 6) {
			Jogador j1 = new Jogador("A");
			Jogador j2 = new Jogador("B");
			Jogador j3 = new Jogador("C");
			Jogador j4 = new Jogador("D");
			Jogador j5 = new Jogador("E");
			Jogador j6 = new Jogador("F");
			ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
			jogadores.add(j1);
			jogadores.add(j2);
			jogadores.add(j3);
			jogadores.add(j4);
			jogadores.add(j5);
			jogadores.add(j6);
	
			//Deixando jogadores em ordem Aleatorios para separar territorios
			Collections.shuffle(jogadores);
			
			
			JogadorRepositorio jr = new JogadorRepositorio(jogadores);
			ContinenteRepositorio cr = new ContinenteRepositorio();
			
			cr.separarTerritoriosJogadores(jogadores.size(), jr);
			//cr.exibirListaTerritoriosPorUsuario();
			
			for(Jogador j:jogadores) {
				System.out.println(j.getTerritorios());
				System.out.println(j.getTerritorios().size());
			}
			/*
			 * 		int i=0;
			for(Continente c: ContinenteRepositorio.Continentes) {
				System.out.println(c.getNome() +c.Territorios.size());
				for(Territorio t: c.Territorios) {
						
					if(i==6)
						i=0;
					
					t.setJogadorDono(jr.getJogadores().get(i));
					i++;
					System.out.println(t.toString()+j++);
				}
			}*/

			
		}
	}

}
