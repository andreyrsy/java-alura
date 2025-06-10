package ManipulamentoData;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class main {
    public static void main(String[] args) {
        LocalDate dataCompra = LocalDate.now();
        LocalDate dataPrimeiraParcela = LocalDate.of(2025, 6, 20);
        LocalDate dataSegundaParcela = dataPrimeiraParcela.plusDays(30);

        if(dataPrimeiraParcela.isBefore(LocalDate.now())){
            System.out.println("Hoje é o dia do vencimento.");
        } else {
            System.out.println("Ainda não é o dia do vencimento.");
        }

        System.out.println("Data compra: " + dataCompra);
        System.out.println("Data primeira parcela: " + dataPrimeiraParcela);
        System.out.println("Data segunda parcela: " + dataSegundaParcela);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data compra formatada: " + dataCompra.format(formatter));

        ZonedDateTime dataConclusaoCompra = ZonedDateTime.now();
        System.out.println("Data conclusao compra formatada: " + dataConclusaoCompra);
        ZonedDateTime dataConclusaoCompraNY = dataConclusaoCompra.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("Data conclusao compra New York: " + dataConclusaoCompraNY);

        LocalTime inicio = LocalTime.of(9, 0);
        LocalTime fim = LocalTime.of(17, 30);

        System.out.println("Inicio: "+inicio+"\nFim: "+fim);
        Duration duracao = Duration.between(inicio, fim);
        System.out.println("Duração do expediente: "+duracao.toHours()
                + " horas e " + duracao.toMinutesPart() + " minutos");

        LocalDate dataPagamento = LocalDate.parse("2025-10-30");
        Period periodo = Period.between(dataCompra, dataPagamento);
        System.out.println("Diferença de meses: "+periodo.getMonths()+ "\nEm dias: "+periodo.getDays());

    }
}
