package Topic05.AnnotationEnumRegex.Lesson03Regex;

import java.util.regex.Pattern;

public class Lesson01SimpleRegex {

    public static void main(String[] args) {
        String content = "This is Regex " +
                "from JahadBook.com.";

        String pattern = ".*Book.*";

        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("The text contains 'Book'? " + isMatch);
    }
}
