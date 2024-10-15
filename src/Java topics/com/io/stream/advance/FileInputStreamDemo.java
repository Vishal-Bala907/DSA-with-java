package com.io.stream.advance;


import java.io.FileInputStream;
import java.io.IOException;

// FileInputStream(String filePath)
// FileInputStream(File file)
public class FileInputStreamDemo {

    public static void main(String[] args) {
        int size;

       try(FileInputStream fin = new FileInputStream("src/Java topics/com/io/stream/advacne/TestingClass.java")) {
           System.out.println("Available bytes : " + (size = fin.available()));

           int n = size/40;
           System.out.println("First "+n+" bytes of the file one read() at a time");
           for(int i =0; i<n; i++) {
               System.out.print((char)fin.read());
           }

           System.out.println("\nStill available bytes : "+fin.available());

           System.out.println("Reading the next "+n+" with the one raad(b[])");
           byte[] b = new byte[n];

           // Reading the n bytes and storing them into b
           if(fin.read(b)!=n) {
               System.err.println("Couldn't read "+n+" bytes");
           }

           System.out.println(new String(b,0,n));

           System.out.println("\nStill available bytes : "+fin.available());

           System.out.println("Skipping half of the remaining bytes with skip() " );
           fin.skip(size/2);
           System.out.println("\nStill available bytes : "+fin.available());


           System.out.println("Reading "+ n/2 +" into the end of the array");

           if(fin.read(b,n/2,n/2) != n/2) {
               System.err.println("Couldn't read "+n/2+" bytes");
           }

           System.out.println(new String(b,0,b.length));

           System.out.println();


       }catch (IOException ex) {
           System.out.println(ex.getMessage());
       }

    }
}
