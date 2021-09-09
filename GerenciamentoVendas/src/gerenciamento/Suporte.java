package gerenciamento;

public class Suporte extends Produto {
	
	private int suporteID;
	private String cor;
	private String textura;
	private String tipoDoSuporte;
	private String tamanho;

	// Sobrecarga
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
	
	public Suporte(int id, String nom, Double pre, String cat) {
		suporteID = id;
		nome = nom;
		preco = pre;
		categoria = cat;
	}
	
	public String toString() {
		return  "\nID: "+ suporteID + "\nNome do Suporte: " + nome + "\nPreço: " + preco 
				+ "\nMaterial: " + material + "\nCor: " + cor + "\nTextura: " + textura 
				+ "\nTipo do Suporte: " + tipoDoSuporte + "\nTamanho: " + tamanho + "\nModelo: " + modelo 
				+ "\nDescrição: " + descricao + "\nCategoria: " + categoria;
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
