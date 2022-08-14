package Topic06.MiscellaneousJavaCore.Lesson01String;

public class Lesson01CharAt {

    public static void main(String[] args) {

        // ********** Java String charAt() Method **********
        String str = "Welcome to java string handling";
        //This will return the first char of the string
        char ch1 = str.charAt(0);

        //This will return the 6th char of the string
        char ch2 = str.charAt(5);

        //This will return the 12th char of the string
        char ch3 = str.charAt(11);

        //This will return the 21st char of the string
        char ch4 = str.charAt(20);

        System.out.println("Character at 0 index is: " + ch1);
        System.out.println("Character at 5th index is: " + ch2);
        System.out.println("Character at 11th index is: " + ch3);
        System.out.println("Character at 20th index is: " + ch4);


        // ********** IndexOutOfBoundsException while using charAt() method **********
        //negative index, method would throw exception
        char ch = '0';
        try {
            ch = str.charAt(-1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException Thrown");
        }

        // ********** Java String charAt() example to print all characters of string **********
        for(int i=0; i<=str.length()-1; i++) {
            System.out.println(str.charAt(i));
        }

        // ********** Java String charAt() example to count the occurrence of a character **********
        int counter = 0;

        for (int i=0; i<=str.length()-1; i++) {
            if(str.charAt(i) == 't') {
                //increasing the counter value at each occurrence of 'B'
                counter++;
            }
        }
        System.out.println("Char 't' occurred "+counter+" times in the string");

    }
}
