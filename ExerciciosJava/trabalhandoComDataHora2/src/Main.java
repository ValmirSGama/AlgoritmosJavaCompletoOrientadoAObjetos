import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {

	public static void main(String[] args) {
		
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		LocalDate d04 = LocalDate.parse("2023-12-22");
		LocalDateTime d05 = LocalDateTime.parse("2023-12-22T15:49:45");
		Instant d06 = Instant.parse("2023-12-22T01:14:55Z"); // Quando for 'Instant', tem que representar o fuso horário, e o 'Z', representa o horário de Londres, é considerado o marco zero dos fusos horários.
		
		// Convertendo a data e hora Global para Local.
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		/**
		 * for(String s : ZoneId.getAvailableZoneIds()) {  // Imprime todos os timeZones disponíveis.
		 * 		System.out.println(s);
		 * }
		 */	
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println("d04 mês = " + d04.getMonthValue());
		System.out.println("d04 ano = " + d04.getYear());
		
		System.out.println("d05 hora = " + d05.getHour());
		System.out.println("d05 minuto = " + d05.getMinute());
				
	}

}
