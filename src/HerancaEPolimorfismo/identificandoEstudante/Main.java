package HerancaEPolimorfismo.identificandoEstudante;

public class Main {
    public static void main(String[] args) {
/*
Você está construindo um sistema acadêmico para uma escola. Cada aluno possui
um nome e pode ser identificado no sistema com uma mensagem padrão. A escola
também possui alunos bolsistas. Para deixar o sistema mais informativo, queremos
 exibir o tipo do aluno no momento da identificação, como "bolsista" ou "regular".

Crie um programa que:

Defina uma classe Aluno com nome e tipo.
Crie um metodo identificar() que que imprime: "Aluno: [nome] - Tipo: [tipo]".
Crie uma classe Bolsista que herda de Aluno e define o tipo automaticamente como "bolsista".
Crie um objeto Aluno regular e um Bolsista, e chame o metodo identificar() de cada um.
*/

        Aluno aluno1 = new Aluno("Fernanda", "Regular");
        Bolsista aluno2 = new Bolsista("Lucas");

        aluno1.identificar();
        aluno2.identificar();

    }
}
