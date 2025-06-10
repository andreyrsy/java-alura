package ManipulamentoData;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VerificandoDataEvento {
    public static void main(String[] args) {
/*
Você trabalha em uma agência de turismo e é responsável
pelo agendamento de eventos como passeios e excursões.
Para garantir uma boa organização, o sistema precisa verificar
se um evento já ocorreu ou ainda está por vir com base na data atual.

Crie um programa que:
Receba uma data de evento previamente cadastrada.
Compare essa data com a data atual.
Exiba a data do evento e a data atual no formato dd-MM-yyyy.
Informe se o evento já ocorreu ou ainda está por vir.

Saída esperada:
Se a data do evento for 10 de março de 2025 e a data atual for 15
de março de 2025, a saída deve ser:
*/

        LocalDate dataAtual = LocalDate.now();
        LocalDate dataEvento = LocalDate.of(2025, 6, 23);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String dataAtualFormatada = dataAtual.format(formatter);
        String dataEventoFormatada = dataEvento.format(formatter);



        System.out.println("Data de evento: " + dataAtualFormatada);
        System.out.println("Data atual: "+ dataEventoFormatada);

        if(dataEvento.isBefore(dataAtual)){
            System.out.println("O evento já aconteceu!");
        } else {
            System.out.println("O evento ainda não aconteceu!");
        }


    }
}
