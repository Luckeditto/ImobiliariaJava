package br.ucsal.bes20231.poo.imobiliaria.domain;

import java.util.Comparator;

public class Imoveis{
	
	
	
	private Integer codigo;
	private String endereco;
	private String bairro;
	private Double valor;
	private Double imposto;
	
	
	

	protected Imoveis(Integer codigo,String endereco, String bairro, Double valor) {
		super();
		this.codigo = codigo;
		this.endereco = endereco;
		this.bairro = bairro;
		this.valor = valor;

	}
	//getters e setters
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		try {
			if(valor>0) {
				this.valor = valor;
			}
		} catch (IllegalArgumentException ValorImovelInvalidoException) {
			System.out.println(ValorImovelInvalidoException + "- valor deve ser maior ou diferente de 0");
		}
		
	}
	
	public Double getImposto() {
		return imposto;
	}
	public void setImposto(Double imposto) {
		this.imposto = imposto;
	}

	//toString
	@Override
	public String toString() {
		return "Imoveis [codigo=" + codigo + ", endereco=" + endereco + ", bairro=" + bairro + ", valor=" + valor + "]";
	}
	

	public Double calcularImposto() {
		this.imposto = this.imposto*0.1;
		return imposto;
	}
		

}
