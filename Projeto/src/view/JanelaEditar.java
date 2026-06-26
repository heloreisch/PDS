package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;


public class JanelaEditar extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel contentPane;

    private JTextField textNome;
    private JTextField textTele;
    private JTextField textEmail;
    private JTextField textDTN;

    private JButton btnCancelar;
    private JButton btnSalvar;

    private JComboBox comboOcu;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                JanelaEditar frame = new JanelaEditar();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public JanelaEditar() {

        setForeground(new Color(0, 0, 0));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        contentPane.setLayout(new MigLayout( "","[][][grow]","[][][][][][][]"));

        JLabel lblN = new JLabel("Nome Completo");
        lblN.setFont(new Font("Tahoma", Font.PLAIN, 13));
        contentPane.add(lblN, "cell 0 0");

        textNome = new RoundedJtext(1);
        contentPane.add(textNome, "cell 1 0 2 1,growx");

        JLabel lblT = new JLabel("Telefone");
        lblT.setFont(new Font("Tahoma", Font.PLAIN, 13));
        contentPane.add(lblT, "cell 0 1");

        textTele = new RoundedJtext(1);
        contentPane.add(textTele, "cell 1 1 2 1,growx");

        JLabel lblE = new JLabel("E-mail");
        lblE.setFont(new Font("Tahoma", Font.PLAIN, 13));
        contentPane.add(lblE, "cell 0 2");

        textEmail = new RoundedJtext(1);
        contentPane.add(textEmail, "cell 1 2 2 1,growx");

        JLabel lblDTN = new JLabel("Data de Nascimento");
        lblDTN.setFont(new Font("Tahoma", Font.PLAIN, 13));
        contentPane.add(lblDTN, "cell 0 3");

        textDTN = new RoundedJtext(1);
        contentPane.add(textDTN, "cell 1 3 2 1,growx");

        JLabel lblO = new JLabel("Ocupação");
        lblO.setFont(new Font("Tahoma", Font.PLAIN, 13));
        contentPane.add(lblO, "cell 0 4");

        comboOcu = new JComboBox(Ocupacao.values());
        contentPane.add(comboOcu, "cell 1 4 2 1,growx");

        btnSalvar = new JButton("Salvar");
        btnSalvar.setBackground(new Color(0, 128, 0));
        contentPane.add(btnSalvar, "cell 0 6,alignx right");

        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBackground(new Color(0, 128, 0));
        contentPane.add(btnCancelar, "cell 2 6");
    }



    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public JButton getBtnSalvar() {
        return btnSalvar;
    }

    public JComboBox getComboOcu() {
        return comboOcu;
    }

    public JTextField getTextNome() {
        return textNome;
    }

    public JTextField getTextTele() {
        return textTele;
    }

    public JTextField getTextEmail() {
        return textEmail;
    }

    public JTextField getTextDTN() {
        return textDTN;
    }
}