package visualiza;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaEstoque implements ActionListener {
	
	private JFrame janelaEstoque = new JFrame("Gerenciamento de Vendas");
	private JPanel panelEstoque = new JPanel();
	private JPanel panelCadastrar = new JPanel();

	private JLabel titulo1 = new JLabel("Estoque");
	private JLabel titulo2 = new JLabel("Cadastrar Estoque");
	private JLabel labelPesq = new JLabel("Pesquisar pelo nome:");
	private JTextField texPesq = new JTextField();
	private JLabel labelCateg = new JLabel("Categoria do produto:");
	private JTextField texCateg = new JTextField();
	private JLabel labelNomProd = new JLabel("Nome do produto:");
	private JTextField texNomProd = new JTextField();
	private JLabel labelQtdForn = new JLabel("Quantidade Fornecida:");
	private JTextField texQtdForn = new JTextField();
	private JLabel labelPreco = new JLabel("Preço:");
	private JTextField texPreco = new JTextField();
	private JButton btnEditar = new JButton("Editar");
	private JButton btnExcluir = new JButton("Excluir");
	private JButton btnFinaliCadast = new JButton("Finalizar o cadastramento");
	
	public void mostraTelaEstoq() {
		panelEstoque.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.RIGHT, TitledBorder.BELOW_TOP, null, new Color(0, 0, 0)));
		panelCadastrar.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.RIGHT, TitledBorder.BELOW_TOP, null, new Color(0, 0, 0)));
		titulo1.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 40));
		titulo2.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 40));
		labelPesq.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		labelCateg.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		labelNomProd.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		labelQtdForn.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		labelPreco.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		btnEditar.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 17));
		btnExcluir.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 17));
		btnFinaliCadast.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 17));
		
		panelEstoque.setBounds(10, 10, 782, 325);
		panelCadastrar.setBounds(10, 340, 782, 241);
		titulo1.setBounds(283, 0, 156, 46);
		titulo2.setBounds(199, 0, 374, 56);
		labelPesq.setBounds(10, 61, 208, 24);
		labelCateg.setBounds(10, 75, 275, 34);
		labelNomProd.setBounds(307, 415, 275, 34);
		labelQtdForn.setBounds(10, 143, 275, 34);
		labelPreco.setBounds(307, 483, 275, 34);
		texPesq.setBounds(10, 88, 462, 26);
		texCateg.setBounds(20, 447, 258, 26);
		texNomProd.setBounds(306, 447, 472, 26);
		texQtdForn.setBounds(10, 174, 103, 26);
		texPreco.setBounds(295, 174, 103, 26);
		btnEditar.setBounds(577, 275, 88, 40);
		btnExcluir.setBounds(675, 275, 97, 40);
		btnFinaliCadast.setBounds(516, 191, 256, 40);
		
		janelaEstoque.setLayout(null);
		panelEstoque.setLayout(null);
		panelCadastrar.setLayout(null);
		
		panelEstoque.add(titulo1);
		panelEstoque.add(labelPesq);
		panelEstoque.add(texPesq);
		panelEstoque.add(btnEditar);
		panelEstoque.add(btnExcluir);
		
		panelCadastrar.add(titulo2);
		panelCadastrar.add(labelCateg);
		janelaEstoque.add(texCateg);
		janelaEstoque.add(labelNomProd);
		janelaEstoque.add(texNomProd);
		panelCadastrar.add(labelQtdForn);
		panelCadastrar.add(texQtdForn);
		janelaEstoque.add(labelPreco);
		panelCadastrar.add(texPreco);
		panelCadastrar.add(btnFinaliCadast);
		
		janelaEstoque.add(panelEstoque);
		janelaEstoque.add(panelCadastrar);
		
		janelaEstoque.setBounds(100, 100, 816, 628);
		janelaEstoque.setLocationRelativeTo(null); 
		janelaEstoque.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == btnEditar) {

		}
		if (src == btnExcluir) {

		}
		if (src == btnFinaliCadast) {

		}

	}

}

