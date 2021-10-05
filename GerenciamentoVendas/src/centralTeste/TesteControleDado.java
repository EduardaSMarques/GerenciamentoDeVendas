package centralTeste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import controle.ControleDado;

class TesteControleDado {
	
	private String[] TrueDadsNovosTest = new String[9];
	private String[] FalseDadsNovosTest = new String[9];
	private ControleDado d = new ControleDado();

	@Test
	void testAdicionarEditarEstoque() {
		TrueDadsNovosTest[0] = Integer.toString(0); //editar os dados

		TrueDadsNovosTest[1] = ("Categoria1");
		TrueDadsNovosTest[2] = ("Produto1");
		TrueDadsNovosTest[3] = String.valueOf((13));
		TrueDadsNovosTest[4] = String.valueOf((43.60));
		
		FalseDadsNovosTest[0] = Integer.toString(1); //editar os dados

		FalseDadsNovosTest[1] = ("Categoria2");
		FalseDadsNovosTest[2] = ("Produto2");
		FalseDadsNovosTest[3] = ("vinte");
		FalseDadsNovosTest[4] = String.valueOf((43.60));
		
		assertTrue(d.AdicionarEditarEstoque(TrueDadsNovosTest));
		assertFalse(d.AdicionarEditarEstoque(FalseDadsNovosTest));
	}

	@Test
	void testRemoverEstoque() {
		assertTrue(d.removerEstoque(5));
		assertTrue(d.removerEstoque(2));
	}

	@Test
	void testAdicionarEditarFuncio() {
		TrueDadsNovosTest[0] = Integer.toString(0); //editar os dados

		TrueDadsNovosTest[1] = ("Funcionário1");
		TrueDadsNovosTest[2] = String.valueOf((91234567));
		TrueDadsNovosTest[3] = ("email1");
		TrueDadsNovosTest[4] = ("endereço1");
		TrueDadsNovosTest[5] = ("1511.00");
		
		FalseDadsNovosTest[0] = Integer.toString(1); //editar os dados

		FalseDadsNovosTest[1] = ("Funcionário2");
		FalseDadsNovosTest[2] = ("telefone nove");
		FalseDadsNovosTest[3] = ("email2");
		FalseDadsNovosTest[4] = ("endereço2");
		FalseDadsNovosTest[5] = ("1522.00");
		
		assertTrue(d.AdicionarEditarFuncio(TrueDadsNovosTest));
		assertFalse(d.AdicionarEditarFuncio(FalseDadsNovosTest));
	}

	@Test
	void testRemoverFuncionario() {
		fail("Not yet implemented");
	}

	@Test
	void testAdicionarEditarCliente() {
		fail("Not yet implemented");
	}

	@Test
	void testRemoverCliente() {
		fail("Not yet implemented");
	}

}
