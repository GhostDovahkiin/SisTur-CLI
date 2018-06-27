package br.ufpb.dcx.Sistur;

public class EventoProgramado extends AtrativoTuristico{
	private String dataInicio;
	private String dataFim;
	private String tipo;
	private Endereco endereco;
	private static final String TIPO_FESTA = "Festa";
	private static final String TIPO_FEIRA_GASTRONOMICA = "Feira Gatronï¿½mica";
	
	public EventoProgramado(String nome, String latitude, String longitude, String comoChegar, String site,
			String infoContato, String dataInicio, String dataFim, String tipo, Endereco endereco) {
		super(nome, latitude, longitude, comoChegar, site, infoContato);
		this.dataFim = dataFim;
		this.dataInicio = dataInicio;
		this.tipo = tipo;
		this.endereco = endereco;
	}
	
	public EventoProgramado(String nome, String latitude, String longitude, String comoChegar, String site,
			String infoContato, String dataInicio, String dataFim, String tipo) {
		super(nome, latitude, longitude, comoChegar, site, infoContato);
		this.dataFim = dataFim;
		this.dataInicio = dataInicio;
		this.tipo = tipo;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public static String getTipoFesta() {
		return TIPO_FESTA;
	}

	public static String getTipoFeiraGastronomica() {
		return TIPO_FEIRA_GASTRONOMICA;
	}

	public String getDescricao() {
		return "\nEvento de nome: "+super.getNome()
		+"\nTipo: "+this.tipo
		+"\nData início: "+this.dataInicio+" Data fim: "+this.dataFim
		+"\nLatitude: "+super.getLatitude()
		+"    Longitude: "+super.getLongitude()+"\nComo chegar: "+super.getComoChegar()
		+"\nSite: "+super.getSite()+"\nInformações de contato: "+super.getInfoContato();
		
	}

}
