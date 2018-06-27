package br.ufpb.dcx.Sistur;

public class Praia extends AtrativoNatural{
	private boolean perigoTubarao;
	private boolean propriaParaBanho;
	private String tipoDeOrla;
	public static final String TIPO_MAR_ABERTO = "Mar aberto";
	public static final String TIPO_PEQUENAS_ONDAS = "Pequenas Ondas";
	public static final String TIPO_MAR_ABRIGADO = "Mar abrigado";
	public static final String TIPO_ONDAS_MEDIAS = "Ondas mï¿½dias";
	public static final String TIPO_PISCINAS_NATURAIS = "Piscinas naturais";
	public static final String TIPO_ONDAS_FORTES = "Ondas fortes";
	
	public Praia(String nomeAtrativo, String latitudeAtrativo, String longitudeAtrativo, String comoChegarAtrativo,
			String siteAtrativo, String infoContatoAtrativo, boolean perigoTubarao2, boolean propriaParaBanho2,
			String tipoDeOrla) {
		super(nomeAtrativo, latitudeAtrativo, longitudeAtrativo, comoChegarAtrativo, siteAtrativo, infoContatoAtrativo);
		this.setPerigoTubarao(perigoTubarao2);
		this.setPropriaParaBanho(propriaParaBanho2);
		this.setTipoDeOrla(tipoDeOrla);
	}

	public String getDescricao(){
		if(this.perigoTubarao == true && this.propriaParaBanho == true) {
			return "Praia de nome: "+super.getNome()
			+"\n Tipo: "+this.tipoDeOrla
			+"\nLatitude: "+super.getLatitude()
			+"    Longitude: "+super.getLongitude()+"\nComo chegar: "+super.getComoChegar()
			+"\nSite: "+super.getSite()+"\nInformações de contato: "+super.getInfoContato()+"\nPrópria para banho: Sim"+"\nPerigo de tubarão: Sim;";
		}else if(this.perigoTubarao == false && this.propriaParaBanho == false) {
			return "Praia de nome: "+super.getNome()
			+"\nTipo: "+this.tipoDeOrla
			+"\nLatitude: "+super.getLatitude()
			+"    Longitude: "+super.getLongitude()+"\nComo chegar: "+super.getComoChegar()
			+"\nSite: "+super.getSite()+"\nInformações de contato: "+super.getInfoContato()+"\nPrópria para banho: Não"+"\nPerigo de tubarão: Não";
		}else if(this.perigoTubarao == true && this.propriaParaBanho == false) {
			return "Praia de nome: "+super.getNome()
			+"\nTipo: "+this.tipoDeOrla
			+"\nLatitude: "+super.getLatitude()
			+"    Longitude: "+super.getLongitude()+"\nComo chegar: "+super.getComoChegar()
			+"\nSite: "+super.getSite()+"\nInformações de contato: "+super.getInfoContato()+"\nPrópria para banho: Não"+"\nPerigo de tubarão: Sim";
		}else {
				return "Praia de nome: "+super.getNome()
				+"\nTipo: "+this.tipoDeOrla
				+"\nLatitude: "+super.getLatitude()
				+"    Longitude: "+super.getLongitude()+"\nComo chegar: "+super.getComoChegar()
				+"\nSite: "+super.getSite()+"\nInformações de contato: "+super.getInfoContato()+"\nPrópria para banho: Sim"+"\nPerigo de tubarão: Não;";
		}
	}

	public String getTipoDeOrla() {
		return tipoDeOrla;
	}

	public void setTipoDeOrla(String tipoDeOrla) {
		this.tipoDeOrla = tipoDeOrla;
	}

	public boolean isPropriaParaBanho() {
		return propriaParaBanho;
	}

	public void setPropriaParaBanho(boolean propriaParaBanho) {
		this.propriaParaBanho = propriaParaBanho;
	}

	public boolean isPerigoTubarao() {
		return perigoTubarao;
	}

	public void setPerigoTubarao(boolean perigoTubarao) {
		this.perigoTubarao = perigoTubarao;
	}

}
