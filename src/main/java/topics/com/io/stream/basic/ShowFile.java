package topics.com.io.stream.basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* p.no. 311
* */
public class ShowFile {

    public static void main(String[] args) {
        int i;
        /*
        * When you create an input stream, if the file does not exist, then the FileNotFoundException is thrown
        * */
        FileInputStream fileInputStream = null;
        String path = "E:/Java File IO/input.txt";
    //! Attempt to open the file
        try {
            fileInputStream = new FileInputStream(path);
            do{
                i = fileInputStream.read();
                System.out.print((char)i);
            }while (i != -1);
        }catch (IOException ex) {
            System.out.println("Error");
        }finally {
            try{
               if(fileInputStream != null)
                   fileInputStream.close();
            }catch (IOException | NullPointerException ex) {
                System.out.println(ex.getMessage());
            }
        }

        // now writing the same file
        try{
            FileOutputStream fout = new FileOutputStream(path);
            fout.write("\tvishal bala here".getBytes());
            fout.close();

            fileInputStream = new FileInputStream(path);
            i = 1;
            while (i != -1) {
                i = fileInputStream.read();
                System.out.print((char)i);
            }
            try {
                fileInputStream.close();
            }catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }

}
