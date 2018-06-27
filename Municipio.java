package br.ufpb.dcx.Sistur;
import java.util.ArrayList;
import java.util.List;

public class Municipio {
	private String nome;
	private int populacao;
	private int latitude;
	private int longitude;
	private String estado;
	private String site;
	private ArrayList<AtrativoTuristico> atrativosTuristicos;
	private ArrayList<MeioDeHospedagem> meiosDeHospedagem;
	
	public Municipio(String nome) {
		this.nome = nome;
	}
	
	public void cadastrarAtrativoTuristico(AtrativoTuristico atrativo) throws AtrativoJaExisteException, AtrativoNaoExisteException{
		AtrativoTuristico T1 = pesquisarAtrativoTuristico(atrativo.getNome());
		if(T1 == null) {
			this.atrativosTuristicos.add(atrativo);
		}else {
			throw new AtrativoJaExisteException("Atrativo"+atrativo.getNome()+" já existe.");
		}
	}
	
	public AtrativoTuristico pesquisarAtrativoTuristico(String nomeAtrativo) throws AtrativoNaoExisteException{
		AtrativoTuristico A2 = null;
		boolean AtrativoAchado = false;
		for(AtrativoTuristico a1: atrativosTuristicos){
			if(a1.getNome().toUpperCase().equals(nomeAtrativo.toUpperCase())){
				AtrativoAchado = false;
				A2 = a1;		
			}
		}
		if(AtrativoAchado == false) {
			return A2;
		}else {
			throw new AtrativoNaoExisteException("Atrativo"+nomeAtrativo+" não existe.");
		}
	}
	
	public void setAtrativosTuristicos(ArrayList<AtrativoTuristico> atrativosTuristicos) {
		this.atrativosTuristicos = atrativosTuristicos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPopulacao() {
		return populacao;
	}

	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}

	public int getLatitude() {
		return latitude;
	}

	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

	public int getLongitude() {
		return longitude;
	}

	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	public ArrayList<MeioDeHospedagem> getMeiosDeHospedagem() {
		return meiosDeHospedagem;
	}

	public void setMeiosDeHospedagem(ArrayList<MeioDeHospedagem> meiosDeHospedagem) {
		this.meiosDeHospedagem = meiosDeHospedagem;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public Municipio(String nome, int populacao, int latitude, int longitude,
			String estado, String site, ArrayList<AtrativoTuristico> atrativosTuristicos,
			ArrayList<MeioDeHospedagem> meiosDeHospedagem) {
		this.nome = nome;
		this.populacao = populacao;
		this.atrativosTuristicos = new ArrayList<AtrativoTuristico>();
		this.latitude = latitude;
		this.longitude = longitude;
		this.meiosDeHospedagem = new ArrayList<MeioDeHospedagem>();
		this.estado = estado;
		this.site = site;
	}

	public String toString() {
		return "\nMunicipio de nome: "+nome+"\nTamanho populacional: "+populacao+"\nLatitude: "+latitude+
				"  Longitude: "+longitude+"\nEstado: "+estado+"\nSite: "+site+"\nAtrativos Turisticos: " 
				+ atrativosTuristicos.size()+" cadastrados."+ "\nMeios De Hospedagem: " + meiosDeHospedagem.size()
				+ " cadastrados.";
	}

	
	public List<AtrativoTuristico> getAtrativosTuristicos(){
		return atrativosTuristicos;
	}
	

}
