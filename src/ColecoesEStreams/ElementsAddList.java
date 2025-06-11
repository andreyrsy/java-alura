package ColecoesEStreams;

import java.util.ArrayList;

public class ElementsAddList {
    public static void main(String[] args) {
/*
Vocên está desenvolvendo um sistema para gerenciar os nomes dos fucionários de uma empresa de
tecnologia. O sistema precisa permitir que novos funcionários sejam adicionados a uma lista de
nomes.
Sua tarefa é criar uma lista de strings e adicionar os nomes dos funcionários "João", "Maria", " Vitor" e
"Ana" a essa lista. Depois, imprima a lista para verificar se os nomes foram adicionados
corretamente.
*/

        ArrayList<String> lista = new ArrayList<>();
        lista.add("João");
        lista.add("Maria");
        lista.add("Vitor");
        lista.add("Ana");

        System.out.println("Lista de funcionários "+lista);

    }
}
