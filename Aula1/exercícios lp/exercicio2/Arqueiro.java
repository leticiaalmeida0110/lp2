package exercicio2;

public class Arqueiro extends Personagem{

    private double precisao;

    public Arqueiro( String nome, int forcaBase, double precisao) {

        super(nome, forcaBase);
        this.precisao = precisao;
    }

    @Override
    public double calcularAtaque() {
        return forcaBase * precisao;
    }
    
}
