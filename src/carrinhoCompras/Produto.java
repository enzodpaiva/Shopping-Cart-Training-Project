package carrinhoCompras;

import java.text.DecimalFormat;

public abstract class Produto {
	private String id;
	private String nome;
	private Double preco;
	private Double imposto;
	private String descricao;
	public static double totalImpostoValor;
	public static double totalValor;
	
	public Produto(String id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	static DecimalFormat deci = new DecimalFormat("0.00");
	
	public abstract void setCusto(int custo);
	
	public abstract double calcImposto(double precoFinal);
	
	public void exibe() {
		System.out.println( id + " | " + nome + " | " + descricao + " | " + deci.format( preco ) + " | " + deci.format( imposto ) );
		Produto.setTotalImpostoValor(imposto);
		Produto.setTotalValor(preco);
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public String getId() {
		return id;
	}

	public static void setTotalImpostoValor(double totalImpostoValor) {
		Produto.totalImpostoValor += totalImpostoValor;
	}

	public static void setTotalValor(double totalValor) {
		Produto.totalValor += totalValor;
	}

	public static String getTotalImpostoPorcentagem() {
		return deci.format( (Produto.totalImpostoValor * 100) / Produto.totalValor );
	}

	public static String getTotalImpostoValor() {
		return deci.format( Produto.totalImpostoValor );
	}

	public static String getTotalValor() {
		return deci.format( Produto.totalValor );
	}
}
