package Topic05.AnnotationEnumRegex.Lesson03Regex;

import java.util.regex.Pattern;

public class Lesson04PatternSplit {
    public static void main(String[] args) {
        String text = "ThisIsjavAClass.ItISJahADClass";
        // Pattern for delimiter
        String patternString = "is";
        Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
        String[] myStrings = pattern.split(text);
        for(String temp: myStrings){
            System.out.println(temp);
        }
        System.out.println("Number of split strings: "+myStrings.length);
    }
}
