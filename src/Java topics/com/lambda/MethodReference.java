package com.lambda;

import java.lang.invoke.MethodHandleInfo;
import java.util.UUID;

interface MethodReferenceDemo<T>{
    T methodReference(T t);

}

//
class MethodHereForReference {

    public static String doSomething(MethodReferenceDemo<String> t,String str) {
        //
            return t.methodReference(str);
    }
    public  Integer doSomething2(MethodReferenceDemo<Integer> t,Integer i) {
        //
            return t.methodReference(i);
    }
}

class ReferencedMethodClass{
    public static String referenceThisMehtod(String str){
        return str.toUpperCase().trim().concat(String.valueOf(UUID.randomUUID()));
    }

    public static int referenceThisMehtod2(Integer i){
        return 123 * i;
    }
































}

public class MethodReference {
    public static void main(String[] args) {
     String str =  MethodHereForReference.doSomething(ReferencedMethodClass::referenceThisMehtod , "vishal bala is the GOAT");

     String str2 =  MethodHereForReference.doSomething((stri)->{
         return stri.toUpperCase().trim().concat(String.valueOf(UUID.randomUUID()));
     } , "vishal bala is the GOAT");
//

//     ?
        MethodHereForReference methodHereForReference  = new MethodHereForReference();
      int  i =  methodHereForReference.doSomething2(ReferencedMethodClass::referenceThisMehtod2,123);
        System.out.println(i);


        //! normal lambda
        MethodReferenceDemo<String> ref = (string)->{
            return string + " ALONE is best";
        };

       String strg =  ref.methodReference("vishal bala");
        System.out.println(strg);

    }
}
