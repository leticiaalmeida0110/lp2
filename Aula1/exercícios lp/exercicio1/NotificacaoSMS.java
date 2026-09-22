package exercicio1;

public class NotificacaoSMS extends Notificacao{
    public NotificacaoSMS(
        String destinatario,
        String mensagem) {

    super(destinatario, mensagem);
}

@Override
public void enviar() {

    String mensagemSMS = mensagem;

    if (mensagemSMS.length() > 160) {
        mensagemSMS = mensagemSMS.substring(0, 160);
    }

    System.out.println(
        "Enviando SMS para: " + destinatario
    );

    System.out.println(
        "Mensagem: " + mensagemSMS
    );
}
    
}
