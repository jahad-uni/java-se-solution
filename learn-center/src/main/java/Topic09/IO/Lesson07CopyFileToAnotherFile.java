package Topic09.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Lesson07CopyFileToAnotherFile {
    public static void main(String[] args) {
        FileInputStream instream = null;
        FileOutputStream outstream = null;

        try {
            File infile = new File("C:\\new_folder\\newfile.txt");
            File outfile = new File("C:\\new_folder\\out_put_file.txt");

            instream = new FileInputStream(infile);
            outstream = new FileOutputStream(outfile);

            byte[] buffer = new byte[1024];

            int length;
            /*copying the contents from input stream to
             * output stream using read and write methods
             */
            while ((length = instream.read(buffer)) > 0) {
                outstream.write(buffer, 0, length);
            }

            //Closing the input/output file streams
            instream.close();
            outstream.close();

            System.out.println("File copied successfully!!");

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
