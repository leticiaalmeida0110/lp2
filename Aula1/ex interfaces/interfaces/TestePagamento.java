package interfaces;

public class TestePagamento {

    public static void main(String[] args) {

        FormaPagamento cartao =
                new CartaoCredito(1000);

        FormaPagamento pix =
                new Pix(500);

        System.out.println("CARTÃO");

        cartao.processarPagamento(100);

        System.out.println();

        System.out.println("PIX");

        pix.processarPagamento(200);
    }

}
