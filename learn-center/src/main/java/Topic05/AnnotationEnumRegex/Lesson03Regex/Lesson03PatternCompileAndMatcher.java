package Topic05.AnnotationEnumRegex.Lesson03Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson03PatternCompileAndMatcher {

    public static void main(String[] args) {
        //matches()
        String content = "This is a java Class! class";
        String patternString = ".*ClaSs.*";
        Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(content);
        boolean isMatched = matcher.matches();
        System.out.println("Is it a Match?" + isMatched);

        //find() , start() , end()
        String charContent = "ZZZ AA PP AA QQQ AAA ZZ";
        String string = "AA";
        Pattern pattern1 = Pattern.compile(string);
        Matcher matcher1 = pattern1.matcher(charContent);
        while(matcher1.find()) {
            System.out.println("Found at: "+ matcher1.start()
                    +
                    " - " + matcher1.end());
        }
    }
}
