package Topic06.MiscellaneousJavaCore.Lesson01String;

import java.util.Locale;

public class Lesson13ToUpperCaseAndToLowerCase {

    public static void main(String[] args) {

        // ********** Java String toUpperCase() method **********
        String str = new String("this is a test string");
        //Standard method of conversion
        System.out.println(str.toUpperCase());

        //By specifying Locale
        System.out.println(str.toUpperCase(Locale.CHINA));

        // ********** Java String toLowerCase() method **********
        String strNew = new String("ABC IS NOT EQUAL TO XYZ");
        //Standard method of conversion
        System.out.println(strNew.toLowerCase());

        //By specifying Locale
        System.out.println(strNew.toLowerCase(Locale.FRANCE));
    }
}
