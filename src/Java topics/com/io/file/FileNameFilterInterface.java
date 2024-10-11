package com.io.file;

import java.io.File;
import java.io.FilenameFilter;
/*
* FileNameFilter -> limit the number of files returned by the list
* has noly a single method -> accept() <-  called once for each file
*
* * */

class ExtensionFilter implements FilenameFilter {

    String ext;

    public ExtensionFilter(String ext) {
        this.ext = ext;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}


// Lamda soluiton
public class FileNameFilterInterface {

    public static void main(String[] args) {
        File file = new File("E:/DSA with java/DSA with java");
        String[] files = file.list();

        // returns all the files which contains  .git
        String[] list = file.list((fl,name) -> {
            return name.contains(".git");
        });

        for(String s : list) {
            System.out.println(s);
        }
        /*
        .git
        .gitignore
        * */
        System.out.println("------------------------------------------------------");
        //! class implementation example
        ExtensionFilter extensionFilter = new ExtensionFilter(".git");
        String[] imple = file.list(extensionFilter);
        for(String s : imple) {
            System.out.println(s);
        }

    }
}
