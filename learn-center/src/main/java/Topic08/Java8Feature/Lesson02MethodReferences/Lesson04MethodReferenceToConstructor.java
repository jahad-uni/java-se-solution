package Topic08.Java8Feature.Lesson02MethodReferences;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class Lesson04MethodReferenceToConstructor {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("mango");
        fruits.add("watermelon");

        // using lambda expression
        Function<List<String>, Set<String>> setFunction = (fruitsList) -> new HashSet<>(fruitsList);
        System.out.println(setFunction.apply(fruits));
        // using Method References
        Function<List<String>, Set<String>> setFunc = HashSet::new;
        System.out.println(setFunc.apply(fruits));
    }
}
