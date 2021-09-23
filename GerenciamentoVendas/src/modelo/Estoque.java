package modelo;

public class Estoque {
	
	private String categoriaProd;
	private int quantidadeFornecida;
	private double precoDaQuantFornecida;
	private String nomeProd;
	private Capa[] estoqueCapas = new Capa[20];
	private Carregador[] estoqueCarregadores = new Carregador[20];
	private Fone[] estoqueFones = new Fone[20];
	private Suporte[] estoqueSuportes = new Suporte[20];
	private Pelicula[] estoquePeliculas = new Pelicula[20];
	
	private int numProdutos = 0;
	
	public Estoque(String nom, int qantForn, double preQuantF) {
		nomeProd = nom;
		quantidadeFornecida = qantForn;
		precoDaQuantFornecida = preQuantF;
	}
	
	public String toString() {
		return  "\nQuantidade Fornecida: " + quantidadeFornecida 
				+ "\nPreço da quantidade fornecida: " + precoDaQuantFornecida;
	}
	
	public Capa[] getEstoqueCapas() {
		return estoqueCapas;
	}

	public void setEstoqueCapas(Capa[] estoqueCapas) {
		this.estoqueCapas = estoqueCapas;
	}
	
	public void incluirProdtuEstoque(Capa c, int posicao) {
		this.estoqueCapas[posicao] = c;
	}

	public Carregador[] getEstoqueCarregadores() {
		return estoqueCarregadores;
	}

	public void setEstoqueCarregadores(Carregador[] estoqueCarregadores) {
		this.estoqueCarregadores = estoqueCarregadores;
	}
	
	public void incluirProdtuEstoque(Carregador car, int posicao) {
		this.estoqueCarregadores[posicao] = car;
	}

	public Fone[] getEstoqueFones() {
		return estoqueFones;
	}

	public void setEstoqueFones(Fone[] estoqueFones) {
		this.estoqueFones = estoqueFones;
	}
	
	public void incluirProdtuEstoque(Fone f, int posicao) {
		this.estoqueFones[posicao] = f;
	}

	public Suporte[] getEstoqueSuportes() {
		return estoqueSuportes;
	}

	public void setEstoqueSuportes(Suporte[] estoqueSuportes) {
		this.estoqueSuportes = estoqueSuportes;
	}

	public void incluirProdtuEstoque(Suporte s, int posicao) {
		this.estoqueSuportes[posicao] = s;
	}
	
	public Pelicula[] getEstoquePeliculas() {
		return estoquePeliculas;
	}

	public void setEstoquePeliculas(Pelicula[] estoquePeliculas) {
		this.estoquePeliculas = estoquePeliculas;
	}
	
	public void incluirProdtuEstoque(Pelicula p, int posicao) {
		this.estoquePeliculas[posicao] = p;
	}
	
	public String getCategoriaProd() {
		return categoriaProd;
	}

	public void setCategoriaProd(String categoriaProd) {
		this.categoriaProd = categoriaProd;
	}
	
	public int getQuantidadeFornecida() {
		return quantidadeFornecida;
	}

	public void setQuantidadeFornecida(int quantidadeFornecida) {
		this.quantidadeFornecida = quantidadeFornecida;
	}

	public double getPrecoDaQuantFornecida() {
		return precoDaQuantFornecida;
	}

	public void setPrecoDaQuantFornecida(double precoDaQuantFornecida) {
		this.precoDaQuantFornecida = precoDaQuantFornecida;
	}
	public String getNomeProd() {
		return nomeProd;
	}

	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}

	public int getNumProdutos() {
		return numProdutos;
	}

	public void setNumProdutos(int numProdutos) {
		this.numProdutos = numProdutos;
	}

}
