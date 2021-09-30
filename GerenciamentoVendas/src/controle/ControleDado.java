package controle;

import modelo.*;

public class ControleDado {

	private Dado d = new Dado();

	public ControleDado() {
		d.preenchendoComDadosAleatorios();
	}

	public Dado getDados() {
		return d;
	}

	public void setDados(Dado d) {
		this.d = d;
	}

	public Cliente[] getClientes() {
		return this.d.getClientes();
	}

	public int getQtdClientes() {
		return this.d.getQtdClientes();
	}
	
	public Funcionario[] getFuncionarios() {
		return this.d.getFuncionarios();
	}

	public int getQtdFuncionarios() {
		return this.d.getQtdFuncionarios();
	}
	
	public Conta[] getContas() {
		return this.d.getContas();
	}

	public int getQtdContas() {
		return this.d.getQtdContas();
	}
	
	public Estoque[] getEstoques() {
		return this.d.getEstoques();
	}

	public int getQtdEstoques() {
		return this.d.getQtdEstoques();
	}
	
	public Capa[] getCapas() {
		return this.d.getCapas();
	}

	public int getQtdCapas() {
		return this.d.getQtdCapas();
	}
	
	public Carregador[] getCarregadores() {
		return this.d.getCarregadores();
	}

	public int getQtdCarregadores() {
		return this.d.getQtdCarregadores();
	}
	
	public Fone[] getFones() {
		return this.d.getFones();
	}

	public int getQtdFones() {
		return this.d.getQtdFones();
	}
	
	public Pelicula[] getPeliculas() {
		return this.d.getPeliculas();
	}

	public int getQtdPeliculas() {
		return this.d.getQtdPeliculas();
	}
	
	public Suporte[] getSuportes() {
		return this.d.getSuportes();
	}

	public int getQtdSuportes() {
		return this.d.getQtdSuportes();
	}
	
	public boolean AdicionarEditarFuncio(String[] dadosFuncionarios) {
		if(!dadosFuncionarios[2].matches("[0-9]+")) {
			return false;
		} else {
				Funcionario f = new Funcionario(dadosFuncionarios[1], Integer.parseInt(dadosFuncionarios[2]), 
						dadosFuncionarios[3], dadosFuncionarios[4],Double.parseDouble(dadosFuncionarios[5]));
				d.inserirEditarFuncionario(f, Integer.parseInt(dadosFuncionarios[0])); //add dado novo do cadastro 
				return true;
		}
	}
	
	
	public boolean removerFuncionario(int i) {
		String removeuFuncionario = d.getFuncionarios()[i].getNome();
		
		if(i == (d.getQtdFuncionarios() - 1)) { // Remoção do funcionario pelo o final do array
			d.setQtdFuncionarios(d.getQtdFuncionarios() - 1);
			d.getFuncionarios()[d.getQtdFuncionarios()] = null;
			return true;
		} else { // Remoção do funcionario pelo o meio do array
			int contador = 0;
			while(d.getFuncionarios()[contador].getNome().compareTo(removeuFuncionario) != 0) {
				contador++;
			}
			//Rotina atualiza
			for(int num = contador; num < d.getQtdFuncionarios() - 1; num++) {
				d.getFuncionarios()[num] = null;
				d.getFuncionarios()[num] = d.getFuncionarios()[num+1];
			}
			d.getFuncionarios()[d.getQtdFuncionarios()] = null;
			d.setQtdFuncionarios(d.getQtdFuncionarios() - 1);
			return true;
		}
	}
	
}
