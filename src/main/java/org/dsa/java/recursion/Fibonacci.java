package org.dsa.java.recursion;

public class Fibonacci {

    public static int xToThePowerN(int x, int n){

        if(x==0)
            return 0;
        if(n==0)
            return 1;

        return x * xToThePowerN(x,n-1);
    }

    public static int xToThePowerNLogN(int x, int n){

        if(x==0)
            return 0;
        if(n==0) {
            return 1;
        }
        if(n%2==0){
            return  xToThePowerNLogN(x,(n)/2) * xToThePowerNLogN(x,(n)/2);
        }else{
            return x *  xToThePowerNLogN(x,(n-1)/2) * xToThePowerNLogN(x,(n-1)/2);
        }
    }

    public static void printFibonacci(int a , int b ,int n) {

        if(n == 2) {
            return;
        }

        System.out.print(a + b +" , ");
        printFibonacci(b ,a+b,n-1);

    }

    public static void main(String[] args) {
        //System.out.print("0 , 1 , ");
       // printFibonacci(0,1,10);

        System.out.print(xToThePowerN(5,4));

//        System.out.println(xToThePowerNLogN(3,4));

    }


}
