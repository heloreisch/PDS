package aula3;
import java.awt.EventQueue; //queue = lista a ordem do evento 

public class Main {
	public static void main(String[] args) {
		//ordem do evento - "invokelater ( invoque depois) -> = executa
	    EventQueue.invokeLater(() -> {
	    	
	        try {
	            CalculadoraInvestimentoGrid frame = new CalculadoraInvestimentoGrid();
	            // vai chamar a classe invesGrid no centro da tela
	            frame.setLocationRelativeTo(null); 
	            frame.setVisible(true);
	        } catch (Exception e) {
	            e.printStackTrace();
	            // para aparecer o erro "mais detalhado"
	        }
	    });
	}

}
