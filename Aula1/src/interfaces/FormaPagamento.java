package interfaces;

public interface FormaPagamento {

    void processarPagamento(double valor);

    default void emitirComprovante(double valor) {

        System.out.println(
            "Comprovante gerado no valor de R$ " + valor
        );

    }

}
