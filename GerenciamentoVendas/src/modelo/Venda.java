package modelo;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venda {
	
	private Funcionario funcio;
	private Estoque estoq;
	private Cliente client;
	private String formaPaga;
	private int quantProduto;
	private Double desconto;
	private int valorTotal;
	private Date data;
	static Double soma = (double) 0;
	
	public Venda(Funcionario fun, Cliente cli, String forPaga, int quantP, Double des, int vt, Date d) {
		funcio = fun;
		client = cli;
		formaPaga = forPaga;
		quantProduto = quantP;
		desconto = des;
		valorTotal = vt;
		data = d;
	}
	
	public Funcionario getFuncio() {
		return funcio;
	}

	public void setFuncio(Funcionario funcio) {
		this.funcio = funcio;
	}

	public Estoque getEstoq() {
		return estoq;
	}

	public void setEstoq(Estoque estoq) {
		this.estoq = estoq;
	}
	
	public Cliente getClient() {
		return client;
	}

	public void setClient(Cliente client) {
		this.client = client;
	}
	
	public String getFormaPaga() {
		return formaPaga;
	}

	public void setFormaPaga(String formaPaga) {
		this.formaPaga = formaPaga;
	}

	public int getQuantProduto() {
		return quantProduto;
	}

	public void setQuantProduto(int quantProduto) {
		this.quantProduto = quantProduto;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public int getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(int valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	public static String somaDosPrecos(Double preco) {
		soma = soma + preco;
		DecimalFormat df = new DecimalFormat("#.00");
		return df.format(soma);
	}
	
	public static String valorTotalComDesconto(Double valorDescont) {
		soma = soma - valorDescont;
		DecimalFormat df = new DecimalFormat("#.00");
		return df.format(soma);
	}	
	
}