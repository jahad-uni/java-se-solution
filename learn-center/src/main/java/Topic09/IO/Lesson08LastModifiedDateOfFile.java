package Topic09.IO;

import java.io.File;
import java.text.SimpleDateFormat;

public class Lesson08LastModifiedDateOfFile {
    public static void main(String[] args) {

        //Specify the file path and name
        File file = new File("C:\\new_folder\\newfile.txt");
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        System.out.println("Last Modified Date: " + sdf.format(file.lastModified()));
    }
}
