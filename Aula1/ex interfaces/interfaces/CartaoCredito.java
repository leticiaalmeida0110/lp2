package interfaces;

public class CartaoCredito implements FormaPagamento{

    private double limite;

    public CartaoCredito(double limite) {
        this.limite = limite;
    }

    @Override
    public void processarPagamento(double valor) {

        double valorComTaxa = valor + (valor * 0.025);

        if (valorComTaxa <= limite) {

            limite = limite - valorComTaxa;

            System.out.println(
                "Pagamento realizado no cartão."
            );

            System.out.println(
                "Valor com taxa: R$ " + valorComTaxa
            );

            emitirComprovante(valorComTaxa);

        } else {

            System.out.println(
                "Pagamento recusado. Limite insuficiente."
            );
        }
    }

}
