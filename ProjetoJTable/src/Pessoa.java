
public class Pessoa {
	
	// mudanças: foi add vari idade e email, como tambem no construtor 
	private String nome, cpf, idade, email;

	public Pessoa(String nome, String cpf, String idade, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	// mudanças: foi adicionado getters e setters para as duas novas vari
	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	
		}
	}
