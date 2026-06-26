package aula2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Conversao extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textTemp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversao frame = new Conversao();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Conversao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textTemp = new JTextField();
		textTemp.setBounds(66, 65, 226, 20);
		contentPane.add(textTemp);
		textTemp.setColumns(10);
		
		JLabel lblEscrita = new JLabel("Escreva a temperatura em Farenheit :");
		lblEscrita.setBounds(66, 36, 268, 20);
		contentPane.add(lblEscrita);
		
		JLabel lblResposta = new JLabel("");
		lblResposta.setBounds(53, 167, 226, 20);
		contentPane.add(lblResposta);
		
		JLabel lblEscrita2 = new JLabel("Temperatura em Celsius :");
		lblEscrita2.setBounds(53, 136, 188, 20);
		contentPane.add(lblEscrita2);
		
		JButton btnConverter = new JButton("Converter");
		btnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					String temp = textTemp.getText();
					
					//Conversão de String para Float
//					float tempF = Float.parseFloat(temp);
					//Conversão de String para Double
					// tempD = temperatura em f 
					double tempD = Double.parseDouble(temp);
					//Conversão de String para Int
//					int tempI = Integer.parseInt(temp);
					
					double C = (tempD - 32 ) * 5.0/9.0;
					
					String TempResposta = String.valueOf(C);
					TempResposta = String.format("%.2f", C , "°C"); //Formatador de Números com virgula
					//Conversão de Float/Double/Int para String
				lblResposta.setText(TempResposta);
			}
		});
		btnConverter.setBounds(132, 102, 128, 23);
		contentPane.add(btnConverter);

	
}
}


