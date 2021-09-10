package gerenciamento;

public class Pelicula extends Produto {
	
	private int peliculaID;
	private String textura;

	// Sobrecarga
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
	
	public Pelicula(int id, String nom, Double pre, String cat) {
		peliculaID = id;
		nome = nom;
		preco = pre;
		categoria = cat;
	}
	
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
