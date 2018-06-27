package br.ufpb.dcx.Sistur;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sistur {
	public static void main(String[] args) throws MunicipioJaExisteException, MunicipioNaoExisteException, AtrativoNaoExisteException {
		Scanner leitor = new Scanner(System.in);
		AreaDeInteresseTuristico pontosTuristicos = new AreaDeInteresseTuristico();
		boolean sair = false;
		while (!sair) {
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\nSISTEMA DE TURISMO \nDigite uma opção:\n1. Cadastrar Municipio\n2. Cadastrar Atrativos"
					+ "\n3. Listar Municípios\n4. Listar Atrativos de um município"
					+ "\n5. Recuperar Eventos Cadastrados"
					+ "\n6. Sair");
			int opcao = Integer.parseInt(leitor.nextLine());
			switch (opcao) {
			case 1:
				String nomeMunicipio = input("Digite o nome do município: ", leitor);
				Municipio m1 = new Municipio(nomeMunicipio);
				try{
					pontosTuristicos.cadastraMunicipio(m1);
					int populacaoMunicipio = Integer.parseInt(input("Digite a população do município: ", leitor));
					int latitudeMunicipio = Integer.parseInt(input("Digite a latitude: ", leitor));
					int longitudeMunicipio = Integer.parseInt(input("Digite a longitude: ", leitor));
					String estadoMunicipio = input("Digite o estado do município: ", leitor);
					String siteMunicipio = input("Digite o site do município: ", leitor);
					ArrayList<AtrativoTuristico> atrativosTuristicos = new ArrayList<AtrativoTuristico>();
					ArrayList<MeioDeHospedagem> meiosHospedagem = new ArrayList<MeioDeHospedagem>();
					m1.setPopulacao(populacaoMunicipio);
					m1.setLatitude(latitudeMunicipio);
					m1.setLongitude(longitudeMunicipio);
					m1.setEstado(estadoMunicipio);
					m1.setSite(siteMunicipio);
					m1.setAtrativosTuristicos(atrativosTuristicos);
					m1.setMeiosDeHospedagem(meiosHospedagem);
					System.out.println("Município cadastrado com sucesso");
				}catch (MunicipioJaExisteException e){
					System.out.println(e.getMessage());
					break;
				}
			break;
			case 2:
				String nomeDoMunicipio = input("Digite o nome do município a cadastrar o atrativo: ", leitor);
				try {
					Municipio m3 = pontosTuristicos.pesquisaMunicipio(nomeDoMunicipio);
					if(m3 == null) {
						System.out.println("Município informado não existe.");
						break;
					}
					String tipoAtrativo = input("Qual o tipo do atrativo? Natural ou Evento Programado \n: ", leitor);
					String nomeAtrativo= input("Digite o nome do atrativo: ", leitor);
					String latitudeAtrativo= input("Digite a latitude do atrativo: ", leitor);
					String longitudeAtrativo= input("Digite a longitude do atrativo: ", leitor);
					String comoChegarAtrativo= input("Digite o endereco do atrativo: ", leitor);
					String siteAtrativo= input("Digite o site do atrativo: ", leitor);
					String infoContatoAtrativo= input("Digite o contato do atrativo: ", leitor);
					if(tipoAtrativo.toUpperCase().equals("NATURAL")) {
						String perguntaAtrativoNatural = input("Praia ou Geossitio? ", leitor);
						if(perguntaAtrativoNatural.toUpperCase().equals("PRAIA")) {
							boolean perigoTubarao = false;
							boolean propriaParaBanho  = false;
							String respTubarao  = input("Há perigo de tubarões na praia? S para sim e N para não.\n: ",leitor);
							if(respTubarao.toUpperCase().equals("S")) {
								perigoTubarao = true;
							}
							String respBanho  = input("A praia é própria para bannho? S para sim e N para não.\n: ",leitor);
							if(respBanho.toUpperCase().equals("S")) {
								propriaParaBanho = true;
							}
							int orla = Integer.parseInt(input("Escolha o tipo de orla: \n1 para Mar Aberto. "
									+ "\n2 para Pequenas Ondas. \n3 para Mar Abrigado. \n4 para ondas medias. "
									+ "\n5 para Piscinas Naturais \n6 para ondas fortes", leitor));
							if(orla==1) {
								AtrativoTuristico praia = new Praia(nomeAtrativo, latitudeAtrativo, longitudeAtrativo, comoChegarAtrativo,siteAtrativo,infoContatoAtrativo, perigoTubarao, propriaParaBanho, Praia.TIPO_MAR_ABERTO);
								try{
									m3.cadastrarAtrativoTuristico(praia);
									System.out.println("Atrativo cadastrado com sucesso!");
								}catch (AtrativoJaExisteException e){
									System.out.println(e.getMessage());
									break;
								}
							} else if(orla==2) {
								AtrativoTuristico praia = new Praia(nomeAtrativo, latitudeAtrativo, longitudeAtrativo, comoChegarAtrativo,siteAtrativo,infoContatoAtrativo, perigoTubarao, propriaParaBanho, Praia.TIPO_PEQUENAS_ONDAS);
								try{
									m3.cadastrarAtrativoTuristico(praia);
									System.out.println("Atrativo cadastrado com sucesso!");
								}catch (AtrativoJaExisteException e){
									System.out.println(e.getMessage());
									break;
								}
							} else if(orla==3) {
								AtrativoTuristico praia = new Praia(nomeAtrativo, latitudeAtrativo, longitudeAtrativo, comoChegarAtrativo,siteAtrativo,infoContatoAtrativo, perigoTubarao, propriaParaBanho, Praia.TIPO_MAR_ABRIGADO);
								try{
									m3.cadastrarAtrativoTuristico(praia);
									System.out.println("Atrativo cadastrado com sucesso!");
								}catch (AtrativoJaExisteException e){
									System.out.println(e.getMessage());
									break;
								}
							} else if(orla==4) {
								AtrativoTuristico praia = new Praia(nomeAtrativo, latitudeAtrativo, longitudeAtrativo, comoChegarAtrativo,siteAtrativo,infoContatoAtrativo, perigoTubarao, propriaParaBanho, Praia.TIPO_MAR_ABRIGADO);
								try{
									m3.cadastrarAtrativoTuristico(praia);
									System.out.println("Atrativo cadastrado com sucesso!");
								}catch (AtrativoJaExisteException e){
									System.out.println(e.getMessage());
									break;
								}
							} else if(orla==5) {
								AtrativoTuristico praia = new Praia(nomeAtrativo, latitudeAtrativo, longitudeAtrativo, comoChegarAtrativo,siteAtrativo,infoContatoAtrativo, perigoTubarao, propriaParaBanho, Praia.TIPO_PISCINAS_NATURAIS);
								try{
									m3.cadastrarAtrativoTuristico(praia);
									System.out.println("Atrativo cadastrado com sucesso!");
								}catch (AtrativoJaExisteException e){
									System.out.println(e.getMessage());
									break;
								}
							} else if(orla==6) {
								AtrativoTuristico praia = new Praia(nomeAtrativo, latitudeAtrativo, longitudeAtrativo, comoChegarAtrativo,siteAtrativo,infoContatoAtrativo, perigoTubarao, propriaParaBanho, Praia.TIPO_ONDAS_FORTES);
								try{
									m3.cadastrarAtrativoTuristico(praia);
									System.out.println("Atrativo cadastrado com sucesso!");
								}catch (AtrativoJaExisteException e){
									System.out.println(e.getMessage());
									break;
								}
							}
					}else {
						try{
							AtrativoTuristico G1 = new Geossitio(nomeAtrativo, latitudeAtrativo, longitudeAtrativo, comoChegarAtrativo,siteAtrativo,infoContatoAtrativo);
							m3.cadastrarAtrativoTuristico(G1);
							System.out.println("Atrativo cadastrado com sucesso!");
						}catch (AtrativoJaExisteException e){
							System.out.println(e.getMessage());
							break;
						}
					}
				}else {
					String dataInicio = input("Data início do evento: ", leitor);
					String dataFim = input("Data fim do evento: ", leitor);
					String tipo = input("Tipo de evento. \nFEIRA ou FESTA: ", leitor);
					String logradouro = input("Digite o logradouro: ",leitor);
					String numero = input("Digite o número: ",leitor);
					String bairro = input("Digite o bairro: ", leitor);
					Endereco EN1 = new Endereco(logradouro, numero, bairro);
					EventoProgramado E1 = new EventoProgramado(nomeAtrativo, latitudeAtrativo, longitudeAtrativo,
							comoChegarAtrativo, siteAtrativo, infoContatoAtrativo, dataInicio, dataFim, tipo, EN1);
					try{
						m3.cadastrarAtrativoTuristico(E1);
						System.out.println("Atrativo cadastrado com sucesso!");
					}catch (AtrativoJaExisteException e){
						System.out.println(e.getMessage());
						break;
					}
				}
				}catch(MunicipioNaoExisteException e) {
					System.out.println(e.getMessage());
					break;
				}
			break;
			case 3:
				if(pontosTuristicos.getMunicipios().size() != 0) {
					for(Municipio Case3: pontosTuristicos.getMunicipios()) {
						System.out.println(Case3.toString());
					}
				}else {
					System.out.println("Não foi cadastrado nenhum município.");
					}
				String esperaSair = input("\nPara voltar ao menu, digite qualquer tecla.", leitor);
			break;
			case 4:
				try {
					String municipioPesquisa = input("Digite o nome do município a ser pesquisado: ", leitor);
					Municipio m5 = pontosTuristicos.pesquisaMunicipio(municipioPesquisa);
					for(AtrativoTuristico A2: m5.getAtrativosTuristicos()){
						System.out.println(A2.getDescricao());
					}
					esperaSair = input("\nPara voltar ao menu, digite qualquer tecla.", leitor);
				}catch(MunicipioNaoExisteException | NullPointerException e) {
					System.out.println(e.getMessage());
					System.out.println("Município não existe ou não foi cadastrado atrativos no município pesquisado.");
					esperaSair = input("Para voltar ao menu, digite qualquer tecla.", leitor);
					break;
				}
				

			break;
			case 5:
				String nomeMun = input("Digite o nome do município: ", leitor);
				GravadorEventos gravadorEV1 = new GravadorEventos();
				try {
					gravadorEV1.recuperaEventos("EventosProgramados"+nomeMun+".txt");
					System.out.println("Eventos recuperados com sucesso!");
				}catch(IOException e) {
					System.out.println(e.getMessage());
				}																		
			break;
			case 6:
				sair = true;
				ArrayList<Municipio> listaTemp = pontosTuristicos.getMunicipios();
				GravadorEventos gravadorEV2 = new GravadorEventos();
				for(Municipio m: listaTemp) {
					ArrayList<EventoProgramado> eventosTemp = new ArrayList<EventoProgramado>();
					for(AtrativoTuristico ep: m.getAtrativosTuristicos()) {
						if(ep instanceof EventoProgramado) {
							eventosTemp.add((EventoProgramado) ep);
						}
					}try {
						gravadorEV2.gravaEventos(eventosTemp, "EventosProgramados"+m.getNome()+".txt");
						System.out.println("Arquivo "+"EventosProgramados"+m.getNome()+".txt"+" gravado com sucesso!");
					}catch(IOException e) {
						System.out.println(e.getMessage());
					}
				}
			break;
			}
		}
	}
	private static String input(String textoMostrado, Scanner leitor) {
		System.out.println(textoMostrado);
		return leitor.nextLine();
	}
}