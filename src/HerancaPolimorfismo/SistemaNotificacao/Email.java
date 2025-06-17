package HerancaPolimorfismo.SistemaNotificacao;

public class Email extends Notificacao  {
    private String corpo;

    public Email(String destinatario, String assunto, String corpoMensagem){
        super(destinatario, assunto);
        this.corpo = corpoMensagem;
    }

    @Override
    public void enviar(){
        System.out.printf("\nEnviando Email para: %s\nAssunto: %s\nCorpo: %s\n", getDestinatario(), getMensagem(), this.corpo);
    }
}
