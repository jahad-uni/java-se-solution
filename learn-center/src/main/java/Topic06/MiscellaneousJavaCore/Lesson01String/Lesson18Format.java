package Topic06.MiscellaneousJavaCore.Lesson01String;

public class Lesson18Format {

    public static void main(String[] args) {

        // ********** Java String format() method **********
        String str = "just a string";

        //concatenating string using format
        String formattedString = String.format("My String is %s", str);

       /* formatting the  value passed and concatenating at the same time
         %.6f is for having 6 digits in the fractional part*/

        String formattedString2 = String.format("My String is %.6f", 12.121);

        System.out.println(formattedString);
        System.out.println(formattedString2);


        // ********** Java String format() example of concatenating arguments to the string **********
        String str1 = "cool string";
        String str2 = "88";

        /* Specifying argument positions. %1$ is for the first argument and
         %2$ is for the second argument*/
        String fstr = String.format("My String is: %1$s, %1$s and %2$s", str1, str2);
        System.out.println(fstr);


        // ********** Left padding the string using string format() **********
        int num = 88;
         /*Left padding an integer number with 0's and converting it
         into a String using Java String format() method.*/

        String formatteString = String.format("%05d", num);
        System.out.println(formatteString);


        // ********** Displaying String, int, hexadecimal, float, char, octal value using format() method **********
        String strr1 = String.format("%d", 15); // Integer value
        String strr2 = String.format("%s", "java.com"); // String
        String strr3 = String.format("%f", 16.10); // Float value
        String strr4 = String.format("%x", 189);  // Hexadecimal value
        String strr5 = String.format("%c", 'P');  // Char value
        String strr6 = String.format("%o", 189); // Octal value
        System.out.println(strr1);
        System.out.println(strr2);
        System.out.println(strr3);
        System.out.println(strr4);
        System.out.println(strr5);
        System.out.println(strr6);

    }
}


/*
*** Java String Format Specifiers ***
%c – Character
%d – Integer
 %s – String
%o – Octal
 %x – Hexadecimal
%f – Floating number
%h – hash code of a value*/
