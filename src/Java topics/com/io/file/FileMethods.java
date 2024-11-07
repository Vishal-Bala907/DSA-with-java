package com.io.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileMethods {
    public static void main(String[] args) {
        File file = new File("E:/DSA with java/");

        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.exists());
        System.out.println(file.canWrite() ? "Is writable" : "is not writable");
        System.out.println(file.isDirectory() ? "Is directory" : "is not directory");
        System.out.println(file.isFile() ? "Is file" : "is not file");
        System.out.println("File length is : "+file.length());
        System.out.println("Last modified : "+file.lastModified());

        try{
            // create a html file
            File file2 = File.createTempFile("index",".html",file);
            // get the file name
            System.out.println(file2.getName());
            // rename file
            boolean b = file2.renameTo(new File(file, "vishal.html"));
            // get the file name again
            System.out.println(file2.getName());

            // deleting the file
            boolean delete = file2.delete();


            System.out.println(delete ? "file deleted" : "file could not be deleted");
        }catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
//        file.


        // Directory
        File file3 = new File("E:/DSA with java/DSA with java");
        String[] arr = file3.list();
        for(String s : arr) {
            System.out.println(s);
        }

    }
}
