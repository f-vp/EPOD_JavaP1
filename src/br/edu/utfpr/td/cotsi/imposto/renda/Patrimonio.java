package br.edu.utfpr.td.cotsi.imposto.renda;

public class Patrimonio {
	private String descricao;
	private double valor;
	
	public Patrimonio(String descricao, double valor) {
		this.descricao = descricao;
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
