package controle;

import modelo.*;

public class ControleConta {

	private Conta[] cont;
	private int qtdContas;
	
	public ControleConta(ControleDado d) {
		cont = d.getContas();
		qtdContas = d.getQtdContas();
		
	}
	
	public String[] getNomeContas() {
		String[] s = new String[qtdContas];
		for(int i = 0; i < qtdContas; i++) {
			s[i] = cont[i].getNome();
		}
		
		return s;
	}
	
	public int getQtd() {
		return qtdContas;
	}

	public void setQtd(int qtd) {
		this.qtdContas = qtd;
	}
	
	public String getNome(int i) {		
		return cont[i].getNome();
	}
	
	
	
	
}
