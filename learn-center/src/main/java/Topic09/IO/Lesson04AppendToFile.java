package Topic09.IO;

import java.io.*;

public class Lesson04AppendToFile {
    public static void main(String[] args) {

        //Append content to File using FileWriter and BufferedWriter
        System.out.println("***** Append content to File using FileWriter and BufferedWriter *****");
        try{
            String content = "This is my content which would be appended " +
                    "at the end of the specified file";
            //Specify the file name and path here
            File file =new File("C:\\new_folder\\newfile.txt");

            /* This logic is to create the file if the
             * file is not already present
             */
            if(!file.exists()){
                file.createNewFile();
            }

            //Here true is to append the content to file
            FileWriter fw = new FileWriter(file,true);
            //BufferedWriter writer give better performance
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            //Closing BufferedWriter Stream
            bw.close();

            System.out.println("Data successfully appended at the end of file");

        }catch(IOException ioe){
            System.out.println("Exception occurred:");
            ioe.printStackTrace();
        }


        //Append content to File using PrintWriter
        System.out.println("***** Append content to File using PrintWriter *****");
        try{
            File file =new File("C:\\new_folder\\newfile.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            //This will add a new line to the file content
            pw.println("");
            /* Below three statements would add three
             * mentioned Strings to the file in new lines.
             */
            pw.println("This is first line");
            pw.println("This is the second line");
            pw.println("This is third line");
            pw.close();

            System.out.println("Data successfully appended at the end of file");

        }catch(IOException ioe){
            System.out.println("Exception occurred:");
            ioe.printStackTrace();
        }
    }
}
