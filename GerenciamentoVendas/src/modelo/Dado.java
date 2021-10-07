package modelo;

/**
 * Classe que armazena dados de todas as classes do pacote modelo (exceto os dados de venda)
 * @author Maria Eduarda Barbosa e Maria Eduarda Marques
 * @version 1.0 (outubro 2021)
 */
public class Dado {

	private Capa[] capas = new Capa[20];
	private int qtdCapas = 0;
	private Carregador[] carregadores = new Carregador[20];
	private int qtdCarregadores = 0;
	private Fone[] fones = new Fone[20];
	private int qtdFones = 0;
	private Pelicula[] peliculas = new Pelicula[20];
	private int qtdPeliculas = 0;
	private Suporte[] suportes = new Suporte[20];
	private int qtdSuportes = 0;
	private Estoque[] estoques = new Estoque[20];
	private int qtdEstoques = 0;
	private Funcionario[] funcionarios = new Funcionario[20];
	private int qtdFuncionarios = 0;
	private Cliente[] clientes = new Cliente[20];
	private int qtdClientes = 0;
	
	/**
	 * Método utilizado para criar dados aleatórios que serão usados para demonstrar o funcionamento do software
	 */
	public void preenchendoComDadosAleatorios() {
		for (int i = 0; i < 6; i++) {

			capas[i] = new Capa((i + 1) * 112233, "Capa" + i, (i + 1) * 50.00, "material" + i, "cor" + i, "textura" + i,
					"modelo" + i, "descricao" + i, "categoria" + i);
			carregadores[i] = new Carregador((i + 1) * 113322, "carregador" + i, (i + 1) * 50.00, "material" + i,
					"cor" + i, "potencia" + i, "tipoDeEntrada" + i, "modelo" + i, "descricao" + i, "categoria" + i);
			fones[i] = new Fone((i + 1) * 221133, "Fone" + i, (i + 1) * 50.00, "material" + i, "cor" + i, "textura" + i,
					"tipoDoFone" + i, "modelo" + i, "descricao" + i, "categoria" + i);
			peliculas[i] = new Pelicula((i + 1) * 223311, "Pelicula" + i, (i + 1) * 50.00, "material" + i,
					"textura" + i, "modelo" + i, "descricao" + i, "categoria" + i);
			suportes[i] = new Suporte((i + 1) * 332211, "Suporte" + i, (i + 1) * 50.00, "material" + i, "cor" + i,
					"textura" + i, "tipoDoSuporte" + i, "tamanho" + i, "modelo" + i, "descricao" + i, "categoria" + i);
			estoques[i] = new Estoque("Categoria" + i, "Produto" + i, (i + 1) * 20, (i + 1) * 50.00);
			funcionarios[i] = new Funcionario("Funcionario" + i, (i + 1) * 200000000, "email" + i, "endereco" + i,
					(i + 1) * 1000);
			clientes[i] = new Cliente((i + 1) * 331122, "Cliente" + i, "numCPF" + i, (i + 1) * 300000000, "email" + i,
					"genero" + i);

		}
		qtdCapas = 6;
		qtdCarregadores = 6;
		qtdFones = 6;
		qtdPeliculas = 6;
		qtdSuportes = 6;
		qtdEstoques = 6;
		qtdFuncionarios = 6;
		qtdClientes = 6;

	}

	public Capa[] getCapas() {
		return capas;
	}

	public void setCapas(Capa[] capas) {
		this.capas = capas;
	}
	
	/**
	 * Método que vai inserir e editar capas no sistema.
	 * @param cp variável que contém a capa e seus dados a ser armazenado em uma posição
	 * @param pos variável que contém a posição da capa
	 */
	public void inserirEditarCapa(Capa cp, int pos) {
		this.capas[pos] = cp;
		if (pos == qtdCapas)
			qtdCapas++;
	}

	public int getQtdCapas() {
		return qtdCapas;
	}

	public void setQtdCapas(int qtdCapas) {
		this.qtdCapas = qtdCapas;
	}

	public Carregador[] getCarregadores() {
		return carregadores;
	}

	public void setCarregadores(Carregador[] carregadores) {
		this.carregadores = carregadores;
	}
	
	/**
	 * Método que vai inserir e editar carregadores no sistema.
	 * @param cg variável que contém o carregador e seus dados a ser armazenado em uma posição 
	 * @param pos variável que contém a posição do carregador
	 */
	public void inserirEditarCarregador(Carregador cg, int pos) {
		this.carregadores[pos] = cg;
		if (pos == qtdCarregadores)
			qtdCarregadores++;
	}

	public int getQtdCarregadores() {
		return qtdCarregadores;
	}

	public void setQtdCarregadores(int qtdCarregadores) {
		this.qtdCarregadores = qtdCarregadores;
	}

	public Fone[] getFones() {
		return fones;
	}

	public void setFones(Fone[] fones) {
		this.fones = fones;
	}
	
	/**
	 * Método que vai inserir e editar fones no sistema.
	 * @param f variável que contém o fone e seus dados a ser armazenado em uma posição
	 * @param pos variável que contém a posição do fone
	 */
	public void inserirEditarFone(Fone f, int pos) {
		this.fones[pos] = f;
		if (pos == qtdFones)
			qtdFones++;
	}

	public int getQtdFones() {
		return qtdFones;
	}

	public void setQtdFones(int qtdFones) {
		this.qtdFones = qtdFones;
	}

	public Pelicula[] getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(Pelicula[] peliculas) {
		this.peliculas = peliculas;
	}
	
	/**
	 * Método que vai inserir e editar peliculas no sistema.
	 * @param p variável que contém a pelicula e seus dados a ser armazenado em uma posição
	 * @param pos variável que contém a posição da pelicula
	 */
	public void inserirEditarPelicula(Pelicula p, int pos) {
		this.peliculas[pos] = p;
		if (pos == qtdPeliculas)
			qtdPeliculas++;
	}

	public int getQtdPeliculas() {
		return qtdPeliculas;
	}

	public void setQtdPeliculas(int qtdPeliculas) {
		this.qtdPeliculas = qtdPeliculas;
	}

	public Suporte[] getSuportes() {
		return suportes;
	}

	public void setSuportes(Suporte[] suportes) {
		this.suportes = suportes;
	}
	
	/**
	 * Método que vai inserir e editar suportes no sistema.
	 * @param s variável que contém o suporte e seus dados a ser armazenado em uma posição
	 * @param pos variável que contém a posição do suporte
	 */
	public void inserirEditarSuporte(Suporte s, int pos) {
		this.suportes[pos] = s;
		if (pos == qtdSuportes)
			qtdSuportes++;
	}

	public int getQtdSuportes() {
		return qtdSuportes;
	}

	public void setQtdSuportes(int qtdSuportes) {
		this.qtdSuportes = qtdSuportes;
	}

	public Estoque[] getEstoques() {
		return estoques;
	}

	public void setEstoques(Estoque[] estoques) {
		this.estoques = estoques;
	}
	
	/**
	 * Método que vai inserir e editar estoques no sistema.
	 * @param e variável que contém o estoque e seus dados a ser armazenado em uma posição
	 * @param pos variável que contém a posição do estoque
	 */
	public void inserirEditarEstoque(Estoque e, int pos) {
		this.estoques[pos] = e;
		if (pos == qtdEstoques)
			qtdEstoques++;
	}

	public int getQtdEstoques() {
		return qtdEstoques;
	}

	public void setQtdEstoques(int qtdEstoques) {
		this.qtdEstoques = qtdEstoques;
	}

	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	/**
	 * Método que vai inserir e editar funcionários no sistema.
	 * @param fc variável que contém o funcionario e seus dados a ser armazenado em uma posição
	 * @param pos variável que contém a posição do funcionario
	 */
	public void inserirEditarFuncionario(Funcionario fc, int pos) {
		this.funcionarios[pos] = fc;
		if (pos == qtdFuncionarios)
			qtdFuncionarios++;
	}

	public int getQtdFuncionarios() {
		return qtdFuncionarios;
	}

	public void setQtdFuncionarios(int qtdFuncionarios) {
		this.qtdFuncionarios = qtdFuncionarios;
	}

	public Cliente[] getClientes() {
		return clientes;
	}

	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}
	
	/**
	 * Método que vai inserir e editar clientes no sistema.
	 * @param cl variável que contém o cliente e seus dados a ser armazenado em uma posição
	 * @param pos variável que contém a posição do cliente
	 */
	public void inserirEditarCliente(Cliente cl, int pos) {
		this.clientes[pos] = cl;
		if (pos == qtdClientes)
			qtdClientes++;
	}

	public int getQtdClientes() {
		return qtdClientes;
	}

	public void setQtdClientes(int qtdClientes) {
		this.qtdClientes = qtdClientes;
	}

}
