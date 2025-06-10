package ManipulamentoData;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class dateFormat {
    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        LocalTime hora = LocalTime.now();

        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter horaFormatada = DateTimeFormatter.ofPattern("hh:mm");

        System.out.println("Data formatada: "+data.format(dataFormatada));
        System.out.println("Hora formatada: "+hora.format(horaFormatada));

    }
}
