package ManipulamentoData;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataVencimento {
    public static void main(String[] args) {
/*
Você trabalha no setor financeiro de uma empresa de serviços e é responsável por
gerenciar o vencimento das faturas dos clientes. Em alguns casos, os clientes
solicitam um adiamento da data de pagamento, e o sistema precisa calcular a nova
data de vencimento com base na quantidade de meses adicionados.

Crie um programa que:

Receba uma data de vencimento original.
Adicione um número de meses ao vencimento.
A data ajustada deve ser exibida no formato dd-MM-yyyy.
Saída esperada:

Se a data de vencimento original for 20 de março de 2025 e o adiamento for de 1 mês, a saída deve ser:
*/

        LocalDate dataVencimentoOriginal = LocalDate.of(2025, 3, 21);
        int adiantamentoMeses = 1;
        LocalDate novaDataVencimento = dataVencimentoOriginal.plusMonths(adiantamentoMeses);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String dataFormatada = novaDataVencimento.format(formatter);

        System.out.println("Data Vencimento padrão: " + dataVencimentoOriginal.format(formatter));
        System.out.println("Data Vencimento Alterada: "+ dataFormatada);



    }
}
