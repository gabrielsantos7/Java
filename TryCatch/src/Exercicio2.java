
/*
    Crie um formulário em Java que receba 2 valores e efetua a divisão do primeiro pelo segundo. 
    Trate, via exceção, o caso de formato de número inválido e divisão por zero. Mostre as mensagens em JOptionPanes.
*/

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.lang.ArithmeticException;
import java.lang.NumberFormatException;
import java.text.DecimalFormat;

public class Exercicio2 {

	private JFrame frame;
	private JTextField inputDivisor;
	private JTextField inputDividendo;

	/*
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio2 window = new Exercicio2();
					window.frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*
	 * Create the application.
	 */
	public Exercicio2() {
		initialize();
	}

	/*
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

        frame.setLocationRelativeTo(null);
		
		JLabel txtDivisor = new JLabel("Divisor:");
		txtDivisor.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		txtDivisor.setBounds(132, 11, 64, 22);
		frame.getContentPane().add(txtDivisor);
		
		inputDivisor = new JTextField();
		inputDivisor.setBounds(195, 15, 94, 20);
		frame.getContentPane().add(inputDivisor);
		inputDivisor.setColumns(10);
		
		JLabel txtDividendo = new JLabel("Dividendo:");
		txtDividendo.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		txtDividendo.setBounds(132, 54, 86, 22);
		frame.getContentPane().add(txtDividendo);
		
		inputDividendo = new JTextField();
		inputDividendo.setColumns(10);
		inputDividendo.setBounds(216, 58, 74, 20);
		frame.getContentPane().add(inputDividendo);

        JLabel txtResultado = new JLabel("");
		txtResultado.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		txtResultado.setBounds(110, 113, 239, 28);
		frame.getContentPane().add(txtResultado);
		
        /* 
         *  Adiciona o evento ao botão
         */

		JButton divideButton = new JButton("Dividir");
		divideButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txtDivisor = inputDivisor.getText();
				String txtDividendo = inputDividendo.getText();

                try{
                    double numDivisor = Double.parseDouble(txtDivisor);
                    double numDividendo = Double.parseDouble(txtDividendo);

                    if (numDividendo == 0) 
                        throw new ArithmeticException("Divisão por zero!");

                    double divisao = numDivisor / numDividendo;

                    DecimalFormat df = new DecimalFormat("0.000");
                    txtResultado.setText("O resultado da divisão é: "+df.format(divisao));

                }catch(NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "Formato de número inválido!", "ERRO", JOptionPane.ERROR_MESSAGE);
                } catch (ArithmeticException ae) {
                    JOptionPane.showMessageDialog(null, ae.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                }
			}
		});
		divideButton.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 13));
		divideButton.setBounds(174, 206, 89, 23);
		frame.getContentPane().add(divideButton);
	}
}
