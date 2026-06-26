import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class PessoaTableModel extends AbstractTableModel{
	ArrayList<Pessoa> lista;
	// mudanças: foi adicionado as var idade e email 
	String colunas[] = new String[] { "Nome", "CPF",  "IDADE" , "EMAIL"};
	
	public PessoaTableModel() {
		this.lista = new ArrayList();
	}
	
	public PessoaTableModel(ArrayList<Pessoa> lista) {
		this.lista = lista;
	}
	/**
	 * Retorna o nome da Coluna consultando a String do vetor "colunas"
	 * no índice "indice"
	 */
	@Override
	public String getColumnName(int indice) {
		return colunas[indice]; 
		
	}
	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return this.lista.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return this.colunas.length;
	}

	@Override
	public String getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		Pessoa pessoa = lista.get(rowIndex);
		if(columnIndex == 0) {
			return pessoa.getNome();
		} 
		if(columnIndex ==1) {
			return pessoa.getCpf();
		}
		// mudanças: foi feito + dois ifs para as duas novas var
		if(columnIndex == 2) {
			return pessoa.getIdade();
		}
		
		if(columnIndex == 3) {
			return pessoa.getEmail();
			
		}
		
		return null;
	}
}
		

	

