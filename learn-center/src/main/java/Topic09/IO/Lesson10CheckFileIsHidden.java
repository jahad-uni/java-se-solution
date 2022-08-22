package Topic09.IO;

import java.io.File;

public class Lesson10CheckFileIsHidden {
    public static void main(String[] args) {

        // Provide the complete file path here
        File file = new File("C:\\new_folder\\newfile.txt");

        if(file.isHidden()){
            System.out.println("The specified file is hidden");
        }else{
            System.out.println("The specified file is not hidden");
        }
    }
}
