package aula3;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CalculadoraInvestimentoGrid extends JFrame {

    private JPanel contentPane;
    private JTextField textDeposito;
    private JTextField textMeses;
    private JTextField textJuros;
    private JLabel labelResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                CalculadoraInvestimentoGrid frame = new CalculadoraInvestimentoGrid();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public CalculadoraInvestimentoGrid() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 350, 200);
        
        
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menuAjuda = new JMenu("Ajuda");
        menuBar.add(menuAjuda);

        JMenuItem menuSobre = new JMenuItem("Sobre");
        menuSobre.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		// instância da classe
        		FormSobree tela = new FormSobree();
                tela.setLocationRelativeTo(null);
                tela.setVisible(true);
        	}
        });
       
        menuAjuda.add(menuSobre);
        


        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new GridLayout(0, 2, 5, 5));

       
        contentPane.add(new JLabel("Depósito mensal R$:"));
        textDeposito = new JTextField();
        contentPane.add(textDeposito);

        
        contentPane.add(new JLabel("Num. de meses:"));
        textMeses = new JTextField();
        contentPane.add(textMeses);

       
        contentPane.add(new JLabel("Juros ao mês %:"));
        textJuros = new JTextField();
        contentPane.add(textJuros);

        
        contentPane.add(new JLabel("Total investido + juros R$:"));
        labelResultado = new JLabel("");
        contentPane.add(labelResultado);

        
        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               // mudando os numeros pra textos 
                    int meses = Integer.parseInt(textMeses.getText());
                    double juros = Double.parseDouble(textJuros.getText());
                    double deposito = Double.parseDouble(textDeposito.getText());
                    // criando uma instância 
                    Investimento inv = new Investimento(meses, juros, deposito);
                    double resultado = inv.calculaTotal();
                  //  mudando os textos para numero
                    labelResultado.setText(String.valueOf(resultado));
                
            }
        });
    
        contentPane.add(btnCalcular);
        contentPane.add(new JLabel("")); 
    }
}

