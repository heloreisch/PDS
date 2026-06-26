import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Retangulo extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textAltura;
    private JTextField textBase;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Retangulo frame = new Retangulo();
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
        double baseR = Double.parseDouble(textBase.getText());
        double alturaR = Double.parseDouble(textAltura.getText());
        return new Ret(baseR, alturaR);
    }

    public Retangulo() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        textAltura = new JTextField();
        textAltura.setBounds(86, 36, 176, 20);
        contentPane.add(textAltura);

        JLabel lblPA = new JLabel("Informe a altura:");
        lblPA.setBounds(76, 11, 186, 14);
        contentPane.add(lblPA);

        textBase = new JTextField();
        textBase.setBounds(86, 92, 176, 20);
        contentPane.add(textBase);

        JLabel lblPB = new JLabel("Informe a base");
        lblPB.setBounds(86, 67, 125, 14);
        contentPane.add(lblPB);

        JLabel lblArea = new JLabel("");
        lblArea.setBounds(94, 167, 247, 14);
        contentPane.add(lblArea);

        JLabel lblPerimetro = new JLabel("");
        lblPerimetro.setBounds(111, 224, 204, 14);
        contentPane.add(lblPerimetro);

        JButton btnArea = new JButton("Calcular área");
        btnArea.setBounds(96, 133, 157, 23);
        contentPane.add(btnArea);

        JButton btnPerimetro = new JButton("Calcular perímetro");
        btnPerimetro.setBounds(122, 192, 157, 23);
        contentPane.add(btnPerimetro);

    
        btnArea.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Ret ret = criarRetangulo();
                String area = "Área: " + ret.calcularArea() + " cm²";
                lblArea.setText(area);
            }
        });

        btnPerimetro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Ret ret = criarRetangulo();
                String perimetro = "Perímetro: " + ret.calcularPerimetro() + " cm";
                lblPerimetro.setText(perimetro);
            }
        });
    }
}
	


