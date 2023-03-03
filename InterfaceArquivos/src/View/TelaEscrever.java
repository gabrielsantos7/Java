package View;

import GerenciadorArquivos.Gerenciador;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class TelaEscrever {

	private JFrame frame;
	public String fileNameAndExtension;	


	public TelaEscrever(String fileNameAndExtension) {
		this.fileNameAndExtension = fileNameAndExtension;
		
		initialize();
	}
	
	
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.setLocationRelativeTo(null);
		
		JLabel txtEscrever = new JLabel("Digite o conteúdo a ser escrito no arquivo:");
		txtEscrever.setFont(new Font("Sylfaen", Font.PLAIN, 17));
		txtEscrever.setBounds(51, 11, 352, 23);

		frame.getContentPane().add(txtEscrever);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 45, 414, 160);
		frame.getContentPane().add(textPane);
		
		JRadioButton radioSobrescrever = new JRadioButton("Sobrescrever");
		radioSobrescrever.setBounds(217, 227, 112, 23);
		frame.getContentPane().add(radioSobrescrever);
		
		JRadioButton radioEscrever = new JRadioButton("Escrever");
		radioEscrever.setBounds(138, 227, 77, 23);
		radioEscrever.setSelected(true);
		frame.getContentPane().add(radioEscrever);
		
		ButtonGroup group = new ButtonGroup();
		group.add(radioSobrescrever);
		group.add(radioEscrever);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaOpcoes t = new TelaOpcoes(fileNameAndExtension);
				frame.setVisible(false);
			}
		});
		btnCancelar.setBounds(10, 227, 89, 23);
		frame.getContentPane().add(btnCancelar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Gerenciador g = new Gerenciador(fileNameAndExtension);
				String txt = textPane.getText();
				
				if(!txt.equals("")) {
					boolean selecaoEscrever = radioEscrever.isSelected();
					boolean novaLinha = false;
					
					if(selecaoEscrever) {
						Object[] options = {"NÃO", "SIM"};
				         
		                int resp = JOptionPane.showOptionDialog(null,"Você deseja escrever o conteúdo em uma nova linha?", "Selecione uma opção", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,  null, options, options[0]);
		                if(resp != 0) {
		                	novaLinha = true;
		                }else {
		                	novaLinha = false;
		                }
		                
		                
					}
					
					g.escrever(txt, selecaoEscrever, novaLinha );
					JOptionPane.showMessageDialog(null, "O texto foi salvo no documento!", "Texto salvo", JOptionPane.DEFAULT_OPTION);
				}
				

				TelaOpcoes t = new TelaOpcoes(fileNameAndExtension);
				frame.setVisible(false);
			}
		});
		btnSalvar.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(btnSalvar);
		
		frame.setVisible(true);
	}
}
