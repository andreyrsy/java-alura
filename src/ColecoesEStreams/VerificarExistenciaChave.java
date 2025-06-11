package ColecoesEStreams;

import java.util.HashMap;
import java.util.Map;

public class VerificarExistenciaChave {
    public static void main(String[] args) {
/*
Você é uma pessoa desenvolvedora que está criando um sistema de gerenciamento de clientes para
uma empresa. A equipe de atendimento precisa acessar os dados dos clientes cadastrados no
sistema através de um ID e conta com sua ajuda para implementar este sistema de busca.
Sua tarefa é:

Armazenar os clientes através de um Map<Integer, String>, onde a chave é o IDe o valor é o nome.

Cadastrar cinco clientes no sistema.
Verificar se um ID específico existe antes de tentar recuperar o nome do cliente.

Se a chave existir, você pode acessar o nome associado; caso contrário, exiba uma mensagem
informando que o cliente não foi encontrado.
*/

        Map<Integer, String> clientes = new HashMap<>();

        clientes.put(1, "Marcia");
        clientes.put(2, "Karen");
        clientes.put(3, "Joana");
        clientes.put(4, "Ana");
        clientes.put(5, "Marcos");

        int clienteId = 6;
        if(clientes.containsKey(clienteId)){
            System.out.printf("O nome do cliente com ID %s é: %s", clienteId, clientes.get(clienteId));
        } else {
            System.out.printf("Cliente com ID %s não encontrado.", clienteId);
        }

    }
}
