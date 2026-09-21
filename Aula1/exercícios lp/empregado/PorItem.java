package empregado;

public class PorItem extends Empregado{

    private double produzida;
    private int quantidade;

    public PorItem(String nome, double produzida, int quantidade) {
        super(nome);
        this.produzida = produzida;
        this.quantidade = quantidade;
    }

    @Override
    public double ganhar() {
        return produzida * quantidade;
    }

    @Override
    public String toString() {
        return "Funcionário por Item\n" +
               "Nome: " + nome +
               "\nValor por item: R$ " + String.format("%.2f", produzida) +
               "\nQuantidade produzida: " + quantidade +
               "\nSalário: R$ " + String.format("%.2f", ganhar());
    }
    
}
