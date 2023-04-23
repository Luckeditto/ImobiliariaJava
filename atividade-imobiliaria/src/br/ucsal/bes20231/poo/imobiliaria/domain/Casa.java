package br.ucsal.bes20231.poo.imobiliaria.domain;



public class Casa extends Imoveis {
	
	private Double areaTerreno;
	private Double areaConstruida;
	private Double imposto;
	
	
	
	//construtor

	public Casa(Integer codigo, String endereco, String bairro, Double valor, Double areaTerreno, Double areaConstruida) {
		super(codigo, endereco, bairro, valor);
		this.areaTerreno = areaTerreno;
		this.areaConstruida = areaConstruida;
		
	}






	//getters e setters
	
	public Double getAreaTerreno() {
		return areaTerreno;
	}

	public void setAreaTerreno(Double areaTerreno) {
		this.areaTerreno = areaTerreno;
	}



	public Double getAreaConstruida() {
		return areaConstruida;
	}



	public void setAreaConstruida(Double areaConstruida) {
		this.areaConstruida = areaConstruida;
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
		return "Casa [areaTerreno=" + areaTerreno + ", areaConstruida=" + areaConstruida + "]";
	}
	
	//metodos especiais
	
	
	public Double calcularImposto() {
		this.imposto = 220*getAreaConstruida()+5*getAreaTerreno(); 
		return imposto;
	}
	
	
	

}
