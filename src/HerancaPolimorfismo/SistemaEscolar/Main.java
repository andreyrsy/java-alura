package HerancaPolimorfismo.SistemaEscolar;

public class Main {
    public static void main(String[] args) {
/*
Você está desenvolvendo um sistema de gestão para uma escola, onde é necessário organizar
informações de alunos e docentes. Cada pessoa na escola possui dados básicos, como nome e idade.
No entanto, cada grupo também possui características próprias: os alunos possuem uma nota final e
os docentes são responsáveis por uma disciplina.
Crie um programa que:

Defina uma classe Pessoa Com os atributos nome e idade.
Crie as classes Aluno e Docente, ambas herdando de Pessoa, adicionando:
Para Aluno : um atributo nota.
Para Docente: um atributo disciplina.
Instancie dois objetos Aluno e dois objetos Docente
Exiba as informações no terminal.
*/

    Aluno aluno1 = new Aluno("Júlia", 16, 8.4);
    aluno1.exibirDados();

    Aluno aluno2 = new Aluno("Rafael", 17, 9.7);
    aluno2.exibirDados();

    Docente professor1 = new Docente("João pedro", 42, "Ciência");
    professor1.exibirDados();

    Docente professor2 = new Docente("Marcelo", 31, "Matemática");
    professor2.exibirDados();


    }
}
