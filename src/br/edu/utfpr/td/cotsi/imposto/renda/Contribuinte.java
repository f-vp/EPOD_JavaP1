package br.edu.utfpr.td.cotsi.imposto.renda;

import java.util.ArrayList;
import java.util.List;

public class Contribuinte {
    private String nome;
    private String cpf;
    private double rendaAnual;
    private boolean solteiro;
    private boolean dependentes;
    private List<Patrimonio> listaPatrimonio = new ArrayList<>();
    private double aliquota = 0.115;
    private double valorTotal = 0;
    private double valorPatrimonio = 0;

    public Contribuinte() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    //Cada chamada dos metodos set aumentamos a aliquota baseado nos dados do individuo
    public void setRendaAnual(double rendaAnual) {
        if (rendaAnual > 500000) this.aliquota += 0.095;

        else if (rendaAnual > 100000) this.aliquota += 0.075;

        else if (rendaAnual > 50000) this.aliquota += 0.065;

        this.rendaAnual = rendaAnual;
    }

    public boolean isSolteiro() {
        return solteiro;
    }

    public void setSolteiro(boolean solteiro) {
        if (solteiro) this.aliquota += 0.023;

        this.solteiro = solteiro;
    }

    public boolean isDependentes() {
        return dependentes;
    }

    public void setDependentes(boolean dependentes) {
        if (!dependentes) this.aliquota += 0.011;

        this.dependentes = dependentes;
    }

    public List<Patrimonio> getListaPatrimonio() {
        return listaPatrimonio;
    }

    // Aqui recebemos uma lista de patrimonios e somamos todos os valores dos tributos e colocamos na variavel listaPatrimonio
    public void setListaPatrimonio(List<Patrimonio> listaPatrimonio) {
        //forEach do Java, ele passa por cada elemento do listaPatrimonio e atribui esse valor a variavel p
        for (Patrimonio p : listaPatrimonio) {
            if (p.getValor() > 300000) this.valorPatrimonio += p.getValor() * 0.01;
        }

        this.listaPatrimonio = listaPatrimonio;
    }

    public double getAliquota() {
        return aliquota;
    }

    // Aqui calculamos o valor total devido para cada chamada do metodo getValorTotal
    public double getValorTotal() {
        valorTotal = this.aliquota * this.getRendaAnual() + getValorPatrimonio();

        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorPatrimonio() {
        return valorPatrimonio;
    }

    public void setValorPatrimonio(double valorPatrimonio) {
        this.valorPatrimonio = valorPatrimonio;
    }

    // Aqui voce pode gerar o metodo toString que é um metodo padrao do java para retornar os campos de um objeto
    @Override
    public String toString() {
        return "Contribuinte{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rendaAnual=" + rendaAnual +
                ", solteiro=" + solteiro +
                ", dependentes=" + dependentes +
                ", listaPatrimonio=" + listaPatrimonio.toString() +
                ", aliquota=" + getAliquota() +
                ", valorTotal=" + getValorTotal() +
                ", valorPatrimonio=" + getValorPatrimonio() +
                '}';
    }
}
