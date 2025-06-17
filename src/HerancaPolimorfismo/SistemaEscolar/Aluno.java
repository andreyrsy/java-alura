package HerancaPolimorfismo.SistemaEscolar;

public class Aluno extends Pessoa{
    private double nota;

    public Aluno(String nome, int idade, double nota) {
        super(nome, idade);
        this.nota = nota;
    }

    public void exibirDados(){
        System.out.printf("Aluno: %s - Idade: %d - Nota: %.1f\n", this.getNome(), this.getIdade(), this.nota);
    }
}
