package exercicio;

public class FilaEncadeada { // sem interface
	
	private No inicio, fim;
	
	public FilaEncadeada() {
		this.inicio = null;
		this.fim = null;
	}

	public void add(Integer valor) {
		No novo = new No(valor);
		
		if(isEmpty()) {
			this.inicio = novo;
			this.fim = novo;
		} else {
			this.fim.setProx(novo);
			this.fim = novo;
		}
	}

public Integer remove() throws FilaVaziaException {
    Integer valor = null;

    if (this.isEmpty()) {
        throw new FilaVaziaException("Impossível remover: a fila está vazia.");
        
    } else if (this.inicio == this.fim) {
        valor = this.inicio.getValor();
        this.inicio = null;
        this.fim = null;
        
    } else {
        No noRemovido = this.inicio;
        this.inicio = this.inicio.getProx();
        valor = noRemovido.getValor();
        noRemovido.setProx(null);
    }

    return valor;
}

	public boolean isEmpty() {
		boolean flag = false;
		
		if (this.inicio==null && this.fim==null)
			flag = true;
		
		return flag;
	}

	public void mostra() {
		if (this.isEmpty()) {
			System.out.println("[]");
		} else if (this.inicio == this.fim) {
			System.out.println(this.inicio.getValor());
		} else {
			No aux = this.inicio;
			
			while (aux != null) {
				System.out.println(aux.getValor());
				aux = aux.getProx();
			}
		}
	}
	
	public static void main(String[] args) {
		FilaEncadeada f1 = new FilaEncadeada();
		FilaEncadeada f2 = new FilaEncadeada();
		
		System.out.println("Vazia? " + f2.isEmpty());
		f2.mostra();
		
		f2.add(10);
		f2.add(20);
		f2.add(30);
		f2.mostra();
		
System.out.println("Remocao:");

try {
    f2.remove();
    f2.remove();
    f2.remove();
    f2.remove();
} catch (FilaVaziaException e) {
    System.out.println("Erro: " + e.getMessage());
}
		
		f2.mostra();
	}

}
