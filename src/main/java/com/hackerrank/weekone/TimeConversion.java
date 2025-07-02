package com.hackerrank.weekone;

public class TimeConversion {

        public static String timeConversion(String s) {
            // Write your code here
            final String noonType = s.substring(s.length() - 2); // AM or PM
            String[] hourAndMinute = s.split(":");
            int hour = Integer.parseInt(hourAndMinute[0]);
//            int min = Integer.parseInt(hourAndMinute[1]);
            // PM
            if(noonType.equals("PM") && (hour > 0 && hour < 12)) {
                hour += 12;
                return hour+":"+ hourAndMinute[1]+":" +s.substring(s.length() - 4 , s.length() - 2);
            } else if (noonType.equals("AM") && (hour == 12)) {
                return "00:"+ hourAndMinute[1]+":" +s.substring(s.length() - 4 , s.length() - 2);
            } else {
                return s.substring(0 , s.length() - 2);
            }


        }

    public static void main(String[] args) {
        String[] inputs = {"12:01:00AM","12:01:00PM"};
        for(String inp : inputs) {

            System.out.println(timeConversion(inp));
        }
    }
}
