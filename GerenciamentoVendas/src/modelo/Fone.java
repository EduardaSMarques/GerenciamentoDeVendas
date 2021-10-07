package modelo;

/**
 * Classe que cont�m as informa��es do fone
 * @author Maria Eduarda Barbosa e Maria Eduarda Marques
 * @version 1.0 (outubro 2021)
 */
public class Fone extends Produto {

	private int foneID;
	private String cor;
	private String textura;
	private String tipoDoFone;
	
	/**
	 * Construtor que cont�m todas as informa��es o fone ir� possuir
	 * @param id um int que cont�m o c�digo de identifica��o do fone
	 * @param nom uma string que cont�m o nome do fone 
	 * @param pre um double que cont�m o valor do fone
	 * @param mat uma string que cont�m o tipo de material do fone
	 * @param c uma string que cont�m a cor do fone
	 * @param tex uma string que cont�m a textura do fone
	 * @param tipFon uma string que cont�m o tipo de fonte do fone
	 * @param mod uma string que cont�m o modelo do fone
	 * @param des uma string que cont�m a descri��o do fone 
	 * @param cat uma string que cont�m a categoria do fone
	 */
	public Fone(int id, String nom, Double pre, String mat, String c, String tex, String tipFon, String mod, String des, String cat) {
		foneID = id;
		nome = nom;
		preco = pre;
		material = mat;
		cor = c;
		textura = tex;
		tipoDoFone = tipFon;
		modelo = mod;
		descricao = des;
		categoria = cat;
	}
	
	/**
	 * Construtor resuzido que cont�m apenas as informa��es essenciais para a venda do fone
	 * @param id um int que cont�m o c�digo de identifica��o do fone
	 * @param nom uma string que cont�m o nome do fone
	 * @param pre um double que cont�m o valor do fone
	 * @param cat uma string que cont�m a categoria do fone
	 */
	public Fone(int id, String nom, Double pre, String cat) {
		foneID = id;
		nome = nom;
		preco = pre;
		categoria = cat;
	}
	
	/**
	 * M�todo que retorna uma string com todas as informa��es essenciais contidas no objeto 
	 * @return string que cont�m as  informa��es essenciais 
	 */
	public String toStringReduzido() {
		return "\nID: " + foneID + "\nNome da Capa: " + nome + "\nPre�o: " + preco 
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
	
	public int getFoneID() {
		return foneID;
	}

	public void setFoneID(int foneID) {
		this.foneID = foneID;
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

	public String getTipoDoFone() {
		return tipoDoFone;
	}

	public void setTipoDoFone(String tipoDoFone) {
		this.tipoDoFone = tipoDoFone;
	}
	
}
