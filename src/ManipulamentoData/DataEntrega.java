package ManipulamentoData;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataEntrega {
    public static void main(String[] args) {
/*
Você é responsável pelos projetos em uma empresa de desenvolvimento de software.
Para garantir que os prazos sejam cumpridos, você precisa calcular a data de entrega
de cada projeto com base na data de início e no prazo estimado em dias.

Você precisa criar um programa que:

Receba uma data de início.
Adicione o prazo em dias ao início do projeto.
Exiba a data final formatada corretamente.

Saída esperada:
Se a data de início for 15 de março de 2025 e o prazo for 15 dias, a saída deve ser:
Data de entrega: 30-03-2025
*/

        LocalDate dataInicio = LocalDate.now();
        int prazoDias = 15;
        LocalDate dataFinal = dataInicio.plusDays(prazoDias);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.println("Data de entrega: " +dataFinal.format(formatter));


    }
}
