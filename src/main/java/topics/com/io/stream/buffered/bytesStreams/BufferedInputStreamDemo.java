package topics.com.io.stream.buffered.bytesStreams;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/*
* BufferedInputStream allows you to wrap any  'InputStream' into a buffered stream to improve
* performance
*
* BufferedInputStream(InputStream inputStream)
* BufferedInputStream(InputStream inputStream, int buffSize)
* */
public class BufferedInputStreamDemo {

    public static void main(String[] args) {
        String s = " This is a &copy; copyright symbol but this is &copy not";
        byte[] buff = s.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(buff);
        int c = 0;
        boolean marked = false;

        // Using try with resources
        try(BufferedInputStream bin = new BufferedInputStream(bais)) {
            while((c=bin.read()) != -1) {
                switch (c) {
                    case '&' :
                        if(!marked) {
                            bin.mark(32);
                            marked = true;
                        }
                    case ';' :
                        if(marked) {
                            marked = false;
                            System.out.print("(c)");
                        }else {
                            System.out.print((char)c);
                        }
                    break;
                    case ' ' :
                        if(marked) {
                            marked = false;
                            bin.reset();
                            System.out.print('&');
                        } else {
                            System.out.print((char)c);
                        }
                    break;

                    default:
                        if(!marked) {
                            System.out.print((char)c);
                        }
                    break;
                }
            }
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
