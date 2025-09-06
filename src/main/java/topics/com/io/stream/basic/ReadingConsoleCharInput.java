package topics.com.io.stream.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * System.in is an object of type InoputStream and System.out/err is an Object of type PrintStream and
 *      These are byte streams
 *
 *  To obtain the a character based input stream that is attached to the console, Wrap System.in
 * in BufferedReader (CharacterStream)
 *
 *  BufferedReader(Reader inputReader)
 *
 * input reader is a stream that is linked to the BufferedReader that is being created.
 * Reader is a abstract class and one of its concrete class is InputStreamReader which converts bytes to
 * characters
 *
 * InputStreamReader(InputStream inputStream) -> System.in is an Object of InputStream
 *
 * BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 *
 * to read characters from BufferedReader use the read().
 * int read() throws Exception // reads a char from input stream and return its int value
 */
public class ReadingConsoleCharInput {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enters characters, 'q' to quit");
        // read characters
        do {
            c= (char)reader.read();
            System.out.println(c);
        }while (c != 'q');

        //? To read string, use the version of readLine() i.e. member of BufferedReader class
        //? String readLine() throws IOException
        System.out.println("Enter lines of text and 'stop' to quit");
        String str;
        do{
            str = reader.readLine();
            System.out.println(str);
        }while (!str.equals("stop"));
    }
}
