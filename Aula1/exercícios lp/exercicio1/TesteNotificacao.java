package exercicio1;

public class TesteNotificacao {

    public static void main(String[] args) {

        NotificacaoEmail email =
            new NotificacaoEmail(
                "joao@email.com",
                "Sua compra foi aprovada!",
                "Compra aprovada"
            );

        NotificacaoSMS sms =
            new NotificacaoSMS(
                "31999999999",
                "Sua compra foi aprovada!"
            );

        NotificacaoPush push =
            new NotificacaoPush(
                "João",
                "Você recebeu uma nova mensagem!",
                "Celular do João"
            );

        GerenciadorNotificacoes gerenciador =
            new GerenciadorNotificacoes();

        gerenciador.dispararAlerta(email);
        gerenciador.dispararAlerta(sms);
        gerenciador.dispararAlerta(push);
    }
    
}
