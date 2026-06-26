package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroM extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	private JTextField textNome;
	private JTextField textTele;
	private JTextField textEmail;
	private JTextField textDTN;

	private JButton btnCadastra;
	private JButton btnVizu;

	private JComboBox comboBOcu;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroM frame = new CadastroM();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CadastroM() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 736, 405);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][348.00,grow][348.00,grow][][][center][]", "[][][][][][][][][][][][][][][][][]"));

		JLabel lblTitulo = new JLabel("Cadastro de Ministrante");
		lblTitulo.setFont(new Font("SimSun", Font.BOLD, 20));
		contentPane.add(lblTitulo, "cell 4 0 2 1,alignx left");

		JLabel lblN = new JLabel("Nome Completo:");
		lblN.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		contentPane.add(lblN, "cell 4 1 2 1");

		textNome = new RoundedJtext(1);
		contentPane.add(textNome, "cell 4 2 2 1,growx");

		JLabel lblT = new JLabel("Telefone");
		lblT.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		contentPane.add(lblT, "cell 4 3 2 1");

		textTele = new RoundedJtext(1);
		contentPane.add(textTele, "cell 4 4 2 1,growx");

		JLabel lblINFO = new JLabel(
				"Informe seu telefone sem pontos, traços ou parênteses (Ex.: 47999998888)"
		);
		lblINFO.setForeground(new Color(255, 128, 64));
		lblINFO.setFont(new Font("Tahoma", Font.PLAIN, 9));
		contentPane.add(lblINFO, "cell 4 5 2 1");

		JLabel lblE = new JLabel("E-mail:");
		lblE.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		contentPane.add(lblE, "cell 4 6 2 1");

		textEmail = new RoundedJtext(1);
		contentPane.add(textEmail, "cell 4 7 2 1,growx");

		JLabel lblDT = new JLabel("Data de Nascimento:");
		lblDT.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		contentPane.add(lblDT, "flowx,cell 4 8 2 1");

		textDTN = new RoundedJtext(1);
		contentPane.add(textDTN, "cell 4 9 2 1,growx");
		
		JLabel lblNewLabel = new JLabel("Informe sua data de nascimento da seguinte forme: (dd/MM/yyyy)");
		lblNewLabel.setForeground(new Color(255, 128, 64));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
		contentPane.add(lblNewLabel, "cell 4 10");

		JLabel lblO = new JLabel("Informe sua ocupação:");
		lblO.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		contentPane.add(lblO, "cell 4 11 2 1");

		comboBOcu = new JComboBox(Ocupacao.values());
		contentPane.add(comboBOcu, "cell 4 12 2 1,growx");

		ImageIcon iconeOriginalCadastra = new ImageIcon(
				CadastroM.class.getResource("/imagem/Group 66.png"));

		Image imagemRedimensionadaCadastra =
				iconeOriginalCadastra.getImage().getScaledInstance(300, 20, Image.SCALE_SMOOTH);

		ImageIcon iconeOriginalVizu = new ImageIcon(
				CadastroM.class.getResource("/imagem/Group 65.png"));

		Image imagemRedimensionadaVizu =
				iconeOriginalVizu.getImage().getScaledInstance(300, 20, Image.SCALE_SMOOTH);

		btnCadastra = new JButton("");
		btnCadastra.setIcon(new ImageIcon(imagemRedimensionadaCadastra));

		btnCadastra.setBorderPainted(false);
		btnCadastra.setContentAreaFilled(false);
		btnCadastra.setFocusPainted(false);
		btnCadastra.setOpaque(false);

		contentPane.add(btnCadastra, "cell 4 13,alignx left");

		btnVizu = new JButton("");
		btnVizu.setIcon(new ImageIcon(imagemRedimensionadaVizu));

		btnVizu.setBorderPainted(false);
		btnVizu.setContentAreaFilled(false);
		btnVizu.setFocusPainted(false);
		btnVizu.setOpaque(false);

		contentPane.add(btnVizu, "cell 4 14");

		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(CadastroM.class.getResource("/imagem/LOGO 60+.png")));
		contentPane.add(lblLogo, "cell 6 15");
	}



	public JComboBox getComboBOcu() {
		return comboBOcu;
	}

	public JButton getBtnCadastra() {
		return btnCadastra;
	}

	public JButton getBtnVizu() {
		return btnVizu;
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