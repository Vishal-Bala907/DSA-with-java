package org.dsa.java.recursion.first;

public class Factorial {

    public static int called = 0;
    public static int getFact(int  n){
        if(n == 0 || n == 1){
            System.out.println(called++);
            return 1;
        }else {
            System.out.println(called++);
            return n  * getFact(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(getFact(6));
    }

}
