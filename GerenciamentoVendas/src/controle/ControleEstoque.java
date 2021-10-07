package controle;

import modelo.*;

/**
*Controla os dados do Estoque
*@author Maria Eduarda Barbosa e Maria Eduarda Marques
*@return 1.0 (outubro 2020)
*/
public class ControleEstoque {

	private Estoque[] est;
	private int qtdEstoques;

	/**
	*Construtor que possui referência de dois objetos que estão na classe ControleDado. Os objetos são:
	*[1] getEstoques.O método dele que está na Classe ControleDado retorna o arrey de estoques.
	*[2] getQtdEstoques. O método dele que está na Classe ControleDado retorna a quantidade de estoques que estão no array.  
	*@paramd é uma variável que contém a classe ControleDado que possui os dados que serão armazenados nos arrays dos objetos
	*/
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
