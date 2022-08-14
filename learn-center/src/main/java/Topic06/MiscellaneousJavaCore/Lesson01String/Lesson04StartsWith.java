package Topic06.MiscellaneousJavaCore.Lesson01String;

public class Lesson04StartsWith {
    public static void main(String[] args) {

       // ********** Java String startsWith() Method **********
        String s = "This is just a sample string";

        System.out.println(s.startsWith("This"));

        System.out.println(s.startsWith("Hi"));

        System.out.println(s.startsWith("This is", 0) );    //true

        // Check Start from specified index
        System.out.println(s.startsWith("This", 2) );       //false

        System.out.println(s.startsWith("is is", 2) );       //true
    }
}
