package ColecoesEStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QuadradoNumeros {
    public static void main(String[] args) {
/*
Você está desenvolvendo uma aplicação matemática que precisa calcular o quadrado de uma lista de
números. Essa funcionalidade será usada para gerar gráficos e análises estatísticas. Para resolver
essa tarefa você deve:

Criar uma lista contendo os números fornecidos.
Calcular o quadrado de cada número utilizando o metodo map.
Criar uma nova lista contendo os resultados.
Exibir a lista de quadrados no console.
*/

        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> quadrado = numeros.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());

        System.out.println(quadrado);
    }
}
