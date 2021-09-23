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
	
}
