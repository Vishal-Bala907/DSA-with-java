package com.innerclasses;
/*
* It can access any private instance variable of the outer class. Like any other instance variable,
* we can have access modifier private, protected, public and default modifier. Like class,
* an interface can also be nested and can have access specifiers.
 *
* */
public class NestedInnerClass {

    class InnerClass {

        public void show() {
            System.out.println("This is a inner class");
        }
    }

    public static void main(String[] args) {

        NestedInnerClass.InnerClass inner =  new NestedInnerClass().new InnerClass();
        inner.show();

    }
}
