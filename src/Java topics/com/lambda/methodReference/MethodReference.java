package com.lambda.methodReference;

import java.util.UUID;

interface MethodReferenceDemo<T>{
    T methodReference(T t);
}

//
class MethodHereForReference {

    // Static method that needs and instance of MethodReferenceDemo interface
    public static String doSomething(MethodReferenceDemo<String> t,String str) {
            return t.methodReference(str);
    }


    // non-static method that needs and instance of MethodReferenceDemo interface
    public  Integer doSomething2(MethodReferenceDemo<Integer> t,Integer i) {
            return t.methodReference(i);
    }
}

class ReferencedStaticMethodClass {
    public static String referenceThisMethod(String str){
        return str.toUpperCase().trim().concat(String.valueOf(UUID.randomUUID()));
    }

    public static int referenceThisMethod2(Integer i){
        return 123 * i;
    }
}

class ReferencedNonStaticMethodClass {
    public String referenceThisMethod(String str){
        return str.toUpperCase().trim().concat(String.valueOf(UUID.randomUUID()));
    }

    public int referenceThisMethod2(Integer i){
        return 123 * i;
    }
}

public class MethodReference {
    public static void main(String[] args) {

        // calling static method of MethodHereForReference
        String staticMethodCall = MethodHereForReference.doSomething(String::toUpperCase, "vishal bala is great");

      /*  MethodReferenceDemo<String> demo1 = (str)->{str.toUpperCase()};
        String s = demo1.methodReference("jai shree ram"); */

      // PASSING STATIC METHOD AD REFERENCE
        MethodHereForReference methodHereForReference = new MethodHereForReference();
        Integer i = methodHereForReference.doSomething2(ReferencedStaticMethodClass::referenceThisMethod2, 22);
        System.out.println("static method reference passed"+i);

     // PASSING NON-STATIC METHOD AS REFERENCE

        ReferencedNonStaticMethodClass referencedNonStaticMethodClass = new ReferencedNonStaticMethodClass();
        String vishal= MethodHereForReference.doSomething(referencedNonStaticMethodClass::referenceThisMethod, "jai shree vishal bala");
        System.out.println("non-static reference method passed "  + vishal);

    }
}
