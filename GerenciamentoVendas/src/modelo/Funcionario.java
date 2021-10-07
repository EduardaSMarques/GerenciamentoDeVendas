package modelo;

/**
 * Classe que cont�m as informa��es do funcion�rio
 * @author Maria Eduarda Barbosa e Maria Eduarda Marques
 * @version 1.0 (outubro 2021)
 */
public class Funcionario {

	private String nome;
	private int telefone;
	private String email;
	private String endereco;
	private double salario;
	
	/**
	 * Construtor que cont�m informa��es que o funcionario ir� possuir
	 * @param nom uma string que cont�m o nome funcionario
	 * @param tel um int que cont�m o telefone do funcionario
	 * @param em uma string que cont�m o e-mail do funcionario
	 * @param end uma string que cont�m o endereco do funcionario
	 * @param sal um double que cont�m o sal�rio recebido pelo funcionario
	 */
	public Funcionario(String nom, int tel, String em, String end, double sal) {
		nome = nom;
		telefone = tel;
		email = em;
		endereco = end;
		salario = sal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
