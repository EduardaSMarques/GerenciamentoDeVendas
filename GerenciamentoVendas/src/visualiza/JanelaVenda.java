package visualiza;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controle.*;

public class JanelaVenda implements ActionListener, ListSelectionListener {

	
	// aviso: JanelaVenda incompleta 
	
	
	private static JFrame janelaVenda = new JFrame("Gerenciamento de Vendas");
	JPanel panelVenda = new JPanel();
	
	private static ControleDado dads;
	private static JLabel titulo1 = new JLabel("Vendas");
	JSeparator separador = new JSeparator();
	private static JLabel titulo2 = new JLabel("Digite o nome do produto a ser vendido:");
	
	private static JButton btnAtualizar = new JButton("Atualizar");
	private static String[] listaNomestest = new String[50];
	private JList<String> listaEstoquestest;
	
	public void mostraTelaVenda(ControleDado dad) {

		panelVenda.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.RIGHT, TitledBorder.BELOW_TOP, null, new Color(0, 0, 0)));
		titulo1.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 43));
		titulo2.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		btnAtualizar.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 17));
		separador.setForeground(Color.BLACK);
		
		listaNomestest = new ControleEstoque(dads).getNomeProdEstoque();
		listaEstoquestest = new JList<String>(listaNomestest);
		listaEstoquestest.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaEstoquestest.setVisibleRowCount(10);
		
		titulo1.setBounds(289, 42, 303, 46);
		separador.setBounds(45, 114, 665, 18);
		titulo2.setBounds(174, 142, 403, 34);
		listaEstoquestest.setBounds(127, 217, 541, 334);
		btnAtualizar.setBounds(127, 217, 541, 334);
		panelVenda.setBounds(24, 35, 748, 281);
		
		panelVenda.setLayout(null);
		janelaVenda.setLayout(null);
		
		janelaVenda.add(titulo1);
		janelaVenda.add(separador);
		janelaVenda.add(titulo2);
		janelaVenda.add(listaEstoquestest);
		janelaVenda.add(btnAtualizar);
		
		janelaVenda.setBounds(100, 100, 816, 628);
		janelaVenda.setLocationRelativeTo(null); 
		janelaVenda.setVisible(true);
	
		btnAtualizar.addActionListener(this);
		listaEstoquestest.addListSelectionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == btnAtualizar) {
			listaEstoquestest.setListData(new ControleEstoque(dads).getNomeProdEstoque());			
			listaEstoquestest.updateUI();
		}
		
	}
	
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if(e.getValueIsAdjusting() && src == listaEstoquestest) {
		}
	}
	
}
