package topics.com.datetime;

import java.time.LocalDate;

public class GetTodayDate {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        // outpuy : 2024-10-06
    }
}
