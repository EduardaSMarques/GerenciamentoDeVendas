package gerenciamento;

public class Estoque {
	
	public static Fornecedor fornec;
	private int quantidadeFornecida;
	private double precoDaQuantFornecida;
	private Produto[] produtosEstoque = new Produto[20];
	private int numProdutos = 0;
	static String nomeForn = fornec.getNome();
	static String nomeProd = fornec.getProdutoFornecido();
	
	public Estoque(String nom, String nomprod, int qantForn, double preQuantF) {
		nomeForn = nom;
		nomeProd = nomprod;
		quantidadeFornecida = qantForn;
		precoDaQuantFornecida = preQuantF;
	}

	public Estoque(Fornecedor forn, int qantForn, double preQuantF) {
		fornec = forn;
		quantidadeFornecida = qantForn;
		precoDaQuantFornecida = preQuantF;
	}
	
	public String toString() {
		return  "\nFornecedor: "+ nomeForn + "\nProduto:" + nomeProd +"\nQuantidade Fornecida: " + quantidadeFornecida 
				+ "\nPreço da quantidade fornecida: " + precoDaQuantFornecida;
	}
	
	public Produto[] getProdutosEstoque() {
		return produtosEstoque;
	}

	public void setProdutosEstoque(Produto[] produtosEstoque) {
		this.produtosEstoque = produtosEstoque;
	}

	public Fornecedor getFornec() {
		return fornec;
	}

	public void setFornec(Fornecedor fornecedor) {
		Estoque.fornec = fornecedor;
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
