package com.io.stream.advance;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        String source = """
                Now this is the time for all good men
                 come to the aid of their country
                 and pay their due taxes""";

        byte[] buff = source.getBytes();
        FileOutputStream f0 = null;
        FileOutputStream f1 = null;
        FileOutputStream f2 = null;

        try{
            f0 = new FileOutputStream("src/Java topics/com/io/stream/advance/first.txt");
            f1 = new FileOutputStream("src/Java topics/com/io/stream/advance/second.txt");
            f2 = new FileOutputStream("src/Java topics/com/io/stream/advance/third.txt");

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

        // Reading all the texts back
        try(FileInputStream fin = new FileInputStream("src/Java topics/com/io/stream/advance/first.txt")) {
            int i = 0;
            while (i != -1) {
                 i = fin.read();
                System.out.print((char)i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
