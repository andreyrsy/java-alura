package POO_OrientacaoAObjetos.AgendaContatos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
/*
Você está desenvolvendo um aplicativo de agenda para uma empresa. Os funcionários
precisam acessar rapidamente os contatos de clientes e fornecedores, mantendo as
informações organizadas e fáceis de localizar.

Crie uma classe que:

Armazene contatos com nome e telefone em uma lista
Permita visualizar todos os contatos cadastrados
Formate a exibição para melhor legibilidade
*/
        ArrayList<Contato> contatos = new ArrayList<>();

        contatos.add(new Contato("Josefino","(11) 99999-0000"));
        contatos.add(new Contato("Ana","(51) 99399-1020"));
        contatos.add(new Contato("Maria","(12) 94999-3110"));

        System.out.println("Lista de contatos:");
        int indice = 1;

        for (Contato contato : contatos) {
            System.out.printf("%d. %s - %s\n", indice++, contato.getNome(), contato.getTelefone());
        }

    }
}
