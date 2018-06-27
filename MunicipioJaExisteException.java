package br.ufpb.dcx.Sistur;

public class MunicipioJaExisteException extends Exception{
	private static final long serialVersionUID = 6691317624619552544L;

	public MunicipioJaExisteException(){
		this("Erro: Munic�pio j� existe");
	}

	public MunicipioJaExisteException(String erroMsg) {
		super(erroMsg);
	}
}