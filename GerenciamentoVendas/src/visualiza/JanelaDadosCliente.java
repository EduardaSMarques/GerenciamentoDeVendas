package visualiza;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import controle.*;

/**
 * Janela dos dados do Cliente para salvar e excluir
 * @author Maria Eduarda Barbosa e Maria Eduarda Marques
 * @version 1.0 (outubro 2021)
 */
public class JanelaDadosCliente implements ActionListener {

	private JFrame janelaDadsClient = new JFrame("Dados do Cliente");
	private JSeparator separa1 = new JSeparator();
	private JSeparator separa2 = new JSeparator();
	
	private JLabel titulo1 = new JLabel("Dados do Cliente/Editar Dados");
	private JLabel labelIdCliente = new JLabel("ID do Cliente:");
	private JTextField texIdCliente;
	private JLabel labelNomClient  = new JLabel("Nome do Cliente:");
	private JTextField texNomClient;
	private JLabel labelCpf = new JLabel("CPF:");
	private JTextField texCpf;
	private JLabel labelTelefon  = new JLabel("Telefone:");
	private JTextField texTelefon;
	private JLabel labelEmail  = new JLabel("E-mail:");
	private JTextField texEmail;
	private JLabel labelGenero = new JLabel("Gênero:");
	private JTextField texGenero;
	private JButton btnSalvar = new JButton("Salvar");
	private JButton btnExcluir = new JButton("Excluir");
	private String[] dadosNovos = new String[9];
	private static ControleDado dads;
	private int posicao;
	private int opcao;

	/**
	 * Método que preenche com dados as caixas de textos do cliente selecionado na lista, também estiliza e adiciona os botões as caixas de textos e as labels na janela, sendo eles:
	 * [1]botões de salvar e excluir
	 * [2]caixas de textos para digitar informações
	 * [3]labels informando o que digitar nas caixas de textos
	 * @param op variável que contém um número inteiro indicando a opção escolhida
	 * @param dad variável que contém a classe de ControleDado onde está armazenado os dados das classes
	 * @param pos variável que contém um número inteiro sendo ele a posição do dado no array da classe JanelaCliente
	 */
	public void VerDadosEditar(int op, ControleDado d, int pos) {

		opcao = op;
		dads = d;
		posicao = pos;

		//Campos do JTexField sendo preenchidos por dados do cliente selecionado
		if (op == 1) {
			texIdCliente = new JTextField(String.valueOf(dads.getClientes()[pos].getClienteID()), 20);
			texNomClient = new JTextField(dads.getClientes()[pos].getNome(), 100);
			texCpf = new JTextField(dads.getClientes()[pos].getNumCPF(), 100);
			texTelefon = new JTextField(String.valueOf(dads.getClientes()[pos].getTelefone()), 20);		
			texEmail = new JTextField(dads.getClientes()[pos].getEmail(), 100);
			texGenero = new JTextField(dads.getClientes()[pos].getGenero(), 100);
			
		} 
		
		titulo1.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 34));
		labelIdCliente.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		labelNomClient.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		labelCpf.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		labelTelefon.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		labelEmail.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		labelGenero.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		
		btnSalvar.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 17));
		btnExcluir.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 17));
		separa1.setBackground(Color.LIGHT_GRAY);
		separa1.setForeground(Color.BLACK);
		separa2.setBackground(Color.LIGHT_GRAY);
		separa2.setForeground(Color.BLACK);
	
		titulo1.setBounds(78, 10, 616, 56);
		separa1.setBounds(56, 76, 596, 9);
		separa2.setBounds(67, 441, 596, 9);
		labelIdCliente.setBounds(99, 90, 154, 34);
		texIdCliente.setBounds(98, 122, 121, 26);
		labelNomClient.setBounds(99, 158, 196, 34);
		texNomClient.setBounds(99, 190, 471, 26);
		labelCpf.setBounds(99, 226, 70, 34);
		texCpf.setBounds(99, 257, 252, 26);		
		labelTelefon.setBounds(101, 293, 113, 34);
		texTelefon.setBounds(99, 324, 252, 26);
		labelEmail.setBounds(99, 360, 89, 34);
		texEmail.setBounds(99, 392, 306, 26);
		labelGenero.setBounds(431, 360, 97, 34);
		texGenero.setBounds(431, 391, 196, 26);
		btnSalvar.setBounds(480, 471, 97, 40);
		btnExcluir.setBounds(597, 471, 97, 40);

		janelaDadsClient.add(titulo1);
		janelaDadsClient.add(separa1);
		janelaDadsClient.add(separa2);
		janelaDadsClient.add(labelIdCliente);
		janelaDadsClient.add(texIdCliente);
		janelaDadsClient.add(labelNomClient);
		janelaDadsClient.add(texNomClient);
		janelaDadsClient.add(labelCpf);
		janelaDadsClient.add(texCpf);
		janelaDadsClient.add(labelTelefon);
		janelaDadsClient.add(texTelefon);
		janelaDadsClient.add(labelEmail);
		janelaDadsClient.add(texEmail);
		janelaDadsClient.add(labelGenero);
		janelaDadsClient.add(texGenero);
		janelaDadsClient.add(btnSalvar);
		janelaDadsClient.add(btnExcluir);

		janelaDadsClient.setLayout(null);

		janelaDadsClient.setBounds(100, 100, 730, 561);
		janelaDadsClient.setLocationRelativeTo(null); 
		janelaDadsClient.setVisible(true);

		btnSalvar.addActionListener(this);
		btnExcluir.addActionListener(this);
	}

	/**
	 * Método que implementa os comandos que os botões devem seguir
	 * @param e uma variável que contém o ActionEvent e identifica o evento que ocorreu
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == btnSalvar) {
			try {
				boolean truOrFals;
				if(opcao == 1)
					dadosNovos[0] = Integer.toString(posicao); //editar os dados

				dadosNovos[1] =  texIdCliente.getText();
				dadosNovos[2] =  texNomClient.getText();
				dadosNovos[3] =  texCpf.getText();
				dadosNovos[4] =  texTelefon.getText();
				dadosNovos[5] =  texEmail.getText();
				dadosNovos[6] =  texGenero.getText();

				// valor boolean para o truOrFals
				truOrFals = dads.AdicionarEditarCliente(dadosNovos);

				if(truOrFals) {
					msgSalvarClienteSucesso();
				}
				else msgSalvarClienteErro();

			} catch (NullPointerException exc1) {
				msgSalvarClienteErro();
			} catch (NumberFormatException exc2) {
				msgSalvarClienteErro();
			}
		}

		if(src == btnExcluir) {
			boolean truOrFals = false;

			if (opcao == 1) {
				truOrFals = dads.removerCliente(posicao); //Exclui dados do cliente
				if (truOrFals) msgExcluirClienteSucesso(); 
				else msgExcluirClienteErro(); 
			}			
		}
	}

	/**
	 * Método que mostra uma mensagem de sucesso ao excluir os dados de cliente
	 */
	public void msgExcluirClienteSucesso() {
		JOptionPane.showMessageDialog(null, "Os Dados do Cliente Foram Excluidos!"
				+ "\nDica: Atualize a lista de clientes para ver as alterações.", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janelaDadsClient.dispose();
	}
	
	/**
	 * Método que mostra uma mensagem quando dar erro ao excluir os dados do cliente
	 */
	public void msgExcluirClienteErro() {
		JOptionPane.showMessageDialog(null,"Erro ao excluir. "
				+ "\nVerifique se o nome do cliente em estoque esta na lista de clientes atualizada.\n", null, 
				JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * Método que mostra uma mensagem de sucesso ao salvar a edição dos dados do cliente
	 */
	public void msgSalvarClienteSucesso() {
		JOptionPane.showMessageDialog(null, "Os Dados do cliente Foram Salvos!"
				+ "\nDica: Atualize a lista de clientes para ver as alterações.", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janelaDadsClient.dispose();
	}

	/**
	 * Método que mostra uma mensagem quando dar erro ao salvar os dados de cliente
	 */
	public void msgSalvarClienteErro() {
		JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS!\n "
				+ "Motivos para o erro:  \n"
				+ "1) O campo na caixa de texto esta vazio. \n"
				+ "2) Não foi preenchido de maneira correta em (ID do Cliente e/ou Telefone), "
				+ "\nambos só podem conter números.", null, 
				JOptionPane.ERROR_MESSAGE);

	}

}


