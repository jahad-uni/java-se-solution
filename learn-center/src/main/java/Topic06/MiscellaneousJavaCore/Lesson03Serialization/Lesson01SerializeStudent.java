package Topic06.MiscellaneousJavaCore.Lesson03Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Lesson01SerializeStudent {

    public static void main(String args[])
    {
        Student obj = new Student(101, 37, "Farhad", "Sattari", 180);
        try{
            FileOutputStream fos = new FileOutputStream("Student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();
            fos.close();
            System.out.println("Serialzation Done!!");
        }catch(IOException ioe){
            System.out.println(ioe);
        }
    }
}
