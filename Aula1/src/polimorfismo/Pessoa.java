package polimorfismo;

public class Pessoa {
	private String nome;
	private String cpf;
	
	public Pessoa(String nome, String cpf) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void mostrarDados() {
		System.out.println(String.format("%s, %s", this.nome, this.cpf));
	}
}
