package br.ucsal.bes20231.poo.imobiliaria.persistence;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.ucsal.bes20231.poo.imobiliaria.domain.Apartamento;
import br.ucsal.bes20231.poo.imobiliaria.domain.Casa;
import br.ucsal.bes20231.poo.imobiliaria.domain.Imoveis;



public class ImovelDAO {
	
	private static List<Imoveis> imoveis = new ArrayList<>();
	
	public static void addCasa(Casa casa) {
		imoveis.add(casa);
		
	}
	
	public static void addApartamento(Apartamento apartamento) {
		imoveis.add(apartamento);
		
	}
	
	public static void showImoveisPorCodigo() {
		Collections.sort(imoveis, Comparator.comparingInt(Imoveis::getCodigo));
		for(Imoveis imovel : imoveis) {
			System.out.println("codigo:"+imovel.getCodigo()+" || endereco: "+imovel.getEndereco()+" || bairro: "+imovel.getBairro());
		}
		
		
	}
	
	public static void showImoveisPorBairroValor() {
		 Map<String, List<Imoveis>> imoveisPorBairro = new HashMap<>();
		    for (Imoveis imovel : imoveis) {
		        imoveisPorBairro.computeIfAbsent(imovel.getBairro(), k -> new ArrayList<>()).add(imovel);
		    }
		    for (List<Imoveis> imoveisNoBairro : imoveisPorBairro.values()) {
		        Collections.sort(imoveisNoBairro, Comparator.comparingDouble(Imoveis::getValor));
		for(Imoveis imovel : imoveisNoBairro) {
			System.out.println("Bairro: "+imovel.getBairro()+ "|| codigo: "+imovel.getCodigo()
			+"|| endereco: "+imovel.getEndereco() + "||valor do imovel: "
		+ imovel.getValor() + "|| valor do imposto "+ imovel.calcularImposto());
		}
		
		    }	
	}	
}