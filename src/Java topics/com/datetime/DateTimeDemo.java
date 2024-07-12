package com.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;
//import java.util.Locale;

public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        LocalDateTime dateTime = date.atStartOfDay();

        // Convert the LocalDateTime to an Instant and then to a timestamp (milliseconds since epoch)
            long timestamp = dateTime.toInstant(ZoneOffset.UTC).toEpochMilli();
        System.out.println(date);

        System.out.println(LocalDate.now().atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli()); // == new Date().getTime());
    }
}
