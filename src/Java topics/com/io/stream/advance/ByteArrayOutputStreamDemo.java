package com.io.stream.advance;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* uses byte array as the destination
* ByteArrayOutputStream() // default, the buffer of 32 bytes is created
* ByteArrayOutputStream(int numBytes)
*
* The buffer is held in the protected 'buf' field of the ByteArrayInputStream
* The buffer size will increase automatically if needed
* The number of bytes held by the buffer is contained in the protected 'count' field
*
* */
public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        String s = "This should end up in the array";
        byte[] buff = s.getBytes();

        try{
            bout.write(buff);
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Buffer as a String");
        System.out.println(bout.toString());

        System.out.println("Buffer into array");
        byte[] byteArray = bout.toByteArray();
        for(byte b : byteArray) {
            System.out.print((char)b);
        }

        System.out.println("Writing to an output stream");
        try(FileOutputStream fout = new FileOutputStream("src/Java topics/com/io/stream/advance/ByteArrayOutputStreamDemo.txt")) {
            bout.writeTo(fout);
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Doing reset");
        bout.reset();
        for(int i=0; i<3; i++) {
            bout.write('x');
        }

        System.out.println(bout.toString());
    }
}
