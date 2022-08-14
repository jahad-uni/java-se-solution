package Topic08.Java8Feature.Lesson02MethodReferences;

import java.util.Arrays;
import java.util.function.Function;

public class Lesson03MethodReferenceToInstanceOfArbitraryObject {

    public static void main(String[] args) {

        //Arbitrary Object mean call method of parameter argument , in this example method of input string
        // using lambda expression
        Function<String, String> stringFunction = (input) -> input.toLowerCase();
        System.out.println(stringFunction.apply("hello world with lambda expression"));
        // using Method Reference
        Function<String, String> stringFunc = String::toLowerCase;
        System.out.println(stringFunc.apply("hello world with method references"));

        //Another Example...
        String[] strArray = {"A", "E", "I", "O", "U", "a", "e", "i", "o", "u"};
        // using lambda
        Arrays.sort(strArray, (s1, s2) -> s1.compareToIgnoreCase(s2));
        //using Method references
        Arrays.sort(strArray, String::compareToIgnoreCase);

        for (String s : strArray)
            System.out.print(s);
    }
}
