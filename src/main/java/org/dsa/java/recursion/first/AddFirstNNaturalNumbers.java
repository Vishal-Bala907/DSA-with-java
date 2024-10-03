package org.dsa.java.recursion.first;

public class AddFirstNNaturalNumbers {
    public static int sumFirstN(int sum ,int n){
        if(sum > n){
            return 0;
        }
        return sum + sumFirstN(sum+1, n);

    }

    public static void main(String[] args) {
        System.out.println(sumFirstN(1,5));
    }
}
