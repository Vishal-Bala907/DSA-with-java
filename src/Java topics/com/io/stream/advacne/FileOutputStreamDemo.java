package com.io.stream.advacne;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        String source = "Now this is the time for all good men\n"+
                " come to the aid of their country\n"+
                " and pay their due taxes";

        byte[] buff = source.getBytes();
        FileOutputStream f0 = null;
        FileOutputStream f1 = null;
        FileOutputStream f2 = null;

        try{
            f0 = new FileOutputStream("src/Java topics/com/io/stream/advacne/first.txt");
            f1 = new FileOutputStream("src/Java topics/com/io/stream/advacne/second.txt");
            f2 = new FileOutputStream("src/Java topics/com/io/stream/advacne/third.txt");

            // write to the first file
            for(int i = 0; i < buff.length; i += 2) {
                f0.write(buff[i]);
            }
            // write to the second file
            f1.write(buff);

            // write to the third file
            f2.write(buff, buff.length - buff.length / 4, buff.length/4);

        }catch (IOException ex) {
            System.err.println(ex.getMessage());
        }finally {
            try{
                if (f0 != null) f0.close();
                if (f1 != null) f1.close();
                if (f2 != null) f2.close();
            }
            catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }

    }
}
