package Topic06.MiscellaneousJavaCore.Lesson06Generics;

public class Lesson03GenericBoundedTypeDemo {

    public static void main(String[] args) {

        // create an object of GenericsClass
        GenericBoundedType<Integer> obj = new GenericBoundedType<>();

        // compile-time exception
        // GenericBoundedType<String> objj = new GenericBoundedType<>();

    }
}
