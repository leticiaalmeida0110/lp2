package interfaces;

public class FilaEncadeada implements Fila {
	
	private No inicio, fim;
	
	public FilaEncadeada() {
		this.inicio = null;
		this.fim = null;
	}

	@Override
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

	@Override
	public Integer remove() {
		Integer valor = null; // retorno
		
		if (this.isEmpty()) {
			System.out.println("Impossivel remver.");
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

	@Override
	public boolean isEmpty() {
		boolean flag = false;
		
		if (this.inicio==null && this.fim==null)
			flag = true;
		
		return flag;
	}

	@Override
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
		Fila f1 = new FilaEncadeada();
		FilaEncadeada f2 = new FilaEncadeada();
		
		System.out.println("Vazia? " + f2.isEmpty());
		f2.mostra();
		
		f2.add(10);
		f2.add(20);
		f2.add(30);
		f2.mostra();
		
		System.out.println("Vazia? " + f2.isEmpty());
		
		System.out.println("Remocao:");
		f2.remove();
		f2.remove();
		f2.remove();
		f2.remove();
		
		f2.mostra();
	}

}
