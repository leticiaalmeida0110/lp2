package excecoes;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {
	List<Conta> listaContas;
	
	public Cadastro() {
		this.listaContas = new ArrayList<Conta>();
	}
	
	public void add(Conta conta) {
		this.listaContas.add(conta);
	}
	
	public Conta get(String numero) throws ContaInexistenteException {
		for (Conta c : this.listaContas) {
			if (c.getNumero().equals(numero))
				return c;
		}
		
		throw new ContaInexistenteException(numero);
	}
	
	public Conta debitar(String numero, double valor) throws ContaInexistenteException, SaldoInsuficienteException {
		Conta conta = get(numero);
		conta.debitar(valor);
		return conta;
	}

}
