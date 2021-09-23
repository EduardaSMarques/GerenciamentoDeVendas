package modelo;

public class Cliente {
	
	private int clienteID;
	private String nome;
	private String numCPF;
	private int telefone;
	private String email;
	private String genero;
	
	public String toString() {
		return  "\nID: "+ clienteID + "\nNome do Cliente: " + nome + "\nCPF: " + numCPF 
				+ "\nTelefone: " + telefone + "\nE-mail: " + email + "\nGenero: " + genero;
	}	
	
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
