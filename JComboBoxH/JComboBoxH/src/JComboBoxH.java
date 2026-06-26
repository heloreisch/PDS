import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

public class JComboBoxH extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textTele;

	private JComboBox  comboTP;
	private JComboBox  comboD;
	private JComboBox  comboF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JComboBoxH frame = new JComboBoxH();
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
	public JComboBoxH() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		contentPane.setLayout(new MigLayout("", "[][][][][][grow][][]", "[][][][][][][][]"));

		JLabel lblN = new JLabel("Cadastro de Cliente - Academia TREINO FIT");
		lblN.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblN, "cell 5 0");

		JLabel lblNom = new JLabel("Nome:");
		lblNom.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblNom, "cell 3 1,alignx trailing");

		textNome = new JTextField();
		contentPane.add(textNome, "cell 5 1,growx");
		textNome.setColumns(10);

		JLabel lblT = new JLabel("Telefone:");
		lblT.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblT, "cell 3 2,alignx trailing");

		textTele = new JTextField();
		contentPane.add(textTele, "cell 5 2,growx");
		textTele.setColumns(10);

		// COMBO TIPO PLANO
		JLabel lblTM = new JLabel("Tipo de plano:");
		lblTM.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblTM, "cell 3 4,alignx trailing");

		comboTP = new JComboBox<>(TipoPlano.values());
		contentPane.add(comboTP, "cell 5 4,growx");

		// COMBO DURAÇÃO
		JLabel lblD = new JLabel("Duração:");
		lblD.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblD, "cell 3 5,alignx trailing");

		comboD = new JComboBox<>(Duracao.values());
		contentPane.add(comboD, "cell 5 5,growx");

		// COMBO FREQUENCIA
		JLabel lblF = new JLabel("Frequência semanal:");
		lblF.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblF, "cell 3 6,alignx trailing");

		comboF = new JComboBox<>(Frequencia.values());
		contentPane.add(comboF, "cell 5 6,growx");

		JLabel lblResposta = new JLabel("");
		contentPane.add(lblResposta, "cell 5 7");

		// BOTÃO
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setHorizontalAlignment(SwingConstants.RIGHT);

		btnCalcular.addActionListener(e -> {

			double preco = 0;

			if (textNome.getText().isEmpty() || textTele.getText().isEmpty()) {

				JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
				return;
			}

			TipoPlano plano = (TipoPlano) comboTP.getSelectedItem();
			Duracao duracao = (Duracao) comboD.getSelectedItem();
			Frequencia freq = (Frequencia) comboF.getSelectedItem();

			
			if (plano == TipoPlano.BASICO) {
				preco = 80;

			} else if (plano == TipoPlano.INTERMEDIARIO) {
				preco = 120;

			} else if (plano == TipoPlano.PREMIUM) {
				preco = 180;
			}

			
			if (duracao == Duracao.SEMESTRAL) {
				preco = preco - preco * 0.1;

			} else if (duracao == Duracao.ANUAL) {
				preco = preco - preco * 0.2;
			}

			
			if (freq == Frequencia.TRES_VEZES_SEMANA) {
				preco = preco + preco * 0.2;

			} else if (freq == Frequencia.CINCO_VEZES_SEMANA) {
				preco = preco + preco * 0.5;
			}

			lblResposta.setText("R$ " + String.format("%.2f", preco));
		});

		contentPane.add(btnCalcular, "cell 3 7,alignx right");
	}
}