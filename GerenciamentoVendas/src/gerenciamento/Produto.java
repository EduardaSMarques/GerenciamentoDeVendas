package gerenciamento;

public abstract class Produto {
	
	protected String nome;
	protected Double preco;
	protected String material;
	protected String modelo;
	protected String descricao;
	protected String categoria;
	private Fornecedor fornecedor;
	private Estoque[] produtosEstoque = new Estoque[20];
	private int numProdutos = 0;
	
	public Estoque[] getProdutosEstoque() {
		return produtosEstoque;
	}

	public void setProdutosEstoque(Estoque[] produtosEstoque) {
		this.produtosEstoque = produtosEstoque;
	}	

	public int getNumProdutos() {
		return numProdutos;
	}

	public void setNumProdutos(int numProdutos) {
		this.numProdutos = numProdutos;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	public String mostraEstoque() {
		String mostra = "============== ESTOQUE ============== \n" ;
		for(int i = 0; i < numProdutos; i++) {
			System.out.println(i);
			mostra = mostra + "\n"+ produtosEstoque[i].toString();
		}
		return mostra;
	}

}
