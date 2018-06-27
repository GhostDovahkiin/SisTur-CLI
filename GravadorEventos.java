package br.ufpb.dcx.Sistur;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GravadorEventos {
	
	public List<EventoProgramado> recuperaEventos(String nomeArquivo) throws IOException {    
		BufferedReader leitor = null;
        List<EventoProgramado> eventos = new ArrayList<EventoProgramado>();
		try {
			leitor = new BufferedReader(new FileReader(nomeArquivo));
			String texto = null;
			do {
				texto = leitor.readLine(); // lê a próxima linha do arquivo
				if (texto != null){
					int quantidadeEventos = Integer.parseInt(texto);
					for(int i = 0; i < quantidadeEventos; i++) {
						String nome = leitor.readLine();
						String latitude = leitor.readLine();
						String longitude = leitor.readLine();
						String comoChegar = leitor.readLine();
						String site = leitor.readLine();
						String infoContato = leitor.readLine();
						String dataInicio = leitor.readLine();
						String dataFim = leitor.readLine();
						String tipo = leitor.readLine();
						
						EventoProgramado ep = new EventoProgramado(nome,latitude,longitude,comoChegar,site,infoContato,
								dataInicio,dataFim,tipo);
						eventos.add(ep);
					}														
                }
			} while(texto != null); //vai ser null quando chegar no fim do arquivo
		} finally {
			if (leitor!=null){
				leitor.close(); //fecha o stream(fluxo) de leitura
			}
		}
		return eventos;
	}
	
	public void gravaEventos(List<EventoProgramado> texto, String nomeArquivo)
			throws IOException {
		BufferedWriter gravador = null;
		try {
			gravador = new BufferedWriter(new FileWriter(nomeArquivo));
                        for (EventoProgramado s: texto) {
                        	gravador.write(texto.size()+"\n");
                        	gravador.write(s.getNome()+"\n"+s.getLatitude()+"\n"
                        		+s.getLongitude()+"\n"+s.getComoChegar()+"\n"
                        		+s.getSite()+"\n"+s.getInfoContato()+"\n"+
                        		s.getDataInicio()+"\n"+s.getDataFim()+"\n"+
                            	s.getTipo());
                              gravador.write("\r\n");
                        }
		} finally {
			if (gravador!=null){
				gravador.close(); //fecha o stream(fluxo) de escrita
			}
		}
	}	
}
