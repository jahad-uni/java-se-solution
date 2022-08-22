package Topic08.Java8Feature.Lesson01LambdaExpressionsAndFunctionalInterface;

@FunctionalInterface
interface Addable {
    int addition(int a, int b);
}

class AddableImpl implements Addable {

    @Override
    public int addition(int a, int b) {
        return (a + b);
    }
}

public class Lesson02LambdaParameters {

    public static void main(String[] args) {

        // before java 8
        Addable add = new AddableImpl();
        System.out.println("sum in traditional way is: " + add.addition(2,8));

        // after java 8
        //lambda with parameter type
        Addable addition1 = (int a, int b) -> (a + b);
        System.out.println("with lambda sum is: " + addition1.addition(5, 10));

        // or without parameter type
        Addable addition2 = (a, b) -> (a + b);
        System.out.println("with lambda sum is: " + addition2.addition(6, 6));

        //or with multiple statement
        Addable addition3 = (a, b) ->{
            int sum = (a + b);
            return sum;
        };
        System.out.println("with lambda sum is: " + addition3.addition(10, 10));
    }
}
