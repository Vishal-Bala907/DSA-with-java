package com.datetime;

import java.time.Duration;
import java.time.LocalTime;

public class GetTimeDifference {
    public static void main(String[] args) {
        LocalTime parse = LocalTime.parse("12:12:12");
        LocalTime parse2 = LocalTime.parse("01:12:12");

        Duration duration = Duration.between(parse,parse2);
        System.out.println(duration.toMinutes());
        System.out.println(duration.toHours());
        System.out.println(duration.toDays());
        System.out.println(duration.toSeconds());

/*
    -660
    -11
    0
    -39600

        */
    }
}
