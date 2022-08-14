package Topic06.MiscellaneousJavaCore.Lesson06Generics;

public class Lesson02GenericMethodDemo {

    public static void main(String[] args) {

        // initialize the class with Integer data
        GenericMethod demo = new GenericMethod();

        // generics method working with String
        demo.<String>genericsMethod("Java Programming");

        // generics method working with integer
        demo.<Integer>genericsMethod(25);
    }
}
