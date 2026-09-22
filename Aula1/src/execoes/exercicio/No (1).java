package exercicio;

public class No { // sem interface
	private Integer valor;
	private No prox;

	public No(Integer valor) {
		this.valor = valor;
		this.prox = null;
	}

	// gets e setts
	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public No getProx() {
		return prox;
	}

	public void setProx(No prox) {
		this.prox = prox;
	}

}
