package br.ufpb.dcx.Sistur;

public class AtrativoNaoExisteException extends Exception{
	private static final long serialVersionUID = -3527313977533035478L;

	public AtrativoNaoExisteException(){
		this("Erro: Atrativo não existe");
	}
	
	public AtrativoNaoExisteException(String msgErro){
		super(msgErro);
	}
}
