package gerenciamento;

public class Estoque {
	
	private String categoriaProduto;
	private String nomeProduto;
	private String fornecedor;
	private int quantidadeFornecida;
	private double precoDaQuantFornecida;

	public String getCategoriaProduto() {
		return categoriaProduto;
	}

	public void setCategoriaProduto(String categoriaProduto) {
		this.categoriaProduto = categoriaProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
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
