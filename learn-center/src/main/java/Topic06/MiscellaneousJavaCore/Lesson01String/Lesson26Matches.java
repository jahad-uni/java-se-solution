package Topic06.MiscellaneousJavaCore.Lesson01String;

public class Lesson26Matches {

    public static void main(String[] args) {

        // ********** Java String matches() Method **********
        String str = new String("Java String Methods");

        System.out.print("Regex: (.*)String(.*) matches string? " );
        System.out.println(str.matches("(.*)String(.*)"));

        System.out.print("Regex: (.*)Strings(.*) matches string? " );
        System.out.println(str.matches("(.*)Strings(.*)"));

        System.out.print("Regex: (.*)Methods matches string? " );
        System.out.println(str.matches("(.*)Methods"));
    }
}
