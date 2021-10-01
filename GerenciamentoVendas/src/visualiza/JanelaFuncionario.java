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

public class JanelaFuncionario implements ActionListener, ListSelectionListener {
	
	private static JFrame janelaEstoque = new JFrame("Gerenciamento de Vendas");
	private static JPanel panelFuncionario = new JPanel();
	private static JPanel panelCadastrar = new JPanel();
	private static ControleDado dads;
	private static String[] listaNomes = new String[50];
	private static String[] listaPesquisa = new String[20];
	private JList<String> listaPesquisaTemporaria;
	private JList<String> listaFuncionarios;

	private static JLabel titulo1 = new JLabel("Funcionários");
	private static JLabel titulo2 = new JLabel("Cadastrar Funcionário");
	private static JLabel labelPesq = new JLabel("Pesquisar pelo nome:");
	private static JTextField texPesq = new JTextField();
	private static JLabel labelNome = new JLabel("Nome do funcionário:");
	private static JTextField texNome = new JTextField();
	private static JLabel labelEndereco = new JLabel("Endereço:");
	private static JTextField texEndereco = new JTextField();
	private static JLabel labelEmail = new JLabel("E-mail:");
	private static JTextField texEmail = new JTextField();
	private static JLabel labelTelefone = new JLabel("Telefone:");
	private static JTextField texTelefone = new JTextField();
	private static JLabel labelSalario = new JLabel("Salário:");
	private static JTextField texSalario = new JTextField();
	private static JButton btnBuscar = new JButton("Buscar");
	private static JButton btnAtualizar = new JButton("Atualizar");
	private static JButton btnFinaliCadast = new JButton("Cadastrar");
	private String[] cadastraDadosNovos = new String[9];
	
	public void mostraTelaFuncio(ControleDado dad) {
		dads = dad;
		
		panelFuncionario.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.RIGHT, TitledBorder.BELOW_TOP, null, new Color(0, 0, 0)));
		panelCadastrar.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.RIGHT, TitledBorder.BELOW_TOP, null, new Color(0, 0, 0)));
		titulo1.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 40));
		titulo2.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 40));
		labelPesq.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		labelNome.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		labelEndereco.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		labelEmail.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		labelTelefone.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		labelSalario.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		btnBuscar.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 17));
		btnAtualizar.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 17));
		btnFinaliCadast.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 17));
		
		listaNomes = new ControleFuncionario(dads).getNomeFuncio();
		listaFuncionarios = new JList<String>(listaNomes);
		listaFuncionarios.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaFuncionarios.setVisibleRowCount(10);
		
		panelFuncionario.setBounds(10, 10, 782, 325);
		panelCadastrar.setBounds(10, 340, 782, 241);
		titulo1.setBounds(261, 0, 303, 46);
		titulo2.setBounds(208, 0, 450, 56);
		labelPesq.setBounds(10, 61, 208, 24);
		labelNome.setBounds(11, 66, 275, 34);
		labelEndereco.setBounds(11, 117, 131, 34);
		labelEmail.setBounds(13, 174, 88, 34);
		labelTelefone.setBounds(493, 66, 275, 34);
		labelSalario.setBounds(493, 117, 103, 34);
		texPesq.setBounds(10, 88, 462, 26);
		texNome.setBounds(11, 94, 442, 26);
		texEndereco.setBounds(11, 150, 442, 26);
		texEmail.setBounds(13, 205, 442, 26);
		texTelefone.setBounds(493, 94, 275, 26);
		texSalario.setBounds(492, 150, 131, 26);
		btnBuscar.setBounds(482, 77, 97, 40);
		btnAtualizar.setBounds(659, 275, 113, 40);
		btnFinaliCadast.setBounds(567, 191, 205, 40);
		listaFuncionarios.setBounds(10, 124, 762, 141);
		
		janelaEstoque.setLayout(null);
		panelFuncionario.setLayout(null);
		panelCadastrar.setLayout(null);
		
		panelFuncionario.add(titulo1);
		panelFuncionario.add(labelPesq);
		panelFuncionario.add(texPesq);
		panelFuncionario.add(listaFuncionarios);
		panelFuncionario.add(btnBuscar);
		panelFuncionario.add(btnAtualizar);
		
		panelCadastrar.add(titulo2);
		panelCadastrar.add(labelNome);
		panelCadastrar.add(texNome);
		panelCadastrar.add(labelEndereco);
		panelCadastrar.add(texEndereco);
		panelCadastrar.add(labelEmail);
		panelCadastrar.add(texEmail);
		panelCadastrar.add(labelTelefone);
		panelCadastrar.add(texTelefone);
		panelCadastrar.add(labelSalario);
		panelCadastrar.add(texSalario);
		panelCadastrar.add(btnFinaliCadast);
		
		janelaEstoque.add(panelFuncionario);
		janelaEstoque.add(panelCadastrar);
		
		janelaEstoque.setBounds(100, 100, 816, 628);
		janelaEstoque.setLocationRelativeTo(null); 
		janelaEstoque.setVisible(true);
		
		btnBuscar.addActionListener(this);
		btnAtualizar.addActionListener(this);
		btnFinaliCadast.addActionListener(this);
		listaFuncionarios.addListSelectionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if (src == btnBuscar) {
			
		}

		if (src == btnAtualizar) {
			listaFuncionarios.setListData(new ControleFuncionario(dads).getNomeFuncio());			
			listaFuncionarios.updateUI();
		}
		
		if (src == btnFinaliCadast) {
			try {
				boolean truOrFals;
				//cadastrar funcionario
				cadastraDadosNovos[0] = Integer.toString(dads.getQtdFuncionarios());

				cadastraDadosNovos[1] =  texNome.getText();
				cadastraDadosNovos[2] =  texTelefone.getText();
				cadastraDadosNovos[3] =  texEmail.getText();
				cadastraDadosNovos[4] =  texEndereco.getText();
				cadastraDadosNovos[5] =  texSalario.getText();

				//valor boolean para o truOrFals
				truOrFals = dads.AdicionarEditarFuncio(cadastraDadosNovos);
				

				if(truOrFals) {
					msgCadastroFuncionarioSucesso();
				}
				else msgCadastroFuncionarioErro();

			} catch (NullPointerException exc1) {
				msgCadastroFuncionarioErro();
			} catch (NumberFormatException exc2) {
				msgCadastroFuncionarioErro();
			}
		}

	}

	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if(e.getValueIsAdjusting() && src == listaFuncionarios) {
			new JanelaDadosFuncionario().VerDadosEditar(1, dads,
					listaFuncionarios.getSelectedIndex());
		}
		
		if(src == listaPesquisaTemporaria) {
			new JanelaDadosFuncionario().VerDadosEditar(1, dads,
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
			listaFuncionarios.setVisible(false);
			listaPesquisaTemporaria = new JList<String>(listaPesquisa);
			listaPesquisaTemporaria.setBounds(10, 124, 762, 141);
			panelFuncionario.add(listaPesquisaTemporaria);
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
	
	public void msgCadastroFuncionarioSucesso() {
		JOptionPane.showMessageDialog(null, "Os Dados do Funcionário Foram Salvos!"
				+ "\nDica: Atualize a lista dos funcionários para ver as alterações.", null, 
				JOptionPane.INFORMATION_MESSAGE);
	}

	public void msgCadastroFuncionarioErro() {
		JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS!\n "
				+ "Motivos para o erro:  \n"
				+ "1) O campo na caixa de texto esta vazio. \n"
				+ "2) Não foi preenchido de maneira correta em (Telefone e/ou Salário), ambos só podem conter números.", null, 
				JOptionPane.ERROR_MESSAGE);
	}
	
}
