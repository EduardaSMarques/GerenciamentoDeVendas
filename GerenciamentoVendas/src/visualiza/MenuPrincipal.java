package visualiza;

import controle.*;

import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class MenuPrincipal implements ActionListener{

	private static JFrame janelaMenu = new JFrame("Gerenciamento de Vendas");
	private static JLabel fundo = new JLabel("");
	private static JButton btnProdutos = new JButton("Produtos");
	private static JButton btnClientes = new JButton("Clientes");
	private static JButton btnFuncionarios = new JButton("Funcionários");
	private static JButton btneEtoque = new JButton("Estoque e Venda");
	public static ControleDado dads = new ControleDado();
	
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
	
	public static void main(String[] args) {
		MenuPrincipal menuPrinc = new MenuPrincipal();
		
		btnProdutos.addActionListener(menuPrinc);
		btnClientes.addActionListener(menuPrinc);
		btnFuncionarios.addActionListener(menuPrinc);
		btneEtoque.addActionListener(menuPrinc);
	}
	
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

	public void msgProdutoEmManuntencao() {
		JOptionPane.showMessageDialog(null, 
				"                Tela produto em manutenção!\n"
				+ "as funcionalidades ainda precisam serem efetuadas.\n", null, 
				JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void msgVendaEmManuntencao() {
		JOptionPane.showMessageDialog(null, 
				"                Tela venda em manutenção!\n"
				+ "as funcionalidades ainda estão sendo efetuadas.\n", null, 
				JOptionPane.INFORMATION_MESSAGE);
	}
	
}