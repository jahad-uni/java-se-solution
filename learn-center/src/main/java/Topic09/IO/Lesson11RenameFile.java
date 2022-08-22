package Topic09.IO;

import java.io.File;

public class Lesson11RenameFile {
    public static void main(String[] args) {

        //Old File
        File oldfile =new File("C:\\new_folder\\newfile.txt");
        //New File
        File newfile =new File("C:\\new_folder\\newFileName.txt");
        /*renameTo() return boolean value
         * It return true if rename operation is
         * successful
         */
        boolean flag = oldfile.renameTo(newfile);
        if(flag){
            System.out.println("File renamed successfully");
        }else{
            System.out.println("Rename operation failed");
        }
    }
}
