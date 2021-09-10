package gerenciamento;

public class Conta {
	
	private String nome;
	private String descricao;
	private int parcelas;
	private double preco;
	private String dia;
	private String mes;
	private String ano;
	private String status;
	
	public Conta(String nom, String desc, int parc, double pre, String d, String m, String a, String sta) {
		nome = nom;
		descricao = desc;
		parcelas = parc;
		preco = pre;
		dia = d;
		mes = m;
		ano = a;
		status = sta;
	}
	
	public String toString() {
		return 	"\nNome: "+ nome + "\nDescrição: " + descricao + "\nParcelas: " + parcelas 
				+ "\nPreço: " + preco + "\nVencimento: " + dia + "/" + mes + "/" + ano + "\nStatus: " + status;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getParcelas() {
		return parcelas;
	}

	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
