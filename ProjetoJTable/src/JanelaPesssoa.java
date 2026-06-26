import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaPesssoa extends JFrame {
 // foi add no desing os campos email e idade
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCPF;
	private JTable table;

	private JButton btnAdicionar;
	private JButton btnRemover;

	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPesssoa frame = new JanelaPesssoa();
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
	public JanelaPesssoa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 466);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][grow][grow][][]", "[][][][][][grow][][][]"));

		JLabel lblNewLabel = new JLabel("Nome:");
		contentPane.add(lblNewLabel, "cell 1 0,alignx trailing");

		txtNome = new JTextField();
		contentPane.add(txtNome, "cell 2 0 2 1,growx");
		txtNome.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("CPF:");
		contentPane.add(lblNewLabel_1, "cell 1 1,alignx trailing");

		txtCPF = new JTextField();
		contentPane.add(txtCPF, "cell 2 1 2 1,growx");
		txtCPF.setColumns(10);

		btnRemover = new JButton("Remover");

		btnAdicionar = new JButton("Adicionar");

		JLabel lblNewLabel_2 = new JLabel("Idade: ");
		contentPane.add(lblNewLabel_2, "cell 1 2,alignx trailing");

		textField = new JTextField();
		contentPane.add(textField, "cell 2 2 3 1,growx");
		textField.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Email:");
		contentPane.add(lblNewLabel_3, "cell 1 3,alignx trailing");

		textField_1 = new JTextField();
		contentPane.add(textField_1, "cell 2 3 3 1,growx");
		textField_1.setColumns(10);

		contentPane.add(btnAdicionar, "cell 1 4");
		contentPane.add(btnRemover, "cell 2 4");
		
		btnNewButton = new JButton("Visualizar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton, "cell 3 4");

		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 1 5 4 4,grow");

		table = new JTable();
		table.setModel(new PessoaTableModel());
		scrollPane.setViewportView(table);
	}

	public JTextField getTxtNome() {
		return txtNome;
	}

	public JTextField getTxtCPF() {
		return txtCPF;
	}

	public JTextField getTxtIdade() {
		return textField;
	}

	public JTextField getTxtEmail() {
		return textField_1;
	}

	public JTable getTable() {
		return table;
	}

	public JButton getBtnAdicionar() {
		return btnAdicionar;
	}

	public JButton getBtnRemover() {
		return btnRemover;
	}
}