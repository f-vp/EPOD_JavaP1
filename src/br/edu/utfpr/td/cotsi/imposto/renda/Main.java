package br.edu.utfpr.td.cotsi.imposto.renda;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Contribuinte individuo = new Contribuinte();
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Programa avancado para Calcular Imposto de Renda");
		System.out.println("================================================");
		
		
		
		System.out.println("Informe o nome do contribuinte: ");
		individuo.setNome(scn.nextLine());
		System.out.println("Informe o CPF do contribuinte: ");
		individuo.setCpf(scn.nextLine());
		System.out.println("Informe a renda anual: ");
		individuo.setRendaAnual(Double.parseDouble(scn.nextLine()));
		
		System.out.println("Estado Civil (C=casado ou S=solteiro): ");
		individuo.setEstadoCivil(scn.next().charAt(0));
		
		System.out.println("Tem Filho (sim ou nao): ");
		String filho = scn.nextLine();
		if(filho == "sim")individuo.setTemFilho(true);
		
		
		System.out.println(individuo.getNome());
		System.out.println(individuo.getCpf());
		System.out.println(individuo.getRendaAnual());
		System.out.println(individuo.getEstadoCivil());
		System.out.println(individuo.getTemFilho());
		
		System.out.println("Deseja declarar patrimonio (sim ou nao)");
		//String temPatrimonio = scn.nextLine()
		//individuo.setListaPatrimonio(scn.nextLine());
		//if(temPatrimonio.equalsIgnoreCase("sim")) {
		//	System.out.println("Informe o valor do patrimonio: ");
			
		//}
		
		System.out.println("Informe uma descricao do patrimonio: ");
		
		System.out.println("Informe o valor do patrimonio: ");
		System.out.println("Calculando imposto de renda de xx com CPF:xx casado(a) com filho, e renda anual de xx");
		System.out.println("Lista de patrimônio: ");
		System.out.println("1- casa no valor de ");
		System.out.println("2- carro no valor de ");
		System.out.println("O imposto total aplicado é ");
		System.out.println("O Valor total devido do patrimonio é ");
		System.out.println("O Valor total devido é ");
		System.out.println("Lista de patrimônio: ");
	}
}
