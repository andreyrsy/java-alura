package HerancaPolimorfismo.SistemaNotificacao;

public class Main {
    public static void main(String[] args) {
/*
Você está desenvolvendo um sistema de comunicação para uma plataforma que precisa enviar
alertas aos usuários de diferentes formas. Cada tipo de notificação tem suas particularidades: um email exige um assunto e um corpo, um SMS somente o texto da mensagem, e uma notificação push
deve conter um título e uma mensagem de texto.
Crie um programa que:
Defina uma classe base Notificacao com atributos destinatário e mensagem.
Crie classes específicas (Email, SMS, Push) que herdem de Notificacao.
• Cada uma deve implementar o seu próprio metodo enviar(), exibindo como cada notificação é
disparada. Lembre-se de sobrescrever o metodo utilizando a anotação @override.
*/
        Email email = new Email(
                "emailcliente@gmail.com",
                "Promoção especial!",
                "Aproveite nosso desconto diário DEZEMBRO10");

        SMS sms = new SMS(
                "(51)9999-98883",
                "Sua fatura foi paga com sucesso!");

        Push push = new Push(
                "ususario_app_desenvolvedor",
                "Novidade!",
                "Você tem uma nova mensagem não lida.");

        email.enviar();
        sms.enviar();
        push.enviar();

    }
}
