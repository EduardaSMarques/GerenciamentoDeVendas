package visualiza;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controle.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaCliente implements ActionListener, ListSelectionListener {
	
	private static JFrame janelaCliente = new JFrame("Gerenciamento de Vendas");
	private static JPanel panelCliente = new JPanel();
	private static JPanel panelCadastrar = new JPanel();
	private static ControleDado dads;
	private static String[] listaNomes = new String[50];
	private static String[] listaPesquisa = new String[20];
	private JList<String> listaPesquisaTemporaria;
	private JList<String> listaClientes;

	private static JLabel titulo1 = new JLabel("Clientes");
	private static JLabel titulo2 = new JLabel("Cadastrar Clientes");
	private static JLabel labelPesq = new JLabel("Pesquisar pelo nome:");
	private static JTextField texPesq = new JTextField();
	private static JLabel labelIdCliente = new JLabel("ID do Cliente:");
	private static JTextField texIdCliente = new JTextField();
	private static JLabel labelNomClient = new JLabel("Nome do Cliente:");
	private static JTextField texNomClient = new JTextField();
	private static JLabel labelCpf = new JLabel("CPF:");
	private static JTextField texCpf = new JTextField();
	private static JLabel labelTelefon = new JLabel("Telefone:");
	private static JTextField texTelefon = new JTextField();
	private static JLabel labelEmail  = new JLabel("E-mail:");
	private static JTextField texEmail  = new JTextField();
	private static JLabel labelGenero = new JLabel("Gênero:");
	private static JTextField texGenero  = new JTextField();
	private static JButton btnBuscar = new JButton("Buscar");
	private static JButton btnAtualizar = new JButton("Atualizar");
	private static JButton btnFinaliCadast = new JButton("Cadastrar");
	private String[] cadastraDadosNovos = new String[9];
	
	public void mostraTelaClient(ControleDado dad) {
		dads = dad;
		
		panelCliente.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.RIGHT, TitledBorder.BELOW_TOP, null, new Color(0, 0, 0)));
		panelCadastrar.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.RIGHT, TitledBorder.BELOW_TOP, null, new Color(0, 0, 0)));
		titulo1.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 43));
		titulo2.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 40));
		labelPesq.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		labelIdCliente.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		labelNomClient.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		labelCpf.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		labelTelefon.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		labelEmail.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		labelGenero.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		btnBuscar.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 17));
		btnAtualizar.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 17));
		btnFinaliCadast.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 17));
		
		listaNomes = new ControleCliente(dads).getNomeClientes();
		listaClientes = new JList<String>(listaNomes);
		listaClientes.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaClientes.setVisibleRowCount(10);
		
		panelCliente.setBounds(10, 10, 782, 325);
		panelCadastrar.setBounds(10, 340, 782, 241);
		titulo1.setBounds(289, 10, 303, 46);
		titulo2.setBounds(208, 0, 450, 56);
		labelPesq.setBounds(10, 61, 208, 24);
		labelIdCliente.setBounds(12, 64, 154, 34);
		labelNomClient.setBounds(167, 64, 196, 34);
		labelCpf.setBounds(11, 174, 70, 34);
		labelTelefon.setBounds(337, 121, 113, 34);
		labelEmail.setBounds(10, 121, 89, 34);
		labelGenero.setBounds(287, 174, 97, 34);
		texPesq.setBounds(10, 88, 462, 26);
		texIdCliente.setBounds(11, 96, 121, 26);
		texNomClient.setBounds(167, 96, 471, 26);
		texCpf.setBounds(11, 205, 252, 26);
		texTelefon.setBounds(336, 151, 252, 26);
		texEmail.setBounds(10, 151, 306, 26);
		texGenero.setBounds(287, 205, 196, 26);
		btnBuscar.setBounds(482, 77, 97, 40);
		btnAtualizar.setBounds(659, 275, 113, 40);
		btnFinaliCadast.setBounds(567, 191, 205, 40);
		listaClientes.setBounds(10, 124, 762, 141);
		
		janelaCliente.setLayout(null);
		panelCliente.setLayout(null);
		panelCadastrar.setLayout(null);
		
		panelCliente.add(titulo1);
		panelCliente.add(labelPesq);
		panelCliente.add(texPesq);
		panelCliente.add(listaClientes);
		panelCliente.add(btnBuscar);
		panelCliente.add(btnAtualizar);
		
		panelCadastrar.add(titulo2);
		panelCadastrar.add(labelIdCliente);
		panelCadastrar.add(texIdCliente);
		panelCadastrar.add(labelNomClient);
		panelCadastrar.add(texNomClient);
		panelCadastrar.add(labelCpf);
		panelCadastrar.add(texCpf);
		panelCadastrar.add(labelTelefon);
		panelCadastrar.add(texTelefon);
		panelCadastrar.add(labelEmail);
		panelCadastrar.add(texEmail);
		panelCadastrar.add(labelGenero);
		panelCadastrar.add(texGenero);
		panelCadastrar.add(btnFinaliCadast);
		
		janelaCliente.add(panelCliente);
		janelaCliente.add(panelCadastrar);
		
		janelaCliente.setBounds(100, 100, 816, 628);
		janelaCliente.setLocationRelativeTo(null); 
		janelaCliente.setVisible(true);
		
		btnBuscar.addActionListener(this);
		btnAtualizar.addActionListener(this);
		btnFinaliCadast.addActionListener(this);
		listaClientes.addListSelectionListener(this);	

	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if (src == btnBuscar) {
			
		}

		if (src == btnAtualizar) {
			listaClientes.setListData(new ControleCliente(dads).getNomeClientes());			
			listaClientes.updateUI();
		}
		
		if (src == btnFinaliCadast) {
			try {
				boolean truOrFals;
				//cadastrar cliente
				cadastraDadosNovos[0] = Integer.toString(dads.getQtdClientes());

				cadastraDadosNovos[1] =  texIdCliente.getText();
				cadastraDadosNovos[2] =  texNomClient.getText();
				cadastraDadosNovos[3] =  texCpf.getText();
				cadastraDadosNovos[4] =  texTelefon.getText();
				cadastraDadosNovos[5] =  texEmail.getText();
				cadastraDadosNovos[6] =  texGenero.getText();

				//valor boolean para o truOrFals
				truOrFals = dads.AdicionarEditarCliente(cadastraDadosNovos);

				if(truOrFals) {
					msgCadastroClienteSucesso();
				}
				else msgCadastroClienteErro();

			} catch (NullPointerException exc1) {
				msgCadastroClienteErro();
			} catch (NumberFormatException exc2) {
				msgCadastroClienteErro();
			}
		}

	}

	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if(e.getValueIsAdjusting() && src == listaClientes) {
			new JanelaDadosCliente().VerDadosEditar(1, dads,
					listaClientes.getSelectedIndex());
		}
		
		if(src == listaPesquisaTemporaria) {
			new JanelaDadosEstoque().VerDadosEditar(1, dads,
					listaPesquisaTemporaria.getSelectedIndex());
		}
		
	}
	
	public boolean comparaNome(String nome) {
		for (String noms : listaNomes) {
			if(nome.equals(noms) == true)
				return true;
		}
		return false;
	}
	
	public void testBusca() {
		int indice = 0;
		String nomeBuscar = texPesq.getText();
		boolean ComparaResult = comparaNome(nomeBuscar);
		
		if (ComparaResult == true) {
			listaPesquisa[indice] = nomeBuscar;
			listaClientes.setVisible(false);
			
			listaPesquisaTemporaria = new JList<String>(listaPesquisa);
			
			listaPesquisaTemporaria.setBounds(10, 124, 762, 141);
			panelCliente.add(listaPesquisaTemporaria);
		} else {
			msgErro();
		}
		
	}
	
	public void msgErro() {
		JOptionPane.showMessageDialog(null,"Nome não encontrado!", null, 
				JOptionPane.ERROR_MESSAGE);
	}
	
	public void msgAchou() {
		JOptionPane.showMessageDialog(null,"encontrado!", null, 
				JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void msgCadastroClienteSucesso() {
		JOptionPane.showMessageDialog(null, "Os Dados do Cliente Foram Salvos!"
				+ "\nDica: Atualize a lista de clientes para ver as alterações.", null, 
				JOptionPane.INFORMATION_MESSAGE);
	}

	public void msgCadastroClienteErro() {
		JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS!\n "
				+ "Motivos para o erro:  \n"
				+ "1) O campo na caixa de texto esta vazio. \n"
				+ "2) Não foi preenchido de maneira correta em (ID do Cliente e/ou Telefone), "
				+ "\nambos só podem conter números.", null, 
				JOptionPane.ERROR_MESSAGE);
	}
	
}
