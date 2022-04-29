package br.edu.utfpr.td.cotsi.imposto.renda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Contribuinte individuo = new Contribuinte();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa TOPPPPPPP para Calcular Imposto de Renda");
        System.out.println("================================================");


        System.out.println("Informe o nome do contribuinte: ");
        individuo.setNome(scanner.nextLine());
        System.out.println("Informe o CPF do contribuinte: ");
        individuo.setCpf(scanner.nextLine());
        System.out.println("Informe a renda anual: ");
        individuo.setRendaAnual(Double.parseDouble(scanner.nextLine()));

        System.out.println("Estado Civil (C=casado ou S=solteiro): ");
        individuo.setSolteiro(scanner.nextLine().equals("S")); //a função retorna true se a pessoa digitar S, e falso se digitar qualquer outra coisa

        System.out.println("Tem Filho (sim ou nao): ");
        individuo.setDependentes(scanner.nextLine().equals("sim")); //idem função anterior

        System.out.println("Deseja declarar patrimonio (sim ou nao)");

        List listaPatrimonio = new ArrayList<>();

        if (scanner.nextLine().equals("sim")) {
            System.out.println("teste");
            while (true) {
                Patrimonio patrimonio = new Patrimonio();

                System.out.println("Digite o tipo do patrimonio");
                patrimonio.setDescricao(scanner.nextLine());

                System.out.println("Digite o valor do patrimonio");
                patrimonio.setValor(Double.parseDouble(scanner.nextLine()));

                listaPatrimonio.add(patrimonio);

                System.out.println("Pressione qualquer tecla para declarar outro patrimonio, ou pressione Enter para continuar");
                if (scanner.nextLine().equals("")) break;
            }
        }

        individuo.setListaPatrimonio(listaPatrimonio);


        System.out.println(individuo);
    }
}
