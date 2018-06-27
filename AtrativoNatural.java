package br.ufpb.dcx.Sistur;

public class AtrativoNatural extends AtrativoTuristico{
	
	public AtrativoNatural(String nome, String latitude, String longitude, String comoChegar, String site,
			String infoContato) {
		super(nome, latitude, longitude, comoChegar, site, infoContato);
	}
	public String getDescricao() {
		return "Atrativo de nome: "+super.getNome()
		+"\nLatitude: "+super.getLatitude()
		+"    Longitude: "+super.getLongitude()+"\nComo chegar: "+super.getComoChegar()
		+"\nSite: "+super.getSite()+" Informações de contato: "+super.getInfoContato();
	}

}
