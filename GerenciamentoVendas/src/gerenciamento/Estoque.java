package gerenciamento;

public class Estoque {

	private String nomeProd;
	private int quantidadeFornecida;
	private double precoDaQuantFornecida;
	private Produto[] produtosEstoque = new Produto[20];
	private int numProdutos = 0;
	

	public Estoque(String nom, int qantForn, double preQuantF) {
		nomeProd = nom;
		quantidadeFornecida = qantForn;
		precoDaQuantFornecida = preQuantF;
	}
	
	public String toString() {
		return  "\nNome do Produto: " + nomeProd 
				+ "\nQuantidade Fornecida: " + quantidadeFornecida 
				+ "\nPreço da quantidade fornecida: R$ " + precoDaQuantFornecida;
	}
	
	public Produto[] getProdutosEstoque() {
		return produtosEstoque;
	}

	public void setProdutosEstoque(Produto[] produtosEstoque) {
		this.produtosEstoque = produtosEstoque;
	}
	
	public void incluirProdutosEstoque(Produto p, int posicao) {
		this.produtosEstoque[posicao] = p;
	}
	
	public String getNomeProd() {
		return nomeProd;
	}

	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}
	
	public int getQuantidadeFornecida() {
		return quantidadeFornecida;
	}

	public void setQuantidadeFornecida(int quantidadeFornecida) {
		this.quantidadeFornecida = quantidadeFornecida;
	}

	public double getPrecoDaQuantFornecida() {
		return precoDaQuantFornecida;
	}

	public void setPrecoDaQuantFornecida(double precoDaQuantFornecida) {
		this.precoDaQuantFornecida = precoDaQuantFornecida;
	}

	public int getNumProdutos() {
		return numProdutos;
	}

	public void setNumProdutos(int numProdutos) {
		this.numProdutos = numProdutos;
	}

}
