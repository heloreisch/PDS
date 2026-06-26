import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fomelandia extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textPeso;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Fomelandia frame = new Fomelandia();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

   
   
    public Fomelandia() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        textPeso = new JTextField();
        textPeso.setBounds(86, 36, 176, 20);
        contentPane.add(textPeso);

        JLabel lblPP = new JLabel("Peso do prato");
        lblPP.setBounds(76, 11, 186, 14);
        contentPane.add(lblPP);

        JLabel lblVQ = new JLabel("Valor do quilo: R$9,95");
        lblVQ.setBounds(86, 67, 125, 14);
        contentPane.add(lblVQ);

        JButton btnCalcular = new JButton("Calcular ");
        btnCalcular.setBounds(105, 92, 157, 23);
        contentPane.add(btnCalcular);
        
        JLabel lblResposta = new JLabel("");
        lblResposta.setBounds(90, 165, 196, 14);
        contentPane.add(lblResposta);
        
        JLabel lblTP = new JLabel("Total a pagar:");
        lblTP.setBounds(86, 140, 125, 14);
        contentPane.add(lblTP);

    
        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	double pesoRef = Double.parseDouble(textPeso.getText());
				
				String precoTotal =  "R$ " + String.format("%.2f", 9.95*pesoRef) ;
				lblResposta.setText(precoTotal);
			
            	
            }
        });
    }
}
	


