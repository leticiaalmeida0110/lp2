package colecoes;

import java.util.Comparator;

public class OrdenarPorPeso implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getPeso(), p2.getPeso());
    }
}