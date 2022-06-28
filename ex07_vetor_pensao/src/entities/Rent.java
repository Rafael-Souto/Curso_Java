package entities;

public class Rent {

//Atributos
	private String nome;
	private String email;

//Construtores	
	public Rent(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

//Métodos	
	public String getName() {
		return nome;
	}

	public void setName(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
//Formatação de impressão na tela	
	public String toString() {
		return nome + ", " + email;
	}
}