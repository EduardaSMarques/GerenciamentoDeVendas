package gerenciamento;

public class Fornecedor {
	
	private Produto produto;
	private String nome;
	private int telefone;
	private String endereco;
	private String cnpj;
	private String email;
	private String produtoFornecido;
	
	public Fornecedor() {
		
	}
	
	public Fornecedor(String nom, int tel, String end, String c, String em, String prodForn) {
		nome = nom;
		telefone = tel;
		endereco = end;
		cnpj = c;
		email = em;
		produtoFornecido = prodForn;
	}
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProdutoFornecido() {
		return produtoFornecido;
	}

	public void setProdutoFornecido(String produtoFornecido) {
		this.produtoFornecido = produtoFornecido;
	}
	
	//funcionalidades
	public void buscaFuncionario() {
		
	}
	
	public String toString() {
		return  "\nNome do Fornecedor: "+ nome + "\nTelefone: " + telefone 
				+ "\nEndereço: " + endereco + "\nCNPJ: " + cnpj 
				+ "\nE-mail: " + email + "\nProduto Fornecido: " + produtoFornecido;
	}	

}
