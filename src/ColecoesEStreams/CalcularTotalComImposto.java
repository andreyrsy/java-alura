package ColecoesEStreams;

import java.util.List;

public class CalcularTotalComImposto {
    public static void main(String[] args) {
/*
Imagine que você trabalha no setor financeiro de uma empresa e precisa calcular o valor total gasto
na compra de produtos. No entanto, a empresa precisa considerar um imposto de 8% sobre o valor
total para definir corretamente o preço final dos produtos.

Crie um programa que:
Crie uma lista contendo os preços dos produtos.
Utilize reduce() para calcular o total gasto.
Calcule o valor do imposto (8%) sobre o total.
Exiba o valor total antes e depois da aplicação do imposto, com duas casas decimais.
*/
        List<Double> valores = List.of(1.99, 43.90, 12.00, 94.92, 99.00);

        double totalGasto = valores.stream()
                .reduce(0.0, Double::sum);

        double imposto = totalGasto * 0.08;
        double totalImposto = totalGasto + imposto;

        System.out.println("Valor total antes do imposto: " + totalGasto);
        System.out.printf("Valor total depois do imposto: %.2f", totalImposto);
    }
}
