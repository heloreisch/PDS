
public enum TipoPlano {
	

	        BASICO("Basico"),
	        INTERMEDIARIO("Intermediario"),
	        PREMIUM("Premium");

	        String descricao;

	        TipoPlano(String descricao) {
	            this.descricao = descricao;
	        }

	        public String toString() {
	            return descricao;
	        }
}
