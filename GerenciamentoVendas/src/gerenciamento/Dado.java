package gerenciamento;
import java.util.*;

public class Dado {
	 
		private Capa[] capas = new Capa[20];
		private int qtdCapas= 0;
		private Carregador[] carregadores = new Carregador[20];
		private int qtdCarregadores = 0;
		private Fone[] fones = new Fone[20];
		private int qtdFones = 0;
		private Pelicula[] peliculas = new Pelicula[20];
		private int qtdPeliculas = 0;
		private Suporte[] suportes = new Suporte[20];
		private int qtdSuportes = 0;
		private Estoque[] estoques = new Estoque[20];
		private int qtdEstoques = 0;
		private Fornecedor[] fornecedores = new Fornecedor[20];
		private int qtdFornecedores = 0;
		private Funcionario[] funcionarios = new Funcionario[20];
		private  int qtdFuncionarios = 0;
		//private Venda[] vendas = new Venda[20];
		//private int qtdVendas = 0;
		private Cliente[] clientes = new Cliente[20];
		private int qtdClientes = 0;
		private Conta[] contas = new Conta[20];
		private int qtdContas = 0;
		
		
	
		public void preenchendoComDadosAleatorios() {
				for(int i = 0; i < 6; i++) {
					Date d = Calendar.getInstance().getTime();
					
					capas[i] = new Capa((i+1)*112233, "Capa"+i, (i+1)*50, "material"+i, "cor"+i, 
									"textura"+i, "modelo"+i, "descricao"+i, "categoria"+i);
					carregadores[i] = new Carregador((i+1)*113322, "carregador"+i, (i+1)*50,
											"material"+i, "cor"+i, "potencia"+i, "tipoDeEntrada"+i, "modelo"+i,
											"descricao"+i, "categoria"+i);
					fones[i] = new Fone((i+1)*221133, "Fone"+i, (i+1)*50, "material"+i, "cor"+i, "textura"+i, 
									"tipoDoFone"+i, "modelo"+i, "descricao"+i, "categoria"+i);
					peliculas[i] = new Pelicula((i+1)*223311, "Pelicula"+i, (i+1)*50, "material"+i, "textura"+i, 
										"modelo"+i, "descricao"+i, "categoria"+i);
					suportes[i] = new Suporte((i+1)*332211, "Suporte"+i, (i+1)*50, "material"+i, "cor"+i, "textura"+i, 
										"tipoDoSuporte"+i, "tamanho"+i, "modelo"+i, "descricao"+i, "categoria"+i);
					estoques[i] = new Estoque(fornecedores[i], (i+1)*20, (i+1)*50);
					fornecedores[i] = new Fornecedor("fornecedor"+i, (i+1)*100000000, "endereco"+i, "cnpj"+i, "email"+i, "produtoFornecido"+i);
					funcionarios[i] = new Funcionario("Funcionario"+i, (i+1)*200000000, "email"+i, "endereco"+i, (i+1)*1000);
					//vendas[i] = new Venda(funcionarios[i], clientes[i],Produto, "formaPaga"+i, (i+1)*10, (i+1)-10, (i+1)*50, d);
					clientes[i] = new Cliente((i+1)*331122, "Cliente"+i, "numCPF"+i, (i+1)*300000000, "email"+i, "genero"+i);
					contas[i] = new Conta("Conta"+i, "descricao"+i, (i+1)*5, (i+1)*50, d, "status"+i);
								
				}		
				qtdCapas = 6;
				qtdCarregadores = 6;
				qtdFones = 6;
				qtdPeliculas = 6;
				qtdSuportes = 6;
				qtdEstoques = 6;
				qtdFornecedores = 6;
				qtdFuncionarios = 6;
				//qtdVendas = 6;
				qtdClientes = 6;
				qtdContas = 6;		
				
		}



		public Capa[] getCapas() {
			return capas;
		}
		
		public void setCapas(Capa[] capas) {
			this.capas = capas;
		}
		
		public void inserirEditarCapa(Capa cp, int pos) {
			this.capas[pos] = cp;
			if(pos == qtdCapas) qtdCapas++;
		}
		
		public int getQtdCapas() {
			return qtdCapas;
		}

		public void setQtdCapas(int qtdCapas) {
			this.qtdCapas = qtdCapas;
		}

		public Carregador[] getCarregadores() {
			return carregadores;
		}

		public void setCarregadores(Carregador[] carregadores) {
			this.carregadores = carregadores;
		}

		public void inserirEditarCarregador(Carregador cg, int pos) {
			this.carregadores[pos] = cg;
			if(pos == qtdCarregadores) qtdCarregadores++;
		}

		public int getQtdCarregadores() {
			return qtdCarregadores;
		}

		public void setQtdCarregadores(int qtdCarregadores) {
			this.qtdCarregadores = qtdCarregadores;
		}

		public Fone[] getFones() {
			return fones;
		}

		public void setFones(Fone[] fones) {
			this.fones = fones;
		}

		public void inserirEditarFone(Fone f, int pos) {
			this.fones[pos] = f;
			if(pos == qtdFones) qtdFones++;
		}

		public int getQtdFones() {
			return qtdFones;
		}

		public void setQtdFones(int qtdFones) {
			this.qtdFones = qtdFones;
		}

		public Pelicula[] getPeliculas() {
			return peliculas;
		}

		public void setPeliculas(Pelicula[] peliculas) {
			this.peliculas = peliculas;
		}

		public void inserirEditarPelicula(Pelicula p, int pos) {
			this.peliculas[pos] = p;
			if(pos == qtdPeliculas) qtdPeliculas++;
		}
		
		public int getQtdPeliculas() {
			return qtdPeliculas;
		}

		public void setQtdPeliculas(int qtdPeliculas) {
			this.qtdPeliculas = qtdPeliculas;
		}

		public Suporte[] getSuportes() {
			return suportes;
		}

		public void setSuportes(Suporte[] suportes) {
			this.suportes = suportes;
		}

		public void inserirEditarSuporte(Suporte s, int pos) {
			this.suportes[pos] = s;
			if(pos == qtdSuportes) qtdSuportes++;
		}

		public int getQtdSuportes() {
			return qtdSuportes;
		}

		public void setQtdSuportes(int qtdSuportes) {
			this.qtdSuportes = qtdSuportes;
		}

		public Estoque[] getEstoques() {
			return estoques;
		}

		public void setEstoques(Estoque[] estoques) {
			this.estoques = estoques;
		}

		public void inserirEditarEstoque(Estoque e, int pos) {
			this.estoques[pos] = e;
			if(pos == qtdEstoques) qtdEstoques++;
		}

		public int getQtdEstoques() {
			return qtdEstoques;
		}

		public void setQtdEstoques(int qtdEstoques) {
			this.qtdEstoques = qtdEstoques;
		}

		public Fornecedor[] getFornecedores() {
			return fornecedores;
		}

		public void setFornecedores(Fornecedor[] fornecedores) {
			this.fornecedores = fornecedores;
		}

		public void inserirEditarFornecedor(Fornecedor fn, int pos) {
			this.fornecedores[pos] = fn;
			if(pos == qtdFornecedores) qtdFornecedores++;
		}

		public int getQtdFornecedores() {
			return qtdFornecedores;
		}

		public void setQtdFornecedores(int qtdFornecedores) {
			this.qtdFornecedores = qtdFornecedores;
		}

		public Funcionario[] getFuncionarios() {
			return funcionarios;
		}

		public void setFuncionarios(Funcionario[] funcionarios) {
			this.funcionarios = funcionarios;
		}

		public void inserirEditarFuncionario(Funcionario fc, int pos) {
			this.funcionarios[pos] = fc;
			if(pos == qtdFuncionarios) qtdFuncionarios++;
		}
		
		public int getQtdFuncionarios() {
			return qtdFuncionarios;
		}

		public void setQtdFuncionarios(int qtdFuncionarios) {
			this.qtdFuncionarios = qtdFuncionarios;
		}

		//public Venda[] getVendas() {
			//return vendas;
		//}

		//public void setVendas(Venda[] vendas) {
			//this.vendas = vendas;
		//}

		//public void inserirEditarVenda(Venda v, int pos) {
			//this.vendas[pos] = v;
			//if(pos == qtdVendas) qtdVendas++;
		//}
		
		//public int getQtdVendas() {
			//return qtdVendas;
		//}

		//public void setQtdVendas(int qtdVendas) {
			//this.qtdVendas = qtdVendas;
		//}

		public Cliente[] getClientes() {
			return clientes;
		}

		public void setClientes(Cliente[] clientes) {
			this.clientes = clientes;
		}

		public void inserirEditarCliente(Cliente cl, int pos) {
			this.clientes[pos] = cl;
			if(pos == qtdClientes) qtdClientes++;
		}

		public int getQtdClientes() {
			return qtdClientes;
		}

		public void setQtdClientes(int qtdClientes) {
			this.qtdClientes = qtdClientes;
		}

		public Conta[] getContas() {
			return contas;
		}

		public void setContas(Conta[] contas) {
			this.contas = contas;
		}

		public void inserirEditarConta(Conta ct, int pos) {
			this.contas[pos] = ct;
			if(pos == qtdContas) qtdContas++;
		}

		public int getQtdContas() {
			return qtdContas;
		}

		public void setQtdContas(int qtdContas) {
			this.qtdContas = qtdContas;
		}
		
}
