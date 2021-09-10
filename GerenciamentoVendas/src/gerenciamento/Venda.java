package gerenciamento;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venda {
	
	private Funcionario funcio;
	private Cliente client;
	private Produto produt;
	private String formaPaga;
	private int quantProduto;
	private Double desconto;
	private int valorTotal;
	private Date data;
	private List<Produto> produtos;
	static Double soma = (double) 0;
	
	public Venda() {
		setProdutos(new ArrayList<Produto>());
	}
	
	public Venda(Funcionario fun, Cliente cli,List<Produto> produto, Produto prod, String forPaga, int quantP, Double des, int vt, Date d) {
		funcio = fun;
		client = cli;
		produt = prod;
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

	public Cliente getClient() {
		return client;
	}

	public void setClient(Cliente client) {
		this.client = client;
	}
	
	public Produto getProdut() {
		return produt;
	}

	public void setProdut(Produto produt) {
		this.produt = produt;
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
	
	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
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
