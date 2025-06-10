package ColecoesEStreams;

import java.util.*;

public class Colecoes {
    public static void main(String[] args) {
        List<String> funcionarios = new ArrayList<>();
        funcionarios.add("Pedro");
        funcionarios.add("Joao");
        funcionarios.add("Joao");
        funcionarios.add("Maria");

        System.out.println(funcionarios.get(1));

        Set<String> produtos = new HashSet<>();
        produtos.add("Agua");
        produtos.add("Coca-Cola");
        produtos.add("Agua");
        System.out.println(produtos);

        Map<Integer, String> clientes = new HashMap<>();
        clientes.put(1, "Maria");
        clientes.put(2, "Marcos");
        clientes.put(3, "Ana");
        System.out.println(clientes.get(2));
    }
}
