package br.edu.utfpr.td.cotsi.imposto.renda;

public class Contribuinte {
	private String nome;
	private String cpf;
	private double rendaAnual;
	private char estadoCivil;
	private boolean temFilho;
	private Patrimonio[] listaPatrimonio = new Patrimonio[10];
	private int indexListaPatrimonio = 0;
	
	public void cadastrarPatrimonio(Patrimonio p){
		if(indexListaPatrimonio <= 9) {
			listaPatrimonio[indexListaPatrimonio] = p;
			//indexListaPatrimonio++
		} else {
			System.out.println("Lista de patrimonio esgotada");
		}
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
		this.rendaAnual = rendaAnual;
	}

	public char getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(char estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	public boolean getTemFilho() {
		return temFilho;
	}
	public void setTemFilho(boolean temFilho) {
		this.temFilho = temFilho;
	}
	
	public Patrimonio[] getListaPatrimonio() {
		return listaPatrimonio;
	}
	public void setListaPatrimonio(Patrimonio[] listaPatrimonio) {
		this.listaPatrimonio = listaPatrimonio;
	}
	
	
	
	
}
