package ColecoesEStreams;

import java.util.List;

public class EstatisticasNotas {
    public static void main(String[] args) {
/*
Você deseja analisar as notas dos alunos e alunas em uma disciplina para entender melhor o
desempenho da turma. Além da média, você também quer saber a menor e a maior nota para ter um
panorama completo. Para isso, você deve criar um programa que seja capaz de:

• Criar uma lista contendo as notas dos alunos.
• Utilizar reduce() para calcular a soma total das notas.
• Calcular a média das notas.
• Determinar a menor e a maior nota da lista. Dica: use a função max e min da classe Stream
• Exibir os resultados no console.
*/

        List<Double> notas = List.of(10.0, 3.50, 7.0, 2.5, 3.0, 5.9);

        double somaNotas = notas.stream().reduce(0.0, Double::sum);
        double mediaNotas = somaNotas/notas.size();

        double menorNota = notas.stream().min(Double::compare).get();
        double maiorNota = notas.stream().max(Double::compare).get();

        System.out.printf("A média das notas é: %.2f\n", mediaNotas);
        System.out.println("A menor nota foi: "+ menorNota);
        System.out.println("A maior nota foi: "+ maiorNota);

    }
}
