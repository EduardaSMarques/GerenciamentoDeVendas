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
	*Construtor que possui refer�ncia de dois objetos que est�o na classe ControleDado. Os objetos s�o:
	*[1] getEstoques.O m�todo dele que est� na Classe ControleDado retorna o arrey de estoques.
	*[2] getQtdEstoques. O m�todo dele que est� na Classe ControleDado retorna a quantidade de estoques que est�o no array.  
	*@paramd � uma vari�vel que cont�m a classe ControleDado que possui os dados que ser�o armazenados nos arrays dos objetos
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
