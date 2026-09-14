package colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestePessoa {

    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();

        // Criando pessoas
        pessoas.add(new Pessoa("Carlos", 25, 1.75, 70, 'M'));
        pessoas.add(new Pessoa("Ana", 30, 1.60, 60, 'F'));
        pessoas.add(new Pessoa("Bruno", 20, 1.80, 85, 'M'));
        pessoas.add(new Pessoa("Daniela", 35, 1.65, 95, 'F'));

        // Lista original
        System.out.println("===== LISTA ORIGINAL =====");

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        // Ordenação pelo nome - Comparable
        Collections.sort(pessoas);

        System.out.println("\n===== ORDENADA POR NOME =====");

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        // Ordenação pela idade - Comparator
        Collections.sort(pessoas, new OrdenarPorIdade());

        System.out.println("\n===== ORDENADA POR IDADE =====");

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        // Ordenação pelo peso - Comparator
        Collections.sort(pessoas, new OrdenarPorPeso());

        System.out.println("\n===== ORDENADA POR PESO =====");

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }
}