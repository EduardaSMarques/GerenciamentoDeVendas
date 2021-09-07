package gerenciamento;

public class Fornecedor {
	
	private Estoque est;
	private String nome;
	private int telefone;
	private String endereco;
	private String cnpj;
	private String email;
	private String produtoFornecido;
	
	public Fornecedor(String nom, int tel, String end, String c, String em, String prodForn) {
		nome = nom;
		telefone = tel;
		endereco = end;
		cnpj = c;
		email = em;
		produtoFornecido = prodForn;
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

	public Estoque getEst() {
		return est;
	}

	public void setEst(Estoque est) {
		this.est = est;
	}

}
