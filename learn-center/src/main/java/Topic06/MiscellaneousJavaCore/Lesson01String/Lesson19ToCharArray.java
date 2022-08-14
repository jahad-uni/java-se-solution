package Topic06.MiscellaneousJavaCore.Lesson01String;

public class Lesson19ToCharArray {

    public static void main(String[] args) {

        // ********** Java String toCharArray() Method **********
        String str = new String("Welcome to java.com");
        char[] array= str.toCharArray();
        System.out.print("Content of Array:");
        for(char c: array){
            System.out.print(c);
        }

    }
}
