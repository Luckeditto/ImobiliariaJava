package br.ucsal.bes20231.poo.imobiliaria.domain;

public class Apartamento extends Imoveis {
	
	

	private Double areaFracaoIdeal;
	private Double areaPrivativa;
	private Double imposto;
	
	
	
	//construtor


	public Apartamento(Integer codigo, String endereco, String bairro, Double valor, Double areaFracaoIdeal,
			Double areaPrivativa) {
		super(codigo, endereco, bairro, valor);
		this.areaFracaoIdeal = areaFracaoIdeal;
		this.areaPrivativa = areaPrivativa;
		
	}



	//getters e setters
	
	public Double getAreaFracaoIdeal() {
		return areaFracaoIdeal;
	}


	


	public void setAreaFracaoIdeal(Double areaFracaoIdeal) {
		this.areaFracaoIdeal = areaFracaoIdeal;
	}


	public Double getAreaPrivativa() {
		return areaPrivativa;
	}


	public void setAreaPrivativa(Double areaPrivativa) {
		this.areaPrivativa = areaPrivativa;
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
		return "Apartamento [areaFracaoIdeal=" + areaFracaoIdeal + ", areaPrivativa=" + areaPrivativa + "]";
	}
	
	public Double calcularImposto() {
		this.imposto = 130*getAreaPrivativa()+40*getAreaFracaoIdeal(); 
		return imposto;
	}




	
	
	
	
	

}
