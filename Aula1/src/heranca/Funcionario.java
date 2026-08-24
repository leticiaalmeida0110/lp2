package heranca;

public class Funcionario {
	
	private String nome;
	protected String rg;
	protected double salario;
	
	public Funcionario() {
	}
	
	public Funcionario(String nome, String rg, double salario) {
		this.nome = nome;
		this.rg = rg;
		this.salario = salario;
	}
	
	// gets sets
	public String getNome() {
		return nome;
	}
	
	public void imprime() {
		System.out.println(String.format("%s: %s\nSalario: %.2f", this.nome, this.rg, this.salario));
	}
	

}
