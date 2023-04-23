package br.ucsal.bes20231.poo.imobiliaria.tui;

import java.util.Scanner;

import br.ucsal.bes20231.poo.imobiliaria.domain.Apartamento;
import br.ucsal.bes20231.poo.imobiliaria.domain.Casa;
import br.ucsal.bes20231.poo.imobiliaria.persistence.ImovelDAO;

public class ImovelTUI {
	private static final String SAIDA = "saindo...";
	private static Scanner scanner = new Scanner(System.in);
	
	public static void executar() {
		ImovelEnum opcao;
		do {
			exibirMenu();
			opcao = selecionarOpcao();
			executarOpcao(opcao);
		}while(!opcao.equals(ImovelEnum.SAIR));
	}
	
	private static void exibirMenu() {
		for(ImovelEnum opcao : ImovelEnum.values()) {
			System.out.println(opcao.obterDescricaoCompleta());
			
		}
	}
	
	private static ImovelEnum selecionarOpcao() {
		ImovelEnum opcaoSelecionada;
		int opcaoSelecionadaInt;
		System.out.println("\nDigite o numero da sua escolha");
		opcaoSelecionadaInt = scanner.nextInt();
		scanner.nextLine();
		//Converter opcaoSelecionadaInt em opcaoSelecionada;
		opcaoSelecionada = ImovelEnum.valueOfCodigo(opcaoSelecionadaInt);
		return opcaoSelecionada;
		
	}
	
	
	private static void executarOpcao(ImovelEnum opcao) {
		switch (opcao) {
		case CADASTRAR_CASA: 
			cadastrarCasa();
			break;
		case CADASTRAR_APARTAMENTO:
			cadastrarApartamento();
			break;
		case EXIBIR_IMOVEIS_POR_CODIGO:
			exibirImoveisPorCodigo();
			break;
		case EXIBIR_IMOVEIS_POR_BAIRRO_VALOR:
			exibirImoveisPorBairroValor();
			break;
		case SAIR:
			System.out.println(SAIDA);

		}

	}
	

	private static void cadastrarCasa() {
		System.out.println("informe o codigo: ");
		Integer codigo = scanner.nextInt();
		scanner.nextLine();
		System.out.println("informe o endereco: ");
		String endereco = scanner.nextLine();
		System.out.println("informe o bairro: ");
		String bairro = scanner.nextLine();
		System.out.println("informe o valor da casa: ");
		Double valor = scanner.nextDouble();
		System.out.println("informe a area do terreno: ");
		Double areaTerreno = scanner.nextDouble();
		System.out.println("informe a area construida: ");
		Double areaConstruida = scanner.nextDouble();
		Casa casa = new Casa(codigo,endereco, bairro, valor, areaTerreno, areaConstruida);
		ImovelDAO.addCasa(casa);			
	}
	
	private static void cadastrarApartamento() {
		System.out.println("informe o codigo: ");
		Integer codigoAp = scanner.nextInt();
		scanner.nextLine();
		System.out.println("informe o endereco: ");
		String enderecoAp = scanner.nextLine();
		System.out.println("informe o bairro: ");
		String bairroAp = scanner.nextLine();
		System.out.println("informe o valor do apartamento: ");
		Double valorAp = scanner.nextDouble();
		System.out.println("informe a area de fracao ideal: ");
		Double areaFracao = scanner.nextDouble();
		System.out.println("informe a area privativa: ");
		Double areaPrivativa = scanner.nextDouble();
		Apartamento apartamento = new Apartamento(codigoAp,enderecoAp,bairroAp,valorAp,areaFracao,areaPrivativa);
		ImovelDAO.addApartamento(apartamento);
		
		
	}
	
	private static void exibirImoveisPorCodigo() {
		ImovelDAO.showImoveisPorCodigo();
		
	}
	
	private static void exibirImoveisPorBairroValor() {
		ImovelDAO.showImoveisPorBairroValor();
		
	}




	

}
