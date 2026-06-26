import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gasolina extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textLitro;
    private JTextField textValor;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Gasolina frame = new Gasolina();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public class Ret {
        double base;
        double altura;

        public Ret(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

        double calcularArea() {
            return base * altura;
        }

        double calcularPerimetro() {
            return 2 * base + 2 * altura;
        }
    }

    public Ret criarRetangulo() {
        double baseR = Double.parseDouble(textValor.getText());
        double alturaR = Double.parseDouble(textLitro.getText());
        return new Ret(baseR, alturaR);
    }

    public Gasolina() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        textLitro = new JTextField();
        textLitro.setBounds(86, 36, 176, 20);
        contentPane.add(textLitro);

        JLabel lblPL = new JLabel("Preço litro:");
        lblPL.setBounds(76, 11, 186, 14);
        contentPane.add(lblPL);

        textValor = new JTextField();
        textValor.setBounds(86, 92, 176, 20);
        contentPane.add(textValor);

        JLabel lblQP = new JLabel("Quanto será pago:");
        lblQP.setBounds(86, 67, 125, 14);
        contentPane.add(lblQP);

        JButton btnCalcular = new JButton("Calcular ");
        btnCalcular.setBounds(96, 133, 157, 23);
        contentPane.add(btnCalcular);
        
        JLabel lblResposta = new JLabel("");
        lblResposta.setBounds(86, 193, 196, 14);
        contentPane.add(lblResposta);

    
        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	double paraLitro = Double.parseDouble(textLitro.getText());
				double paraValor = Double.parseDouble(textValor.getText());
				String area = String.format("%.2f", paraValor/paraLitro) + " litros";
				lblResposta.setText(area);
			
            }
        });
    }
}
	


