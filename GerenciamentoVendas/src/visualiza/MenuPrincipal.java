package visualiza;

import controle.*;

import javax.swing.*;

import java.awt.Font;
import java.awt.event.*;

public class MenuPrincipal implements ActionListener{

	private JFrame janela = new JFrame("Gerenciamento de Vendas");
	private static JButton vendas = new JButton("");
	private JLabel vend = new JLabel("Vendas");
	private static JButton produtos = new JButton("");
	private JLabel prod = new JLabel("Produtos");
	private static JButton clientes = new JButton("");
	private JLabel client = new JLabel("Clientes");
	private static JButton funcionarios = new JButton("");
	private JLabel fun = new JLabel("Funcionários");
	private static JButton estoque = new JButton("");
	private JLabel est = new JLabel("Estoque");
	public static ControleDado dads = new ControleDado();
	
	public MenuPrincipal() {
		vendas.setIcon(new ImageIcon("imgFundo.jpeg"));
		
		vend.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 40));
		prod.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 40));
		client.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 40));
		fun.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 40));
		est.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 40));
		
		vend.setBounds(116, 294, 188, 52);
		prod.setBounds(422, 294, 188, 52);
		client.setBounds(749, 294, 179, 52);
		fun.setBounds(216, 621, 262, 52);
		est.setBounds(619, 621, 158, 52);
		
		vendas.setBounds(73, 110, 214, 166);
		produtos.setBounds(396, 110, 214, 166);
		clientes.setBounds(726, 110, 214, 166);
		funcionarios.setBounds(228, 432, 214, 166);
		estoque.setBounds(582, 432, 214, 166);
		
		janela.setLayout(null);
		
		janela.add(vend);
		janela.add(prod);
		janela.add(client);
		janela.add(fun);
		janela.add(est);
		janela.add(vendas);
		janela.add(produtos);
		janela.add(clientes);
		janela.add(funcionarios);
		janela.add(estoque);
		
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setBounds(100, 100, 1012, 744);
		janela.setLocationRelativeTo(null); //para janela ficar centralizada na hora de abrir
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		MenuPrincipal menuPrinc = new MenuPrincipal();
		
		vendas.addActionListener(menuPrinc);
		produtos.addActionListener(menuPrinc);
		clientes.addActionListener(menuPrinc);
		funcionarios.addActionListener(menuPrinc);
		estoque.addActionListener(menuPrinc);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == vendas) {
			
		}
		if (src == produtos) {
			new JanelaProduto().mostraTelaProd();
		}
		if (src == clientes) {

		}
		if (src == funcionarios) {
			new JanelaFuncionario().mostraTelaFuncio(dads);
		}		
		
		if (src == estoque) {
			new JanelaEstoque().mostraTelaEstoq();
		}
	}

}
