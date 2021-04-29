package entities.enums;

public enum TipoDeDocumento {

	RG("Registro Geral / Identidade"),
	CPF("Cadastro de Pessoa F�sica"),
	CNPJ("Cadastro Nacional de Pessoa Jur�dica");
	
	private String descricao;
	
	TipoDeDocumento(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}