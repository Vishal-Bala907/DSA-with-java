package com.lambda;

interface VariableCaptureDemo<T>{
    T getN(T n);
}

public class VariableCapture {
    public static void main(String[] args) {

        // effectively final variable (bcz used inside the lambda) and cannot be modified
        String s ="prefix";

        VariableCaptureDemo<String> str = (strPara)->{
            strPara += s; // no-error
        //  s+=strPara; // error:trying to modify the effectively final variable
            return String.valueOf(strPara.length());
        };
       System.out.println(str.getN("Hello"));
    }
}
