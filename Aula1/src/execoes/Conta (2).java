package excecoes;

public class Conta {
	private String numero;
	private double saldo;

	public void debitar(double valor) throws SaldoInsuficienteException{
		if (valor <= this.saldo)
			this.saldo -= valor;
		else
			// System.out.println("Saldo Insuficiente!");
		throw new SaldoInsuficienteException();
	}

	public void creditar(double valor) {
		this.saldo += valor;
	}

	public void transferir(Conta conta, double valor) throw SaldoInsuficienteException{
		debitar(valor); // sera que debitou?
		conta.creditar(valor);
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
