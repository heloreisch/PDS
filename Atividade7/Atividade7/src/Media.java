import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Media extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textNome;
    private JTextField textN1;
    private JTextField textN2;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Media frame = new Media();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Media() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNA = new JLabel("Nome do aluno:");
        lblNA.setBounds(52, 11, 123, 14);
        contentPane.add(lblNA);

        textNome = new JTextField();
        textNome.setBounds(52, 49, 161, 20);
        contentPane.add(textNome);

        JLabel lblNotas = new JLabel("Notas:");
        lblNotas.setBounds(52, 80, 46, 14);
        contentPane.add(lblNotas);

        textN1 = new JTextField();
        textN1.setBounds(52, 106, 86, 20);
        contentPane.add(textN1);

        textN2 = new JTextField();
        textN2.setBounds(218, 106, 86, 20);
        contentPane.add(textN2);

        JLabel lblM = new JLabel("Média do aluno:");
        lblM.setBounds(52, 159, 133, 14);
        contentPane.add(lblM);

        JLabel lblMedia = new JLabel("");
        lblMedia.setBounds(52, 184, 200, 14);
        contentPane.add(lblMedia);

        JLabel lblS = new JLabel("Situação:");
        lblS.setBounds(52, 205, 80, 14);
        contentPane.add(lblS);

        JLabel lblSitua = new JLabel("");
        lblSitua.setBounds(52, 230, 200, 14);
        contentPane.add(lblSitua);

        JButton btnCalcular = new JButton("Calcular média");
        btnCalcular.setBounds(180, 150, 150, 23);
        contentPane.add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(textN1.getText());
                double n2 = Double.parseDouble(textN2.getText());

                double media = (n1 + n2) / 2;

                lblMedia.setText("Média = " + String.format("%.2f", media));

                if (media >= 7) {
                    lblSitua.setText("Aprovado(a)");
                } else {
                    lblSitua.setText("Reprovado(a)");
                }
            }
        });
    }
}


