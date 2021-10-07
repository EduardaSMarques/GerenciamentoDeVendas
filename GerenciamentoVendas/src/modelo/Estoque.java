package modelo;

/**
 * Classe que contém as informações do estoque
 * @author Maria Eduarda Barbosa e Maria Eduarda Marques
 * @version 1.0 (outubro 2021)
 */
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
	
	/**
	 * Construtor que contém informações que o estoque irá possuir
	 * @param cat uma string que contém a categoria do produto
	 * @param nom uma string que contém o nome do produto
	 * @param qantForn um int que contém a quantidade fornecida do produto
	 * @param preQuantF um double que contém o preço da quantidade fornecida do produto
	 */
	public Estoque(String cat, String nom, int qantForn, double preQuantF) {
		categoriaProd = cat;
		nomeProd = nom;
		quantidadeFornecida = qantForn;
		precoDaQuantFornecida = preQuantF;
	}
	
	public Capa[] getEstoqueCapas() {
		return estoqueCapas;
	}

	public void setEstoqueCapas(Capa[] estoqueCapas) {
		this.estoqueCapas = estoqueCapas;
	}
	
	/**
	 * Método que inclui capa no estoque
	 * @param c variável que contém a capa e seus dados a ser armazenado em uma posição 
	 * @param posicao variável que contém a posição da capa
	 */
	public void incluirProdtuEstoque(Capa c, int posicao) {
		this.estoqueCapas[posicao] = c;
	}

	public Carregador[] getEstoqueCarregadores() {
		return estoqueCarregadores;
	}

	public void setEstoqueCarregadores(Carregador[] estoqueCarregadores) {
		this.estoqueCarregadores = estoqueCarregadores;
	}
	
	/**
	 * Método que inclui carregador no estoque
	 * @param car variável que contém o carregador e seus dados a ser armazenado em uma posição
	 * @param posicao variável que contém a posição do carregador
	 */
	public void incluirProdtuEstoque(Carregador car, int posicao) {
		this.estoqueCarregadores[posicao] = car;
	}

	public Fone[] getEstoqueFones() {
		return estoqueFones;
	}

	public void setEstoqueFones(Fone[] estoqueFones) {
		this.estoqueFones = estoqueFones;
	}
	
	/**
	 * Método que inclui fone no estoque
	 * @param f variável que contém o fone e seus dados a ser armazenado em uma posição
	 * @param posicao variável que contém a posição do fone
	 */
	public void incluirProdtuEstoque(Fone f, int posicao) {
		this.estoqueFones[posicao] = f;
	}

	public Suporte[] getEstoqueSuportes() {
		return estoqueSuportes;
	}

	public void setEstoqueSuportes(Suporte[] estoqueSuportes) {
		this.estoqueSuportes = estoqueSuportes;
	}
	
	/**
	 * Método que inclui suporte no estoque
	 * @param s variável que contém o suporte e seus dados a ser armazenado em uma posição
	 * @param posicao variável que contém a posição do suporte
	 */
	public void incluirProdtuEstoque(Suporte s, int posicao) {
		this.estoqueSuportes[posicao] = s;
	}
	
	public Pelicula[] getEstoquePeliculas() {
		return estoquePeliculas;
	}

	public void setEstoquePeliculas(Pelicula[] estoquePeliculas) {
		this.estoquePeliculas = estoquePeliculas;
	}
	
	/**
	 * Método que inclui pelicula no estoque
	 * @param p variável que contém a pelicula e seus dados a ser armazenado na posição
	 * @param posicao variável que contém a posição da pelicula
	 */
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
