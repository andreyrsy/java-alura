package ManipulamentoData;

import java.time.Duration;
import java.time.LocalTime;

public class diferencaEntreHoras {
    public static void main(String[] args) {
/*
Você é responsável pelo controle de tempo em projetos dentro de uma agência de desenvolvimento.
Você precisa monitorar o tempo gasto em cada tarefa para garantir que os projetos sejam executados dentro do prazo.

Para isso, crie um programa que:

Receba dois horários representando o início e o término de uma atividade.
Calcule a diferença em horas e minutos entre esses dois horários.
Exiba o resultado formatado.
Saída esperada:

Se o primeiro horário for 14:30:00 e o segundo horário for 16:45:00, a saída deve ser:
*/
        LocalTime horaInicio = LocalTime.of(14, 30);
        LocalTime horaFim = LocalTime.of(16, 45);
        Duration duracao = Duration.between(horaInicio, horaFim);
        System.out.println("Duração de "+duracao.toHours()+ " horas e "+duracao.toMinutesPart() + " minutos.");

    }
}
