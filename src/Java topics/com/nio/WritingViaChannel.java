package com.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WritingViaChannel {

    public static void main(String[] args) {
        try(FileChannel fchan = (FileChannel) Files.newByteChannel(Paths.get("src/Java topics/com/nio/write.txt"),
            StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {

            ByteBuffer mbuff = ByteBuffer.allocate(26);
            for (int i =0; i<26; i++) {
                mbuff.put((byte) ('A'+i));
            }
            // reset the buffer so that it can be rewritten
            mbuff.rewind();
            // write the buffer to the output file
            int write = fchan.write(mbuff);
            System.out.print(write);

        }catch (InvalidPathException ex) {
            System.out.println(ex.getMessage());
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
