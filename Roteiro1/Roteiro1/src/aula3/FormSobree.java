package aula3;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormSobree extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) {
    	
        EventQueue.invokeLater(() -> {
           
                FormSobree frame = new FormSobree();
                frame.setVisible(true);
                 });
    }

    public FormSobree() {
        setTitle("CalcInvest - Sobre");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 400, 250);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        contentPane.setLayout(new GridLayout(0, 1, 5, 5)); 
        setContentPane(contentPane);

       
        contentPane.add(new JLabel("CalcInvest - Calculadora de Investimentos"));
        
        contentPane.add(new JLabel("Versão: 1.0"));
        
        contentPane.add(new JLabel("Autora: Heloisa Mafra Reisch"));
        
        contentPane.add(new JLabel("Contato: heloisa.mr@aluno.ifsc.edu.br"));

        
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton btnOK = new JButton("OK");
        btnOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); 
                // para fechar a janela
            }
        });

        panel.add(btnOK);
        contentPane.add(panel);
    }
}


	


