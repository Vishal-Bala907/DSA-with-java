package com.datetime;

import java.time.LocalDate;

public class GetDates {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now().minusDays(1);
/*        LocalDate date = LocalDate.now().minusMonths(1);
        LocalDate date = LocalDate.now().minusWeeks(1);
        LocalDate date = LocalDate.now().minusYears(1);*/
        System.out.println(date);
//        output : 2024-10-05
    }
}
