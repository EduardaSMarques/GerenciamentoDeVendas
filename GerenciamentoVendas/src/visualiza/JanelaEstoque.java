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

public class JanelaEstoque implements ActionListener, ListSelectionListener {
	
	private static JFrame janelaEstoque = new JFrame("Gerenciamento de Vendas");
	private static JPanel panelFuncionario = new JPanel();
	private static JPanel panelCadastrar = new JPanel();
	private static ControleDado dads;
	private static String[] listaNomes = new String[50];
	private static String[] listaPesquisa = new String[20];
	private JList<String> listaPesquisaTemporaria;
	private JList<String> listaEstoques;

	private static JLabel titulo1 = new JLabel("Estoques");
	private static JLabel titulo2 = new JLabel("Cadastrar Estoque");
	private static JLabel labelPesq = new JLabel("Pesquisar pelo nome:");
	private static JTextField texPesq = new JTextField();
	private static JLabel labelCateg = new JLabel("Categoria do produto:");
	private static JTextField texCateg = new JTextField();
	private static JLabel labelNomProd = new JLabel("Nome do produto:");
	private static JTextField texNomProd = new JTextField();
	private static JLabel labelQtdForn = new JLabel("Quantidade Fornecida:");
	private static JTextField texQtdForn = new JTextField();
	private static JLabel labelPreco = new JLabel("Preço:");
	private static JTextField texPreco = new JTextField();
	private static JButton btnBuscar = new JButton("Buscar");
	private static JButton btnAtualizar = new JButton("Atualizar");
	private static JButton btnFinaliCadast = new JButton("Cadastrar");
	private String[] cadastraDadosNovos = new String[9];
	
	public void mostraTelaEstoq(ControleDado dad) {
		dads = dad;
		
		panelFuncionario.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.RIGHT, TitledBorder.BELOW_TOP, null, new Color(0, 0, 0)));
		panelCadastrar.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.RIGHT, TitledBorder.BELOW_TOP, null, new Color(0, 0, 0)));
		titulo1.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 43));
		titulo2.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 40));
		labelPesq.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		labelCateg.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		labelNomProd.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		labelQtdForn.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		labelPreco.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		btnBuscar.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 17));
		btnAtualizar.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 17));
		btnFinaliCadast.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 17));
		
		listaNomes = new ControleEstoque(dads).getNomeProdEstoque();
		listaEstoques = new JList<String>(listaNomes);
		listaEstoques.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaEstoques.setVisibleRowCount(10);
		
		panelFuncionario.setBounds(10, 10, 782, 325);
		panelCadastrar.setBounds(10, 340, 782, 241);
		titulo1.setBounds(289, 10, 303, 46);
		titulo2.setBounds(208, 0, 450, 56);
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
		btnBuscar.setBounds(482, 77, 97, 40);
		btnAtualizar.setBounds(659, 275, 113, 40);
		btnFinaliCadast.setBounds(567, 191, 205, 40);
		listaEstoques.setBounds(10, 124, 762, 141);
		
		janelaEstoque.setLayout(null);
		panelFuncionario.setLayout(null);
		panelCadastrar.setLayout(null);
		
		panelFuncionario.add(titulo1);
		panelFuncionario.add(labelPesq);
		panelFuncionario.add(texPesq);
		panelFuncionario.add(listaEstoques);
		panelFuncionario.add(btnBuscar);
		panelFuncionario.add(btnAtualizar);
		
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
		
		janelaEstoque.add(panelFuncionario);
		janelaEstoque.add(panelCadastrar);
		
		janelaEstoque.setBounds(100, 100, 816, 628);
		janelaEstoque.setLocationRelativeTo(null); 
		janelaEstoque.setVisible(true);
		
		btnBuscar.addActionListener(this);
		btnAtualizar.addActionListener(this);
		btnFinaliCadast.addActionListener(this);
		listaEstoques.addListSelectionListener(this);	

	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if (src == btnBuscar) {
		}

		if (src == btnAtualizar) {
			listaEstoques.setListData(new ControleEstoque(dads).getNomeProdEstoque());			
			listaEstoques.updateUI();
		}
		
		if (src == btnFinaliCadast) {
			try {
				boolean truOrFals;
				//cadastrar estoque
				cadastraDadosNovos[0] = Integer.toString(dads.getQtdEstoques());

				cadastraDadosNovos[1] =  texCateg.getText();
				cadastraDadosNovos[2] =  texNomProd.getText();
				cadastraDadosNovos[3] =  texQtdForn.getText();
				cadastraDadosNovos[4] =  texPreco.getText();

				//valor boolean para o truOrFals
				truOrFals = dads.AdicionarEditarEstoque(cadastraDadosNovos);

				if(truOrFals) {
					msgCadastroEstoqueSucesso();
				}
				else msgCadastroEstoqueErro();

			} catch (NullPointerException exc1) {
				msgCadastroEstoqueErro();
			} catch (NumberFormatException exc2) {
				msgCadastroEstoqueErro();
			}
		}

	}

	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if(e.getValueIsAdjusting() && src == listaEstoques) {
			new JanelaDadosEstoque().VerDadosEditar(1, dads,
					listaEstoques.getSelectedIndex());
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
			listaEstoques.setVisible(false);
			
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
	
	public void msgCadastroEstoqueSucesso() {
		JOptionPane.showMessageDialog(null, "Os Dados do Estoque Foram Salvos!"
				+ "\nDica: Atualize a lista dos estoques para ver as alterações.", null, 
				JOptionPane.INFORMATION_MESSAGE);
	}

	public void msgCadastroEstoqueErro() {
		JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS!\n "
				+ "Motivos para o erro:  \n"
				+ "1) O campo na caixa de texto esta vazio. \n"
				+ "2) Não foi preenchido de maneira correta em (Quantidade Fornecida e/ou Preço da Quantidade Fornecida), "
				+ "\nambos só podem conter números.", null, 
				JOptionPane.ERROR_MESSAGE);
	}
	
}
