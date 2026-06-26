import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculdora extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textN1;
    private JTextField textN2;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Calculdora frame = new Calculdora();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

   
   
    public Calculdora() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        textN1 = new JTextField();
        textN1.setBounds(44, 55, 86, 20);
        contentPane.add(textN1);
        textN1.setColumns(10);
        
        textN2 = new JTextField();
        textN2.setBounds(44, 90, 86, 20);
        contentPane.add(textN2);
        textN2.setColumns(10);
        
        JLabel lblResposta = new JLabel("");
        lblResposta.setBounds(44, 211, 105, 14);
        contentPane.add(lblResposta);
        
        JButton btnSOMA = new JButton("SOMA");
    	btnSOMA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					double n1 = Double.parseDouble(textN1.getText());
					double n2 = Double.parseDouble(textN2.getText());
					
					String res =  "Resultado = " + String.format("%.2f", n1 + n2) ;
					lblResposta.setText(res);
				
			}
		});
        btnSOMA.setBounds(186, 54, 89, 23);
        contentPane.add(btnSOMA);
        
        
        JButton btnSUB = new JButton("SUBTRAÇÃO");
        btnSUB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1 = Double.parseDouble(textN1.getText());
				double n2 = Double.parseDouble(textN2.getText());
				
				String res =  "Resultado = " + String.format("%.2f", n1 - n2) ;
				lblResposta.setText(res);
			}
		});
        btnSUB.setBounds(310, 55, 124, 23);
        contentPane.add(btnSUB);
        
        JButton btnDIVI = new JButton("DIVISÃO");
        
        btnDIVI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1 = Double.parseDouble(textN1.getText());
				double n2 = Double.parseDouble(textN2.getText());
				
				String res =  "Resultado = " + String.format("%.2f", n1 / n2) ;
				lblResposta.setText(res);
			}
		});
        btnDIVI.setBounds(186, 102, 89, 23);
        contentPane.add(btnDIVI);
        
        JButton btnMULT = new JButton("MULTIPLICAÇÃO");
        btnMULT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1 = Double.parseDouble(textN1.getText());
				double n2 = Double.parseDouble(textN2.getText());
				
				String res=  "Resultado = " + String.format("%.2f", n1 * n2) ;
				lblResposta.setText(res);
				
			}
		});
        btnMULT.setBounds(310, 102, 124, 23);
        contentPane.add(btnMULT);
        
        JLabel lblNewLabel = new JLabel("=");
        lblNewLabel.setBounds(44, 162, 105, 14);
        contentPane.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Número1:");
        lblNewLabel_1.setBounds(44, 37, 105, 14);
        contentPane.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("Número2:");
        lblNewLabel_2.setBounds(44, 73, 86, 14);
        contentPane.add(lblNewLabel_2);
        
    
    }
}
	


