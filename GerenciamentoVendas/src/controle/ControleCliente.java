package controle;

import modelo.*;

/**
 * Controla os dados da classe cliente para se obter informa��es espec�ficas 
 * @author Maria Eduarda Barbosa e Maria Eduarda Marques
 * @version 1.0 (outubro 2021)
 */
public class ControleCliente {
	
	private Cliente[] cli;
	private int qtdClientes;
	
	/**
	 * Construtor que possui refer�ncia de dois objetos que est�o na classe ControleDado. Os objetos s�o:
	 * [1]getClientes. O m�todo dele que est� na Classe ControleDado, retorna o array de clientes.
	 * [2]getQtdClientes. O m�todo dele que est� na Classe ControleDado, retorna a quantidade de clientes que est�o no array
	 * @param d � uma vari�vel que cont�m a classe ControleDado que possui os dados que ser�o armazenados nos arrays dos objetos 
	 */
	public ControleCliente(ControleDado d) {
		this.cli = d.getClientes();
		this.qtdClientes = d.getQtdClientes();
	}

	public String[] getNomeClientes() {
		String[] str = new String[qtdClientes];
		for(int i = 0; i < qtdClientes; i++) {
			str[i] = cli[i].getNome();
		}

		return str;
	}
	
	public int getQtd() {
		return qtdClientes;
	}

	public void setQtd(int qtd) {
		this.qtdClientes = qtd;
	}

	public String getNome(int i) {		
		return cli[i].getNome();
	}
	
	public String getID(int i) {
		String numID = String.valueOf(cli[i].getClienteID());
		return numID;
	}

	public String getCPF(int i) {
		String numCPF = String.valueOf(cli[i].getNumCPF());
		return numCPF;
	}

	public String getNumTel(int i) {
		String numtel = String.valueOf(cli[i].getTelefone());
		return numtel;
	}
	
	public String getEmail(int i) {		
		return cli[i].getEmail();
	}	
	
	public String getGenero(int i) {		
		return cli[i].getGenero();
	}	

	public void setQtdClientes(int qtdClientes) {
		this.qtdClientes = qtdClientes;
	}

}
