package modelo;

/**
 * Classe que cont�m as informa��es do suporte
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
	 * Construtor que cont�m todas as informa��es o suporte ir� possuir
	 * @param id um int que cont�m o c�digo de identifica��o do suporte
	 * @param nom uma string que cont�m o nome do suporte 
	 * @param pre um double que cont�m o valor do suporte
	 * @param mat uma string que cont�m o tipo de material do suporte
	 * @param c uma string que cont�m a cor do suporte
	 * @param tex uma string que cont�m a textura do suporte
	 * @param tipSup uma string que cont�m o tipo de suporte
	 * @param tam uma string que cont�m o tamanho de suporte
	 * @param mod uma string que cont�m o modelo do suporte
	 * @param des uma string que cont�m a descri��o do suporte
	 * @param cat uma string que cont�m a categoria do suporte
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
	 * Construtor resuzido que cont�m apenas as informa��es essenciais para a venda do suporte
	 * @param id um int que cont�m o c�digo de identifica��o do suporte
	 * @param nom uma string que cont�m o nome do suporte
	 * @param pre um double que cont�m o valor do suporte
	 * @param cat uma string que cont�m a categoria do suporte
	 */
	public Suporte(int id, String nom, Double pre, String cat) {
		suporteID = id;
		nome = nom;
		preco = pre;
		categoria = cat;
	}
	
	/**
	 * M�todo que retorna uma string com todas as informa��es essenciais contidas no objeto 
	 * @return string que cont�m as  informa��es essenciais 
	 */
	public String toStringReduzido() {
		return "\nID: " + suporteID + "\nNome da Capa: " + nome + "\nPre�o: " + preco 
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
