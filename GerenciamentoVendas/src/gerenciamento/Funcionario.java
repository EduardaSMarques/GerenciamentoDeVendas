package gerenciamento;

public class Funcionario {

	private String nome;
	private int telefone;
	private String email;
	private String endereco;
	private double salario;
	
	public String toString() {
		return 	"\nNome do funcionário: " + nome + "\nTelefone: " + telefone
				+ "\nE-mail: " + email + "\nEndereço: " + endereco 
				+ "\nSalário: " + salario;
	}
	
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
