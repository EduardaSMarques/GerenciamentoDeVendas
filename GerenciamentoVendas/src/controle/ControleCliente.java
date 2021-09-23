package controle;

import modelo.*;

public class ControleCliente {
	
	private Cliente[] cli;
	private int qtdClientes;

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
	
	public String getEndereco(int i) {		
		return cli[i].getEmail();
	}	
	
	public String getGenero(int i) {		
		return cli[i].getGenero();
	}	

	public void setQtdClientes(int qtdClientes) {
		this.qtdClientes = qtdClientes;
	}

}
