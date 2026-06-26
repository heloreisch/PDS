package controller;

import javax.swing.JOptionPane;
import javax.swing.JComboBox;
// importar pacote/classe
import model.Ministrante;
import model.MinistranteTableModel;
import view.CadastroM;
import view.JanelaEditar;
import view.JanelaVizualizar;

public class MinistranteController {

	//construtor
    private MinistranteTableModel table;
    private JanelaVizualizar view;
    private CadastroM tela;
    private JanelaEditar edicao;

    public MinistranteController(
            MinistranteTableModel modelo,
            JanelaVizualizar view,
            CadastroM tela,
            JanelaEditar edicao) {

        this.table = modelo;
        this.view = view;
        this.tela = tela;
        this.edicao = edicao;
        // puxar o modelo de tabela p ser usado
        this.view.getTable().setModel(modelo);
        
        // chama o botão cadastra da tela = CadastroM / quando clicar no botão executa ( ->) o evento 
        this.tela.getBtnCadastra().addActionListener(e -> eventoBotaoCadastra());
        this.tela.getBtnVizu().addActionListener(e -> eventoBotaoVizu());
        this.view.getBtnRemover().addActionListener(e -> eventoBotaoRemover());
        this.view.getBtnEditar().addActionListener(e -> eventoBotaoEditar());
        this.view.getBtnVoltar().addActionListener(e -> eventoBotaoVoltar());
        this.edicao.getBtnSalvar().addActionListener(e -> eventoBotaoSalvar());
        this.edicao.getBtnCancelar().addActionListener(e -> eventoBotaoCancelar());
    }
    
    
// implementar o botão
    private void eventoBotaoCadastra() {
    	// guarda em uma string o que o usuário digitou 
        String nome = tela.getTextNome().getText();
        String telefone = tela.getTextTele().getText();
        String email = tela.getTextEmail().getText();
        String dataNascimento = tela.getTextDTN().getText();
        String ocupacao = tela.getComboBOcu().getSelectedItem().toString(); // tranforma em string
        
        if (nome.isEmpty() || telefone.isEmpty() || email.isEmpty() || dataNascimento.isEmpty()) {
        	// se nome estiver vazio ou...
        	
        	    JOptionPane.showMessageDialog(view,"Preencha todos os campos!");
        	    		return; // retorna janela com a mensagem pree...
        	}
        
        // cria objeto ministrante
        Ministrante m = new Ministrante( nome, telefone,email, dataNascimento, ocupacao); 
        // vai add esse objeto na tabela
        table.adicionarMinistrante(m);
        
        
        // limpa todas as variaveis 
        tela.getTextNome().setText("");
        tela.getTextTele().setText("");
        tela.getTextEmail().setText("");
        tela.getTextDTN().setText("");
        tela.getComboBOcu().setSelectedIndex(0);
        
        

        JOptionPane.showMessageDialog(tela,"Ministrante cadastrado com sucesso!");
        
      
    }
    // botão vizualição que apresenta a janelaVizualizar
    private void eventoBotaoVizu() {

        view.setLocationRelativeTo(tela);
        // p tela aparecer
        view.setVisible(true);
        // e a outra sair
        tela.setVisible(false);
    }
    // botão voltar
    private void eventoBotaoVoltar() {
    	// para a tela aparecer no luga onde estava a outra
        tela.setLocationRelativeTo(view);
        
        tela.setVisible(true);

        view.setVisible(false);
    }

    private void eventoBotaoRemover() {

        int linhaSelecionada = view.getTable().getSelectedRow();

        if (linhaSelecionada == -1) {

            JOptionPane.showMessageDialog( view, "Selecione um ministrante.");
            	return;
        }

        table.remover(linhaSelecionada);
    }

    private void eventoBotaoEditar() {
    	// para selecionar uma linha
        int linhaSelecionada = view.getTable().getSelectedRow();
        // se linha == 0 retorna mensagem
        if (linhaSelecionada == -1) {

            JOptionPane.showMessageDialog(view,"Selecione um ministrante.");
            	return;
        }
        // 	saber que linha o usuário selecionou e vai na lista ministrante retornar o valor 
        Ministrante ministrante = table.getMinistrante(linhaSelecionada);
        // pega o nome do mini selecionado e vai retornar o nome editadp 
        edicao.getTextNome().setText(ministrante.getNome());
        	//edição          // muda 
        edicao.getTextTele().setText(ministrante.getTelefone());
        edicao.getTextEmail().setText(ministrante.getEmail());
        edicao.getTextDTN().setText(ministrante.getDataNascimento());
        edicao.getComboOcu().setSelectedItem(ministrante.getOcupacao());
        edicao.setLocationRelativeTo(view);
        edicao.setVisible(true);
    }

    private void eventoBotaoSalvar() {

        int linhaSelecionada = view.getTable().getSelectedRow();

        if (linhaSelecionada == -1) {
            return;
        }
        // puxa o nome dado e altera
        Ministrante ministrante = table.getMinistrante(linhaSelecionada);
        ministrante.setNome(edicao.getTextNome().getText());
        ministrante.setTelefone(edicao.getTextTele().getText());
        ministrante.setEmail(edicao.getTextEmail().getText());
        ministrante.setDataNascimento( edicao.getTextDTN().getText());
        ministrante.setOcupacao( edicao.getComboOcu().getSelectedItem().toString());
        // para atualizar a tabela conforme a linha selecionada e ministrante
        table.atualizarMinistrante( linhaSelecionada, ministrante);

        JOptionPane.showMessageDialog( edicao, "Ministrante atualizado com sucesso!");
        // apos tudo a janela fecha
        edicao.dispose();
    }

    private void eventoBotaoCancelar() {

        edicao.dispose();
    }
}