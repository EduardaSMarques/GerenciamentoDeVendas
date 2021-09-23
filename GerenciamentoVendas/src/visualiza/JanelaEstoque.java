package visualiza;

import javax.swing.*;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaEstoque implements ActionListener {

	private JFrame janelaEstoque = new JFrame("Gerenciamento de Vendas");
	private JLabel tituloTest = new JLabel("Parte1");

	public void mostraTelaEstoq() {
		tituloTest.setFont(new Font("Ubuntu Mono", Font.PLAIN, 64));
		
		tituloTest.setBounds(98, 98, 281, 59);
		
		janelaEstoque.add(tituloTest);
		
		janelaEstoque.setBounds(100, 100, 816, 628);
		janelaEstoque.setLocationRelativeTo(null); 
		janelaEstoque.setVisible(true);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
	}
	

}
