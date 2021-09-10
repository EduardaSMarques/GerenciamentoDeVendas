package gerenciamento;

import java.util.Scanner;

public class Test {

	static Capa c;
	static Carregador crr;
	static Suporte s1;
	static Suporte s2;
	static Pelicula p;
	static Fone f1;
	static Fone f2;
	static Cliente cli1;
	static Cliente cli2;
	static Conta con1;
	static Conta con2;
	static Estoque e;
	static Fornecedor forn1;
	static Fornecedor forn2;
	static Funcionario fun1;
	static Funcionario fun2;
	static Grafico g;
	static Produto pr;
	static Venda v;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		// cadastro de capa
		c = new Capa(10000, "capa1", 5.99, "Capas");
		// cadastro de carregador
		crr = new Carregador(01000, "Carregador1", 7.68, "Carregadores");
		// cadastro de suportes
		s1 = new Suporte(00100, "Suporte1", 40.13, "Suporte");
		s2 = new Suporte(00110, "suporte2", 38.90, "Suporte");
		// cadastro de pelicula
		p = new Pelicula(00010, "Película1", 50.30, "Película");
		// cadastro de fones
		f1 = new Fone(00001, "fone1", 90.8, "Fones");
		f2 = new Fone(00011, "fone2", 899.8, "Fones");

		// pegando os preços dos produtos e somando eles
		Double precoProdCapa = c.getPreco();
		Venda.somaDosPrecos(precoProdCapa);
		Double precoProdCarregador = crr.getPreco();
		Venda.somaDosPrecos(precoProdCarregador);
		Double precoProdSuporte1 = s1.getPreco();
		Venda.somaDosPrecos(precoProdSuporte1);
		Double precoProdSuporte2 = s2.getPreco();
		Venda.somaDosPrecos(precoProdSuporte2);
		Double precoProdPelicula = p.getPreco();
		Venda.somaDosPrecos(precoProdPelicula);
		Double precoProdFone1 = f1.getPreco();
		Venda.somaDosPrecos(precoProdFone1);
		Double precoProdFone2 = f2.getPreco();
		Venda.somaDosPrecos(precoProdFone2);

		String preço = Venda.somaDosPrecos(precoProdFone2);
		
		System.out.println("============ PRODUTOS VENDIDOS ==========");
		System.out.print("-----------------------------------------");
		System.out.println(c.toStringReduzido());
		System.out.print("-----------------------------------------");
		System.out.println(crr.toStringReduzido());
		System.out.print("-----------------------------------------");
		System.out.println(s1.toStringReduzido());
		System.out.print("-----------------------------------------");
		System.out.println(s2.toStringReduzido());
		System.out.print("-----------------------------------------");
		System.out.println(p.toStringReduzido());
		System.out.print("-----------------------------------------");
		System.out.println(f1.toStringReduzido());
		System.out.print("-----------------------------------------");
		System.out.println(f2.toStringReduzido());
		System.out.println("-----------------------------------------");
		System.out.print("+++++++++++++++++++++++++++++++++++++++++");
		System.out.print("\nValor: R$ " + preço + "\nDesconto: R$ 25.50" +
				"\nPreço total da compra: R$ " + Venda.valorTotalComDesconto(25.50) + "\n");
		System.out.print("+++++++++++++++++++++++++++++++++++++++++");
		
		// cadastro de cliente
		cli1 = new Cliente(2783, "cliente1", "7636333", 986662, "clente1@email.com", "feminino");
		cli2 = new Cliente(2103, "cliente2", "7600033", 900609, "clente2@email.com", "masculino");
		// cadastro de conta
		con1 = new Conta("conta1", "lotes de produtos", 3, 400.50, "13", "4", "2021", "pago");
		con2 = new Conta("conta2", "pagamento de funcionários", 3, 2501.86, "2", "9", "2021", "ainda não foi pago");
		// cadastro de fornecedor
		forn1 = new Fornecedor("fornecedor1", 987772, "q2-23", "6762", "fornecedor1@email.com", "Capas");
		forn2 = new Fornecedor("fornecedor2", 982272, "q2-23", "6762", "fornecedor2@email.com", "Carregadores");
		// cadastro de fornecedor
		fun1 = new Funcionario("funcionario1", 9863464, "funcionario1@email.com", "q16 etd", 1200.98);
		fun2 = new Funcionario("funcionario2", 9113464, "funcionario2@email.com", "q10 etd", 1300.88);

		System.out.println("\n\n============ CLIENTES ============");
		System.out.print("----------------------------------");
		System.out.println(cli1.toString());
		System.out.println("----------------------------------");
		System.out.print(cli2.toString());
		System.out.println("\n\n============ CONTAS A PAGAR ============");
		System.out.println("----------------------------------------");
		System.out.println(con1.toString());
		System.out.println("----------------------------------------");
		System.out.print(con2.toString());
		System.out.println("\n\n============ FORNECEDORES ============");
		System.out.println(forn1.toString());
		System.out.println("--------------------------------------");
		System.out.print(forn2.toString());
		System.out.println("\n\n============ FUNCIONÁRIOS ============");
		System.out.println(fun1.toString());
		System.out.println("--------------------------------------");
		System.out.print(fun2.toString());
		
	}

}
