package HerancaPolimorfismo.SistemaNotificacao;

public class SMS extends Notificacao  {
    public SMS(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }

    @Override
    public void enviar(){
        System.out.printf("\nEnviando SMS para: %s\nMensagem: %s\n", getDestinatario(), getMensagem());
    }
}
