package br.ucsal.bes20231.poo.imobiliaria.tui;

public enum ImovelEnum {
	CADASTRAR_CASA(1,"cadastrar casa"),
	CADASTRAR_APARTAMENTO(2,"cadastrar apartamento"),
	EXIBIR_IMOVEIS_POR_CODIGO(3,"exibir imoveis por codigo"),
	EXIBIR_IMOVEIS_POR_BAIRRO_VALOR(4, "exibir imoveis por bairro valor"),
	SAIR(5, "sair");
	
	
	private int codigo;
	private String descricao;
	
	
	private ImovelEnum(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String obterDescricaoCompleta() {
		return codigo +"-"+descricao;
	}


	public static ImovelEnum valueOfCodigo(int codigo) {
		for(ImovelEnum opcao : ImovelEnum.values()) {
			if(opcao.codigo==codigo) {
				return opcao;
			}
		}
		throw new IllegalArgumentException(ImovelEnum.class.getClass().getName() + "-" + codigo + " nao encontrado"
				);
	}

	
	
	

}
