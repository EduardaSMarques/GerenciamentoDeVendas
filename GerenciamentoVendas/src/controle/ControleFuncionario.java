package controle;

import modelo.*;

public class ControleFuncionario {

	private Funcionario[] func;
	private int qtdFuncionarios;

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