package br.ufpb.dcx.Sistur;

public class MunicipioNaoExisteException extends Exception{
	private static final long serialVersionUID = -7895766922026577149L;
	
	public MunicipioNaoExisteException(String msgErro){
		super(msgErro);
	}
	
	public MunicipioNaoExisteException(){
		this("Município não existe");
	}

}
