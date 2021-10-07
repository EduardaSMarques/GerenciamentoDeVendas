package modelo;

/**
 * Classe que cont�m as informa��es sobre a venda
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
	 * Construtor que cont�m informa��es que o cliente ir� possuir	
	 * @param fun � uma vari�vel que cont�m a classe funcionario
	 * @param cli � uma vari�vel que cont�m a classe cliente
	 * @param forPaga string que cont�m a forma de pagamento
	 * @param quantP um int que cont�m a quandidade de produto vendida
	 * @param des um double que cont�m o valor do desconto
	 * @param vt um int que cont�m o valor total da compra 
	 * @param d vari�vel que cont�m a data da compra 
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
