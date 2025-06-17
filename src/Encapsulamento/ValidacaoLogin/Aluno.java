package Encapsulamento.ValidacaoLogin;

public class Aluno {
    private String login;
    private String senha;

    public Aluno(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public void validarSenha(String validarLogin, String validarSenha, int tentativas){
        if(validarLogin.equals(this.login)  && validarSenha.equals(this.senha)){
            System.out.println("Login bem-sucedido!");
        } else{
            System.out.println("Senha incorreta. Tentativas restantes: "+tentativas);
        }
    }
}
