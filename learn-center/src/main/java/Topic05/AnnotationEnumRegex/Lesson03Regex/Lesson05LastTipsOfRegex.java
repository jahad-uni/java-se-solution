package Topic05.AnnotationEnumRegex.Lesson03Regex;

import java.util.regex.Pattern;

public class Lesson05LastTipsOfRegex {
    public static void main(String[] args) {

        // It would return true if string matches exactly "farhad"
        System.out.println(
                Pattern.matches("farhad", "Farhad")); //False

        // returns true if the string matches exactly
        // "farhad" or "Farhad"

        System.out.println(
                Pattern.matches("[Ff]arhad", "farhad")); //True
        System.out.println(
                Pattern.matches("[Ff]arhad", "Farhad")); //True

        // Returns true if the string matches exactly "farhad"
        // or "Farhad" or "mehrdad" or "Mehrdad"

        System.out.println(
                Pattern.matches("[Ff]arhad|[Mm]ehrdad", "Farhad"));//True
        System.out.println(
                Pattern.matches("[Ff]arhad|[Mm]ehrdad", "mehrdad"));//True

        // returns true if the string contains "abc" at
        // any place

        System.out.println(
                Pattern.matches(".*abc.*", "deabcpq"));//True

        // returns true if the string does not have a
        // number at the beginning

        System.out.println(
                Pattern.matches("^[^\\d].*", "123abc")); //False
        System.out.println(
                Pattern.matches("^[^\\d].*", "abc123")); //True

        // returns true if the string contains of three letters
        System.out.println(
                Pattern.matches("[a-zA-Z][a-zA-Z][a-zA-Z]", "aPz"));//True
        System.out.println(
                Pattern.matches("[a-zA-Z][a-zA-Z][a-zA-Z]", "aAA"));//True
        System.out.println(
                Pattern.matches("[a-zA-Z][a-zA-Z][a-zA-Z]", "apZx"));//False

        // returns true if the string contains 0 or more non-digits
        System.out.println(
                Pattern.matches("\\D*", "abcde")); //True
        System.out.println(
                Pattern.matches("\\D*", "abcde123")); //False

        // Boundary Matchers example
        // ^ denotes start of the line
        // $ denotes end of the line

        System.out.println(
                Pattern.matches("^This$", "This is Chaitanya")); //False
        System.out.println(
                Pattern.matches("^This$", "This")); //True
        System.out.println(
                Pattern.matches("^This$", "Is This Chaitanya")); //False
    }
}
