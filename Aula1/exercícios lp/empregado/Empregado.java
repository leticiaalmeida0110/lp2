package empregado;

public abstract class Empregado {

    protected String nome;

    public Empregado(String nome) {
        this.nome = nome;
    }

    public abstract double ganhar();

    @Override
    public String toString() {
        return "Nome: " + nome + "\nSalário: R$ " + String.format("%.2f", ganhar());
    }
    
}
