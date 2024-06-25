package com.lambda;

interface SomeFunc<T>{
    T doSomething(T t);
}

public class GenericFunctionalInterface {
    public static void main(String[] args) {
        SomeFunc<Integer> f =(Integer n)->{
            int fact=1;
            for(int i=1;i<=n;i++){
                fact = n*i;
            }
            return fact;
        };

        SomeFunc<String> s = (String str)->{
            String rev = "";
            int i = str.length();
            for(i = str.length()-1; i>=0; i--){
                rev += str.charAt(i);
            }
            return rev;
        };

        //! Printing factorial
        System.out.println(f.doSomething(5));
        //* Reversing number
        System.out.println(s.doSomething("Vishal is here"));
    }
}
