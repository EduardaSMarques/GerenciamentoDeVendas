package modelo;

/**
 * Classe que cont�m as informa��es do carregador
 * @author Maria Eduarda Barbosa e Maria Eduarda Marques
 * @version 1.0 (outubro 2021)
 */
public class Carregador extends Produto {

	private int carregadorID;
	private String cor;
	private String potencia;
	private String tipoDeEntrada;

	/**
	 * Construtor que cont�m todas as informa��es o carregador ir� possuir
	 * @param id um int que cont�m o c�digo de identifica��o do carregador
	 * @param nom uma string que cont�m o nome do carregador 
	 * @param pre um double que cont�m o valor do carregador
	 * @param mat uma string que cont�m o tipo de material do carregador
	 * @param c uma string que cont�m a cor do carregador
	 * @param pot uma string que cont�m a pot�ncia do carregador 
	 * @param tipEnt uma string que cont�m o tipo de entrada do carregador
	 * @param mod uma string que cont�m o modelo do carregador
	 * @param des uma string que cont�m a descri��o do carregador
	 * @param cat uma string que cont�m a categoria do carregador 
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
	 * Construtor resuzido que cont�m apenas as informa��es essenciais para a venda do carregador
	 * @param id um int que cont�m o c�digo de identifica��o do carregador
	 * @param nom uma string que cont�m o nome do carregador 
	 * @param pre um double que cont�m o valor do carregador
	 * @param cat uma string que cont�m a categoria do carregador 
	 */
	public Carregador(int id, String nom, Double pre, String cat) {
		carregadorID = id;
		nome = nom;
		preco = pre;
		categoria = cat;
	}
	
	/**
	 * M�todo que retorna uma string com todas as informa��es essenciais contidas no objeto 
	 * @return string que cont�m as  informa��es essenciais 
	 */
	public String toStringReduzido() {
		return "\nID: " + carregadorID + "\nNome da Capa: " + nome + "\nPre�o: " + preco 
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
