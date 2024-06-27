package com.lambda;

import java.util.UUID;

interface MethodReferenceDemo<T>{
    T methodReference(T t);
}

class MethodHereForReference {

    public static String doSomething(MethodReferenceDemo<String> t,String str) {
            return t.methodReference(str);
    }
}

class ReferencedMethodClass{
    public static String referenceThisMehtod(String str){
        return str.toUpperCase().trim().concat(String.valueOf(UUID.randomUUID()));
    }
}


public class MethodReference {
    public static void main(String[] args) {
     String str =  MethodHereForReference.doSomething(ReferencedMethodClass::referenceThisMehtod , "vishal bala is the GOAT");

     String str2 =  MethodHereForReference.doSomething((stri)->{
         return stri.toUpperCase().trim().concat(String.valueOf(UUID.randomUUID()));
     } , "vishal bala is the GOAT");

        System.out.println(str);

    }
}
