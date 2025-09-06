package topics.com.datetime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class GetCurrentTime {
    public static void main(String[] args) {
        LocalTime localTime = LocalDateTime.now().toLocalTime();
        System.out.println(localTime); // 08:44:41.101279500

        LocalTime localTime2 = LocalTime.now();
        System.out.println(localTime2); // 08:45:10.486559800

        long time = new Date().getTime();
        System.out.println(time); // 1728184564383
    }
}
