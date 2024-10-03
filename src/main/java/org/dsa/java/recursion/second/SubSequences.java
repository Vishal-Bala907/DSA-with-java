package org.dsa.java.recursion.second;

public class SubSequences {

    public static void printSequence(String base , int index , String seq) {

        if(base.length()  == index) {
//            System.out.println(seq);
            return;
        }


        System.out.println(seq + base.charAt(index)+ " , ");
//        System.out.println( seq + "_ , ");
        //seq = seq + String.valueOf(base.charAt(index));


        printSequence(base, index + 1 , seq + (base.charAt(index)));
        printSequence(base, index + 1 , seq + "_" );
        // ayega


        // for nhi ayehga


        // left = b , right  = "_" {a}
        // ba , b_ => l
        // bal , ba_ , b_l , b__ => a
        // bala , bal_ , ba_a , ba__ , b_la , b_l_ , b__a, b___
    }

    public static void main(String[] args) {
        String base = "abc";
        printSequence(base , 0 , "" );
    }
}
