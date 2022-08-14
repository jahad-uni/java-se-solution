package Topic06.MiscellaneousJavaCore.Lesson06Generics;

public class GenericClass<T> {

    // variable of T type
    private T data;

    public GenericClass(T data) {
        this.data = data;
    }

    // method that return T type variable
    public T getData() {
        return this.data;
    }
}
