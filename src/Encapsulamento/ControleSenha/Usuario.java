package Encapsulamento.ControleSenha;

public class Usuario {
    private String senha;

    public Usuario(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha, String novaSenha) {
        if(senha.equals(this.senha)){
            this.senha = novaSenha;
            System.out.println("Senha atualizada com sucesso!");
        } else {
            System.out.println("Senha incorreta! Tente novamente!");
        }
    }
}
