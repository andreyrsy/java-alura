package HerancaPolimorfismo.SistemaNotificacao;

public class Push extends Notificacao {
    private String conteudo;
    public Push(String destinatario, String titulo, String conteudo) {
        super(destinatario, titulo);
        this.conteudo = conteudo;
    }

    @Override
    public void enviar(){
        System.out.printf("\nEnviando Push para: %s\nTítulo: %s\nConteúdo: %s\n", getDestinatario(), getMensagem(), this.conteudo);
    }
}
