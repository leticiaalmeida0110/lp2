package colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teste {

    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Carlos", 25, 1.75, 70, 'M'));
        pessoas.add(new Pessoa("Ana", 20, 1.60, 55, 'F'));
        pessoas.add(new Pessoa("João", 30, 1.80, 90, 'M'));
        pessoas.add(new Pessoa("Maria", 18, 1.65, 50, 'F'));

        // Ordenação pelo nome - Comparable
        Collections.sort(pessoas);

        System.out.println("Ordenação por nome:");
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }

        // Ordenação pela idade - Comparator
        Collections.sort(pessoas, new PessoaIdadeComparator());

        System.out.println("\nOrdenação por idade:");
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }

        // Ordenação pelo peso - Comparator
        Collections.sort(pessoas, new PessoaPesoComparator());

        System.out.println("\nOrdenação por peso:");
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }

        // Teste do IMC
        System.out.println("\nIMC:");
        for (Pessoa p : pessoas) {
            System.out.printf("%s: %.2f - %s%n",
                    p.getNome(),
                    p.calcularIMC(),
                    p.classificacaoIMC());
        }
    }
}
