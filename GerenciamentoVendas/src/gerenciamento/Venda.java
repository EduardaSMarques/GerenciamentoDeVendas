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
	private int desconto;
	private int valorTotal;
	private Date data;
	private List<Produto> produtos;
	static Double soma = (double) 0;
	// static int numAddcarrinho = 0;
	// static String nomesAddnoCarrinho[] = null;
	
	public Venda() {
		produtos = new ArrayList<Produto>();
	}
	
	public Venda(Funcionario fun, Cliente cli,List<Produto> produto, Produto prod, String forPaga, int quantP, int des, int vt, Date d) {
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
	
	// public String toString() {
	// return "\nNome: "+ nomesAddnoCarrinho;
	// }
	
	// public static String carrinhoCompra(String nome) {
	// String mostra = "***** Lista de produtos add no carrinho ***** \n";
	// for(int i = 0; i < numAddcarrinho; i++) {
	// System.out.println(i);
	// mostra = mostra + "\n"+ nomesAddnoCarrinho[i].toString();
	// }
	// return mostra;
	// }
	
	public static String somaDosPrecos(Double preco) {
		soma = soma + preco;
		DecimalFormat df = new DecimalFormat("#.00");
		return df.format(soma);
	}
	
	public String mostrarProdutos() {
		return "=============== PRODUTOS ===============\n"
				+ getProdutos();
	}	

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
}
