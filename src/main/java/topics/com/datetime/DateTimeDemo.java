package topics.com.datetime;

import java.time.*;
import java.util.Date;
//import java.util.Locale;

public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        LocalDateTime dateTime = date.atStartOfDay();

        LocalTime parse = LocalTime.parse("18:46:41");
        LocalTime parse1 = LocalTime.parse("20:20:20");


        Duration duration = Duration.between(parse,parse1);
//        System.out.println(duration.toMinutes());

        System.out.println(LocalDate.now());

//        System.out.println(new Date().get);

        System.out.println(LocalDateTime.now().toLocalTime());

        // Convert the LocalDateTime to an Instant and then to a timestamp (milliseconds since epoch)
            long timestamp = dateTime.toInstant(ZoneOffset.UTC).toEpochMilli();
//        System.out.println(date);

//        System.out.println(LocalDate.now().atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli()); // == new Date().getTime());
    }
}
