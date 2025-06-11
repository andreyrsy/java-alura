package ColecoesEStreams;

import java.util.ArrayList;

public class RemovendoElementos {
    public static void main(String[] args) {
/*
Você está trabalhando no sistema de gestão de uma escola, garantindo que a lista de estudantes
esteja sempre correta. Durante uma revisão nos cadastros, percebeu que um nome foi adicionado
incorretamente: "Pedro". Para evitar confusões na emissão de certificados e registros, você precisa
corrigir essa informação imediatamente.
Sua tarefa é remover o nome “Pedro" da lista. Considere que a lista inicial possui os seguintes
nomes: Joana, Lucas, Pedro e Antônio.
*/
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Joana");
        lista.add("Lucas");
        lista.add("Pedro");
        lista.add("Antônio");

        System.out.printf("Lista inicial: %s\n",lista);
        lista.remove("Pedro");
        System.out.printf("Lista após a exclusão: %s",lista);

    }
}
