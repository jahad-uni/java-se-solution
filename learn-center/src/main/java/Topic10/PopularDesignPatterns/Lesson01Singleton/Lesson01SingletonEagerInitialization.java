package Topic10.PopularDesignPatterns.Lesson01Singleton;

public class Lesson01SingletonEagerInitialization {

    private static final Lesson01SingletonEagerInitialization instance = new Lesson01SingletonEagerInitialization();

    public String msg;
    //private constructor to avoid client applications to use constructor
    private Lesson01SingletonEagerInitialization(){
        msg = "Hello I am a string part of Singleton class";
    }

    public static Lesson01SingletonEagerInitialization getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        // Instantiating Singleton class with variable x
        Lesson01SingletonEagerInitialization x = Lesson01SingletonEagerInitialization.getInstance();

        // Instantiating Singleton class with variable y
        Lesson01SingletonEagerInitialization y = Lesson01SingletonEagerInitialization.getInstance();

        // instantiating Singleton class with variable z
        Lesson01SingletonEagerInitialization z = Lesson01SingletonEagerInitialization.getInstance();

        // Now  changing variable of instance x
        // via toUpperCase() method
        x.msg = (x.msg).toUpperCase();

        // Print and display commands
        System.out.println("String from x is: " + x.msg);
        System.out.println("String from y is: " + y.msg);
        System.out.println("String from z is: " + z.msg);
        System.out.println("\n");

        // Now again changing variable of instance x
        z.msg = (z.msg).toLowerCase();

        System.out.println("String from x is: " + x.msg);
        System.out.println("String from y is: " + y.msg);
        System.out.println("String from z is: " + z.msg);
    }
}
