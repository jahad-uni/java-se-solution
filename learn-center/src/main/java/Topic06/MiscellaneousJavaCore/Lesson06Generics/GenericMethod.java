package Topic06.MiscellaneousJavaCore.Lesson06Generics;

public class GenericMethod {

    // create a generics method
    public <T> void genericsMethod(T data) {
        System.out.println("Data Passed: " + data);
    }
}
