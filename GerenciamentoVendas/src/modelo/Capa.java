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

	// Sobrecarga
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

	public Capa(int id, String nom, Double pre, String cat) {
		capaID = id;
		nome = nom;
		preco = pre;
		categoria = cat;
	}
	
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
