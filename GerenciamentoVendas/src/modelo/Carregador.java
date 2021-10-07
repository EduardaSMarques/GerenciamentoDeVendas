package modelo;

/**
 * Classe que contém as informações do carregador
 * @author Maria Eduarda Barbosa e Maria Eduarda Marques
 * @version 1.0 (outubro 2021)
 */
public class Carregador extends Produto {

	private int carregadorID;
	private String cor;
	private String potencia;
	private String tipoDeEntrada;

	/**
	 * Construtor que contém todas as informações o carregador irá possuir
	 * @param id um int que contém o código de identificação do carregador
	 * @param nom uma string que contém o nome do carregador 
	 * @param pre um double que contém o valor do carregador
	 * @param mat uma string que contém o tipo de material do carregador
	 * @param c uma string que contém a cor do carregador
	 * @param pot uma string que contém a potência do carregador 
	 * @param tipEnt uma string que contém o tipo de entrada do carregador
	 * @param mod uma string que contém o modelo do carregador
	 * @param des uma string que contém a descrição do carregador
	 * @param cat uma string que contém a categoria do carregador 
	 */
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
	
	/**
	 * Construtor resuzido que contém apenas as informações essenciais para a venda do carregador
	 * @param id um int que contém o código de identificação do carregador
	 * @param nom uma string que contém o nome do carregador 
	 * @param pre um double que contém o valor do carregador
	 * @param cat uma string que contém a categoria do carregador 
	 */
	public Carregador(int id, String nom, Double pre, String cat) {
		carregadorID = id;
		nome = nom;
		preco = pre;
		categoria = cat;
	}
	
	/**
	 * Método que retorna uma string com todas as informações essenciais contidas no objeto 
	 * @return string que contém as  informações essenciais 
	 */
	public String toStringReduzido() {
		return "\nID: " + carregadorID + "\nNome da Capa: " + nome + "\nPreço: " + preco 
				+ "\nCategoria: " + categoria;
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
