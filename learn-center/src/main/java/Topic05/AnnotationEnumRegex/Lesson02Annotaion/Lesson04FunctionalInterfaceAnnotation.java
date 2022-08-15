package Topic05.AnnotationEnumRegex.Lesson02Annotaion;


@FunctionalInterface // only one abstract method can exist
interface MyFunctionalInterface {

    public String sayHello1();

    // public  String sayHello2();
    default String sayGoodbye() {
        return "GoodBye...";
    }

    static String sayWelcome() {
        return "Welcome...";
    }
}

public class Lesson04FunctionalInterfaceAnnotation {
}
