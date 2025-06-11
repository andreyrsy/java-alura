package ColecoesEStreams;

import java.util.ArrayList;

public class AcessandoElementos {
    public static void main(String[] args) {
/*
Você faz parte da equipe de tecnologia de uma empresa que precisa garantir que o cadastro de
funcionários esteja sempre atualizado. Hoje, você recebeu uma solicitação para manter o controle
de acesso à empresa. Para isso, seu código deve ser capaz de:

Verificar quantos funcionários estão registrados
Descobrir o nome do segundo funcionário da lista
*/

        ArrayList<String> funcionarios = new ArrayList<>();
        funcionarios.add("João");
        funcionarios.add("Maria");
        funcionarios.add("Ana");
        funcionarios.add("Pedro");
        funcionarios.add("Antônio");

        System.out.println("A segunda pessoa da Lista é: "+funcionarios.get(1));

        System.out.printf("Total de funcionários: %s\n", funcionarios.size());


    }
}
