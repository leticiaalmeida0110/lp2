package exercicio2;

public class Personagem {

    protected String nome;
    protected int forcaBase;

    public Personagem(String nome, int forcaBase) {
        this.nome = nome;
        this.forcaBase = forcaBase;
    }

    public double calcularAtaque() {
        return forcaBase;
    }

    public String getNome() {
        return nome;
    }
    
}
