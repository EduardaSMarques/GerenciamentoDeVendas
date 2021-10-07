package visualiza;

import controle.*;

import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

/**
 * Janela do Menu Principal para dar início ao software com os botões que abrem as outras janelas com funcões 
 * @author Maria Eduarda Barbosa e Maria Eduarda Marques
 * @version 1.0 (outubro 2021)
 */
public class MenuPrincipal implements ActionListener{

	private static JFrame janelaMenu = new JFrame("Gerenciamento de Vendas");
	private static JLabel fundo = new JLabel("");
	private static JButton btnProdutos = new JButton("Produtos");
	private static JButton btnClientes = new JButton("Clientes");
	private static JButton btnFuncionarios = new JButton("Funcionários");
	private static JButton btneEtoque = new JButton("Estoque e Venda");
	public static ControleDado dads = new ControleDado();
	
	/**
	 * Construtor que estiliza e adiciona os botões e a label na janela, sendo eles:
	 * [1]botões de produtos, clientes, funcionarios e estoque e venda
	 * [2]label com a imagem de fundo
	 */
	public MenuPrincipal() {
		
		fundo.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagem/imgFundo.jpeg")));
		
		btnProdutos.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 43));
		btnProdutos.setBackground(Color.DARK_GRAY);
		btnProdutos.setForeground(Color.WHITE);
		
		btnClientes.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 43));
		btnClientes.setBackground(Color.DARK_GRAY);
		btnClientes.setForeground(Color.WHITE);
		
		btnFuncionarios.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 43));
		btnFuncionarios.setBackground(Color.DARK_GRAY);
		btnFuncionarios.setForeground(Color.WHITE);
		
		btneEtoque.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 43));
		btneEtoque.setBackground(Color.DARK_GRAY);
		btneEtoque.setForeground(Color.WHITE);
		
		btnProdutos.setBounds(705, 425, 214, 99);
		btnClientes.setBounds(440, 425, 214, 99);
		btnFuncionarios.setBounds(90, 425, 302, 99);
		btneEtoque.setBounds(317, 160, 375, 106);
		fundo.setBounds(0, 0, 1025, 707);
		
		janelaMenu.setLayout(null);
		
		janelaMenu.add(btnProdutos);
		janelaMenu.add(btnClientes);
		janelaMenu.add(btnFuncionarios);
		janelaMenu.add(btneEtoque);
		janelaMenu.add(fundo);
		
		janelaMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janelaMenu.setBounds(100, 100, 1012, 744);
		janelaMenu.setLocationRelativeTo(null); //para janela ficar centralizada na hora de abrir
		janelaMenu.setVisible(true);
	}
	
	/**
	 * Método main onde chamará os botões assim que iniciar o software
	 * @param args uma coleção de Strings, em que o software aceita quando o executa.
	 */
	public static void main(String[] args) {
		MenuPrincipal menuPrinc = new MenuPrincipal();
		
		btnProdutos.addActionListener(menuPrinc);
		btnClientes.addActionListener(menuPrinc);
		btnFuncionarios.addActionListener(menuPrinc);
		btneEtoque.addActionListener(menuPrinc);
	}
	
	/**
	 * Método que implementa os comandos que os botões devem seguir
	 * @param e uma variável que contém o ActionEvent e identifica o evento que ocorreu
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == btnProdutos) {
			msgProdutoEmManuntencao();
		}
		
		if (src == btnClientes) {
			new JanelaCliente().mostraTelaClient(dads);
		}
		
		if (src == btnFuncionarios) {
			new JanelaFuncionario().mostraTelaFuncio(dads);
		}		
		
		if (src == btneEtoque) {
			new JanelaEstoque().mostraTelaEstoq(dads);
		}
	}

	/**
	 * Método que mostra uma mensagem de informação quando o botão produtos for selecionado
	 */
	public void msgProdutoEmManuntencao() {
		JOptionPane.showMessageDialog(null, 
				"                Tela produto em manutenção!\n"
				+ "as funcionalidades ainda precisam serem efetuadas.\n", null, 
				JOptionPane.INFORMATION_MESSAGE);
	}
	
}