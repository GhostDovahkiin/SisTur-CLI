package br.ufpb.dcx.Sistur;

public class MeioDeHospedagem {
	private String nome;
	private int latitude;
	private int longitude;
	private String infoContato;
	private String site;
	private String tipoHospedagem;
	private Endereco endereco;

	private static final String TIPO_HOTEL = "Hotel";
	
	public static String getTipoHotel() {
		return TIPO_HOTEL;
	}

	public static String getTipoPousada() {
		return TIPO_POUSADA;
	}

	public static String getTipoAlbergue() {
		return TIPO_ALBERGUE;
	}

	private static final String TIPO_POUSADA = "Pousada";
	private static final String TIPO_ALBERGUE = "Albergue";
	
	public MeioDeHospedagem(Endereco endereco) {
		this.nome = "";
		this.latitude = 0;
		this.longitude = 0;
		this.infoContato = "";
		this.site = "";	
		this.tipoHospedagem = "";
		this.endereco = endereco;
	}
	
	public MeioDeHospedagem(String nome, int latitude, int longitude, 
			String infoContato, String site, String tipoHospedagem, Endereco endereco){
		this.nome = nome;
		this.latitude = latitude;
		this.longitude = longitude;
		this.infoContato = infoContato;
		this.site = site;
		this.tipoHospedagem = tipoHospedagem;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String getInfoContato() {
		return infoContato;
	}

	public void setInfoContato(String infoContato) {
		this.infoContato = infoContato;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getTipoHospedagem() {
		return tipoHospedagem;
	}

	public void setTipoHospedagem(String tipoHospedagem) {
		this.tipoHospedagem = tipoHospedagem;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
