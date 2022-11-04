package aps_lpoo;

public class Pessoa {
	String nome;
	String email;
	double rendimentos;
	
	public  String getNome() {
		return this.nome;
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

	public double getRendimentos() {
		return rendimentos;
	}

	public void setRendimentos(double rendimentos) {
		this.rendimentos = rendimentos;
	}
	
	@Override
	public String toString() {
		return "\nNome: " + this.getNome() + "\nEmail: " + this.getEmail() + "\nRendimento: " + this.getRendimentos();
	}
	

	
		
}
