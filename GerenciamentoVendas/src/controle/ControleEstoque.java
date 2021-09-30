package controle;

import modelo.*;

public class ControleEstoque {

	private Estoque[] est;
	private int qtdEstoques;

	public ControleEstoque(ControleDado d) {
		this.est = d.getEstoques();
		this.qtdEstoques = d.getQtdEstoques();
	}

	public String[] getNomeProdEstoque() {
		String[] str = new String[qtdEstoques];
		for(int i = 0; i < qtdEstoques; i++) {
			str[i] = est[i].getNomeProd();
		}
		
		return str;
	}
	
	public int getQtd() {
		return qtdEstoques;
	}

	public void setQtd(int qtd) {
		this.qtdEstoques = qtd;
	}

	public String getNome(int i) {		
		return est[i].getNomeProd();
	}
	
	public int getQtdFornecProd(int i) {		
		return est[i].getQuantidadeFornecida();
	}
	
	public void setQtdEstoques(int qtdEstoques) {
		this.qtdEstoques = qtdEstoques;
	}
	
	public Double getPreco(int i) {
		return est[i].getPrecoDaQuantFornecida();
	}
	
}
