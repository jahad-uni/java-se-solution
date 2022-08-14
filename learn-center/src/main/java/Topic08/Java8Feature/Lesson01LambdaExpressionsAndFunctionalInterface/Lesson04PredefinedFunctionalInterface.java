package Topic08.Java8Feature.Lesson01LambdaExpressionsAndFunctionalInterface;

import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

class FunctionImpl implements Function<String, Integer> {


    @Override
    public Integer apply(String s) {
        return s.length();
    }
}

class ConsumerImpl implements Consumer<String>{

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

class SupplierImpl implements Supplier<LocalDateTime>{

    @Override
    public LocalDateTime get() {
        return LocalDateTime.now();
    }
}

public class Lesson04PredefinedFunctionalInterface {

    public static void main(String[] args) {

        // traditional way
        Function<String, Integer> function = new FunctionImpl();
        System.out.println(function.apply("Farhad"));
        // impl with lambda expression
        Function<String, Integer> func = (String s) -> s.length();
        System.out.println(func.apply("Mehrdad"));

        //traditional way
        Consumer<String> consumer = new ConsumerImpl();
        consumer.accept("Hello world with traditional way");
        // impl with lambda expression
        Consumer<String> cons = (input) -> System.out.println(input);
        cons.accept("Hello world with lambda");


        // traditional way
        Supplier<LocalDateTime> supplier = new SupplierImpl();
        System.out.println(supplier.get());
        // impl with lambda expression
        Supplier<LocalDateTime> supplierr = () -> LocalDateTime.now();
        System.out.println(supplierr.get());


    }

}
