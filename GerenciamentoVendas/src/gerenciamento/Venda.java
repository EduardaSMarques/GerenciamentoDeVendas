package gerenciamento;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venda {
	
	private Funcionario funcio;
	private Cliente client;
	private Produto produt;
	private String formaPaga;
	private int quantProduto;
	private int desconto;
	private int valorTotal;
	private Date data;
	//private final List<Produto> produto;
	
	public Venda() {
		//this.produto = new ArrayList<>();
		
	}
	
	public Venda(Funcionario fun, Cliente cli,List<Produto> produto, Produto prod, String forPaga, int quantP, int des, int vt, Date d) {
		//this.produto = new ArrayList<>();
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

	public int getDesconto() {
		return desconto;
	}

	public void setDesconto(int desconto) {
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
	
	//funcionalidades
	public void buscaProdutoID(int i) {
		
	}
	
	public void addItem(int i) {
		
	}	
	
	public void totalCompra() {
		
	}

	//public List<Produto> getProduto() {
		//return produto;
	//}
	
}
