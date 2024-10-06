package com.datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;

public class GetTimeStamp {
    public static void main(String[] args) {
        // Today
        Date date = new Date();
        System.out.println(date.getTime()); // 1728185059795

        long epochDay = LocalDate.now().atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli();
        System.out.println(epochDay); // 1728172800000

        // previous day timestamps
        long epochMilli = LocalDate.now().minusDays(2).atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli();
        System.out.println(epochMilli); // 1728000000000
    }
}
