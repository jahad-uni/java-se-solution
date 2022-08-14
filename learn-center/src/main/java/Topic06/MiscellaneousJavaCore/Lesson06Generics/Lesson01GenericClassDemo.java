package Topic06.MiscellaneousJavaCore.Lesson06Generics;

public class Lesson01GenericClassDemo {

    public static void main(String[] args) {

        // initialize generic class with Integer data
        GenericClass<Integer> intObj = new GenericClass<>(5);
        System.out.println("Generic Class returns: " + intObj.getData());

        // initialize generic class with String data
        GenericClass<String> stringObj = new GenericClass<>("Java Programming");
        System.out.println("Generic Class returns: " + stringObj.getData());
    }
}
