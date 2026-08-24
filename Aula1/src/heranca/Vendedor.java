package heranca;

public class Vendedor extends Funcionario {
	private double totalVendas;

	public Vendedor(String nome, String rg, double salario) {
		super(nome, rg, salario);
	}
	
	public void acumularVendas(double valor) {
		this.totalVendas +=valor;
	}
	
	@Override
	public void imprime() {
		//super.imprime();
		System.out.println(String.format("%s: %s\nSalario: %.2f", super.getNome(), super.rg, super.salario));
		double salarioFinal = super.salario + this.totalVendas*0.05;
		this.totalVendas = 0;
		System.out.println("Salário Total: " + salarioFinal);
	}

}
