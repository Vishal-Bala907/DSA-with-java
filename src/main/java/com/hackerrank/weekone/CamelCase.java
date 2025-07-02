package com.hackerrank.weekone;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
//        String value = "S:M:plasticCup()"; // M,C,V
//        String value = "C:V:mobile phone"; // M,C,V
//        String value = "C;C;coffee machine"; // M,C,V
//        String value = "S;C;LargeSoftwareBook"; // M,C,V
//        String value = "C;M;white sheet of paper"; // M,C,V
//        String value = "S;V;pictureFrame"; // M,C,V

        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            String value = sc.nextLine();
            String newValue = "";

            String[] perform = value.split(";");

            if (perform[0].equals("S")) {
                for (String s : perform[2].split("")) {
                    if (s.matches("[A-Z]")) {
                        newValue += " " + s.toLowerCase();
                    } else {

                        newValue += s;
                    }
                }
                if (perform[1].equals("M")) {
                    newValue = newValue.replaceAll("[()]", "");
                }
            } else {
                // combine here
                String[] words = perform[2].split(" ");
                for (String word : words) {
                    // convert first occurrence to capital then merge
                    newValue += word.split("")[0].toUpperCase() + word.substring(1);
                }
                if (!perform[1].equals("C")) {
                    newValue = newValue.split("")[0].toLowerCase() + newValue.substring(1);
                    if (perform[1].equals("M")) {
                        newValue += "()";
                    }
                }
            }

            System.out.println(newValue.trim());
        }
    }
}
