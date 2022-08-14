package Topic06.MiscellaneousJavaCore.Lesson03Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Lesson02DeserializeStudent {

    public static void main(String args[])
    {
        Student o=null;
        try{
            FileInputStream fis = new FileInputStream("Student.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            o = (Student)ois.readObject();
            ois.close();
            fis.close();
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
            return;
        }catch(ClassNotFoundException cnfe)
        {
            System.out.println("Student Class is not found.");
            cnfe.printStackTrace();
            return;
        }
        System.out.println("Student Name:"+o.getStuName());
        System.out.println("Student Age:"+o.getStuAge());
        System.out.println("Student Roll No:"+o.getStuRollNum());
        System.out.println("Student Address:"+o.getStuAddress());
        System.out.println("Student Height:"+o.getStuHeight());
    }
}
