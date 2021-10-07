package modelo;

/**
 * Classe que contém as informações da pelicula
 * @author Maria Eduarda Barbosa e Maria Eduarda Marques
 * @version 1.0 (outubro 2021)
 */
public class Pelicula extends Produto {
	
	private int peliculaID;
	private String textura;

	/**
	 * Construtor que contém todas as informações a pelicula irá possuir
	 * @param id um int que contém o código de identificação da pelicula
	 * @param nom uma string que contém o nome da pelicula 
	 * @param pre um double que contém o valor da pelicula
	 * @param mat uma string que contém o tipo de material da pelicula
	 * @param tex uma string que contém a textura da pelicula
	 * @param mod uma string que contém o modelo da pelicula
	 * @param des uma string que contém a descrição da pelicula
	 * @param cat uma string que contém a categoria da pelicula
	 */
	public Pelicula(int id, String nom, Double pre, String mat, String tex, String mod, String des, String cat) {	
		peliculaID = id;
		nome = nom;
		preco = pre;
		material = mat;
		textura = tex;
		modelo = mod;
		descricao = des;
		categoria = cat;
	}
	
	/**
	 * Construtor resuzido que contém apenas as informações essenciais para a venda da pelicula
	 * @param id um int que contém o código de identificação da pelicula
	 * @param nom uma string que contém o nome da pelicula
	 * @param pre um double que contém o valor da pelicula
	 * @param cat uma string que contém a categoria da pelicula
	 */
	public Pelicula(int id, String nom, Double pre, String cat) {
		peliculaID = id;
		nome = nom;
		preco = pre;
		categoria = cat;
	}
	
	/**
	 * Método que retorna uma string com todas as informações essenciais contidas no objeto 
	 * @return string que contém as  informações essenciais 
	 */
	public String toStringReduzido() {
		return "\nID: " + peliculaID + "\nNome da Capa: " + nome + "\nPreço: " + preco 
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
	
	public int getPeliculaID() {
		return peliculaID;
	}

	public void setPeliculaID(int peliculaID) {
		this.peliculaID = peliculaID;
	}
	
	public String getTextura() {
		return textura;
	}

	public void setTextura(String textura) {
		this.textura = textura;
	}

}
