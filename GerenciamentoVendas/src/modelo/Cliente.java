package modelo;

/**
 * Classe que contém as informações do cliente
 * @author Maria Eduarda Barbosa e Maria Eduarda Marques
 * @version 1.0 (outubro 2021)
 */
public class Cliente {
	
	private int clienteID;
	private String nome;
	private String numCPF;
	private int telefone;
	private String email;
	private String genero;
	
	/**
	 * Construtor que contém informações que o cliente irá possuir
	 * @param id um int que contém o código de identificação do cliente
	 * @param nom uma string que contém o nome cliente
	 * @param cpf uma string que contém o CPF do cliente
	 * @param tel um int que contém o telefone do cliente
	 * @param em uma string que contém o e-mail do cliente
	 * @param gen uma string que contém o gênero do cliente
	 */
	public Cliente(int id, String nom, String cpf, int tel, String em, String gen) {
		clienteID = id;
		nome = nom;
		numCPF = cpf;
		telefone = tel;
		email = em;
		genero = gen;
	}


	public int getClienteID() {
		return clienteID;
	}

	public void setClienteID(int clienteID) {
		this.clienteID = clienteID;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumCPF() {
		return numCPF;
	}

	public void setNumCPF(String numCPF) {
		this.numCPF = numCPF;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}	
	
}
