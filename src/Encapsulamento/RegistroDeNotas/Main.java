package Encapsulamento.RegistroDeNotas;

public class Main {
    public static void main(String[] args) {
/*
Você está desenvolvendo um módulo acadêmico para registrar o desempenho dos alunos em cada
disciplina. O sistema precisa ser flexível para receber diferentes quantidades de notas, mas deve
garantir que todas estejam dentro do intervalo válido.
Crie um programa que:
Defina uma classe que armazene o nome da disciplina e a lista das notas dos alunos
Valide se cada nota está entre 0 e 10
Calcule a média apenas das notas válidas
Informe quantas notas foram registradas com sucesso e quantas foram ignoradas
*/


        Disciplina historia = new Disciplina("História");

        historia.adicionarNota(7.5);
        historia.adicionarNota(11.0);
        historia.adicionarNota(8.0);
        historia.adicionarNota(-3.0);
        historia.adicionarNota(7.9);

        System.out.println("Total de notas válidas: " + historia.contarNotasValidas());
        System.out.printf("Média em %s: %.2f\n", historia.getDisciplina(), historia.calcularMedia());
    }
}
