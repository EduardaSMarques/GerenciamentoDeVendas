package gerenciamento;

public class Grafico {
	
	private Venda vend;
	private Conta cont;
	private double faturamento;
	private double despesas;
	private double lucro;
	private double margemDeLucro;
	private double porcentagemLucro;
	private String nomeCategoriaProduto;
	private String genero;
	private int vendasPorGenero;
	
	public Venda getVend() {
		return vend;
	}

	public void setVend(Venda vend) {
		this.vend = vend;
	}
	
	public Conta getCont() {
		return cont;
	}

	public void setCont(Conta cont) {
		this.cont = cont;
	}

	public double getFaturamento() {
		return faturamento;
	}

	public void setFaturamento(double faturamento) {
		this.faturamento = faturamento;
	}

	public double getDespesas() {
		return despesas;
	}

	public void setDespesas(double despesas) {
		this.despesas = despesas;
	}

	public double getLucro() {
		return lucro;
	}

	public void setLucro(double lucro) {
		this.lucro = lucro;
	}

	public double getMargemDeLucro() {
		return margemDeLucro;
	}

	public void setMargemDeLucro(double margemDeLucro) {
		this.margemDeLucro = margemDeLucro;
	}

	public double getPorcentagemLucro() {
		return porcentagemLucro;
	}

	public void setPorcentagemLucro(double porcentagemLucro) {
		this.porcentagemLucro = porcentagemLucro;
	}

	public String getNomeCategoriaProduto() {
		return nomeCategoriaProduto;
	}

	public void setNomeCategoriaProduto(String nomeCategoriaProduto) {
		this.nomeCategoriaProduto = nomeCategoriaProduto;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getVendasPorGenero() {
		return vendasPorGenero;
	}

	public void setVendasPorGenero(int vendasPorGenero) {
		this.vendasPorGenero = vendasPorGenero;
	}

}
