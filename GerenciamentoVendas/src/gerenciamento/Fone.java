package gerenciamento;

public class Fone extends Produto {

	private int foneID;
	private String cor;
	private String textura;
	private String tipoDoFone;
	
	public Fone() {
		super();
	}
	
	public Fone(int id, String nom, double pre, String mat, String c, String tex, String tipFon, String mod, String des, String cat) {
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
	
	public String toString() {
		return  "\nID: "+ foneID + "\nNome do Fone: " + nome + "\nPreço: " + preco 
				+ "\nMaterial: " + material + "\nCor: " + cor + "\nTextura: " + textura 
				+ "\nTipo do Fone: " + tipoDoFone + "\nModelo: " + modelo 
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
