package Topic08.Java8Feature.Lesson02MethodReferences;

import java.util.Locale;

@FunctionalInterface
interface Printable {
    void print(String msg);
}

public class Lesson02MethodReferenceToInstanceOfObject {

    public void display(String msg) {

        msg = msg.toUpperCase();
        System.out.println(msg);
    }

    public static void main(String[] args) {

        Lesson02MethodReferenceToInstanceOfObject obj = new Lesson02MethodReferenceToInstanceOfObject();
        //using lambda expression
        Printable printable = (msg) -> obj.display(msg);
        printable.print("hello world with lambda");
        //using Method References
        Printable printablee = obj::display;
        printablee.print("hello world with method references");

    }
}
