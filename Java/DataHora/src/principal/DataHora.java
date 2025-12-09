import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.time.format.DateTimeFormatter;
import java.time.Period;

// MetaSessãoEstudo25_12_09 -  

public class DataHora {
    public static void main(String args[]) {
        String dataString = "11/12/2024";
        String horaString = "02:30 PM";
        String dataHoraString = "2024-12-11 02:30 PM";

        // Formatar + Exibir Data e Hora
        try {
            // LocalDate
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate localDate = LocalDate.parse(dataString, formatter);
            
            System.out.println(localDate);
            
            // LocalTime
            DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("h:mm a");
            LocalTime hora = LocalTime.parse(horaString, formatterHora);

            System.out.println("Hora: " + hora);

            // LocalDateTime
            DateTimeFormatter formatterDataHora = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a");
            LocalDateTime dataHora = LocalDateTime.parse(dataHoraString, formatterDataHora);
            System.out.println("Data e hora: " + dataHora);

        } catch (DateTimeParseException e) {
            System.out.println("Erro ao converter string para data/hora " + e.getMessage());
        }

        // Subtração
        LocalDate data1 = LocalDate.of(2024, 1, 1);
        LocalDate data2 = LocalDate.of(2024, 12, 11);

        Period periodo = Period.between(data1, data2);

        System.out.println("Subtração entre " + data1 + " e " + data2);
        System.out.println("Diferença: " + periodo.getYears() + " anos, " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias.");

        // Adição
        LocalDate dataBase = LocalDate.now();
        LocalDate dataAtual;

        dataAtual = dataBase.plusDays(10);
        System.out.println("A data de hoje mais 10 dias é " + dataAtual);

        dataAtual = dataBase.plusMonths(3);
        System.out.println("A data de hoje mais 3 meses é " + dataAtual);

        dataAtual = dataBase.plusYears(2);
        System.out.println("A data de hoje mais 2 anos é " + dataAtual);

        LocalTime horaAtual = LocalTime.now();

        DateTimeFormatter formatterHours = DateTimeFormatter.ofPattern("hh:mm a");
        horaAtual = horaAtual.plusHours(5);
        System.out.println("As horas de hoje mais 5 horas é " + horaAtual.format(formatterHours));
    }
}
