package topics.com.nio;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.*;

public class NIOChannelBased {
    public static void main(String[] args) {
        int count = 0;
        Path filePath = null;
        // First Obtain the path
        try{
            filePath = Paths.get("src/Java topics/com/nio/channel.txt");
        }catch (InvalidPathException ex) {
            System.out.println(ex.getMessage());
        }

        // Next, Obtain a channel to the file
        try(SeekableByteChannel fchan = Files.newByteChannel(filePath)){
            // Allocate a buffer
            ByteBuffer bb = ByteBuffer.allocate(128);
            do {
                // read a buffer
                count = fchan.read(bb);
                // strop when end of the file reached
                if(count != -1) {
                    // rewind the buffer so it can read
                    bb.rewind();

                    // read bytes from buffer and show them on the screens as chars
                    System.out.print((char)bb.get());

                }
            }while (count != -1);
            System.out.println();
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
