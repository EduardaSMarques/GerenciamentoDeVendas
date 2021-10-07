package modelo;

/**
 * Classe que contém as informações do suporte
 * @author Maria Eduarda Barbosa e Maria Eduarda Marques
 * @version 1.0 (outubro 2021)
 */
public class Suporte extends Produto {
	
	private int suporteID;
	private String cor;
	private String textura;
	private String tipoDoSuporte;
	private String tamanho;

	/**
	 * Construtor que contém todas as informações o suporte irá possuir
	 * @param id um int que contém o código de identificação do suporte
	 * @param nom uma string que contém o nome do suporte 
	 * @param pre um double que contém o valor do suporte
	 * @param mat uma string que contém o tipo de material do suporte
	 * @param c uma string que contém a cor do suporte
	 * @param tex uma string que contém a textura do suporte
	 * @param tipSup uma string que contém o tipo de suporte
	 * @param tam uma string que contém o tamanho de suporte
	 * @param mod uma string que contém o modelo do suporte
	 * @param des uma string que contém a descrição do suporte
	 * @param cat uma string que contém a categoria do suporte
	 */
	public Suporte(int id, String nom, Double pre, String mat, String c, String tex, String tipSup, String tam, String mod, String des, String cat) {
		suporteID = id;
		nome = nom;
		preco = pre;
		material = mat;
		cor = c;
		textura = tex;
		tipoDoSuporte = tipSup;
		tamanho = tam;
		modelo = mod;
		descricao = des;
		categoria = cat;
	}
	
	/**
	 * Construtor resuzido que contém apenas as informações essenciais para a venda do suporte
	 * @param id um int que contém o código de identificação do suporte
	 * @param nom uma string que contém o nome do suporte
	 * @param pre um double que contém o valor do suporte
	 * @param cat uma string que contém a categoria do suporte
	 */
	public Suporte(int id, String nom, Double pre, String cat) {
		suporteID = id;
		nome = nom;
		preco = pre;
		categoria = cat;
	}
	
	/**
	 * Método que retorna uma string com todas as informações essenciais contidas no objeto 
	 * @return string que contém as  informações essenciais 
	 */
	public String toStringReduzido() {
		return "\nID: " + suporteID + "\nNome da Capa: " + nome + "\nPreço: " + preco 
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
	
	public int getSuporteID() {
		return suporteID;
	}

	public void setSuporteID(int suporteID) {
		this.suporteID = suporteID;
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

	public String getTipoDoSuporte() {
		return tipoDoSuporte;
	}

	public void setTipoDoSuporte(String tipoDoSuporte) {
		this.tipoDoSuporte = tipoDoSuporte;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

}
