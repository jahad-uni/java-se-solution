package Topic03.ExceptionHandling;

import java.io.*;

public class Lesson3FinallyBlock {
}

class SimpleFinallyBlock {
    public static void main(String[] args) {
        try {
            int num = 121 / 0;
            System.out.println(num);
        } catch (ArithmeticException e) {
            System.out.println("Number should not be divided by zero");
        }
        //Finally block will always execute
        // even if there is no exception in try block
        finally {
            System.out.println("This is finally block");
        }
        System.out.println("Out of try-catch-finally");
    }
}

class NotHandledExceptionWithFinallyBlock {
    public static void main(String[] args) {
        try {
            System.out.println("First statement of try block");
            int num = 45 / 0;
            System.out.println(num);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } finally {
            System.out.println("finally block");
        }
        System.out.println("Out of try-catch-finally block");
    }
}

class FinallyBlockWithReturnStatement {
    public static void main(String[] args) {
        System.out.println(FinallyBlockWithReturnStatement.myMethod());
    }

    public static int myMethod() {
        try {
            return 112;
        } finally {
            System.out.println("This is Finally block");
            System.out.println("Finally block ran even after return statement");
        }
    }
}

class FinallyBlockWithCloseStatement {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            try {
                fis = new FileInputStream("B:/myfile.txt");
            } catch (FileNotFoundException e) {
                System.out.println("FileNotFoundException occur");
            } finally {
//                if (fis != null)
                fis.close();
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occur");
        } catch (Exception e) {
            System.out.println("some exception occur");
        }
    }
}

class HandleExceptionInFinallyBlock {

    public static void main(String[] args) {
        InputStream input = null;
        try {
            input = new FileInputStream("inputfile.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException exp) {
                    System.out.println(exp);
                }
            }

            // or throws IOException
        }
    }
}

class FinallyBlockWithSystemExit {

    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            System.exit(0);
        } catch (Exception exp) {
            System.out.println(exp);
        } finally {
            System.out.println("Java finally block");
        }
    }
}

class FinallyBlockCanOverrideReturnValues {

    public static int myMethod() {
        try {
            return 5;
        } finally {
            return 19;
        }
    }

    public static void main(String[] args) {
        System.out.println(myMethod());
    }

}
//*********************************************
//Flow of control in try/catch/finally blocks:

//1-If exception occurs in try block’s body then control immediately transferred(skipping rest of the statements in try block) to the catch block. Once catch block finished execution then finally block and after that rest of the program.
//2-If there is no exception occurred in the code which is present in try block then first, the try block gets executed completely and then control gets transferred to finally block (skipping catch blocks).
//3-If a return statement is encountered either in try or catch block. In this case finally block runs. Control first jumps to finally and then it returned back to return statement.

//Few Important points regarding finally block:

//1-A finally block must be associated with a try block, you cannot use finally without a try block. You should place those statements in this block that must be executed always.
//2-Finally block is optional, as we have seen in previous tutorials that a try-catch block is sufficient for exception handling, however if you place a finally block then it will always run after the execution of try block.
//3-In normal case when there is no exception in try block then the finally block is executed after try block. However if an exception occurs then the catch block is executed before finally block.
//4-An exception in the finally block, behaves exactly like any other exception.
//5-The statements present in the finally block execute even if the try block contains control transfer statements like return, break or continue.
//6-Finally block can override return value.

//Cases when the finally block doesn’t execute:

//1-The death of a Thread
//2-Using of the System. exit() method.
//3-Due to an exception arising in the finally block.

