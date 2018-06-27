package br.ufpb.dcx.Sistur;

public class AtrativoJaExisteException extends Exception{
	private static final long serialVersionUID = -1574872474251568321L;
	
	public AtrativoJaExisteException(){
		this("Erro: Atrativo Já Existe");
	}
	
	public AtrativoJaExisteException(String msgErro){
		super(msgErro);
	}
}
