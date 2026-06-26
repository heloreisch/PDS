package model;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class MinistranteTableModel extends AbstractTableModel {

	
	// cria uma lista p ser modelo da tabela
    ArrayList<Ministrante> tabela;

    String colunas[] = { "Nome Completo",
    					"Telefone",
    					"E-mail",
    					"Data de Nascimento",
    					"Ocupação"
    };

    public MinistranteTableModel() {
        this.tabela = new ArrayList<>();
    }

    public MinistranteTableModel(ArrayList<Ministrante> tabela) {
        this.tabela = tabela;
    }

    @Override
    public String getColumnName(int indice) {
        return colunas[indice];
    }

    @Override
    public int getRowCount() {
        return this.tabela.size();
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }

    @Override
    // detemina em qual lugar vai cada valor 
    public String getValueAt(int rowIndex, int columnIndex) {

        Ministrante ministrante = tabela.get(rowIndex);

        if (columnIndex == 0) {
            return ministrante.getNome();
        }

        if (columnIndex == 1) {
            return ministrante.getTelefone();
        }

        if (columnIndex == 2) {
            return ministrante.getEmail();
        }

        if (columnIndex == 3) {
        	return ministrante.getDataNascimento();
        }

        if (columnIndex == 4) {
            return ministrante.getOcupacao();
        }

        return null;
    }

    // seleciona e remove
    public void remover(int linhaSelecionada) {
        tabela.remove(linhaSelecionada);
        fireTableDataChanged(); // obrigatório - tabela mudou p/ alterar a vizu
    }
    //p add um ministrante
    public void adicionarMinistrante(Ministrante m) {
        tabela.add(m);
        fireTableDataChanged();
    }

    public Ministrante getMinistrante(int linha) {
        return tabela.get(linha);
    }

    public void atualizarMinistrante(int linha, Ministrante ministrante) {
        tabela.set(linha, ministrante);
        fireTableRowsUpdated(linha, linha);
    }
}