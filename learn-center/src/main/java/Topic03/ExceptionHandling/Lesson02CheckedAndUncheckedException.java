package Topic03.ExceptionHandling;

import java.io.*;

public class Lesson02CheckedAndUncheckedException {
}

//checked exceptions gets checked during compile time
//some checked exceptions:
//1- SQLException  2-IOException  3-ClassNotFoundException  4-InvocationTargetException
class CheckedExceptionExample {
    public static void main(String[] args) {
        FileInputStream fis = null;
        //This constructor FileInputStream(File filename)
        // throws FileNotFoundException which is a checked exception

//        fis = new FileInputStream("B:/myfile.txt");
        int k;

       //Method read() of FileInputStream class also throws
         // a checked exception: IOException

//        while ((k = fis.read()) != -1) {
//            System.out.print((char) k);
//        }

        //The method close() closes the file input stream
         //It throws IOException*/

//        fis.close();
    }
}

//How resolve checked exception?
//1- using throws keyword
//2- Handle them using try-catch blocks

class HandleCheckedExceptionByThrows {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        fis = new FileInputStream("B:/myfile.txt");
        int k;

        while ((k = fis.read()) != -1) {
            System.out.print((char) k);
        }
        fis.close();
    }
}

class HandleCheckedExceptionByTryCatchBlock {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("B:/myfile.txt");
        } catch (FileNotFoundException fnfe) {
            System.out.println("The specified file is not " +
                    "present at the given path");
        }
        int k;
        try {
            while ((k = fis.read()) != -1) {
                System.out.print((char) k);
            }
            fis.close();
        } catch (IOException ioe) {
            System.out.println("I/O error occurred: " + ioe);
        }
    }
}

//unchecked exceptions not checked at compile time
//,and they occur at runtime.
//some unchecked exceptions:
//1-NullPointerException   2-ArrayIndexOutOfBoundsException  3-ArithmeticException
//4-IllegalArgumentException  NumberFormatException
class UnCheckedArithmeticException {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        //Since I'm dividing an integer with 0
        // it should throw ArithmeticException

        int res = num1 / num2;
        System.out.println(res);
    }
}

class UnCheckedArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        // My array has only 5 elements but we are trying to
        // display the value of 8th element. It should throw
        // ArrayIndexOutOfBoundsException

        System.out.println(arr[7]);
    }
}

