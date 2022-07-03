package Topic03.ExceptionHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class Lesson04ThrowVSThrows {
}

class SimpleThrow {
    static void checkEligibilty(int studentAge, int studentWeight){
        if(studentAge<12 && studentWeight<40) {
            throw new ArithmeticException("Student is not eligible for registration");
        }
        else {
            System.out.println("Student Entry is Valid!!");
        }
    }

    public static void main(String[] args){
        System.out.println("Welcome to the Registration process!!");
        checkEligibilty(10, 39);
        System.out.println("Have a nice day..");
    }
}

class SimpleThrows {
    //defining a method
    public static void readFile() throws IOException {
        FileInputStream fis = null;
        fis = new FileInputStream("B:/myfile.txt");
        int k;

        while ((k = fis.read()) != -1) {
            System.out.print((char) k);
        }
        fis.close();
    }
    //main method
    public static void main(String[] args) {
        try {
            SimpleThrows.readFile();
        }
        catch (IOException e){
            System.out.println("\nNumber cannot be divided by 0");
        }

        System.out.println("Rest of the code..");
    }
}

//*************************************
//Throw vs Throws :

//1-Throws clause is used to declare an exception, which means it works similar to the try-catch block. On the other hand throw keyword is used to throw an exception explicitly.
//2-If we see syntax wise than throw is followed by an instance of Exception class and throws is followed by exception class names.
//3-Throw keyword is used in the method body to throw an exception, while throws is used in method signature to declare the exceptions that can occur in the statements present in the method.
//4-You can throw one exception at a time but you can handle multiple exceptions by declaring them using throws keyword.
//5-The ideal way to use throws is by declaring the exceptions in method signature and handle the exceptions using try-catch in calling method.



