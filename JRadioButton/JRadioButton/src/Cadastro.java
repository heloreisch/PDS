import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ButtonGroup;

public class Cadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textTele;
	
	 	private JRadioButton rdbtnBa, rdbtnInter, rdbtnPre;
	    private JRadioButton rdbtnMensal, rdbtnSemestral, rdbtnAnual;
	    private JRadioButton rdbtn2xS, rdbtn3xS, rdbtn5xS;
	    private JLabel lblResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
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
	public Cadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][][grow][][]", "[][][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Cadastro de Cliente - Academia TREINO FIT ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, "cell 3 0 5 1");
		
		//nome
		
		JLabel lblN = new JLabel("Nome:");
		lblN.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblN, "cell 2 1,alignx trailing");
		
		textNome = new JTextField();
		contentPane.add(textNome, "cell 3 1 4 1,growx");
		textNome.setColumns(10);
		
		//telefone
		
		JLabel lblT = new JLabel("Telefone:");
		lblT.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblT, "cell 2 2,alignx trailing");
		
		textTele = new JTextField();
		contentPane.add(textTele, "cell 3 2 4 1,growx");
		textTele.setColumns(10);
		
		//tipo do plano
		
		
		
		JLabel lblNe = new JLabel("Tipo de plano: ");
		lblNe.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNe, "cell 2 3");
	 
	// JRadioButton  rdbtnBa = new JRadioButton("Básico"); = como criei as variaveis antes assim cria de novo outra 
	  rdbtnBa = new JRadioButton("Básico");
	  rdbtnBa.setFont(new Font("Tahoma", Font.BOLD, 11));
	  contentPane.add(rdbtnBa, "cell 4 3");
	
		
	 rdbtnInter = new JRadioButton("Intermediário");
		rdbtnInter.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(rdbtnInter, "flowx,cell 5 3");
		// colocar dentro de um grupo ( so poderá ser selecionado 1)
		 ButtonGroup grupoPlano = new ButtonGroup();
	        grupoPlano.add(rdbtnInter);
		
		 rdbtnPre = new JRadioButton("Premium");
		 rdbtnPre.setFont(new Font("Tahoma", Font.BOLD, 11));
		 contentPane.add(rdbtnPre, "cell 6 3");
		 grupoPlano.add(rdbtnPre);
	
		
		// duracao
		
		JLabel lblDu = new JLabel("Duração");
		lblDu.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblDu, "cell 2 4");
		 
		  rdbtnMensal = new JRadioButton("Mensal");
		  rdbtnMensal.setFont(new Font("Tahoma", Font.BOLD, 11));
		  contentPane.add(rdbtnMensal, "cell 4 4");
		
		
		 rdbtnSemestral = new JRadioButton("Semestral");
		rdbtnSemestral.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(rdbtnSemestral, "flowx,cell 5 4");
		
		 ButtonGroup grupoDuracao = new ButtonGroup();
	        grupoDuracao.add(rdbtnSemestral);
		
		 rdbtnAnual = new JRadioButton("Anual");
		 rdbtnAnual.setFont(new Font("Tahoma", Font.BOLD, 11));
		 contentPane.add(rdbtnAnual, "cell 6 4");
		 grupoDuracao.add(rdbtnAnual);

		
		// frequencia
		
		
		JLabel lblNewLabel_1 = new JLabel("Frequência semanal ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_1, "cell 2 5");
		 
		  rdbtn2xS = new JRadioButton("2x por semana");
		  rdbtn2xS.setFont(new Font("Tahoma", Font.BOLD, 11));
		  contentPane.add(rdbtn2xS, "cell 4 5");
		 
		 rdbtn3xS = new JRadioButton("3x por semana");
		rdbtn3xS.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(rdbtn3xS, "flowx,cell 5 5");
		
		ButtonGroup grupoFreq = new ButtonGroup();
			grupoFreq.add(rdbtn3xS);
		
		
		// botao
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addMouseListener(new MouseAdapter() {
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				calcular();
				
			}
		});
		
		 rdbtn5xS = new JRadioButton("5x por semana");
		 rdbtn5xS.setFont(new Font("Tahoma", Font.BOLD, 11));
		 contentPane.add(rdbtn5xS, "cell 6 5");
		 grupoFreq.add(rdbtn5xS);
		contentPane.add(btnNewButton, "cell 2 7");
		
		JLabel lblNewLabel_2 = new JLabel("Valor final:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_2, "flowx,cell 5 7");
		
		 lblResultado = new JLabel("");
		contentPane.add(lblResultado, "cell 5 7");
		
	
	}
	 private void calcular() {
		
 	    if (textNome.getText() == null || textNome.getText().trim().isEmpty() ||
 	        textTele.getText() == null || textTele.getText().trim().isEmpty()) {
 	        JOptionPane.showMessageDialog(this, "Preencha seu nome e telefone");
 	        return;
 	    }

 	   
 	    String plano = null;
 	    double valorBase = 0.0;
 	    if (rdbtnBa.isSelected()) {
 	        plano = "Básico";
 	        valorBase = 80.0;
 	    } else if (rdbtnInter.isSelected()) {
 	        plano = "Intermediário";
 	        valorBase = 120.0;
 	    } else if (rdbtnPre.isSelected()) {
 	        plano = "Premium";
 	        valorBase = 180.0;
 	    }

 	   
 	    String duracao = null;
 	    double desconto = 0.0; // desconto por fidelidade
 	    if (rdbtnMensal.isSelected()) {
 	        duracao = "Mensal";
 	        desconto = 0.0;
 	    } else if (rdbtnSemestral.isSelected()) {
 	        duracao = "Semestral";
 	        desconto = 0.10; // 10% de desconto
 	    } else if (rdbtnAnual.isSelected()) {
 	        duracao = "Anual";
 	        desconto = 0.20; // 20% de desconto
 	    }

 	
 	    String frequencia = null;
 	    double acrescimo = 0.0; // aumento por frequencia
 	    if (rdbtn2xS.isSelected()) {
 	        frequencia = "2x";
 	        acrescimo = 0.0; // sem aumento
 	    } else if (rdbtn3xS.isSelected()) {
 	        frequencia = "3x";
 	        acrescimo = 0.20; // +20%
 	    } else if (rdbtn5xS.isSelected()) {
 	        frequencia = "5x";
 	        acrescimo = 0.50; // +50%
 	    }

 	   
 	    if (plano == null || duracao == null || frequencia == null) {
 	        JOptionPane.showMessageDialog(this, "Selecione todas as opções!");
 	        return;
 	    }

 	    double valorFinal = valorBase * (1 + acrescimo);  // aplica aumento por frequencia
 	    valorFinal = valorFinal * (1 - desconto);         // aplica desconto por fidelidade

 	    lblResultado.setText("R$ " + String.format("%.2f", valorFinal));
 	}
	 }
	
	


