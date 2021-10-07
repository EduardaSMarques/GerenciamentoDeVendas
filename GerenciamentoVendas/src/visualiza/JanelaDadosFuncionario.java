package visualiza;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import controle.*;

/**
 * Janela dos dados do Funcion�rio para salvar e excluir
 * @author Maria Eduarda Barbosa e Maria Eduarda Marques
 * @version 1.0 (outubro 2021)
 */
public class JanelaDadosFuncionario implements ActionListener {

	private JFrame janelaDadsFuncio = new JFrame("Dados do Funcion�rio");
	private JSeparator separa1 = new JSeparator();
	private JSeparator separa2 = new JSeparator();
	
	private JLabel titulo1 = new JLabel("Dados do Funcion�rio/Editar Dados");
	private JLabel labelNome = new JLabel("Nome do funcion�rio:");
	private JTextField texNome;
	private JLabel labelTelefone  = new JLabel("Telefone:");
	private JTextField texTelefone;
	private JLabel labelEmail = new JLabel("E-mail:");
	private JTextField texEmail;
	private JLabel labelEndereo  = new JLabel("Endere�o:");
	private JTextField texEndereco;
	private JLabel labelSalario = new JLabel("Sal�rio:");
	private JTextField texSalario;
	private JButton btnSalvar = new JButton("Salvar");
	private JButton btnExcluir = new JButton("Excluir");
	private String[] novoDado = new String[9];
	private static ControleDado dads;
	private int posicao;
	private int opcao;

	/**
	 * M�todo que preenche com dados as caixas de textos do cliente selecionado na lista, tamb�m estiliza e adiciona os bot�es as caixas de textos e as labels na janela, sendo eles:
	 * [1]bot�es de salvar e excluir
	 * [2]caixas de textos para digitar informa��es
	 * [3]labels informando o que digitar nas caixas de textos
	 * @param op vari�vel que cont�m um n�mero inteiro indicando a op��o escolhida
	 * @param dad vari�vel que cont�m a classe de ControleDado onde est� armazenado os dados das classes
	 * @param pos vari�vel que cont�m um n�mero inteiro sendo ele a posi��o do dado no array da classe JanelaFuncionario
	 */
	public void VerDadosEditar(int op, ControleDado d, int pos) {

		opcao = op;
		dads = d;
		posicao = pos;

		//Campos do JTexField sendo preenchidos por dados do funcionario selecionado
		if (op == 1) {
			texNome = new JTextField(dads.getFuncionarios()[pos].getNome(), 100);
			texTelefone = new JTextField(String.valueOf(dads.getFuncionarios()[pos].getTelefone()), 20);
			texEmail = new JTextField(dads.getFuncionarios()[pos].getEmail(), 100);
			texEndereco = new JTextField(dads.getFuncionarios()[pos].getEndereco(), 100);
			texSalario = new JTextField(String.valueOf(dads.getFuncionarios()[pos].getSalario()), 20);
		} 
		
		titulo1.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 34));
		labelNome.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		labelTelefone.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		labelEmail.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		labelEndereo.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		labelSalario.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		btnSalvar.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 17));
		btnExcluir.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 17));
		separa1.setBackground(Color.LIGHT_GRAY);
		separa1.setForeground(Color.BLACK);
		separa2.setBackground(Color.LIGHT_GRAY);
		separa2.setForeground(Color.BLACK);
	
		titulo1.setBounds(78, 10, 616, 56);
		separa1.setBounds(56, 76, 596, 9);
		separa2.setBounds(67, 441, 596, 9);
		labelNome.setBounds(117, 92, 275, 34);
		texNome.setBounds(116, 124, 472, 26);
		labelTelefone.setBounds(119, 160, 275, 34);
		texTelefone.setBounds(119, 192, 275, 26);
		labelEmail.setBounds(119, 228, 88, 34);
		texEmail.setBounds(119, 259, 471, 26);		
		labelEndereo.setBounds(119, 295, 131, 34);
		texEndereco.setBounds(119, 326, 471, 26);
		labelSalario.setBounds(121, 362, 103, 34);
		texSalario.setBounds(119, 393, 131, 26);
		btnSalvar.setBounds(480, 471, 97, 40);
		btnExcluir.setBounds(597, 471, 97, 40);

		janelaDadsFuncio.add(titulo1);
		janelaDadsFuncio.add(separa1);
		janelaDadsFuncio.add(separa2);
		janelaDadsFuncio.add(labelNome);
		janelaDadsFuncio.add(texNome);
		janelaDadsFuncio.add(labelTelefone);
		janelaDadsFuncio.add(texTelefone);
		janelaDadsFuncio.add(labelEmail);
		janelaDadsFuncio.add(texEmail);
		janelaDadsFuncio.add(labelEndereo);
		janelaDadsFuncio.add(texEndereco);
		janelaDadsFuncio.add(labelSalario);
		janelaDadsFuncio.add(texSalario);
		janelaDadsFuncio.add(btnSalvar);
		janelaDadsFuncio.add(btnExcluir);

		janelaDadsFuncio.setLayout(null);

		janelaDadsFuncio.setBounds(100, 100, 730, 561);
		janelaDadsFuncio.setLocationRelativeTo(null); //para janela ficar centralizada na hora de abrir
		janelaDadsFuncio.setVisible(true);

		btnSalvar.addActionListener(this);
		btnExcluir.addActionListener(this);
	}

	/**
	 * M�todo que implementa os comandos que os bot�es devem seguir
	 * @param e uma vari�vel que cont�m o ActionEvent e identifica o evento que ocorreu
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == btnSalvar) {
			try {
				boolean truOrFals;
				if(opcao == 1)
					novoDado[0] = Integer.toString(posicao); //editar os dados

				novoDado[1] =  texNome.getText();
				novoDado[2] =  texTelefone.getText();
				novoDado[3] =  texEmail.getText();
				novoDado[4] =  texEndereco.getText();
				novoDado[5] =  texSalario.getText();

				//valor boolean para o truOrFals
				truOrFals = dads.AdicionarEditarFuncio(novoDado);
				
				if(truOrFals) {
					msgSalvarFuncionarioSucesso();
				}
				else msgSalvarFuncionarioErro();

			} catch (NullPointerException exc1) {
				msgSalvarFuncionarioErro();
			} catch (NumberFormatException exc2) {
				msgSalvarFuncionarioErro();
			}
		}

		if(src == btnExcluir) {
			boolean truOrFals = false;
			
			if (opcao == 1) {
				truOrFals = dads.removerFuncionario(posicao); //Exclui dados do funcionario funcionario
				if (truOrFals) msgExcluirFuncionarioSucesso(); 
				else msgExcluirFuncionarioErro(); 
			}			
		}
	}

	/**
	 * M�todo que mostra uma mensagem de sucesso ao excluir os dados do funcion�rio
	 */
	public void msgExcluirFuncionarioSucesso() {
		JOptionPane.showMessageDialog(null, "Os Dados do Funcion�rio Foram Excluidos!"
				+ "\nDica: Atualize a lista de funcionarios para ver as altera��es.", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janelaDadsFuncio.dispose();
	}
	
	/**
	 * M�todo que mostra uma mensagem quando dar erro ao excluir os dados do funcion�rio
	 */
	public void msgExcluirFuncionarioErro() {
		JOptionPane.showMessageDialog(null,"Erro ao excluir. "
				+ "\nVerifique se o funcion�rio esta na lista de funcion�rios atualizada.\n", null, 
				JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * M�todo que mostra uma mensagem de sucesso ao salvar a edi��o dos dados do funcion�rio
	 */
	public void msgSalvarFuncionarioSucesso() {
		JOptionPane.showMessageDialog(null, "Os Dados do Funcion�rio Foram Salvos!"
				+ "\nDica: Atualize a lista dos funcion�rios para ver as altera��es.", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janelaDadsFuncio.dispose();
	}

	/**
	 * M�todo que mostra uma mensagem quando dar erro ao salvar os dados de funcion�rio
	 */
	public void msgSalvarFuncionarioErro() {
		JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS!\n "
				+ "Motivos para o erro:  \n"
				+ "1) O campo na caixa de texto esta vazio. \n"
				+ "2) N�o foi preenchido de maneira correta em (Telefone e/ou Sal�rio), ambos s� podem conter n�meros.", null, 
				JOptionPane.ERROR_MESSAGE);
	}

}