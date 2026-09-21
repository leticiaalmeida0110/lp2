package interfaces;

public class Pix implements FormaPagamento{

    private double limite;

    public Pix(double limite) {
        this.limite = limite;
    }

    @Override
    public void processarPagamento(double valor) {

        if (valor <= limite) {

            System.out.println(
                "Pagamento Pix realizado instantaneamente."
            );

            emitirComprovante(valor);

        } else {

            System.out.println(
                "Pagamento recusado. Limite insuficiente."
            );
        }
    }

    @Override
    public void emitirComprovante(double valor) {

        System.out.println(
            "Comprovante gerado no valor de R$ "
            + valor
            + " (Pagamento Instantâneo)"
        );
    }

}
