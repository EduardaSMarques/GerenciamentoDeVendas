package gerenciamento;

public class Pelicula extends Produto {
	
	private int peliculaID;
	private String textura;
	
	public Pelicula() {
		super();
	}

	public Pelicula(int id, String nom, double pre, String mat, String tex, String mod, String des, String cat) {	
		peliculaID = id;
		nome = nom;
		preco = pre;
		material = mat;
		textura = tex;
		modelo = mod;
		descricao = des;
		categoria = cat;
	}
	
	public String toString() {
		return  "\nID: "+ peliculaID + "\nNome da Película: " + nome + "\nPreço: " + preco 
				+ "\nMaterial: " + material + "\nTextura: " + textura + "\nModelo: " + modelo 
				+ "\nDescrição: " + descricao + "\nCategoria: " + categoria;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
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
