package exercicio2;

public class TestePersonagem {

    public static void realizarTurno(Personagem p) {

        double dano = p.calcularAtaque();

        System.out.println( p.getNome() + " causou " + dano + " de dano." );
    }

    public static void main(String[] args) {

        Guerreiro guerreiro = new Guerreiro("Arthur", 100);

        Mago mago = new Mago("Merlin", 50, 80);

        Arqueiro arqueiro = new Arqueiro("Legolas", 100, 1.2);

        realizarTurno(guerreiro);
        realizarTurno(mago);
        realizarTurno(arqueiro);
    }
    
}
