package Topic08.Java8Feature.Lesson02MethodReferences;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lesson01MethodReferencesToStaticMethod {

    public static int addition(int a, int b){
        return (a + b);
    }

    public static void main(String[] args) {

        //using lambda
        Function<Integer, Double> function = (input) -> Math.sqrt(input);
        System.out.println(function.apply(4));

        // using method references
        Function<Integer, Double> func = Math::sqrt;
        System.out.println(func.apply(16));

        //using lambda
        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> Lesson01MethodReferencesToStaticMethod.addition(a,b);
        System.out.println(biFunction.apply(10, 20));
        // using method references
        BiFunction<Integer, Integer, Integer> biFunc = Lesson01MethodReferencesToStaticMethod::addition;
        System.out.println(biFunc.apply(10, 40));
    }
}
