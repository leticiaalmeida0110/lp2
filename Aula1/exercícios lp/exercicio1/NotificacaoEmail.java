package exercicio1;

public class NotificacaoEmail extends Notificacao{
    private String assunto;

    public NotificacaoEmail(
            String destinatario,
            String mensagem,
            String assunto) {

        super(destinatario, mensagem);
        this.assunto = assunto;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando e-mail para: " + destinatario);
        System.out.println("Assunto: " + assunto);
        System.out.println("Mensagem: " + mensagem);
    }

}
