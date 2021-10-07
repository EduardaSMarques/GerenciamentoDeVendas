package modelo;

/**
 * Classe que contém as informações da capa
 * @author Maria Eduarda Barbosa e Maria Eduarda Marques
 * @version 1.0 (outubro 2021)
 */
public class Capa extends Produto {

	private int capaID;
	private String cor;
	private String textura;

	/**
	 * Construtor que contém todas as informações a capa irá possuir
	 * @param id um int que contém o código de identificação da capa
	 * @param nom uma string que contém o nome da capa
	 * @param pre um double que contém o valor da capa
	 * @param mat uma string que contém o tipo de material da capa 
	 * @param c uma string que contém a cor da capa
	 * @param tex uma string que contém a textura da capa 
	 * @param mod uma string que contém o modelo da capa
	 * @param des uma string que contém a descrição da capa
	 * @param cat uma string que contém a categoria da capa 
	 */
	public Capa(int id, String nom, Double pre, String mat, String c, String tex, String mod, String des, String cat) {
		capaID = id;
		nome = nom;
		preco = pre;
		material = mat;
		cor = c;
		textura = tex;
		modelo = mod;
		descricao = des;
		categoria = cat;
	}
	
	/**
	 * Construtor resuzido que contém apenas as informações essenciais para a venda da capa 
	 * @param id um int que contém o código de identificação da capa
	 * @param nom uma string que contém o nome da capa
	 * @param pre um double que contém o valor da capa
	 * @param cat uma string que contém a categoria da capa
	 */
	public Capa(int id, String nom, Double pre, String cat) {
		capaID = id;
		nome = nom;
		preco = pre;
		categoria = cat;
	}
	
	/**
	 * Método que retorna uma string com todas as informações essenciais contidas no objeto 
	 * @return string que contém as  informações essenciais 
	 */
	public String toStringReduzido() {
		return "\nID: " + capaID + "\nNome da Capa: " + nome + "\nPreço: " + preco 
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

	public int getCapaID() {
		return capaID;
	}

	public void setCapaID(int capaID) {
		this.capaID = capaID;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTextura() {
		return textura;
	}

	public void setTextura(String textura) {
		this.textura = textura;
	}

}
