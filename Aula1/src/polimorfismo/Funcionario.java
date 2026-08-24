package polimorfismo;

public class Funcionario extends Pessoa {
	private String matricula;
	private double salario;
	
	public Funcionario(String matricula, String nome, String cpf, double salario) {
		super(nome, cpf);
		this.matricula = matricula;
		this.salario = salario;
	}
	
	public void mostrarDados() {
		System.out.println(String.format("%s, %s, %s, %.2f", 
				this.matricula, super.getNome(), 
				super.getCpf(), this.salario));
	}
}
