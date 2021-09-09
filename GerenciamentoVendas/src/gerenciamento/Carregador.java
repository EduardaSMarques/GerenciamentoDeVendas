package gerenciamento;

public class Carregador extends Produto {

	private int carregadorID;
	private String cor;
	private String potencia;
	private String tipoDeEntrada;

	// Sobrecarga
	public Carregador(int id, String nom, Double pre, String mat, String c, String pot, String tipEnt, String mod,
			String des, String cat) {
		carregadorID = id;
		nome = nom;
		preco = pre;
		material = mat;
		cor = c;
		potencia = pot;
		tipoDeEntrada = tipEnt;
		modelo = mod;
		descricao = des;
		categoria = cat;
	}

	public Carregador(int id, String nom, Double pre, String cat) {
		carregadorID = id;
		nome = nom;
		preco = pre;
		categoria = cat;
	}

	public String toString() {
		return "\nID: " + carregadorID + "\nNome do Carregador: " + nome + "\nPreço: " + preco + "\nMaterial: "
				+ material + "\nCor: " + cor + "\nPotencia: " + potencia + "\nTipo de Entrada: " + tipoDeEntrada
				+ "\nModelo: " + modelo + "\nDescrição: " + descricao + "\nCategoria: " + categoria;
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

	public int getCarregadorID() {
		return carregadorID;
	}

	public void setCarregadorID(int carregadorID) {
		this.carregadorID = carregadorID;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}

	public String getTipoDeEntrada() {
		return tipoDeEntrada;
	}

	public void setTipoDeEntrada(String tipoDeEntrada) {
		this.tipoDeEntrada = tipoDeEntrada;
	}

}
