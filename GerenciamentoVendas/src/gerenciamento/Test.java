package gerenciamento;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test {

	static Capa c;
	static Carregador crr;
	static Suporte s1;
	static Suporte s2;
	static Pelicula p;
	static Fone f1;
	static Fone f2;
	static Cliente cli;
	static Conta con;
	static Estoque e;
	static Fornecedor forn;
	static Funcionario fun;
	static Grafico g;
	static Produto pr;
	static Venda v;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		GregorianCalendar d = new GregorianCalendar();
		Date agora = d.getTime();

		// cadastro de capa
		c = new Capa(10000, "capa1", 5.99, "Capas");
		// cadastro de carregador
		crr = new Carregador(01000, "Carregador1", 7.68, "Carregadores");
		// cadastro de suporte
		s1 = new Suporte(00100, "Suporte1", 40.13, "Suporte");
		s2 = new Suporte(00110, "suporte2", 38.90, "Suporte");
		// cadastro de pelicula
		p = new Pelicula(00010, "Película1", 50.30, "Película");
		// cadastro de fone
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

		String total = Venda.somaDosPrecos(precoProdFone2);

		System.out.println("Preço total da compra: R$ " + total + "\n");

		// String nomes = f1.getNome();
		// String nomes2 = f2.getNome();
		// Venda.carrinhoCompra(nomes);
		// String testnomes2 = Venda.carrinhoCompra(nomes2);

		// cadastro de cliente
		cli = new Cliente(2783, "cliente1", "7636333", 986662, "clente1@email.com", "fêmea");
		// cadastro de conta
		con = new Conta("conta1", "lotes de produtos", 3, 400.50, agora, "pago");
		// cadastro de fornecedor
		forn = new Fornecedor("fornecedor1", 987772, "q2-23", "6762", "fornecedor1@email.com", "Capas");
		// cadastro de fornecedor
		fun = new Funcionario("funcionario1", 9863464, "funcionario1@email.com", "q16 -etd", 1200.98);

		System.out.println(cli.toString());
		System.out.println(con.toString());
		// System.out.println(e.toString());
		System.out.println(forn.toString());
		System.out.println(fun.toString());
		// System.out.println(g.toString());
		// System.out.println(v.mostrarProdutos());

	}

}
