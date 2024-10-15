package com.io.stream.advance;

import java.io.ByteArrayInputStream;

/*
* uses a byte array sa the source
?  ByteArrayInputStream(byte[] byteArr)
? ByteArrayInputStream(byte[] byteArr, int start, int numOfBytes)
* */
public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        String tmp = "abc";
        ByteArrayInputStream bais = new ByteArrayInputStream(tmp.getBytes());
        for(int i =0; i<2; i++) {
            int c = 0;
            while ((c = bais.read()) != -1) {
                if(i==0)
                    System.out.print((char)c);
                else
                    System.out.print(Character.toUpperCase((char)c));
            }
            System.out.println();
            /*
            * reset(), sets the stream pointer start of the stream
            * */
            bais.reset();
        }
    }
}
