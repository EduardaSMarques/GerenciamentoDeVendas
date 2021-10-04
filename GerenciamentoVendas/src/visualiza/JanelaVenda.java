package visualiza;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import controle.*;

public class JanelaVenda implements ActionListener {

	private JFrame janelaDadsEstoque = new JFrame("Venda");
	private JSeparator separa1 = new JSeparator();
	private JSeparator separa2 = new JSeparator();
	
	private JTextField texQtdVendida = new JTextField();
	private JLabel titulo1 = new JLabel("Venda");
	private JLabel labelQtdVend  = new JLabel("Quantidade vendida:");
	private JButton btnVend = new JButton("vender");
	private static ControleDado dads;
	private int posicao;
	private int opcao;

	public void VerDadosEditar(int op, ControleDado d, int pos) {

		opcao = op;
		dads = d;
		posicao = pos; 
		
		titulo1.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 34));
		labelQtdVend.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		btnVend.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 17));
		separa1.setBackground(Color.LIGHT_GRAY);
		separa1.setForeground(Color.BLACK);
		separa2.setBackground(Color.LIGHT_GRAY);
		separa2.setForeground(Color.BLACK);
	
		titulo1.setBounds(254, 10, 151, 56);
		separa1.setBounds(52, 76, 541, 4);
		separa2.setBounds(52, 175, 541, 4);
		labelQtdVend.setBounds(211, 90, 220, 34);
		btnVend.setBounds(477, 192, 97, 40);
		texQtdVendida.setBounds(252, 122, 110, 26);
		
		if (opcao == 2) {
			janelaDadsEstoque.add(titulo1);
			janelaDadsEstoque.add(separa1);
			janelaDadsEstoque.add(labelQtdVend);
			janelaDadsEstoque.add(texQtdVendida);
			janelaDadsEstoque.add(separa2);
			janelaDadsEstoque.add(btnVend);
		}

		janelaDadsEstoque.setLayout(null);

		janelaDadsEstoque.setBounds(100, 100, 651, 286);
		janelaDadsEstoque.setLocationRelativeTo(null); //para janela ficar centralizada na hora de abrir
		janelaDadsEstoque.setVisible(true);

		btnVend.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == btnVend) {
			try {
				if(opcao == 2) {
					String qantidadeVend = texQtdVendida.getText();
					int texQtdForn = dads.getEstoques()[posicao].getQuantidadeFornecida();
					
					if (Integer.parseInt(qantidadeVend) > texQtdForn) {
						msgVendaErroSemEstoq();
					} else {
						int NovoEstoq = texQtdForn - Integer.parseInt(qantidadeVend); 
						dads.getEstoques()[posicao].setQuantidadeFornecida(NovoEstoq);
						msgVendaSucesso(); 
					}
				}
		} catch (NumberFormatException exc1) {
			msgVendaErro();
		}
		} 
	}

	public void msgVendaSucesso() {
		JOptionPane.showMessageDialog(null, "                                                         Produto em Estoque Vendido!"
				+ "\nDica: Fecha a janela (Dados do Estoque/Editar Dados) e Atualize a lista dos estoques para ver as alterações.", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janelaDadsEstoque.dispose();
	}

	public void msgVendaErro() {
		JOptionPane.showMessageDialog(null,"ERRO AO VENDER O PRODUTO!\n "
				+ "Motivo para o erro:  \n"
				+ "1) O campo na caixa de texto esta vazio.", null, 
				JOptionPane.ERROR_MESSAGE);

	}

	public void msgVendaErroSemEstoq() {
		JOptionPane.showMessageDialog(null,"ERRO AO VENDER O PRODUTO!\n "
				+ "Motivo para o erro:  \n"
				+ "1) A quantidade vendida é maior do que a quantidade disponível no estoque."
				+ "\nDica: Reponha a quantidade fornecida desse produto", null, 
				JOptionPane.ERROR_MESSAGE);

	}
	
}