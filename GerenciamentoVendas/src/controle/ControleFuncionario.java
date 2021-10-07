package controle;

import modelo.*;

/**
*Controla os dados do Funcionario
*@author maria Eduarda Barbosa e Maaria Eduarda Marques
*@version 1.0 (outubro 2020)
*/
public class ControleFuncionario {

	private Funcionario[] func;
	private int qtdFuncionarios;

	/**
	*Construtor atribuindo para func e qtdFuncionarios dados que est�o na classe ControleDado. Os dados s�o:
	*[1] getFuncionarios.O m�todo dele que est� na Classe ControleDado retorna o arrey de funcionarios. 
	*[2] getQtdFuncionarios. O m�todo dele que est� na Classe ControleDado retorna a quantidade de funcionarios que est�o no array.  
	*@param d � uma vari�vel que cont�m a classe ControleDado que possui os dados que ser�o armazenados nos arrays dos objetos
	*/
	public ControleFuncionario(ControleDado d) {
		func = d.getFuncionarios();
		qtdFuncionarios = d.getQtdFuncionarios();
	}

	public String[] getNomeFuncio() {
		String[] str = new String[qtdFuncionarios];
		for(int i = 0; i < qtdFuncionarios; i++) {
			str[i] = func[i].getNome();
		}
		
		return str;
	}

	public int getQtd() {
		return qtdFuncionarios;
	}

	public void setQtd(int qtd) {
		this.qtdFuncionarios = qtd;
	}
	
	public String getNome(int i) {		
		return func[i].getNome();
	}
	
	public String getTelef(int i) {	
		String numTel = String.valueOf(func[i].getTelefone());
		return numTel;
	}
	
	
	public String getEmail(int i) {
		return func[i].getEmail();
	}	
	
	public String getEndereco(int i) {		
		return func[i].getEndereco();
	}
	
	public String getSalario(int i) {		
		String salari = Double.toString(func[i].getSalario());
		return salari;
	}
	
	public void setQtdFuncionarios(int qtdFuncionarios) {
		this.qtdFuncionarios = qtdFuncionarios;
	}
	
}