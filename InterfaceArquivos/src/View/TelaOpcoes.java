package View;

import GerenciadorArquivos.Gerenciador;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;


public class TelaOpcoes {

	private JFrame frame;
	public String fileNameAndExtension;	
	
public TelaOpcoes(String fileNameAndExtension) {
	this.fileNameAndExtension = fileNameAndExtension;
	
	initialize();
}



private void initialize() {
		
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setLayout(null);
		
		Gerenciador g = new Gerenciador(this.fileNameAndExtension);
		
		JButton btnEscrever = new JButton("Escrever");
		btnEscrever.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaEscrever t = new TelaEscrever(fileNameAndExtension);
				frame.setVisible(false);
                
                
			}
		});
		btnEscrever.setBounds(170, 141, 106, 23);
		frame.getContentPane().add(btnEscrever);
		
		JButton btnApagar = new JButton("Apagar");
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] options = {"CANCELAR", "CONFIRMAR"};
		         
                int resp = JOptionPane.showOptionDialog(null,"Você deseja realmente apagar este arquivo?", "Selecione uma opção", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,  null, options, options[0]);
                if(resp != 0) {
                	if (g.apagar()) {
                		JOptionPane.showMessageDialog(null, "O arquivo foi deletado com êxito.", "", JOptionPane.INFORMATION_MESSAGE);
                		TelaPrincipal t = new TelaPrincipal();
                		frame.setVisible(false);
                	}
                		
                	else
                		JOptionPane.showMessageDialog(null, "O arquivo não pôde ser deletado.\nVerifique o terminal.");
                }
			}
		});
		btnApagar.setBounds(170, 192, 106, 23);
		frame.getContentPane().add(btnApagar);
		
		JButton btnLer = new JButton("Ler");
		btnLer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, g.lerArquivo());
			}
		});
		btnLer.setBounds(170, 92, 106, 23);
		frame.getContentPane().add(btnLer);
		
		JLabel txtTitulo = new JLabel("Menu de Opções");
		txtTitulo.setFont(new Font("Sylfaen", Font.PLAIN, 17));
		txtTitulo.setBounds(160, 11, 180, 23);
		frame.getContentPane().add(txtTitulo);
		
		
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	public String getfileNameAndExtension() {return this.fileNameAndExtension;}
	public void setfileNameAndExtension(String fileNameAndExtension) {this.fileNameAndExtension = fileNameAndExtension;}
}

