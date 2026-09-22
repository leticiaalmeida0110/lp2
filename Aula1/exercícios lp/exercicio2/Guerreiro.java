package exercicio2;

public class Guerreiro extends Personagem{

    public Guerreiro(String nome, int forcaBase) {
        super(nome, forcaBase);
    }

    @Override
    public double calcularAtaque() {
        return forcaBase * 1.5;
    }
    
}
