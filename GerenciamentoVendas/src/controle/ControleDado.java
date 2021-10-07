package controle;

import modelo.*;

/**
 * Controla os dados para se fazer os cruds das classes cliente, estoque e funcionário
 * @author Maria Eduarda Barbosa e Maria Eduarda Marques
 * @version 1.0 (outubro 2021)
 */
public class ControleDado {

	private Dado d = new Dado();
	
	/**
	 * Construtor que armazena os dados aleatórios da classe Dado para se utilizar nos cruds
	 */
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
	
	public String getPosicaoIndiceDoEstoque(String nome) {
		int posicao = 0;
		while(d.getEstoques()[posicao].getNomeProd().compareTo(nome) != 0) {
			posicao++;
		}
		return String.valueOf(posicao);
	}	
	
	public String getPosicaoIndiceDoFuncionario(String nome) {
		int posicao = 0;
		while(d.getFuncionarios()[posicao].getNome().compareTo(nome) != 0) {
			posicao++;
		}
		return String.valueOf(posicao);
	}
	
	public String getPosicaoIndiceDoCliente(String nome) {
		int posicao = 0;
		while(d.getClientes()[posicao].getNome().compareTo(nome) != 0) {
			posicao++;
		}
		return String.valueOf(posicao);
	}
	/**
	 * Método que irá adicionar e editar dados do estoque
	 * @param dadosEstoq uma string que contém uma posição de onde o dado armazenado tem que ser um número 
	 * @return false ou true se:
	 * [1] retorna false se o dado na posição não for um número
	 * [2] retorna true se o dado na posição for número e então adiciona ou edita dados no estoque
	 */	
	public boolean AdicionarEditarEstoque(String[] dadosEstoq) {
		if(!dadosEstoq[3].matches("[0-9]+")) { //se o dado nao sao numeros no indice mencionado, retorna false
			return false;
		} else {
				Estoque e = new Estoque(dadosEstoq[1], dadosEstoq[2], Integer.parseInt(dadosEstoq[3])
						, Double.parseDouble(dadosEstoq[4]));
				d.inserirEditarEstoque(e, Integer.parseInt(dadosEstoq[0])); //adicionar dados
				return true;
		}
	}
	
	/**
	 * Método que remove o produto no estoque do software
	 * @param i variável que indica a posição do produto no estoque
	 * @return true se:
	 * [1]Se a remoção do estoque for no final ou no meio
	 * [2]Para retirar o null da posição onde o produto foi retirado
	 */	
	public boolean removerEstoque(int i) {
		String removeuEstoque = d.getEstoques()[i].getNomeProd();
		
		if(i == (d.getQtdEstoques() - 1)) { // remoção do estoque pelo o final do array
			d.setQtdEstoques(d.getQtdEstoques() - 1);
			d.getEstoques()[d.getQtdEstoques()] = null;
			return true;
		} else  { // remoção do estoque pelo o meio do array
			int contador = 0;
			while(d.getEstoques()[contador].getNomeProd().compareTo(removeuEstoque) != 0) {
				contador++;
			}
			
			for(int num = contador; num < d.getQtdEstoques() - 1; num++) {
				d.getEstoques()[num] = null;
				d.getEstoques()[num] = d.getEstoques()[num+1];
			}
			d.getEstoques()[d.getQtdEstoques()] = null;
			d.setQtdEstoques(d.getQtdEstoques() - 1);
			return true;
		}
	}
	
	/**
	 * Método que irá adicionar e editar dados do funcionario
	 * @param dadosFuncionarios uma string que contém uma posição de onde o dado armazenado tem que ser um número 
	 * @return false ou true se:
	 * [1] retorna false se o dado na posição não for um número
	 * [2] retorna true se o dado na posição for número e então adiciona ou edita dados no funcionario
	 */	
	public boolean AdicionarEditarFuncio(String[] dadosFuncionarios) {
		if(!dadosFuncionarios[2].matches("[0-9]+")) { //se o dado nao sao numeros no indice mencionado, retorna false
			return false;
		} else {
				Funcionario f = new Funcionario(dadosFuncionarios[1], Integer.parseInt(dadosFuncionarios[2]), 
						dadosFuncionarios[3], dadosFuncionarios[4],Double.parseDouble(dadosFuncionarios[5]));
				d.inserirEditarFuncionario(f, Integer.parseInt(dadosFuncionarios[0])); //adicionar dados 
				return true;
		}
	}
	
	/**
	 * Método que remove o funcionario do software
	 * @param i variável que indica a posição do funcionario
	 * @return true se:
	 * [1]Se a remoção do funcionario for no final ou no meio
	 * [2]Para retirar o null da posição onde o funcionario foi retirado
	 */	
	public boolean removerFuncionario(int i) {
		String removeuFuncionario = d.getFuncionarios()[i].getNome();
		
		if(i == (d.getQtdFuncionarios() - 1)) { // remoção do funcionario pelo o final do array
			d.setQtdFuncionarios(d.getQtdFuncionarios() - 1);
			d.getFuncionarios()[d.getQtdFuncionarios()] = null;
			return true;
		} else { // remoção do funcionario pelo o meio do array
			int contador = 0;
			while(d.getFuncionarios()[contador].getNome().compareTo(removeuFuncionario) != 0) {
				contador++;
			}
			
			for(int num = contador; num < d.getQtdFuncionarios() - 1; num++) {
				d.getFuncionarios()[num] = null;
				d.getFuncionarios()[num] = d.getFuncionarios()[num+1];
			}
			d.getFuncionarios()[d.getQtdFuncionarios()] = null;
			d.setQtdFuncionarios(d.getQtdFuncionarios() - 1);
			return true;
		}
	}
	
	/**
	 * Método que irá adicionar e editar dados do cliente
	 * @param dadosClientes uma string que contém uma posição de onde o dado armazenado tem que ser um número 
	 * @return false ou true se:
	 * [1] retorna false se o dado na posição não for um número
	 * [2] retorna true se o dado na posição for número e então adiciona ou edita dados no cliente
	 */	
	public boolean AdicionarEditarCliente(String[] dadosClientes) {
		if(!dadosClientes[1].matches("[0-9]+") || !dadosClientes[4].matches("[0-9]+")) { 
			return false;
		} else {
				Cliente c = new Cliente(Integer.parseInt(dadosClientes[1]),dadosClientes[2], dadosClientes[3],
						Integer.parseInt(dadosClientes[4]), dadosClientes[5], dadosClientes[6]);
				d.inserirEditarCliente(c, Integer.parseInt(dadosClientes[0])); //adicionar dados
				return true;
		}
	}
	
	/**
	 * Método que remove o cliente do software
	 * @param i variável que indica a posição do cliente
	 * @return true se:
	 * [1]Se a remoção do cliente for no final ou no meio
	 * [2]Para retirar o null da posição onde o cliente foi retirado
	 */		
	public boolean removerCliente(int i) {
		String removeuCliente = d.getClientes()[i].getNome();
			
		if(i == (d.getQtdClientes() - 1)) { // remoção do cliente pelo o final do array
			d.setQtdClientes(d.getQtdClientes() - 1);
			d.getClientes()[d.getQtdClientes()] = null;
			return true;
		} else {  // remoção do cliente pelo o meio do array
			int contador = 0;
			while(d.getClientes()[contador].getNome().compareTo(removeuCliente) != 0) {
				contador++;
			}
			
			for(int num = contador; num < d.getQtdClientes() - 1; num++) {
				d.getClientes()[num] = null;
				d.getClientes()[num] = d.getClientes()[num+1];
			}
			d.getClientes()[d.getQtdClientes()] = null;
			d.setQtdClientes(d.getQtdClientes() - 1);
			return true;
		}
	}
	
}
