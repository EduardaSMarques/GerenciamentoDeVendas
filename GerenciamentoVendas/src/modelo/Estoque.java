package modelo;

/**
 * Classe que cont�m as informa��es do estoque
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
	 * Construtor que cont�m informa��es que o estoque ir� possuir
	 * @param cat uma string que cont�m a categoria do produto
	 * @param nom uma string que cont�m o nome do produto
	 * @param qantForn um int que cont�m a quantidade fornecida do produto
	 * @param preQuantF um double que cont�m o pre�o da quantidade fornecida do produto
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
	 * M�todo que inclui capa no estoque
	 * @param c vari�vel que cont�m a capa e seus dados a ser armazenado em uma posi��o 
	 * @param posicao vari�vel que cont�m a posi��o da capa
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
	 * M�todo que inclui carregador no estoque
	 * @param car vari�vel que cont�m o carregador e seus dados a ser armazenado em uma posi��o
	 * @param posicao vari�vel que cont�m a posi��o do carregador
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
	 * M�todo que inclui fone no estoque
	 * @param f vari�vel que cont�m o fone e seus dados a ser armazenado em uma posi��o
	 * @param posicao vari�vel que cont�m a posi��o do fone
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
	 * M�todo que inclui suporte no estoque
	 * @param s vari�vel que cont�m o suporte e seus dados a ser armazenado em uma posi��o
	 * @param posicao vari�vel que cont�m a posi��o do suporte
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
	 * M�todo que inclui pelicula no estoque
	 * @param p vari�vel que cont�m a pelicula e seus dados a ser armazenado na posi��o
	 * @param posicao vari�vel que cont�m a posi��o da pelicula
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
