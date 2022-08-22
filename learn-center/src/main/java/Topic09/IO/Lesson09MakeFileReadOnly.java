package Topic09.IO;

import java.io.File;

public class Lesson09MakeFileReadOnly {
    public static void main(String[] args) {

        // Changing file attributes to read only
        System.out.println("***** Changing file attributes to read only *****");
        File myfile = new File("C:\\new_folder\\newfile.txt");
        //making the file read only
        boolean flag = myfile.setReadOnly();
        if (flag==true)
        {
            System.out.println("File successfully converted to Read only mode!!");
        }
        else
        {
            System.out.println("Unsuccessful Operation!!");
        }


        // Check whether the file is writable or read only
        System.out.println("***** Check whether the file is writable or read only *****");
        if (myfile.canWrite())
        {
            System.out.println("File is writable.");
        }
        else
        {
            System.out.println("File is read only.");
        }


        // How to make a read only file writable in java
        System.out.println("***** How to make a read only file writable in java *****");
        //changing the file mode to writable
        myfile.setWritable(true);
        if (myfile.canWrite())
        {
            System.out.println("File is writable.");
        }
        else
        {
            System.out.println("File is read only.");
        }
    }
}
