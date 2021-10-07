package modelo;

/**
 * Classe que contém as informações sobre a venda
 * @author Maria Eduarda Barbosa e Maria Eduarda Marques
 * @version 1.0 (outubro 2021)
 */
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
	
	/**
	 * Construtor que contém informações que o cliente irá possuir	
	 * @param fun é uma variável que contém a classe funcionario
	 * @param cli é uma variável que contém a classe cliente
	 * @param forPaga string que contém a forma de pagamento
	 * @param quantP um int que contém a quandidade de produto vendida
	 * @param des um double que contém o valor do desconto
	 * @param vt um int que contém o valor total da compra 
	 * @param d variável que contém a data da compra 
	 */
	public Venda(Funcionario fun, Estoque est, Cliente cli, String forPaga, int quantP, Double des, int vt, Date d) {
		funcio = fun;
		estoq = est;
		client = cli;
		formaPaga = forPaga;
		quantProduto = quantP;
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
	
}
