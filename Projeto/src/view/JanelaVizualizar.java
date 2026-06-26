package view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

public class JanelaVizualizar extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel contentPane;
    private JTable table;
    private JScrollPane scrollPane;

    private JButton btnVoltar;
    private JButton btnEditar;
    private JButton btnRemover;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                JanelaVizualizar frame = new JanelaVizualizar();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public JanelaVizualizar() {

        setTitle("Visualizar Ministrantes");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 800, 400);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        setContentPane(contentPane);

        contentPane.setLayout(new MigLayout("", "[grow][grow][grow]","[][][grow][]"));

      
        JLabel lblTitulo = new JLabel("Ministrantes Cadastrados");
        lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 18));
        contentPane.add(lblTitulo,
                "cell 0 0 3 1,alignx center");

       
        scrollPane = new JScrollPane();
        contentPane.add(scrollPane,
                "cell 0 2 3 1,grow");

        table = new JTable();
        scrollPane.setViewportView(table);

       
        btnVoltar = new JButton("Voltar");
        contentPane.add(btnVoltar,
                "cell 0 3,alignx center");

        btnEditar = new JButton("Editar");
        contentPane.add(btnEditar,
                "cell 1 3,alignx center");

        btnRemover = new JButton("Remover");
        contentPane.add(btnRemover,
                "cell 2 3,alignx center");
    }

  

    public JTable getTable() {
        return table;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public JButton getBtnVoltar() {
        return btnVoltar;
    }

    public JButton getBtnEditar() {
        return btnEditar;
    }

    public JButton getBtnRemover() {
        return btnRemover;
    }
}