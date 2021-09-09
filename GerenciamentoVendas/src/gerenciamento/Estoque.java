package gerenciamento;

public class Estoque {
	
	public static Fornecedor fornec;
	private int quantidadeFornecida;
	private double precoDaQuantFornecida;
	static String nomeForn = fornec.getNome();
	static String nomeProd = fornec.getProdutoFornecido();
	
	public Estoque(String nom, String nomprod, int qantForn, double preQuantF) {
		nomeForn = nom;
		nomeProd = nomprod;
		quantidadeFornecida = qantForn;
		precoDaQuantFornecida = preQuantF;
	}

	public String toString() {
		return  "\nFornecedor: "+ nomeForn + "\nProduto:" + nomeProd +"\nQuantidade Fornecida: " + quantidadeFornecida 
				+ "\nPreço da quantidade fornecida: " + precoDaQuantFornecida;
	}
	
	public Estoque(Fornecedor forn, int qantForn, double preQuantF) {
		fornec = forn;
		quantidadeFornecida = qantForn;
		precoDaQuantFornecida = preQuantF;
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

}
