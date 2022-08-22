package Topic09.IO;

import java.io.File;

public class Lesson05DeleteFile {
    public static void main(String[] args) {
        try{
            //Specify the file name and path
            File file = new File("C:\\new_folder\\newfile.txt");
            /*the delete() method returns true if the file is
             * deleted successfully else it returns false
             */
            if(file.delete()){
                System.out.println(file.getName() + " is deleted!");
            }else{
                System.out.println("Delete failed: File didn't delete");
            }
        }catch(Exception e){
            System.out.println("Exception occurred");
            e.printStackTrace();
        }
    }
}
