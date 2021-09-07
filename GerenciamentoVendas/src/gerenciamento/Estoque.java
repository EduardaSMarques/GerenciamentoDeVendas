package gerenciamento;

public class Estoque {
	
	private Fornecedor fornec;
	private int quantidadeFornecida;
	private double precoDaQuantFornecida;
	
	public Estoque() {
		
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
		this.fornec = fornecedor;
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
	
	//funcionalidades
	public void buscaProduto() {

	}
		
	public String toString() {
		return  "\nFornecedor: "+ fornec + "\nQuantidade Fornecida: " + quantidadeFornecida 
				+ "\nPreço da quantidade fornecida: " + precoDaQuantFornecida;
	}	

}
