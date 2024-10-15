package com.io.stream.characterStreams;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("src/Java topics/com/io/stream/characterStreams/filereader.txt")) {
            int c =0;
            while((c = fr.read())!=-1) {
                System.out.print((char)c);
            }
        }catch (IOException ex) {
            System.err.println(ex.getMessage());;
        }
    }
}
