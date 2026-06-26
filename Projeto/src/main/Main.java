package main;

import controller.MinistranteController;
import model.MinistranteTableModel;
import view.CadastroM;
import view.JanelaEditar;
import view.JanelaVizualizar;

public class Main {

    public static void main(String[] args) {
// cria o modelo 
        MinistranteTableModel model = new MinistranteTableModel();
        // cria a janela cadastroM..
        CadastroM tela = new CadastroM();
        JanelaVizualizar view = new JanelaVizualizar();
        JanelaEditar edicao = new JanelaEditar();
// cria a ligação entre as classes
        MinistranteController controller = new MinistranteController(model, view, tela, edicao);
//aparece a tela
        tela.setVisible(true);
    }
}
