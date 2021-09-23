package visualiza;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JanelaProduto implements ActionListener{
	
	private JFrame janelaProduto = new JFrame("Gerenciamento de Vendas");
	private JLabel tituloTest = new JLabel("Parte2");
	
	public void mostraTelaProd() {
		tituloTest.setFont(new Font("Ubuntu Mono", Font.PLAIN, 64));
		tituloTest.setBounds(98, 98, 281, 59);
		
		janelaProduto.add(tituloTest);
		
		janelaProduto.setBounds(100, 100, 816, 628);
		janelaProduto.setLocationRelativeTo(null); //para janela ficar centralizada na hora de abrir
		janelaProduto.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		
	}

}
