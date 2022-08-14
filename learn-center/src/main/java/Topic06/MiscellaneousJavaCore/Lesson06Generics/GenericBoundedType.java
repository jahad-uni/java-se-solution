package Topic06.MiscellaneousJavaCore.Lesson06Generics;

public class GenericBoundedType<T extends Number> {

    public void display() {
        System.out.println("This is a bounded type generics class.");
    }
}
