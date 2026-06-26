package aula3;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;

public class CalculadoraInvestimentos extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
  
    public CalculadoraInvestimentos() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 250, 250);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        setContentPane(contentPane);

        JLabel lblD = new JLabel("Depósito mensal R$:");
        lblD.setBounds(57, 11, 107, 20);
        contentPane.add(lblD);

     

        JLabel lblN = new JLabel("Num. de meses:");
        lblN.setBounds(67, 62, 120, 20);
        contentPane.add(lblN);

       
        JLabel lblJuros = new JLabel("Juros ao mês (%):");
        lblJuros.setBounds(67, 112, 100, 20);
        contentPane.add(lblJuros);

       

        JLabel lblTotal = new JLabel("Total investido + juros R$:");
        lblTotal.setBounds(57, 157, 138, 20);
        contentPane.add(lblTotal);

     

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(64, 175, 100, 25);
        contentPane.add(btnCalcular);
        
        textField = new JTextField();
        textField.setBounds(57, 31, 121, 20);
        contentPane.add(textField);
        textField.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setBounds(56, 81, 122, 20);
        contentPane.add(textField_1);
        textField_1.setColumns(10);
        
        textField_2 = new JTextField();
        textField_2.setBounds(57, 134, 121, 20);
        contentPane.add(textField_2);
        textField_2.setColumns(10);
        
  
    }
}



