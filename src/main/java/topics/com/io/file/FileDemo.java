package topics.com.io.file;

import java.io.File;

/*
* File class describe the properties of the file itself, its object is used to obtain/manipulate
* the information associated with the disk files
*
* File(String directoryPath)
* File(String directoryPath, String fileName)
* File(File dirObj, String fileName)
* File(URI uriObj)
* */
public class FileDemo {
    public static void main(String[] args) {
        File file = new File("/");
        File file2 = new File("/","autoexec.bat");
        File file3 = new File(file,"autoexec2.bat");
    }
}
