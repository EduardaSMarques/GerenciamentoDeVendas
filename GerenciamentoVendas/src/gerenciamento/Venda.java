package gerenciamento;

import java.util.Date;

public class Venda {
	
	private String formaPaga;
	private int quantProduto;
	private int desconto;
	private int valorTotal;
	private Date data;
	
	public Venda(String forPaga, int quantP, int des, int vt, Date d) {
		formaPaga = forPaga;
		quantProduto = quantP;
		desconto = des;
		valorTotal = vt;
		data = d;
	}

	public String getFormaPaga() {
		return formaPaga;
	}

	public void setFormaPaga(String formaPaga) {
		this.formaPaga = formaPaga;
	}

	public int getQuantProduto() {
		return quantProduto;
	}

	public void setQuantProduto(int quantProduto) {
		this.quantProduto = quantProduto;
	}

	public int getDesconto() {
		return desconto;
	}

	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}

	public int getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(int valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
