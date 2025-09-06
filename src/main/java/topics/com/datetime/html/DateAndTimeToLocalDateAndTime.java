package topics.com.datetime.html;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateAndTimeToLocalDateAndTime {

    public static void main(String[] args) {
        // Date in html : YYYY-MM-DD
        LocalDate parsedTime = LocalDate.parse("2025-08-16");
        System.out.println(parsedTime);

        LocalTime localTime = LocalTime.parse("18:20");
        System.out.println(localTime);
    }
}
