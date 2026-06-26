import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Nome extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textResposta;
    private JTextField textRESPs;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Nome frame = new Nome();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Nome() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        textResposta = new JTextField();
        textResposta.setBounds(86, 64, 176, 20);
        contentPane.add(textResposta);
        textResposta.setColumns(10);

        JLabel lblNome = new JLabel("Escreva seu nome:");
        lblNome.setBounds(76, 39, 186, 14);
        contentPane.add(lblNome);

        textRESPs = new JTextField();
        textRESPs.setBounds(86, 124, 176, 20);
        contentPane.add(textRESPs);
        textRESPs.setColumns(10);

        JLabel lblSobre = new JLabel("Escreva seu sobrenome:");
        lblSobre.setBounds(80, 99, 233, 14);
        contentPane.add(lblSobre);

        JLabel lblCompleto = new JLabel("");
        lblCompleto.setBounds(86, 203, 247, 14);
        contentPane.add(lblCompleto);

        JButton btnNewButton = new JButton("Enter");
        btnNewButton.setBounds(133, 163, 89, 23);
        contentPane.add(btnNewButton);

        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = textResposta.getText();
                String sobrenome = textRESPs.getText();

                String nomeComp = nome + " " + sobrenome;
                lblCompleto.setText(nomeComp);
            }
        });
    }
}


	
		
	


