package Encapsulamento.SistemaPontosAlunos;

public class Aluno {
    private String nome;
    private int pontos;
    private int nivel;

    public Aluno(String nome) {
        this.nome = nome;
        this.pontos = 0;
        this.nivel = 1;
    }

    public void ganharPontos(int pontosAdicionados){
        this.pontos += pontosAdicionados;
        atualizarNivel();
    }
    public void atualizarNivel(){
        this.nivel = (pontos / 100) + 1;
    }
    public void exibirStatus(){
        System.out.printf("Nome: %s\nPontos: %s\nNivel: %s", this.nome, this.pontos, this.nivel);
    }

}
