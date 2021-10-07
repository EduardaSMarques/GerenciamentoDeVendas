package visualiza;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import controle.*;

/**
 * Janela de vendas para vender o produto selecionado
 * @author Maria Eduarda Barbosa e Maria Eduarda Marques
 * @version 1.0 (outubro 2021)
 */
public class JanelaVenda implements ActionListener {

	private JFrame janelaDadsVenda = new JFrame("Venda");
	private JSeparator separa1 = new JSeparator();
	private JSeparator separa2 = new JSeparator();
	
	private JTextField texQtdVendida = new JTextField();
	private JLabel titulo1 = new JLabel("Venda");
	private JLabel labelQtdVend  = new JLabel("Quantidade vendida:");
	private JButton btnVend = new JButton("vender");
	private static ControleDado dads;
	private int posicao;
	private int opcao;

	/**
	 * M�todo que estiliza e adiciona o bot�o a caixa de texto e a label na janela, sendo eles:
	 * [1]bot�o de vender
	 * [2]caixa de texto para digitar a quantidade vendida
	 * [3]label informando o que digitar na caixa de texto
	 * @param op vari�vel que cont�m um n�mero inteiro indicando a op��o escolhida
	 * @param dad vari�vel que cont�m a classe de ControleDado onde est� armazenado os dados das classes
	 * @param pos vari�vel que cont�m um n�mero inteiro com a posi��o do dado no array da classe JanelaEstoque
	 */
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
			janelaDadsVenda.add(titulo1);
			janelaDadsVenda.add(separa1);
			janelaDadsVenda.add(labelQtdVend);
			janelaDadsVenda.add(texQtdVendida);
			janelaDadsVenda.add(separa2);
			janelaDadsVenda.add(btnVend);
		}

		janelaDadsVenda.setLayout(null);

		janelaDadsVenda.setBounds(100, 100, 651, 286);
		janelaDadsVenda.setLocationRelativeTo(null); //para janela ficar centralizada na hora de abrir
		janelaDadsVenda.setVisible(true);

		btnVend.addActionListener(this);
	}

	/**
	 * M�todo que implementa os comandos que os bot�es devem seguir
	 * @param e uma vari�vel que cont�m o ActionEvent e identifica o evento que ocorreu
	 */
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

	/**
	 * M�todo que mostra uma mensagem de sucesso ao vender o produto em estoque
	 */
	public void msgVendaSucesso() {
		JOptionPane.showMessageDialog(null, "                                                         Produto em Estoque Vendido!"
				+ "\nDica: Fecha a janela (Dados do Estoque/Editar Dados) e Atualize a lista dos estoques para ver as altera��es.", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janelaDadsVenda.dispose();
	}

	/**
	 * M�todo que mostra uma mensagem quando dar erro ao vender o produto em estoque
	 */
	public void msgVendaErro() {
		JOptionPane.showMessageDialog(null,"ERRO AO VENDER O PRODUTO!\n "
				+ "Motivo para o erro:  \n"
				+ "1) O campo na caixa de texto esta vazio.", null, 
				JOptionPane.ERROR_MESSAGE);

	}

	/**
	 * M�todo que mostra uma mensagem quando dar erro ao vender o produto em estoque
	 */
	public void msgVendaErroSemEstoq() {
		JOptionPane.showMessageDialog(null,"ERRO AO VENDER O PRODUTO!\n "
				+ "Motivo para o erro:  \n"
				+ "1) A quantidade vendida � maior do que a quantidade dispon�vel no estoque."
				+ "\nDica: Reponha a quantidade fornecida desse produto", null, 
				JOptionPane.ERROR_MESSAGE);

	}
	
}