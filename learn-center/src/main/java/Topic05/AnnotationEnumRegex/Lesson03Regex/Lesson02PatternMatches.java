package Topic05.AnnotationEnumRegex.Lesson03Regex;

import java.util.regex.Pattern;

public class Lesson02PatternMatches {

    public static void main(String[] args) {
        String content = "This is a java class!";
        String patternString = ".*java.*";
        boolean isMatch = Pattern.matches(patternString, content);
        System.out.println("The text contains 'java'? " + isMatch);
    }
}
