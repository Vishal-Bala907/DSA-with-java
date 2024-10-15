package com.io.stream.characterStreams;

import java.io.FileWriter;
import java.io.IOException;

/*
* Use to create a file
* FileWriter(String filePath)
* FileWriter(String filePath, boolean append)
* FileWriter(File file)
* FileWriter(File file, boolean append)
* */
public class FileWriterDemo {

    public static void main(String[] args) {
        String source = """
                Now this is the time for all good mens to come
                to aid their country and pay their due taxes
                """;
        char[] buffer = new char[source.length()];
        source.getChars(0,source.length(),buffer,0);

        try(
                FileWriter file1 = new FileWriter("src/Java topics/com/io/stream/characterStreams/file1.txt");
                FileWriter file2 = new FileWriter("src/Java topics/com/io/stream/characterStreams/file2.txt");
                FileWriter file3 = new FileWriter("src/Java topics/com/io/stream/characterStreams/file3.txt");
                ) {
            // write to the first file(Every second character)
            for(int i =0; i<buffer.length-1; i+=2) {
                file1.write(buffer[i]);
            }
            // write to second file(entire set of characters)
            file2.write(buffer);
            //  writing to the third file(last 1/4 characters)
            file3.write(buffer, buffer.length - buffer.length/4,buffer.length/4);


        }catch (IOException ex) {
            System.err.println(ex.getMessage());
        }

    }

}
