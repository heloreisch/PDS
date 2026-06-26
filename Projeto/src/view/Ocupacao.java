package view;

public enum Ocupacao {
	
	 DOCENTE ("Docente"),
     ESTUDANTE ("Estudante"),
     SERVIDOR_PUBLICO ("Servidor Público"),
     MEMBRO_DA_COMUNIDADE_EXTERNA ("Membro da Comunidade Externa");

     String ocupacao;

     Ocupacao(String ocupacao) {
         this.ocupacao = ocupacao;
     }

     public String toString() {
         return ocupacao;
     }

}
