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

    public void setListaPatrimonio(List<Patrimonio> listaPatrimonio) {
        for (Patrimonio p : listaPatrimonio) {
            if (p.getValor() > 300000) this.valorPatrimonio += p.getValor() * 0.01;
        }

        this.listaPatrimonio = listaPatrimonio;
    }

    public double getAliquota() {
        return aliquota;
    }

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
