package com.lambda;

interface StringFunct{
    String funct(String s);
}


class LambdasAsArgumentDemo {
    static String function(StringFunct stringFunct ,String str){
        // stringFunct = str -> str.toUpperCase()
        return stringFunct.funct(str);
    }
    public static String getLength(String str){
        return String.valueOf(str.length());
    }
}

public class LambdasAsArgs {
    public static void main(String[] args) {

        // Converting string to uppercase
        String upCase = "";
        upCase = LambdasAsArgumentDemo.function(String::toUpperCase , "hello everyone" );
        System.out.println("Uppercase "+upCase);

        // method reference
        /*
        *   interface StringFunct{
        *       String function(String s);
        *   }
        *  since this returns a String value so in the method reference, we supply the Classname whose
        * method we are going to pass and then two colon followed by the method name
        *
        * */
       String methodRef = LambdasAsArgumentDemo.function(LambdasAsArgumentDemo::getLength, "hello everyone");
 //       String methodRef = LambdasAsArgumentDemo.function(LambdasAsArgumentDemo::getLength, "hello everyone");
//        LambdasAsArgumentDemo.function((str)->{
//            return String.valueOf(str.length());
//        }, "hello everyone");


        // remove white spaces
        String spaces = LambdasAsArgumentDemo.function((str)->{
            String removed = "";
            for(int i=0;i<str.length()-1;i++){
                if(! (str.charAt(i)==' ')){
                    removed+=str.charAt(i);
                }
            }
            return removed;
        }, "method we are going to pass and then two colon followed by the method name");
        System.out.println("removed spaces" + spaces);

        // passing instance of a method
        StringFunct  reverse = (str)->{
            String rev = "";
            int i = str.length();
            for(i = str.length()-1; i>=0; i--){
                rev += str.charAt(i);
            }
            return rev;
        };

        String instancePassing = LambdasAsArgumentDemo.function(reverse, "hello everyone");
        System.out.println(instancePassing);

    }
}
