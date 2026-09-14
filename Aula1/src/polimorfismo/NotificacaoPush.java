public class NotificacaoPush extends Notificacao{

    private String tituloDispositivo;

    public NotificacaoPush(String destinatario, String mensagem, String tituloDispositivo){
        super(destinatario, mensagem);
        this.tituloDispositivo = tituloDispositivo;
    }


    @Override
    public void enviar(){
        System.out.println("Enviando Push para o dispositivo:"+ tituloDispositivo);
        System.out.println("Destinatário:"+ destinatario);
        System.out.println("Mensagem:"+ mensagem);

    }
}
