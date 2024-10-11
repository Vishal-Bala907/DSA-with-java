package com.io.stream.basic;

import java.io.PrintWriter;

/*
* For real world programs, the recommended method for writing to the console when using the java
* is through a PrintWriter class
* It is a character based class
*
* PrintWriter(OutputStream stream, Boolean flushingOn)
* flushingOn specifies whether the java flushes the output stream everytime a println method is called
*
* */
public class PrintWriterClass {
    public static void main(String[] args) {
        PrintWriter printWriter = new PrintWriter(System.out,true);

        printWriter.println("This is a String");

        int i = -7;
        printWriter.println(i);
        double d = 4.5e-7;
        printWriter.println(d);


    }
}
