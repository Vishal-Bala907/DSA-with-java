package topics.com.io.stream.characterStreams;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharacterArrayReaderAndWriterDemo {
    public static void main(String[] args) {
    // Character array reader
        /*
        * implements input stream that uses char[] as source
        * CharArrayReader(char[] array)
        * CharArrayReader(char[] array, int start. int numChars)
        * the close() method does not throw any exception
        * */
        String temp = "abcdefghijklmnopqerstuvwxyz";
        int length = temp.length();
        char[] c = new char[length];

        temp.getChars(0,length,c,0);

        try(CharArrayReader reader1 = new CharArrayReader(c);
            CharArrayReader reader2 = new CharArrayReader(c,0,5);
        ) {
        int i1=0,i2=0;
        while((i1 = reader1.read()) != -1) {
            System.out.print((char)i1);
        }
            System.out.println("\nReading first 5 characters using reader2");
            while((i2 = reader2.read()) != -1) {
                System.out.print((char)i2);
            }

        }catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
//            all characters using reader1
    }
}
