package interfaces;

public class TesteFila {

    public static void main(String[] args) {

        Fila f1 = new FilaDeVetor();
        Fila f2 = new FilaEncadeada();

        f1.add(10);
        f1.add(20);
        f1.add(30);

        f2.add(100);
        f2.add(200);
        f2.add(300);

        System.out.println("Fila de vetor:");
        System.out.println(f1.get(0));
        System.out.println(f1.get(1));
        System.out.println(f1.remove());

        System.out.println();

        System.out.println("Fila encadeada:");
        System.out.println(f2.get(0));
        System.out.println(f2.get(1));
        System.out.println(f2.remove());

        System.out.println();

        System.out.println("Fila de vetor vazia? " + f1.isEmpty());
        System.out.println("Fila encadeada vazia? " + f2.isEmpty());
    }

}
