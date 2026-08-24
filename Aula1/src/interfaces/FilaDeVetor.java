package interfaces;

public class FilaDeVetor implements Fila{

    private Integer[] vetor;
    private int inicio;
    private int fim;
    private int tamanho;

    public FilaDeVetor() {
        this(5);
    }

    public FilaDeVetor(int tamanho) {

        this.vetor = new Integer[tamanho];
        this.inicio = 0;
        this.fim = 0;
        this.tamanho = 0;
    
    }

    @Override
public void add(Integer valor) {

    if (this.tamanho == this.vetor.length) {
        redimensionar();
    }

    this.vetor[this.fim] = valor;
    this.fim++;
    this.tamanho++;
}

private void redimensionar() {

    Integer[] novo = new Integer[this.vetor.length * 2];

    for (int i = 0; i < this.tamanho; i++) {
        novo[i] = this.vetor[this.inicio + i];
    }

    this.vetor = novo;
    this.inicio = 0;
    this.fim = this.tamanho;
}

@Override
public Integer remove() {

    if (isEmpty()) {
        return null;
    }

    Integer valor = this.vetor[this.inicio];

    this.vetor[this.inicio] = null;

    this.inicio++;
    this.tamanho--;

    return valor;
}

@Override
public Integer get(int index) {

    if (index < 0 || index >= this.tamanho) {
        return null;
    }

    return this.vetor[this.inicio + index];
} 

@Override
public boolean isEmpty() {
    return this.tamanho == 0;
}

public void mostra() {

    for (int i = 0; i < this.tamanho; i++) {
        System.out.println(this.vetor[this.inicio + i]);
    }
}

}
