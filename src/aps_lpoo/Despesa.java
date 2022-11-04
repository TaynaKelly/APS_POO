package aps_lpoo;


public class Despesa {
	String nome, descricao, tipo;
	int grauClassificacao;
	double valor, totalDespesa;
		
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
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
	
	public void setValor(float valor) {
		this.valor = valor;
	}
	

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getGrauClassificacao() {
		return grauClassificacao;
	}

	public void setGrauClassificacao(int grauClassificacao) {
		this.grauClassificacao = grauClassificacao;
	}

	public void informacoesDepesa() {
		System.out.println("\nNome: " + this.nome);
		System.out.println("Descrição: " + this.descricao);
		System.out.println("Valor: " + this.valor);
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Grau Classificação: " + this.grauClassificacao);
		
	}
	
	public void somaDespesas() {
		
		
	}
	
	
}
