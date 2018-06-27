package br.ufpb.dcx.Sistur;

import java.util.ArrayList;

public class AreaDeInteresseTuristico {
	private ArrayList<Municipio> municipios;
	private String nome;
	
	public AreaDeInteresseTuristico(String nome, ArrayList<Municipio> municipios) {
		this.nome = nome;
		this.municipios = new ArrayList<Municipio>();
	}
	
	public AreaDeInteresseTuristico() {
		this.municipios = new ArrayList<Municipio>();
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<Municipio> getMunicipios() {
		return municipios;
	}

	public void setMunicipios(ArrayList<Municipio> municipios) {
		this.municipios = municipios;
	}

	public void cadastraMunicipio(Municipio mun) throws MunicipioJaExisteException, MunicipioNaoExisteException {
		Municipio m1 = pesquisaMunicipio(mun.getNome());
		if(m1 == null) {
			this.municipios.add(mun);
		}else {
			throw new MunicipioJaExisteException("Município: "+mun.getNome()+" já existe.");
		}
	}
	
	public Municipio pesquisaMunicipio(String municipioPesquisado) throws MunicipioNaoExisteException{
		Municipio retorno = null;
		boolean existe = false;
		for(Municipio m1: this.municipios) {
			if(m1.getNome().toUpperCase().equals(municipioPesquisado)) {
				existe = false;
				retorno = m1;
			}
		}if(existe == false) {
			return retorno;
		}else {
			throw new MunicipioNaoExisteException("Município: "+municipioPesquisado+" não existe. \nTente novamente.");
		}
	}
}
