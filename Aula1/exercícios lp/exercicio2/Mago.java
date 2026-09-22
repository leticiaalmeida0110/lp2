package exercicio2;

public class Mago extends Personagem{

    private int poderMagico;

    public Mago( String nome, int forcaBase, int poderMagico) {

        super(nome, forcaBase);
        this.poderMagico = poderMagico;
    }

    @Override
    public double calcularAtaque() {
        return forcaBase + poderMagico;
    }
    
}
