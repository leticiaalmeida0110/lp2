package empregado;

public class Main {

    public static void main(String[] args) {

        Empregado funcionario1 =
                new PorHora("João", 20, 40);

        Empregado funcionario2 =
                new PorComissao("Maria", 1500, 20, 30);

        Empregado funcionario3 =
                new PorItem("Pedro", 5, 100);

        System.out.println(funcionario1);
        System.out.println("--------------------");

        System.out.println(funcionario2);
        System.out.println("--------------------");

        System.out.println(funcionario3);
    }
    
}
