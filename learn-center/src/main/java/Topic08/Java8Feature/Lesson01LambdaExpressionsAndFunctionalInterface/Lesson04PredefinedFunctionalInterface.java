package Topic08.Java8Feature.Lesson01LambdaExpressionsAndFunctionalInterface;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.*;

class FunctionImpl implements Function<String, Integer> {


    @Override
    public Integer apply(String s) {
        return s.length();
    }
}

class ConsumerImpl implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

class SupplierImpl implements Supplier<LocalDateTime> {

    @Override
    public LocalDateTime get() {
        return LocalDateTime.now();
    }
}

class BiFunctionImpl implements BiFunction<Integer, Integer, Integer> {

    @Override
    public Integer apply(Integer t, Integer u) {
        return (t + u);
    }
}

class BiConsumerImpl implements BiConsumer<Integer, Integer> {

    @Override
    public void accept(Integer a, Integer b) {
        System.out.println(a + b);
    }
}

class BiPredicateImpl implements BiPredicate<String, String> {

    @Override
    public boolean test(String s1, String s2) {
        return s1.equals(s2);
    }
}

public class Lesson04PredefinedFunctionalInterface {

    public static void main(String[] args) {

        // Function in traditional way
        Function<String, Integer> function = new FunctionImpl();
        System.out.println(function.apply("Farhad"));
        // impl with lambda expression
        Function<String, Integer> func = (String s) -> s.length();
        System.out.println(func.apply("Mehrdad"));

        //Consumer traditional way
        Consumer<String> consumer = new ConsumerImpl();
        consumer.accept("Hello world with traditional way");
        // impl with lambda expression
        Consumer<String> cons = (input) -> System.out.println(input);
        cons.accept("Hello world with lambda");


        //Supplier traditional way
        Supplier<LocalDateTime> supplier = new SupplierImpl();
        System.out.println(supplier.get());
        // impl with lambda expression
        Supplier<LocalDateTime> supplierr = () -> LocalDateTime.now();
        System.out.println(supplierr.get());

        // BiFunction in traditional way
        BiFunction<Integer, Integer, Integer> BiFunction = new BiFunctionImpl();
        System.out.println(BiFunction.apply(10, 20));
        System.out.println(BiFunction.apply(100, 200));

        // impl BiFunction with Anonymous Class
        BiFunction<Integer, Integer, Integer> BiFunctionAnonymous =
                new BiFunction<Integer, Integer, Integer>() {
                    @Override
                    public Integer apply(Integer t, Integer u) {
                        return (t + u);
                    }
                };

        System.out.println(BiFunctionAnonymous.apply(100, 10));

        // impl BiFunction with Lambda Expression
        BiFunction<Integer, Integer, Integer> additionBiFunc = (t, u) -> (t + u);
        System.out.println("Addition -> " + additionBiFunc.apply(50, 10));

        BiFunction<Integer, Integer, Integer> substractionBiFunc = (t, u) -> (t - u);
        System.out.println("Substraction -> " + substractionBiFunc.apply(50, 10));

        BiFunction<Integer, Integer, Integer> multiplicationBiFunc = (t, u) -> (t * u);
        System.out.println("multiplication -> " + multiplicationBiFunc.apply(5, 3));

        BiFunction<Integer, Integer, Integer> divisionBiFunc = (t, u) -> (t / u);
        System.out.println("Division -> " + divisionBiFunc.apply(20, 4));

        Function<Integer, Integer> funcc = (number) -> number * number;

        Integer integer = additionBiFunc.andThen(funcc).apply(5, 2);
        System.out.println("addition with Then funcc -> " + integer);

        // BiConsumer in traditional way
        BiConsumer<Integer, Integer> biConsumer = new BiConsumerImpl();
        biConsumer.accept(10, 20);

        // impl BiConsumer with Anonymous Class
        BiConsumer<Integer, Integer> biConsumerAnonymous = new BiConsumer<Integer, Integer>() {
            @Override
            public void accept(Integer a, Integer b) {
                System.out.println(a + b);
            }
        };
        biConsumerAnonymous.accept(20, 80);

        // impl BiConsumer with Lambda Expression
        BiConsumer<Integer, Integer> biConsumerLambda = (a, b) -> System.out.println(a + b);
        biConsumerLambda.accept(50, 30);

        BiConsumer<Integer, Integer> subtractionBiConsumerLambda = (a, b) -> System.out.println(a - b);
        subtractionBiConsumerLambda.accept(50, 30);

        BiConsumer<Integer, Integer> multiplicationBiConsumerLambda = (a, b) -> System.out.println(a * b);
        multiplicationBiConsumerLambda.accept(10, 3);

        BiConsumer<Integer, Integer> divideBiConsumerLambda = (a, b) -> System.out.println(a / b);
        divideBiConsumerLambda.accept(50, 5);

        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Java");
        map.put(2, "C++");
        map.put(3, "Rust");
        map.put(4, "JavaScript");
        map.put(4, "Go");

        //Hear forEach parameter is BiConsumer
        map.forEach((k, v) -> {
            System.out.println(k);
            System.out.println(v);
        });


        BiPredicate<String, String> biPredicate = new BiPredicateImpl();
        System.out.println(biPredicate.test("farhad", "farhad"));
        System.out.println(biPredicate.test("mehrdad", "Mehrdad"));


        BiPredicate<String, String> biPredicateAnonymous = new BiPredicate<String, String>() {
            @Override
            public boolean test(String s1, String s2) {
                return s1.equals(s2);
            }
        };
        biPredicateAnonymous.test("farhad", "farhad");

        BiPredicate<String, String> biPredicateLambda = (s1, s2) -> s1.equals(s2);
        biPredicateLambda.test("farhad", "farhad");

        BiPredicate<Integer, Integer> biPredicateLambda1 = (s1, s2) -> s1 > s2;
        BiPredicate<Integer, Integer> biPredicateLambda2 = (s1, s2) -> s1 == s2;

        boolean result = biPredicateLambda1
                .and(biPredicateLambda2)
                .test(10, 20); // logical AND condition
        System.out.println("BiPredict AND Condition -> " + result);

        boolean result1 = biPredicateLambda1
                .or(biPredicateLambda2)
                .test(10, 20); // logical OR condition
        System.out.println("BiPredict OR Condition -> " + result1);


    }

}
