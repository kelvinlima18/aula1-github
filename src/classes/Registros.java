package classes;

public class Registros {

	private String nome;
	private String email;
	
	public Registros(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String toString() {
		return nome + ", " + email;
	}


	
	
	}


